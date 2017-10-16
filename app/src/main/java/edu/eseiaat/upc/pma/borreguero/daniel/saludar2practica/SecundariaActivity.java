package edu.eseiaat.upc.pma.borreguero.daniel.saludar2practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecundariaActivity extends AppCompatActivity {
    private EditText etSecundaria;
    public static int pasar=1;
    public static String keyname="keyname";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);

        etSecundaria=(EditText)findViewById(R.id.etSecundario);
    }

    public void Secundario(View view) {
        String nom=etSecundaria.getText().toString();
        Intent data=new Intent();
        data.putExtra(keyname,nom);
        setResult(RESULT_OK,data);
        finish();
    }
}
