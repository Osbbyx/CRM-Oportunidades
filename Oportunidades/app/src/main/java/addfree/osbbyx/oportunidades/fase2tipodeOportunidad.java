package addfree.osbbyx.oportunidades;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class fase2tipodeOportunidad extends AppCompatActivity {

    Spinner sp1,sp2,sp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fase2tipode_oportunidad);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        sp1= (Spinner)findViewById(R.id.sp1);
        sp2= (Spinner)findViewById(R.id.sp2);
        sp3= (Spinner)findViewById(R.id.sp3);

        String [] opciones = {"1","2","3","4","5","6","7","8","9","10"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        sp1.setAdapter(adapter);
        sp2.setAdapter(adapter);
        sp3.setAdapter(adapter);
    }


    public void seleccion(View view){
        String s1 = sp1.getSelectedItem().toString();
        String s2 = sp2.getSelectedItem().toString();
        String s3 = sp3.getSelectedItem().toString();

    }

    public void atras(View view){
        Intent atras = new Intent(this,MainActivity.class);
        startActivity(atras);
    }
}
