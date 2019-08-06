package addfree.osbbyx.oportunidades;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class VerOportunidades extends AppCompatActivity {


    public TextView tw1,tw2,tw3,tw4,tw5,tw6;
    public TextView tw7,tw8,tw9,tw10,tw11,tw12;
    public TextView tw13,tw14,tw15,tw16,tw17,tw18;
    public TextView tw19,tw20,tw21,tw22,tw23,tw24;
    public TextView tw25,tw26,tw27,tw28,tw29,tw30;
    public TextView tw31,tw32,tw33,tw34,tw35,tw36;
    public int cambio,cambio2,cambio3,cambio4,cambio5,cambio6 = 0;

    //Harcodeo para la demostracion de lo que hara , OJO ARREGLAR (No debe haber duplicidad ni harcodeo)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_oportunidades);

        //Icono en el nav

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        tw1 = (TextView)findViewById(R.id.et1);
        tw2 = (TextView)findViewById(R.id.et2);
        tw3 = (TextView)findViewById(R.id.et3);
        tw4 = (TextView)findViewById(R.id.et4);
        tw5 = (TextView)findViewById(R.id.tw5);
        tw6 = (TextView)findViewById(R.id.tw6);

        tw7 = (TextView)findViewById(R.id.textView21);
        tw8 = (TextView)findViewById(R.id.textView22);
        tw9 = (TextView)findViewById(R.id.textView23);
        tw10 = (TextView)findViewById(R.id.textView24);
        tw11 = (TextView)findViewById(R.id.textView25);
        tw12 = (TextView)findViewById(R.id.textView26);

        tw13 = (TextView)findViewById(R.id.textView27);
        tw14 = (TextView)findViewById(R.id.textView28);
        tw15 = (TextView)findViewById(R.id.textView29);
        tw16 = (TextView)findViewById(R.id.textView30);
        tw17 = (TextView)findViewById(R.id.textView31);
        tw18 = (TextView)findViewById(R.id.textView32);

        tw19 = (TextView)findViewById(R.id.textView33);
        tw20 = (TextView)findViewById(R.id.textView34);
        tw21 = (TextView)findViewById(R.id.textView35);
        tw22 = (TextView)findViewById(R.id.textView36);
        tw23 = (TextView)findViewById(R.id.textView37);
        tw24 = (TextView)findViewById(R.id.textView38);

        tw25 = (TextView)findViewById(R.id.textView39);
        tw26 = (TextView)findViewById(R.id.textView40);
        tw27 = (TextView)findViewById(R.id.textView41);
        tw28 = (TextView)findViewById(R.id.textView42);
        tw29 = (TextView)findViewById(R.id.textView43);
        tw30 = (TextView)findViewById(R.id.textView44);

        tw31 = (TextView)findViewById(R.id.textView45);
        tw32 = (TextView)findViewById(R.id.textView46);
        tw33 = (TextView)findViewById(R.id.textView47);
        tw34 = (TextView)findViewById(R.id.textView48);
        tw35 = (TextView)findViewById(R.id.textView49);
        tw36 = (TextView)findViewById(R.id.textView50);
        }



    public void mostrar(View view){


        if(cambio == 0){
            tw1.setVisibility(View.VISIBLE);
            tw2.setVisibility(View.VISIBLE);
            tw3.setVisibility(View.VISIBLE);
            tw4.setVisibility(View.VISIBLE);
            tw5.setVisibility(View.VISIBLE);
            tw6.setVisibility(View.VISIBLE);
            cambio = 1;
        }else{
            cambio = 0;
            tw1.setVisibility(View.GONE);
            tw2.setVisibility(View.GONE);
            tw3.setVisibility(View.GONE);
            tw4.setVisibility(View.GONE);
            tw5.setVisibility(View.GONE);
            tw6.setVisibility(View.GONE);
        }
    }

    public void mostrar2(View view){


        if(cambio2 == 0){
            tw7.setVisibility(View.VISIBLE);
            tw8.setVisibility(View.VISIBLE);
            tw9.setVisibility(View.VISIBLE);
            tw10.setVisibility(View.VISIBLE);
            tw11.setVisibility(View.VISIBLE);
            tw12.setVisibility(View.VISIBLE);
            cambio2 = 1;
        }else{
            cambio2 = 0;
            tw7.setVisibility(View.GONE);
            tw8.setVisibility(View.GONE);
            tw9.setVisibility(View.GONE);
            tw10.setVisibility(View.GONE);
            tw11.setVisibility(View.GONE);
            tw12.setVisibility(View.GONE);
        }
    }

    public void mostrar3(View view){


        if(cambio3 == 0){
            tw13.setVisibility(View.VISIBLE);
            tw14.setVisibility(View.VISIBLE);
            tw15.setVisibility(View.VISIBLE);
            tw16.setVisibility(View.VISIBLE);
            tw17.setVisibility(View.VISIBLE);
            tw18.setVisibility(View.VISIBLE);
            cambio3 = 1;
        }else{
            cambio3 = 0;
            tw13.setVisibility(View.GONE);
            tw14.setVisibility(View.GONE);
            tw15.setVisibility(View.GONE);
            tw16.setVisibility(View.GONE);
            tw17.setVisibility(View.GONE);
            tw18.setVisibility(View.GONE);
        }
    }

    public void mostrar4(View view){


        if(cambio4 == 0){
            tw19.setVisibility(View.VISIBLE);
            tw20.setVisibility(View.VISIBLE);
            tw21.setVisibility(View.VISIBLE);
            tw22.setVisibility(View.VISIBLE);
            tw23.setVisibility(View.VISIBLE);
            tw24.setVisibility(View.VISIBLE);
            cambio4 = 1;
        }else{
            cambio4 = 0;
            tw19.setVisibility(View.GONE);
            tw20.setVisibility(View.GONE);
            tw21.setVisibility(View.GONE);
            tw22.setVisibility(View.GONE);
            tw23.setVisibility(View.GONE);
            tw24.setVisibility(View.GONE);
        }
    }

    public void mostrar5(View view){


        if(cambio5 == 0){
            tw25.setVisibility(View.VISIBLE);
            tw26.setVisibility(View.VISIBLE);
            tw27.setVisibility(View.VISIBLE);
            tw28.setVisibility(View.VISIBLE);
            tw29.setVisibility(View.VISIBLE);
            tw30.setVisibility(View.VISIBLE);
            cambio5 = 1;
        }else{
            cambio5 = 0;
            tw25.setVisibility(View.GONE);
            tw26.setVisibility(View.GONE);
            tw27.setVisibility(View.GONE);
            tw28.setVisibility(View.GONE);
            tw29.setVisibility(View.GONE);
            tw30.setVisibility(View.GONE);
        }
    }

    public void mostrar6(View view){


        if(cambio6 == 0){
            tw31.setVisibility(View.VISIBLE);
            tw32.setVisibility(View.VISIBLE);
            tw33.setVisibility(View.VISIBLE);
            tw34.setVisibility(View.VISIBLE);
            tw35.setVisibility(View.VISIBLE);
            tw36.setVisibility(View.VISIBLE);
            cambio6 = 1;
        }else{
            cambio6 = 0;
            tw31.setVisibility(View.GONE);
            tw32.setVisibility(View.GONE);
            tw33.setVisibility(View.GONE);
            tw34.setVisibility(View.GONE);
            tw35.setVisibility(View.GONE);
            tw36.setVisibility(View.GONE);
        }
    }

    public void atras(View view){
        Intent atras = new Intent(this,RealMainActivity.class);
        startActivity(atras);
    }
}
