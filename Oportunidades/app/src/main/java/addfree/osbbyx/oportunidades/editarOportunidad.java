package addfree.osbbyx.oportunidades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class editarOportunidad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_oportunidad);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }

    public void fase2(View view){
        Intent fase2 = new Intent(this,fase2tipodeOportunidad.class);
        startActivity(fase2);
    }
    public void fase3(View view){
        Intent fase3 = new Intent(this,fase3Propuesta.class);
        startActivity(fase3);
    }
    public void fase4(View view){
        Intent fase4 = new Intent(this,fase4OrdenDeCompras.class);
        startActivity(fase4);
    }
}
