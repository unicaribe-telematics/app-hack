package com.telematics.denunciaciudadana;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class LogIn extends ActionBarActivity {
    Button IniciaSesion, Registrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        IniciaSesion = (Button)findViewById(R.id.button);
        Registrarse = (Button)findViewById(R.id.button2);
    }
    public void onClickSesion(View view)
    {
        Intent lol;
        lol = new Intent(this, MainMenu.class);
        startActivity(lol);
    }
    public void onClickregistrarse(View view)
    {
        Intent lpl;
        lpl = new Intent(this, SignUp.class);
        startActivity(lpl);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_log_in, menu);
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
