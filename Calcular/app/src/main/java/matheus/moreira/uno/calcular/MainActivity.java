package matheus.moreira.uno.calcular;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener { //AdapterView é uma classe da API do java e o OnItem é a interface;
    public static final String TAG = "MainActivity";
    private static final String DIVISAO = "Dividir";
    private static final String MULTIPLICACAO = "Multiplicar";
    private static final String SOMA = "Somar";
    private static final String SUBTRACAO = "Subtrair";
    private EditText edtOperando1, edtOperando2;
    private TextView tvOpcao, tvResultado;
    private Spinner spiOpcoes;
    private ImageView imgOperacao, imgIgual;
    private Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("Calcular");
        }


        edtOperando1 = findViewById(R.id.edtOperando1);
        edtOperando2 = findViewById(R.id.edtOperando2);
        tvOpcao = findViewById(R.id.tvOpcao);
        tvResultado = findViewById(R.id.tvResultado);
        spiOpcoes = findViewById(R.id.spiOpcoes);
        imgOperacao = findViewById(R.id.imgOperacao);
        imgIgual = findViewById(R.id.imgIgual);
        btnCalcular = findViewById(R.id.btnCalcular);

        //Cria/instancia os elementos contidos no strings.xml; Lista de operações matemáticas criada;
        ArrayAdapter<String> adapterOpcoesMatematicas = new ArrayAdapter<String>(this
                , android.R.layout.simple_spinner_item
                , getResources().getStringArray(R.array.operacoes_matematica));
        adapterOpcoesMatematicas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); //android.R.layout mostra uma opção matemática embaixo da outra na lista do spinner;
        //getResources pega os elementos que estão no resource(strings);


        spiOpcoes.setAdapter(adapterOpcoesMatematicas);
        spiOpcoes.setOnItemSelectedListener(this);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View view) {
                //Pega a opção selecionada no SPINNER
                String opcaoSelecionada = spiOpcoes.getSelectedItem().toString();

                if (opcaoSelecionada.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor, escolha uma operação matemática!", Toast.LENGTH_SHORT).show();

                } else if (edtOperando1.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor, insira um valor! ", Toast.LENGTH_SHORT).show();

                } else if (edtOperando2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor, insira um valor!", Toast.LENGTH_SHORT).show();

                } else if (opcaoSelecionada.equals(DIVISAO)) {
                    tvResultado.setText(divisao());

                } else if (opcaoSelecionada.equals(MULTIPLICACAO)) {
                    tvResultado.setText(multiplicacao());

                    //equals() é um compara objetos
                } else if (opcaoSelecionada.equals(SOMA)) {
                    tvResultado.setText(somar());

                } else if (opcaoSelecionada.equals(SUBTRACAO)) {
                    tvResultado.setText(subtrair());

                }

            }
        });


    }


    //Adapter tem a ver com o adapter criado anteriormente e a View com o Spinner e seu objeto;
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        //Toast.makeText(this, adapterView.getItemAtPosition(i).toString(), Toast.LENGTH_SHORT).show();


        imgOperacao.setVisibility(View.VISIBLE);

        if (adapterView.getItemAtPosition(i).toString().equals(DIVISAO)) {
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.divisao, getTheme()));
            edtOperando1.setHint("dividendo");
            edtOperando2.setHint("divisor");
            tvResultado.setHint("quociente");

        } else if (adapterView.getItemAtPosition(i).toString().equals(MULTIPLICACAO)) {
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.multiplica, getTheme()));
            edtOperando1.setHint("fator");
            edtOperando2.setHint("fator");
            tvResultado.setHint("produto");

        } else if (adapterView.getItemAtPosition(i).toString().equals(SOMA)) {
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.soma, getTheme()));
            edtOperando1.setHint("parcela");
            edtOperando2.setHint("parcela");
            tvResultado.setHint("total");

        } else if (adapterView.getItemAtPosition(i).toString().equals(SUBTRACAO)) {
            imgOperacao.setImageDrawable(getResources().getDrawable(R.drawable.subtracao, getTheme()));
            edtOperando1.setHint("minuendo");
            edtOperando2.setHint("subtraendo");
            tvResultado.setHint("diferença");

        } else {
            Log.d(TAG, "Nenhuma opção foi selecionada");
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    private String somar() {

        int n1  = Integer.valueOf(edtOperando1.getText().toString()).intValue();
        int n2  = Integer.valueOf(edtOperando2.getText().toString()).intValue();
        int res = n1 + n2;

        String resultado = Integer.toString(res);

        return "O resultado da operação matemática é: " + resultado;
    }

    private String subtrair() {

        int n1  = Integer.valueOf(edtOperando1.getText().toString()).intValue();
        int n2  = Integer.valueOf(edtOperando2.getText().toString()).intValue();
        int res = n1 - n2;

        String resultado = Integer.toString(res);

        return "O resultado da operação matemática é: " + resultado;
    }

    private String multiplicacao() {

        int n1  = Integer.valueOf(edtOperando1.getText().toString()).intValue();
        int n2  = Integer.valueOf(edtOperando2.getText().toString()).intValue();
        int res = n1 * n2;

        String resultado = Integer.toString(res);

        return "O resultado da operação matemática é: " + resultado;
    }

    private String divisao() {

        int n1  = Integer.valueOf(edtOperando1.getText().toString()).intValue();
        int n2  = Integer.valueOf(edtOperando2.getText().toString()).intValue();
        int res = n1 / n2;

        String resultado = Integer.toString(res);

        return "O resultado da operação matemática é: " + resultado;

    }

    private void validarOperacao(){



    }









}