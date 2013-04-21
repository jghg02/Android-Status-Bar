package com.example.jghg.action.bar;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.com.jghg.action.bar.R;
import com.example.jghg.funtion.action.bar.ActionBarFragmentActivity;

/**
 * 
 * @author Josue Hernandez
 * 
 */
public class MainActivity extends ActionBarFragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.actionbar, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int itemId = item.getItemId();

		switch (itemId) {
		case android.R.id.home:
			Log.v("MENU", "Press Home Button in Anction Bar");
			// finish();
			break;
		// case R.id.menu_search:
		//
		// super.onSearchRequested();
		// break;
		default:

			break;
		}
		return super.onOptionsItemSelected(item);
	}

}
