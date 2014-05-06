###Action Bar in Android

Ejemplo de la implementacion de un Action Bar en Android __(version 2.3)__.

1.- Las clases necesarias para poder implementar el __Action Bar__ estan en el paquete __com.example.jghg.funtion.action.bar__ aqui se encuetran todas las que se implementan para el Action Bar.

2.- Para poder implementar el Action Bar en un _Activity_ es necesario que dicha _Actividad_ extienda de __ActionBarFragmentActivity__
	
		public class MainActivity extends ActionBarFragmentActivity{}
		
3.- En la clase __ActionBarHelperBase__ es donde se definen los botones y el texto que va a tener el Action Bar por defecto. (ver metodo _setupActionBar_)

4.- Para agregar mas botones al Action Bar, se debe crear un _XML_ el el directorio __res/menu__ que va a tener los items que se desean mostrar. 
	
	<menu xmlns:android="http://schemas.android.com/apk/res/android" >

    	<item
        	android:id="@+id/action_refresh"
        	android:icon="@android:drawable/ic_delete"
        	android:orderInCategory="100"
        	android:showAsAction="always"/>

	</menu> 
	
5.- Para implementarlo en la __Activity__ 

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.actionbar, menu);
			return super.onCreateOptionsMenu(menu);
		}
		
6.- Para saber donde se esta presionando en el _Action Bar_. 
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		int itemId = item.getItemId();

		switch (itemId) {
		case android.R.id.home:
			Log.v("MENU", "Press Home Button in Anction Bar");
			// finish();
			break;
		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
###Resultado

Josue Hernandez.
@jghg02

![result](http://img809.imageshack.us/img809/3416/actionbar.png)
