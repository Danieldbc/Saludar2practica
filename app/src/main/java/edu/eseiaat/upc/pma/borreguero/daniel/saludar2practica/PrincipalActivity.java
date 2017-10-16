package edu.eseiaat.upc.pma.borreguero.daniel.saludar2practica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {
    private TextView tvPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        tvPrincipal=(TextView)findViewById(R.id.etHolaMon);
        String actual=tvPrincipal.getText().toString();
        String inicial="mon";
        tvPrincipal.setText(String.format(actual,inicial));
    }

    public void Principal(View view) {
    }
}
