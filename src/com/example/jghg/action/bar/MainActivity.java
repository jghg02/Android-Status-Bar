package com.example.jghg.action.bar;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.com.jghg.action.bar.R;
import com.example.jghg.adapters.ListAdapter;
import com.example.jghg.funtion.action.bar.ActionBarFragmentActivity;

/**
 * 
 * @author Josue Hernandez
 * 
 */
public class MainActivity extends ActionBarFragmentActivity {

	private static final String LOG_TAG = MainActivity.class.getName();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.slide_menu);
		String[] items = new String[] { "Linux", "Mac OS", "Windows", "iPhone",
				"iMac", "MacBook", "MacBook Pro", "Linux", "Mac OS", "Windows",
				"iPhone", "iMac", "MacBook", "MacBook Pro", "Linux", "Mac OS",
				"Windows", "iPhone", "iMac", "MacBook", "MacBook Pro", "Linux",
				"Mac OS", "Windows", "iPhone", "iMac", "MacBook", "MacBook Pro" };

		ListView list = (ListView) findViewById(R.id.lista);

		list.setAdapter(new ListAdapter(this, items));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		Log.i(LOG_TAG, "onCreateOptionsMenu");
		// MenuInflater inflater = getMenuInflater();
		// inflater.inflate(R.menu.actionbar, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int itemId = item.getItemId();

		switch (itemId) {
		case android.R.id.home:
			Log.v("MENU", "Press Home Button in Anction Bar");
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
