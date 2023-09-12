package br.com.tiagors09.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText edtTextPrecoAlcool, edtTxtPrecoGasolina;
    TextView resultado;
    double precoAlcool, precoGasolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.edtTextPrecoAlcool = findViewById(R.id.edtTxtPrecoAlcool);
        this.edtTxtPrecoGasolina = findViewById(R.id.edtTxtPrecoGasolina);
        this.resultado = findViewById(R.id.resultado);
    }

    public void decidir(View v) {
        String precoGasolina = this.edtTextPrecoAlcool.getText().toString();
        String precoAlcool = this.edtTxtPrecoGasolina.getText().toString();

        if(!precoAlcool.equals("") && !precoGasolina.equals("")) {
            this.precoAlcool = Double.parseDouble(precoAlcool);
            this.precoGasolina = Double.parseDouble(precoGasolina);

            if (this.precoAlcool > this.precoGasolina) {
                this.resultado.setText("Melhor utilizar Gasolina");
            } else {
                this.resultado.setText("Melhor utilizar Alcool");
            }
        } else {
            this.resultado.setText("Preencha os campos!!!");
        }
    }
}