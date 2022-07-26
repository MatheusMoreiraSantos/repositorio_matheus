package desenvolvedores.em.tecnologia.da.informacao.calcular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
     static final String TAG           = "MainActivity";
     private static final String DIVISAO       = "Divisão";
     private static final String MULTIPLICACAO = "Multiplicação";
     private static final String SOMA          = "Soma";
     private static final String SUBTRACAO     = "Subtração";
     private static final String EXPONENCIACAO = "Exponenciação";
     private static final String LOGARITMO     = "Logaritmo";
     private static final String RAIZ_QUADRADA = "Raiz Quadrada";
     private static final String POTENCIA_DE_10= "Potência de 10";
     Spinner spiOpcoes;
     Button btnCalcular;
     private ImageView imgOperacao;
     private TextView tvResultado;
     private EditText edtOperando1, edtOperando2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spiOpcoes   = findViewById(R.id.spiOpcoes);
        btnCalcular = findViewById(R.id.btnCalcular);
        imgOperacao = findViewById(R.id.imgOperacao);
        tvResultado = findViewById(R.id.tvResultado);
        edtOperando1= findViewById(R.id.edtOperando1);
        edtOperando2= findViewById(R.id.edtOperando2);

        Log.d(TAG, "onCreate: " + toString());

        imgOperacao.setVisibility(View.INVISIBLE);

        ArrayAdapter<String> adapterOpcoesMatematicas = new ArrayAdapter<>(this
                , android.R.layout.simple_spinner_item
                , getResources().getStringArray(R.array.operacoes_matematicas));
        adapterOpcoesMatematicas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spiOpcoes.setAdapter(adapterOpcoesMatematicas);
        spiOpcoes.setOnItemSelectedListener(this);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validarOperacao(spiOpcoes.getSelectedItem().toString())){
                    efetuarCalculo(spiOpcoes.getSelectedItem().toString());
                }
            }
        });
    }

     @Override
     public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

         imgOperacao.setVisibility(View.VISIBLE);
         if(adapterView.getItemAtPosition(i).toString().equals(DIVISAO)){
             imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.divisao, getTheme()));
             edtOperando1.setHint("Dividendo");
             edtOperando2.setHint("Divisor");

         } else if(adapterView.getItemAtPosition(i).toString().equals(MULTIPLICACAO)){
             imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.multiplica, getTheme()));
             edtOperando1.setHint("Multiplicando");
             edtOperando2.setHint("Multiplicador");

         } else if(adapterView.getItemAtPosition(i).toString().equals(SOMA)){
             imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.soma, getTheme()));
             edtOperando1.setHint("Parcela");
             edtOperando2.setHint("Parcela");

         } else if(adapterView.getItemAtPosition(i).toString().equals(SUBTRACAO)){
             imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.subtracao, getTheme()));
             edtOperando1.setHint("Minuendo");
             edtOperando2.setHint("Subtraendo");

         }
         else if(adapterView.getItemAtPosition(i).toString().equals(EXPONENCIACAO)){
             imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.x_elevado_y, getTheme()));
         }
         else if(adapterView.getItemAtPosition(i).toString().equals(LOGARITMO)){
             imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.ic_log, getTheme()));
         }
         else if(adapterView.getItemAtPosition(i).toString().equals(RAIZ_QUADRADA)){
             imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.square_root, getTheme()));
         }
         else if(adapterView.getItemAtPosition(i).toString().equals(POTENCIA_DE_10)){
             imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.pot10, getTheme()));
         } else{
             imgOperacao.setVisibility(View.INVISIBLE);
         }
     }

     @Override
     public void onNothingSelected(AdapterView<?> adapterView) {

     }

     private boolean validarOperacao(String tipoOperacao){
        boolean op1 = validarTermoVazio(edtOperando1);
        boolean op2 = validarTermoVazio(edtOperando2);

         if(tipoOperacao.equals(DIVISAO)){
             if(op1){
                 Toast.makeText(this, "Informe o dividendo", Toast.LENGTH_SHORT).show();
                 edtOperando1.requestFocus();
                 return false;
             } else if(op2){
                 Toast.makeText(this, "Informe o divisor", Toast.LENGTH_SHORT).show();
                 edtOperando2.requestFocus();
                 return false;
             } else if(validarDivisor()){
                 Toast.makeText(this, "Divisão por ZERO inválida.", Toast.LENGTH_SHORT).show();
                 edtOperando2.requestFocus();
                 return false;
             }

         } else if(tipoOperacao.equals(MULTIPLICACAO)){
             if(op1){
                 Toast.makeText(this, "Informe o Multiplicando", Toast.LENGTH_SHORT).show();
                 edtOperando1.requestFocus();
                 return false;
             } else if(op2){
                 Toast.makeText(this, "Informe o Multiplicador", Toast.LENGTH_SHORT).show();
                 edtOperando2.requestFocus();
                 return false;
             }
         } else if(tipoOperacao.equals(SOMA)){
             if(op1){
                 Toast.makeText(this, "Informe a Parcela", Toast.LENGTH_SHORT).show();
                 edtOperando1.requestFocus();
                 return false;
             } else if(op2){
                 Toast.makeText(this, "Informe a Parcela", Toast.LENGTH_SHORT).show();
                 edtOperando2.requestFocus();
                 return false;
             }
         } else if(tipoOperacao.equals(SUBTRACAO)){
             if(op1){
                 Toast.makeText(this, "Informe o Minuendo", Toast.LENGTH_SHORT).show();
                 edtOperando1.requestFocus();
                 return false;
             } else if(op2){
                 Toast.makeText(this, "Informe o Subtraendo", Toast.LENGTH_SHORT).show();
                 edtOperando2.requestFocus();
                 return false;
             }
         } else{
             Toast.makeText(MainActivity.this, "Por favor, selecione uma operação matemática.", Toast.LENGTH_SHORT).show();
             return  false;
         }

         return true;
     }

     String dividir(int dividendo, int divisor) {
        String resultado = "";

        if(divisor != 0)
            resultado = String.valueOf(dividendo / divisor);

        return resultado;
     }

     private boolean validarDivisor(){
        //Nas operações de divisão o edtOperando2 é o divisor e não pode ser zero
        return Integer.valueOf(edtOperando2.getText().toString()) == 0 ? true : false;
     }

     private String multiplicar(int multiplicando, int multiplicador) {
         String resultado = "";

         resultado = String.valueOf(multiplicando * multiplicador);

         return resultado;
     }

     private String somar(int parcela1, int parcela2) {
         String resultado = "";

         resultado = String.valueOf(parcela1 + parcela2);

         return resultado;
     }

     private String subtrair(int minuendo, int subtraendo) {
         String resultado = "";

         resultado = String.valueOf(minuendo - subtraendo);

         return resultado;
     }

     private boolean validarTermoVazio(EditText editText){
         return editText.getText().toString().isEmpty();
     }

     private void efetuarCalculo(String tipoOperacao){
        String resultado = "";
        int op1          = Integer.valueOf(edtOperando1.getText().toString()).intValue();
        int op2          = Integer.valueOf(edtOperando2.getText().toString()).intValue();

        if(tipoOperacao.equals(DIVISAO)){
            resultado = "O resultado da divisão é: "
                    + dividir(op1, op2);

        } else if(tipoOperacao.equals(MULTIPLICACAO)){
            resultado = "O resultado da multiplicação é: "
                    + multiplicar(op1, op2);

        } else if(tipoOperacao.equals(SOMA)){
            resultado = "O resultado da soma é: "
                    + somar(op1, op2);

        } else if(tipoOperacao.equals(SUBTRACAO)){
            resultado = "O resultado da subtração é: "
                    + subtrair(op1, op2);
        }

         tvResultado.setText(resultado);
     }

     

     public static String getSOMA() {
         return SOMA;
     }

     @Override
     public String toString() {
         return "MainActivity{" +
                 "Operação matemática selecionada: " + spiOpcoes.getSelectedItem().toString() +
                 ", resultado da operação: " + tvResultado +
                 '}';
     }
 }