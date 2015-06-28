package com.bchat.activity;

import java.util.ArrayList;

import com.bchat.R;
import com.bchat.adapter.ListMessageAdapter;
import com.bchat.item.Message;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class ChatActivity extends ActionBarActivity {
	private ArrayList<Message> listMessage;
	private ListMessageAdapter adapter;
	private EditText messageTextInput;
	private Button sendButton;
	private ListView listViewMessage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chat);
		
		messageTextInput = (EditText)findViewById(R.id.message_text_input);
		listViewMessage = (ListView)findViewById(R.id.list_message);
		sendButton = (Button)findViewById(R.id.message_send);
		sendButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				send();
				
			}
		});
		listMessage = new ArrayList<Message>();
		listMessage.add(new Message("Hello", false));
		listMessage.add(new Message("Hi!", true));
		listMessage.add(new Message("Wassup??", false));
		listMessage.add(new Message("How are u?", true));
		listMessage.add(new Message("I'm fine. Thank you. And you?", false));
		listMessage.add(new Message("Fine, thanks!", true));
		
		
		adapter = new ListMessageAdapter(this, listMessage);
		listViewMessage.setAdapter(adapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.chat, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	void send(){
		String message = messageTextInput.getText().toString().trim();
		if (message.length()>0){
			messageTextInput.setText("");
			addMessage(new Message(message, true));
			long now = System.currentTimeMillis();
			while(true){
				if (System.currentTimeMillis() - now > 1000)
					break;
			}
			
			String[] rep = {"What?", "I dont know", "Ahh I see!"};
			
			addMessage(new Message(rep[message.length()%3], false));
			
		}
	}

	private void addMessage(Message message) {
		// TODO Auto-generated method stub
		listMessage.add(message);
		adapter.notifyDataSetChanged();
		listViewMessage.setSelection(listMessage.size()-1);
		
	}
}
