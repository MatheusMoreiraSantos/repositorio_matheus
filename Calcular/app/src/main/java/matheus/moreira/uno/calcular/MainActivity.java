package matheus.moreira.uno.calcular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static final String DIVISAO         = "Divisão";
    private static final String MULTIPLICACAO   = "Multiplição";
    private static final String SOMA            = "Soma";
    private static final String SuBTRACAO       = "Subtração";
    private EditText edtOperando, edtOperando2;
    private TextView tvOpcao, tvOperacao, tvResultado;
    private Spinner spiOpcoes;
    private ImageView imgOperacao, imgOperacao2;
    private Button btnCalcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtOperando         = findViewById(R.id.edtOperando1);
        edtOperando2        = findViewById(R.id.edtOperando2);
        tvOpcao             = findViewById(R.id.tvOpcao);
        tvOperacao          = findViewById(R.id.tvOperacao);
        tvResultado         = findViewById(R.id.tvResultado);
        spiOpcoes           = findViewById(R.id.spiOpcoes);
        imgOperacao         = findViewById(R.id.imgOperacao);
        imgOperacao2        = findViewById(R.id.imgOperacao2);
        btnCalcular         = findViewById(R.id.btnCalcular);

        //Cria/instancia os elementos contidos no strings.xml; Lista de operações matemáticas criada;
        ArrayAdapter<String> adapterOpcoesMatematicas = new ArrayAdapter<String>(this
                , android.R.layout.simple_spinner_item
                , getResources().getStringArray(R.array.operacoes_matematica));
        adapterOpcoesMatematicas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spiOpcoes.setAdapter(adapterOpcoesMatematicas);
        spiOpcoes.setOnItemSelectedListener(this);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Pega a opção selecionada no SPINNER
                String opcaoSelecionada = spiOpcoes.getSelectedItem().toString();

                if(opcaoSelecionada == DIVISAO){

                }


            }
        });









    }


    //Adapter tem a ver com o adapter criado anteriormente e a View com o Spinner e seu objeto;
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        




    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}