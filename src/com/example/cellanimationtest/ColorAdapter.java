package com.example.cellanimationtest;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class ColorAdapter extends ArrayAdapter<String> {

	Context mContext;
	
	public ColorAdapter(Context context, int textViewResourceId) {
		super(context, textViewResourceId);
		mContext = context;
		// TODO Auto-generated constructor stub
	}
	
	public void setData(List<String> data) {
	    clear();
	    if (data != null) {
	        addAll(data);
	    }
    }
	
	@Override 
    public View getView(int position, View convertView, ViewGroup parent) {
		
		convertView = new LinearLayout(mContext);
		ListView.LayoutParams ll = new ListView.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT); 
		convertView.setLayoutParams(ll);
		TextView tv = new TextView(mContext);
		tv.setText(Integer.toString(position));
		((LinearLayout)convertView).addView(tv);
		
		convertView.setPadding(100, 0, 0, 100);
		
		if (position % 2 == 0) {
			convertView.setBackgroundColor(mContext.getResources().getColor(android.R.color.holo_blue_bright));
		} 
		else {
			convertView.setBackgroundColor(mContext.getResources().getColor(android.R.color.darker_gray));
		}
//		else if (position == 2) {
//			convertView.setBackgroundColor(mContext.getResources().getColor(android.R.color.holo_green_dark));
//		}  else if (position == 3) {
//			convertView.setBackgroundColor(mContext.getResources().getColor(android.R.color.holo_orange_light));
//		}  else if (position == 4) {
//			convertView.setBackgroundColor(mContext.getResources().getColor(android.R.color.holo_blue_light));
//		}  else if (position == 5) {
//			convertView.setBackgroundColor(mContext.getResources().getColor(android.R.color.holo_purple));
//		}  else if (position == 6) {
//			convertView.setBackgroundColor(mContext.getResources().getColor(android.R.color.holo_orange_dark));
//		}  else if (position == 7) {
//			convertView.setBackgroundColor(mContext.getResources().getColor(android.R.color.holo_green_light));
//		}  else if (position == 8) {
//			convertView.setBackgroundColor(mContext.getResources().getColor(android.R.color.holo_blue_dark));
//		}   else if (position == 8) {
//			convertView.setBackgroundColor(mContext.getResources().getColor(android.R.color.holo_blue_dark));
//		}  
		
		
		return convertView;
		
	}

}
