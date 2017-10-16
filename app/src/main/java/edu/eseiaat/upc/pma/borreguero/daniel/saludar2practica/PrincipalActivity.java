package edu.eseiaat.upc.pma.borreguero.daniel.saludar2practica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {
    private TextView tvPrincipal;
    private String actual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        tvPrincipal=(TextView)findViewById(R.id.etHolaMon);
        actual=tvPrincipal.getText().toString();
        String inicial=getString(R.string.mundo);
        tvPrincipal.setText(String.format(actual,inicial));

    }

    public void Principal(View view) {
        Intent intent=new Intent(this,SecundariaActivity.class);
        startActivityForResult(intent,SecundariaActivity.pasar);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==SecundariaActivity.pasar){
            if (resultCode==RESULT_OK){
                String cambiar=data.getExtras().getString(SecundariaActivity.keyname);
                tvPrincipal.setText(String.format(actual,cambiar));
            }
        }

    }
}
