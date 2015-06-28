package com.bchat.adapter;

import java.util.ArrayList;

import com.bchat.R;
import com.bchat.item.Message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class ListMessageAdapter extends BaseAdapter {
	private Context mContext;
	private ArrayList<Message> mListMessage;
	
	public ListMessageAdapter(Context context, ArrayList<Message> listMessage) {
		// TODO Auto-generated constructor stub
		super();
		this.mContext = context;
		this.mListMessage = listMessage;		
	}
	
	@SuppressLint("NewApi")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Message message = (Message)this.getItem(position);
		ViewHolder holder;
		if (convertView == null){
			holder = new ViewHolder();
			LayoutInflater inflater = LayoutInflater.from(mContext);
			convertView = inflater.inflate(R.layout.message_item, parent, false);
			holder.message = (TextView)convertView.findViewById(R.id.message_item_text);
			holder.avatar = (ImageView)convertView.findViewById(R.id.message_item_avatar);
			convertView.setTag(holder);
		}
		else{
			holder = (ViewHolder) convertView.getTag();
		}
		
		//set message text
		holder.message.setText(message.getMessage());
		//set avatar of message owner
		
		RelativeLayout layout = (RelativeLayout)convertView.findViewById(R.id.message_layout);
		layout.setEnabled(false);
		LayoutParams lpMessage = (LayoutParams)holder.message.getLayoutParams();
		LayoutParams lpAvatar = (LayoutParams)holder.avatar.getLayoutParams();
		
		if(message.isMine()){
			holder.message.setBackgroundResource(R.drawable.speech_bubble_yellow);
			lpAvatar.removeRule(RelativeLayout.ALIGN_PARENT_LEFT);
			lpAvatar.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
			holder.avatar.setLayoutParams(lpAvatar);
			
			lpMessage.removeRule(RelativeLayout.RIGHT_OF);
			lpMessage.addRule(RelativeLayout.LEFT_OF, holder.avatar.getId());
			holder.message.setLayoutParams(lpMessage);
			layout.setGravity(Gravity.RIGHT);
		}
		else{
			holder.message.setBackgroundResource(R.drawable.speech_bubble_green);
			
			lpAvatar.removeRule(RelativeLayout.ALIGN_PARENT_RIGHT);
			lpAvatar.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
			holder.avatar.setLayoutParams(lpAvatar);
			
			lpMessage.removeRule(RelativeLayout.LEFT_OF);
			lpMessage.addRule(RelativeLayout.RIGHT_OF, holder.avatar.getId());
			holder.message.setLayoutParams(lpMessage);
			layout.setGravity(Gravity.LEFT);
					
			
		}
		
		
		return convertView;
	}
	

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mListMessage.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mListMessage.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private static class ViewHolder{
		TextView message;
		ImageView avatar;
	}

}
