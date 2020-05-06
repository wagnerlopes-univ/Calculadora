package br.com.dlweb.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText numero1;
    EditText numero2;
    TextView resultado;
    ListView lista_resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.etNum1);
        numero2 = findViewById(R.id.etNum2);
        resultado = findViewById(R.id.tvRes);
        lista_resultado = findViewById(R.id.tvListRes);
    }

    public void adicaoResultado (View v) {
        resultado.setText("");
        String num1St = numero1.getText().toString().trim();
        String num2St = numero2.getText().toString().trim();

        if (num1St.equals("") || num2St.equals("")) {
            Toast.makeText(this, "Por favor, informar os dois números!", Toast.LENGTH_LONG).show();
        } else {
            float res = Float.valueOf(num1St) + Float.valueOf(num2St);
            resultado.setText("Resultado: " + res);
            lista_resultado.add("Resultado: " + res);
        }
    }


    public void divisaoResultado (View v) {
        resultado.setText("");
        String num1St = numero1.getText().toString().trim();
        String num2St = numero2.getText().toString().trim();

        if (num1St.equals("") || num2St.equals("")) {
            Toast.makeText(this, "Por favor, informar os dois números!", Toast.LENGTH_LONG).show();
        } else {
            float res = Float.valueOf(num1St) * Float.valueOf(num2St);
            resultado.setText("Resultado: " + res);
            lista_resultado.add("Resultado: " + res);

        }
    }

    public void divisaoResultado (View v) {
        resultado.setText("");
        String num1St = numero1.getText().toString().trim();
        String num2St = numero2.getText().toString().trim();

        if (num1St.equals("") || num2St.equals("")) {
            Toast.makeText(this, "Por favor, informar os dois números!", Toast.LENGTH_LONG).show();
        } else {
            float res = Float.valueOf(num1St) / Float.valueOf(num2St);
            resultado.setText("Resultado: " + res);
            lista_resultado.add("Resultado: " + res);

        }
    }


    public void subtracaoResultado (View v) {
        resultado.setText("");
        String num1St = numero1.getText().toString().trim();
        String num2St = numero2.getText().toString().trim();

        if (num1St.equals("") || num2St.equals("")) {
            Toast.makeText(this, "Por favor, informar os dois números!", Toast.LENGTH_LONG).show();
        } else {
            float res = Float.valueOf(num1St) - Float.valueOf(num2St);
            resultado.setText("Resultado: " + res);
            lista_resultado.add("Resultado: " + res);

        }
    }

}
