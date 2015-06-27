package com.bchat.adapter;

import com.bchat.R;
import com.bchat.fragment.FriendList;
import com.bchat.fragment.MessageList;

import android.content.Context;
import android.graphics.drawable.Drawable;
//import android.R;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;


public class TabPagerAdapter extends FragmentStatePagerAdapter {

	private CharSequence Titles[] = {"Message", "Friend"};
	private int[] imageResId = {
			R.drawable.ic_conversation,
			R.drawable.ic_contact
	};
	private Context context;
	
	public TabPagerAdapter(FragmentManager fm, Context context) {
		super(fm);
		// TODO Auto-generated constructor stub
		this.context = context;
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		switch (arg0) {
		case 0:
			//message list at first
			return new MessageList();
		case 1:
			return new FriendList();

		default:
			return null;
		}
		
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2;
	}
	
//	@Override
//	public CharSequence getPageTitle(int position) {
//		// TODO Auto-generated method stub
//		return Titles[position];
//	}
	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub
		
		Drawable image = context.getResources().getDrawable(imageResId[position]);
	    image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());
	    SpannableString sb = new SpannableString(" ");
	    ImageSpan imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BOTTOM);
	    sb.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
	    return sb;
	}

}
