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

public class FriendList extends Fragment {
	private ArrayList<Contact> listContact;
	private ListView listMessage;

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView = inflater.inflate(R.layout.fragment_friendlist, container, false);
		
		listContact = new ArrayList<Contact>();
		listContact.add(new Contact("datvt", "Tien dat", "chjcken123@gmail.com"));
		listContact.add(new Contact("davt77", "Kiss Dee", null));
		listContact.add(new Contact("datvt", "Ngoc Hoa", "chjcken123@gmail.com"));
		listContact.add(new Contact("datvt", "Minh Trieu", "chjcken123@gmail.com"));
		listContact.add(new Contact("datvt", "Johnny Depp", "chjcken123@gmail.com"));
		
		ListContactAdapter listAdapter = new ListContactAdapter(container.getContext(), listContact);
		listMessage = (ListView)rootView.findViewById(R.id.list_contact);
		listMessage.setAdapter(listAdapter);
		
		return rootView;
	}
}
