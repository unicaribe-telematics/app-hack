package com.telematics.denunciaciudadana;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainMenu extends ActionBarActivity {
    Button Historial, Denuncia, DatosPersonales, CambiarPass, Cerrar_sesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        Historial = (Button)findViewById(R.id.button3);
        Denuncia = (Button)findViewById(R.id.button4);
        DatosPersonales = (Button)findViewById(R.id.button5);
        CambiarPass = (Button)findViewById(R.id.change_psswd);
        Cerrar_sesion = (Button)findViewById(R.id.textView4);
    }

     public void historial(View view)
     {
         Intent i = new Intent(this, History.class);
         startActivity(i);
     }
    public void denuncia(View view)
    {
        Intent i = new Intent(this, Complaint.class);
        startActivity(i);
    }
    public void Datos_Personales(View view)
    {
        Intent i = new Intent(this, PDataConfiguration.class);
        startActivity(i);
    }
    public void ChangePass(View view)
    {
        Intent i = new Intent(this, ChangePassword1.class);
        startActivity(i);
    }
    public void cerrar_sesion(View view)
    {
        Intent i = new Intent(this, MainMenu.class);
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_menu, menu);
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
