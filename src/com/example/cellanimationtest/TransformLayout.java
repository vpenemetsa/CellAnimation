package com.example.cellanimationtest;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class TransformLayout extends LinearLayout implements OnGestureListener{
	
	private GestureDetector mGestureDetector;
	
	private float mCurrentScaleX, mCurrentScaleY;

	public TransformLayout(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}

	public TransformLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public TransformLayout(Context context) {
		super(context);
		init();
	}
	
	private void init() {
		mGestureDetector = new GestureDetector(getContext(), this);
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		return mGestureDetector.onTouchEvent(event);
	}
	
	@Override
	public boolean onDown(MotionEvent e) {
		return true;
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX,
			float velocityY) {
		return false;
	}

	@Override
	public void onLongPress(MotionEvent e) {
		
	}

	@Override
	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
		return false;
	}

	@Override
	public void onShowPress(MotionEvent e) {
		this.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));
		ObjectAnimator anim = ObjectAnimator.ofFloat(this, "scaleX", 1f, .75f);
		anim.setDuration(200);
		anim.addUpdateListener(mAnimatorUpdateListenerX);
		anim.start();
		ObjectAnimator anim2 = ObjectAnimator.ofFloat(this, "scaleY", 1f, .75f);
		anim2.setDuration(200);
		anim.addUpdateListener(mAnimatorUpdateListenerY);
		anim2.start();
	}

	@Override
	public boolean onSingleTapUp(MotionEvent e) {
		this.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
		ObjectAnimator anim = ObjectAnimator.ofFloat(this, "scaleX", mCurrentScaleX, 1f);
		anim.setDuration(200);
		anim.start();
		ObjectAnimator anim2 = ObjectAnimator.ofFloat(this, "scaleY", mCurrentScaleY, 1f);
		anim2.setDuration(200);
		anim2.start();
		return false;
	}
	
	
	private AnimatorUpdateListener mAnimatorUpdateListenerX = new AnimatorUpdateListener() {
		@Override
		public void onAnimationUpdate(ValueAnimator animation) {
			mCurrentScaleX = (Float) animation.getAnimatedValue();
		}
	};

	private AnimatorUpdateListener mAnimatorUpdateListenerY = new AnimatorUpdateListener() {
		@Override
		public void onAnimationUpdate(ValueAnimator animation) {
			mCurrentScaleY = (Float) animation.getAnimatedValue();
		}
	};
	
}
