package com.example.jghg.funtion.action.bar;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
@SuppressWarnings("javadoc")
public class ActionBarFragmentActivity extends FragmentActivity{
    private static final String TAG = ActionBarFragmentActivity.class.getName();
	final ActionBarHelper mActionBarHelper = ActionBarHelper.createInstance(this);

	
    public ActionBarHelper getmActionBarHelper() {
		return mActionBarHelper;
	}
	
	public MenuInflater getMenuInflater(){
		return mActionBarHelper.getMenuInflater(super.getMenuInflater());
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		mActionBarHelper.onCreate(savedInstanceState);
	}
	
	@Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mActionBarHelper.onPostCreate(savedInstanceState);
    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		boolean retValue = false;
        retValue |= mActionBarHelper.onCreateOptionsMenu(menu);
        retValue |= super.onCreateOptionsMenu(menu);
        Log.d(TAG, "retornando el valor para el menu " + retValue);
        return retValue;
	}
	
	@Override
    protected void onTitleChanged(CharSequence title, int color) {
	    mActionBarHelper.onTitleChanged(title, color);
        super.onTitleChanged(title, color);
    }

}
