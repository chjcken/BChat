package com.bchat.activity;

import com.bchat.R;
import com.bchat.adapter.TabPagerAdapter;
import com.bchat.widget.SlidingTabLayout;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
//import android.support.v7.widget.Toolbar;
//import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Bundle;


public class MainActivity extends ActionBarActivity {

	private ViewPager viewPager;
	private TabPagerAdapter tabAdaper;
	//private Toolbar toolbar;
	private SlidingTabLayout tabs;	
	
	//@TargetApi(Build.VERSION_CODES.LOLLIPOP)
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		//getSupportActionBar().hide();
		//toolbar = (Toolbar)findViewById(R.id.tool_bar);
		//setSupportActionBar(toolbar);
		//CharSequence tit[] = {"Message", "Friend"};
		tabAdaper = new TabPagerAdapter(getSupportFragmentManager(), this); 
		
		viewPager = (ViewPager)findViewById(R.id.pager);
		//Log.e("test",String.valueOf(viewPager.getElevation()));
		viewPager.setAdapter(tabAdaper);
		
		tabs = (SlidingTabLayout)findViewById(R.id.tabs);
		tabs.setCustomTabView(R.layout.custom_tab, 0);
		tabs.setDistributeEvenly(true);
		
		tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
			
			@Override
			public int getIndicatorColor(int position) {
				// TODO Auto-generated method stub
				return getResources().getColor(R.color.tabScrollColor);
			}
		});
		
		tabs.setViewPager(viewPager);
		//viewPager.getcu

	}	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
 
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
 
        return super.onOptionsItemSelected(item);
	}
	

	
}
