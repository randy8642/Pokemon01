package com.example.user.pokemon01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView infoText;
    EditText nameEditText;
    RadioGroup optionGroup;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main);

        infoText=(TextView)findViewById(R.id.infoText);
        nameEditText=(EditText)findViewById(R.id.nameEditText);
        optionGroup=(RadioGroup)findViewById(R.id.optionGroup);
        Button confirmBtn=(Button)findViewById(R.id.comfirmButton);
        confirmBtn.setOnClickListener(MainActivity.this);


    }
    


    @Override
    public void onClick(View v) {
        int viewId=v.getId();
        if (viewId==R.id.comfirmButton){
            Log.d("button","confirmBtn was clicked ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }

    }
}
