package addfree.osbbyx.oportunidades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class concluirActivity extends AppCompatActivity {

    public Button a,a1,a2,b,b1,b2,c,c1,c2,d,d1,d2,e,e1,e2,f,f1,f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concluir);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        a = (Button)findViewById(R.id.a);
        a1 = (Button)findViewById(R.id.a1);
        a2 = (Button)findViewById(R.id.a2);
        b = (Button)findViewById(R.id.b);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        c = (Button)findViewById(R.id.c);
        c1 = (Button)findViewById(R.id.c1);
        c2 = (Button)findViewById(R.id.c2);
        d = (Button)findViewById(R.id.d);
        d1 = (Button)findViewById(R.id.d1);
        d2 = (Button)findViewById(R.id.d2);
        e = (Button)findViewById(R.id.e);
        e1 = (Button)findViewById(R.id.e1);
        e2 = (Button)findViewById(R.id.e2);
        f = (Button)findViewById(R.id.f);
        f1 = (Button)findViewById(R.id.f1);
        f2 = (Button)findViewById(R.id.f2);

    }

    public void avanzar(View view){
        Intent avanzar = new Intent(this,avanzar.class);
        startActivity(avanzar);
    }

    public void concluira(View view){
        a.setVisibility(View.GONE);
        a1.setVisibility(View.GONE);
        a2.setVisibility(View.GONE);
    }

    public void concluirb(View view){
        b.setVisibility(View.GONE);
        b1.setVisibility(View.GONE);
        b2.setVisibility(View.GONE);
    }

    public void concluirc(View view){
        c.setVisibility(View.GONE);
        c1.setVisibility(View.GONE);
        c2.setVisibility(View.GONE);
    }

    public void concluird(View view){
        d.setVisibility(View.GONE);
        d1.setVisibility(View.GONE);
        d2.setVisibility(View.GONE);
    }

    public void concluire(View view){
        e.setVisibility(View.GONE);
        e1.setVisibility(View.GONE);
        e2.setVisibility(View.GONE);
    }

    public void concluirf(View view){
        f.setVisibility(View.GONE);
        f1.setVisibility(View.GONE);
        f2.setVisibility(View.GONE);
    }

}
