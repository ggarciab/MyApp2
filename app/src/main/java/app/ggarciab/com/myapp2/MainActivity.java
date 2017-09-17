package app.ggarciab.com.myapp2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //agregar

    private static final String TAG = "MainActivity";

    private EditText mETusername;
    private EditText mETPassword;
    private Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("", "estamos en onCreate()");

        mETusername = (EditText) findViewById(R.id.et_username);
        mETPassword = (EditText) findViewById(R.id.et_password);
        mBtnLogin = (Button) findViewById(R.id.btn_login);

        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //ocultar keyboard
                View v = MainActivity.this.getCurrentFocus();
                if(v !=null){
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(v.getWindowToken(),0);
                }


                String username = mETusername.getText().toString();
                String password = mETPassword.getText().toString();


                if (username.equals("ggarciab") && password.equals("123456")) {
                    Toast.makeText(MainActivity.this, "las credenciales son correctas", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "las credenciales son incorrectas", Toast.LENGTH_SHORT).show();
                }
                 }
        }
        );

    }
}
