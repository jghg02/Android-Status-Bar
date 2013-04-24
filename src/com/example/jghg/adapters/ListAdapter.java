package com.example.jghg.adapters;

import com.example.com.jghg.action.bar.R;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListAdapter extends ArrayAdapter<String> {

	private final Activity context;
	private final String[] items;

	/**
	 * Este es el constructor del adapter
	 * 
	 * @param context
	 *            Activity
	 * @param items
	 *            Datos a mostrar
	 */
	public ListAdapter(Activity context, String[] items) {
		// en el super le paso los parametros establecidos en el constructor
		// e inicializo la vista pasandole el layout inicial que en este
		// caso es el de la actividad R.layout.activity_main
		super(context, R.layout.slide_menu, items);
		this.context = context;
		this.items = items;

	}

	/**
	 * Aqui estoy implementando el Holder que es donde se definen todos los
	 * componentes de la interfaz, como lo son los textview las imagenes y todos
	 * aquellos componenetes que se desean agregar a la interfaz
	 * 
	 * @author jghg
	 * 
	 */
	static class ViewHolder {
		public TextView tectview;
	}

	/**
	 * Metodo que se implementa para mostrar la vista del adapter
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			// Inflo el visto dependiento del contexto donde estoy
			LayoutInflater inflater = context.getLayoutInflater();
			// asigno el layout para que se muestre en pantalla
			// en este caso coloco el layout donde se va a mostrar la lista
			// la que contiene los rows
			convertView = inflater.inflate(R.layout.list_rows, null);
			// instancio la clase holder donde defino los componetes de la
			// interfaz
			holder = new ViewHolder();
			// asigno el layout correspondiente a los holders que declare en la
			// clase
			holder.tectview = (TextView) convertView
					.findViewById(R.id.questionary_name);
			convertView.setTag(holder);
		}
		holder = (ViewHolder) convertView.getTag();

		// Aqui coloco el zebra style para la lista
		if (position % 2 == 0) {
			convertView
					.setBackgroundResource(R.drawable.destination_item_selector_even);
		} else {
			convertView
					.setBackgroundResource(R.drawable.destination_item_selector_odd);
		}

		String s = items[position];
		// Aqui asigno el valor del texto al textview definido en el Holder
		holder.tectview.setText(s);
		return convertView;
	}

}
