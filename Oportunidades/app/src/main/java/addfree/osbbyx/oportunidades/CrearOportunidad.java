package addfree.osbbyx.oportunidades;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.Time;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;
import java.util.Date;

public class CrearOportunidad extends AppCompatActivity {

    EditText fechaaa ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_oportunidad);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
        Date currentTime = Calendar.getInstance().getTime();


        fechaaa=(EditText)findViewById(R.id.fecha);
        fechaaa.setText(currentTime.toString());
    }





    public void atras(View view){
        Intent atras = new Intent(this,MainActivity.class);
        startActivity(atras);
    }
}
