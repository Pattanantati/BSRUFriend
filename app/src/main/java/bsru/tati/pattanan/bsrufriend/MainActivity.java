package bsru.tati.pattanan.bsrufriend;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Explicit การประกาศตัวแปร
    private Button SigninButton, signupButton;
    private EditText userEditText, passEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind widget คือการ initial var กับ view บน xml
        signupButton = (Button) findViewById(R.id.button2);
        signupButton = (Button) findViewById(R.id.button3);
        userEditText = (EditText) findViewById(R.id.editText);
        passEditText = (EditText) findViewById(R.id.editText2);

        // Button Controller
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SignUpActivity.class));
            }
        });
    } // main method
}   //คลาสหลัก main class
