package addfree.osbbyx.oportunidades;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        Toast toast = Toast.makeText(this, "Bienvenido Pedro!", Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent atras = new Intent(this,MainActivity.class);
            startActivity(atras);
        } else if (id == R.id.nav_gallery) {
            Intent atras = new Intent(this,CrearOportunidad.class);
            startActivity(atras);
        } else if (id == R.id.nav_slideshow) {
            Intent atras = new Intent(this,VerOportunidades.class);
            startActivity(atras);
        } else if (id == R.id.nav_tools) {
            Intent atras = new Intent(this,editarOportunidad.class);
            startActivity(atras);
        } else if (id == R.id.nav_toolss) {
            Intent atras = new Intent(this,avanzar.class);
            startActivity(atras);
        } else if (id == R.id.nav_toolsa) {
            Intent atras = new Intent(this,Estadisticas.class);
            startActivity(atras);
        } else if (id == R.id.nav_perfil) {
            Intent atras = new Intent(this,perfil.class);
            startActivity(atras);
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void crearOportunidad(View view){
        Intent crear = new Intent(this,CrearOportunidad.class);
        startActivity(crear);

    }
    public void verOportunidad(View view){
        Intent Ver = new Intent(this,VerOportunidades.class);
        startActivity(Ver);
    }

    public void perfil(View view){
        Intent Ver = new Intent(this,perfil.class);
        startActivity(Ver);
    }
    public void login(View view){
        Intent login = new Intent(this,MainActivity.class);
        startActivity(login);
    }


    public void estadisticas(View view){
        Intent atras = new Intent(this,Estadisticas.class);
        startActivity(atras);
    }

    public void avanzar(View view){
        Intent atras = new Intent(this,avanzar.class);
        startActivity(atras);
    }

    public void modificar(View view){
        Intent atras = new Intent(this,editarOportunidad.class);
        startActivity(atras);
    }



}
