package com.bchat.adapter;

import java.util.ArrayList;

import com.bchat.R;
import com.bchat.item.Contact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListContactAdapter extends BaseAdapter {
	private Context mContext;
	private ArrayList<Contact> mListContact;
	
	public ListContactAdapter(Context context, ArrayList<Contact> listContact) {
		// TODO Auto-generated constructor stub
		super();
		this.mContext = context;
		this.mListContact = listContact;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (convertView == null){
			LayoutInflater inflater = (LayoutInflater)this.mContext
										.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			convertView = inflater.inflate(R.layout.contact_item, parent, false);
		}
		Contact contact = (Contact)getItem(position);
		TextView contactName = (TextView)convertView.findViewById(R.id.contact_item_name);
		//set info of contact
		contactName.setText(contact.getName());
		
		
		return convertView;
	}

	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.mListContact.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mListContact.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
