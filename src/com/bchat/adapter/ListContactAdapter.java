package com.bchat.adapter;

import java.util.ArrayList;

import com.bchat.R;
import com.bchat.info.Contact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListContactAdapter extends BaseAdapter {
	private Context context;
	private ArrayList<Contact> listContact;
	
	public ListContactAdapter(Context context, ArrayList<Contact> listContact) {
		// TODO Auto-generated constructor stub
		this.context = context;
		this.listContact = listContact;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (convertView == null){
			LayoutInflater inflater = (LayoutInflater)this.context
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
		return this.listContact.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return listContact.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
