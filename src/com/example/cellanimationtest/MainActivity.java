package com.example.cellanimationtest;

import java.util.ArrayList;
import java.util.List;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.ScaleAnimation;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends Activity {

	private boolean animated = false;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
//		ImageView image = (ImageView) findViewById(R.id.image);
//		
//		image.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				PropertyValuesHolder pvhX = PropertyValuesHolder.ofFloat(View.SCALE_X, 3);
//				PropertyValuesHolder pvhY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 3);
//				
//				ObjectAnimator scaleAnim = ObjectAnimator.ofPropertyValuesHolder(v, pvhY, pvhX);
//				scaleAnim.setDuration(3000);
//				scaleAnim.start();
//			}
//		});
//		
		ListView lv = (ListView) findViewById(R.id.listview);
		
		List<String> data = new ArrayList<String>();
		data.add("1");
		data.add("2");
		data.add("3");
		data.add("4");
		data.add("5");
		data.add("6");
		data.add("7");
		data.add("8");
		data.add("9");
		data.add("1");
		data.add("2");
		data.add("3");
		data.add("4");
		data.add("5");
		data.add("6");
		data.add("7");
		data.add("8");
		data.add("9");
		data.add("1");
		data.add("2");
		data.add("3");
		data.add("4");
		data.add("5");
		data.add("6");
		data.add("7");
		data.add("8");
		data.add("9");
		data.add("1");
		data.add("2");
		data.add("3");
		data.add("4");
		data.add("5");
		data.add("6");
		data.add("7");
		data.add("8");
		data.add("9");
		
		
		ColorAdapter ca = new ColorAdapter(getApplicationContext(), 0);
		ca.setData(data);
		
		lv.setAdapter(ca);
		
		lv.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapterView, View view, int position, long arg3) {
				PropertyValuesHolder pvhX = PropertyValuesHolder.ofFloat(View.SCALE_X, 3);
				PropertyValuesHolder pvhY = PropertyValuesHolder.ofFloat(View.SCALE_Y, 3);
				
				ObjectAnimator scaleAnim = ObjectAnimator.ofPropertyValuesHolder(adapterView.getChildAt(position), pvhY, pvhX);
				scaleAnim.setDuration(3000);
				
//				ObjectAnimator obx = ObjectAnimator.ofFloat(view, "scaleX", 2);
//				ObjectAnimator oby = ObjectAnimator.ofFloat(view, "scaleY", 2);
//				
//				
//				AnimatorSet animSet = new AnimatorSet();
//				animSet.playTogether(obx, oby);
				
//				animSet.start();
				
//				scaleAnim.setRepeatCount(1);
//				scaleAnim.setRepeatMode(ValueAnimator.REVERSE);
//				
				scaleAnim.start();
//				setupAnimation(view, scaleAnim);
				
//				ScaleAnimation scaleAnim = new ScaleAnimation(1, 2, 1, 2);
//				scaleAnim.setDuration(1000);
//				scaleAnim.setFillAfter(true);
//				scaleAnim.setFillEnabled(true);
//				setupAnimation(view, scaleAnim);
			}
		});
		
		
		
//		lv.animate().
		
//		
	}

	private void setupAnimation(View view, Animator scaleAnim) {
		scaleAnim.start();
	}



}
