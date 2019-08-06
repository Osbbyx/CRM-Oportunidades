package addfree.osbbyx.oportunidades;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class RealMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }


    public void login(View view){
        Intent login = new Intent(this,MainActivity.class);
        startActivity(login);
        Toast toast = Toast.makeText(this, "Bienvenido Pedro!", Toast.LENGTH_LONG);
        toast.show();
        finish();
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
