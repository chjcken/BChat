package com.bchat.fragment;


import java.util.ArrayList;

import com.bchat.R;
import com.bchat.adapter.ListContactAdapter;
import com.bchat.item.Contact;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class MessageList extends Fragment {
	private ArrayList<Contact> listContact;
	private ListView listMessage;
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView = inflater.inflate(R.layout.fragment_messagelist, container, false);
		
		listContact = new ArrayList<Contact>();
		//listContact.add(new Contact("datvt", "tien dat", "chjcken123@gmail.com"));
		//listContact.add(new Contact("davt77", "kiss dee", null));
		
		ListContactAdapter listAdapter = new ListContactAdapter(container.getContext(), listContact);
		listMessage = (ListView)rootView.findViewById(R.id.list_conversation);
		listMessage.setAdapter(listAdapter);
		
		return rootView;
	}
}
