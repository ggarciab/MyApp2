package app.ggarciab.com.myapp2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    //agregar

    private static final String TAG = "MainActivity";

    EditText mETusername1;
    EditText mETusername2;
    EditText mETusername3;
    EditText mETusername4;
    Button btn_mostrar;
    Button btn_cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mETusername1 = (EditText) findViewById(R.id.et_username1);
        mETusername2 = (EditText) findViewById(R.id.et_username2);
        mETusername3 = (EditText) findViewById(R.id.et_username3);
        mETusername4 = (EditText) findViewById(R.id.et_username4);
        btn_mostrar = (Button) findViewById(R.id.btn_mostrar);
        btn_cancelar = (Button) findViewById(R.id.btn_cancelar);


        btn_mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            //ocultar keyboard
            View v = Main2Activity.this.getCurrentFocus();
            if(v !=null){
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(),0);
                        }

            Intent intent = new Intent(Main2Activity.this,Main3Activity.class);


            String nombre = mETusername1.getText().toString();
            intent.putExtra("DATO1",nombre);
            String apellido = mETusername2.getText().toString();
            intent.putExtra("DATO2",apellido);
            String correo = mETusername3.getText().toString();
            intent.putExtra("DATO3",correo);
            String usuario = mETusername4.getText().toString();
            intent.putExtra("DATO4",usuario);

            startActivity(intent);


                 }
                 }
                 );


        btn_cancelar.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  Intent intent = new Intent(Main2Activity.this,MainActivity.class);
                  startActivity(intent);
                }
            }
        );
        }
    }
