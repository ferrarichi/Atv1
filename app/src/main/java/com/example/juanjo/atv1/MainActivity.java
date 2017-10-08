package com.example.juanjo.atv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{


    private Button btnEnviar;
    private EditText editText;
    private RadioButton rButtonHom, rButtonMuj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = (Button) findViewById(R.id.buttonEnviar);
        editText = (EditText) findViewById(R.id.editText3);
        rButtonHom = (RadioButton) findViewById(R.id.radioButton2);
        rButtonMuj = (RadioButton) findViewById(R.id.radioButton);

        btnEnviar.setOnClickListener(this);


    }



    public void onRadioButtonClicked(View view) {

        // Is the button now checked?

        boolean checked = ((RadioButton) view).isChecked();

        // hacemos un case con lo que ocurre cada vez que pulsemos un botón

        switch (view.getId()) {
            case R.id.radioButton:
                if (checked)
                    //
                    break;
            case R.id.radioButton2:
                if (checked)
                    //
                    break;
        }
    }

    @Override
    public void onClick(View v) {

        Intent explicit_intent;//Declaro el Intent

        //Instanciamos el Intent dandole:
        // el contexto y la clase a la cual nos deseamos dirigir
        explicit_intent = new Intent(this,Main2Activity.class);


        String auxEdiNombre=editText.getText().toString();
        String auxSexo = "";

        if(rButtonHom.isChecked()){
            auxSexo="Hombre";

        }else{
            auxSexo="Mujer";
        }


        explicit_intent.putExtra("nombre",auxEdiNombre);//Guardamos una cadena
        explicit_intent.putExtra("sexo", auxSexo);

        //lo iniciamos pasandole la intencion, con todos sus parametros guardados
        startActivity(explicit_intent);
    }
}

