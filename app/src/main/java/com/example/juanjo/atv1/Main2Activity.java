package com.example.juanjo.atv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    private TextView benv;
    private Button btnCancel, btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        //Enllacem elements del xml amb objectes java
        benv = (TextView) findViewById(R.id.bienvenido);
        btnCancel = (Button) findViewById(R.id.btn_cancelar);
        btnContinuar = (Button) findViewById(R.id.btn_continuar);

        //Afegim l'intent que ha llençat este activity

        Intent i = getIntent();

        Bundle parameRebuts = i.getExtras();

        if(parameRebuts!= null){
             String elNom = parameRebuts.getString("nombre");
            String elSexo = parameRebuts.getString("sexo");

             benv.setText("Hola, " +elNom+" tu sexo es: " + elSexo+ " introduce tu edad: ");
        }

        //Afegim listener al bottons de continuar y cancelar

        /*btnCancel.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v){
                    setResult(RESULT_CANCELED);
                    finish();
                 }

        )};

        btnContinuar.setOnClickListener(new View.OnClickListener(){

                public void onClick(View v){
                    setResult(RESULT_CANCELED);
                    finish();
                }
            )

            ;}*/


    }






}
