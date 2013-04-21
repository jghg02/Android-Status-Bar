package com.example.jghg.funtion.action.bar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
/**
 * Maneja algunas acciones comunes del actionBar, esta hecha para servir como 
 * base para crear activades que usen el action bar y eliminar la mayoria de los
 * problemas references a la version de Android. 
 * 
 * Estas actividades estan basadas en el ejemplo ActionBarSample que viene con
 * el SDK
 * @author Josue Hernandez
 *
 */
public abstract class ActionBarHelper {
    /**
     * Actividad que instancio esta clase
     */
    protected Activity mActivity;
	/**
	 * Crea objetos de {@link ActionBarHelper} para las actividades dadas.
	 * Los objetos se crean en base a la version del sistema operativo
	 */
	public static ActionBarHelper createInstance(Activity activity){
//	    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ICE_CREAM_SANDWICH){
//	        Log.i(TAG, "Entrando a ICS");
//	        return new ActionBarHelperICS(activity);
//	    }
//	    else 
//	        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB){
//	        Log.i(TAG, "Entrando a HoneyComb");
//	        return new ActionBarHelperHoneycomb(activity); 
//	    }
//	    else{
	        return new ActionBarHelperBase(activity);
//	    }
	}
	
	/**
	 * Crea una instancia de la clase
	 * @param mActivity actividad que esta llamando esta clase
	 */
	protected ActionBarHelper(Activity mActivity) {
		this.mActivity = mActivity;
	}
	
	 /**
     * Action bar helper code to be run in {@link Activity#onCreate(android.os.Bundle)}.
     */
    public void onCreate(Bundle savedInstanceState) {
    }

    /**
     * Action bar helper code to be run in {@link Activity#onPostCreate(android.os.Bundle)}.
     */
    public void onPostCreate(Bundle savedInstanceState) {
    }

    /**
     * Action bar helper code to be run in {@link Activity#onCreateOptionsMenu(android.view.Menu)}.
     *
     * NOTE: Setting the visibility of menu items in <em>menu</em> is not currently supported.
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    /**
     * Returns a {@link MenuInflater} for use when inflating menus. The implementation of this
     * method in {@link ActionBarHelperBase} returns a wrapped menu inflater that can read
     * action bar metadata from a menu resource pre-Honeycomb.
     */
    public MenuInflater getMenuInflater(MenuInflater superMenuInflater) {
        return superMenuInflater;
    }
    /**
     * Action bar helper code to be run in {@link Activity#onTitleChanged(CharSequence, int)}.
     */
    protected void onTitleChanged(CharSequence title, int color) {
    }
		
}
