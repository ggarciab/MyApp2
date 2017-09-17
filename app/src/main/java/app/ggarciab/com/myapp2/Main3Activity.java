package app.ggarciab.com.myapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    //agregar

    private static final String TAG = "MainActivity";

    TextView mETusername5;
    TextView mETusername6;
    TextView mETusername7;
    TextView mETusername8;
    Button btn_cerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        mETusername5 = (TextView) findViewById(R.id.et_username5);
        mETusername6 = (TextView) findViewById(R.id.et_username6);
        mETusername7 = (TextView) findViewById(R.id.et_username7);
        mETusername8 = (TextView) findViewById(R.id.et_username8);
        btn_cerrar = (Button) findViewById(R.id.btn_cerrar);

        Intent intent2 = getIntent();
        Bundle extras = intent2.getExtras();

        if(extras!=null){
            String nombre = extras.getString("DATO1");
            mETusername5.setText(nombre);
            String apellido = extras.getString("DATO2");
            mETusername6.setText(apellido);
            String correo = extras.getString("DATO3");
            mETusername7.setText(correo);
            String usuario = extras.getString("DATO4");
            mETusername8.setText(usuario);
        }


        btn_cerrar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
             Intent intent = new Intent(Main3Activity.this,MainActivity.class);
             startActivity(intent);
                  }
             }
                                    );

    }
}
