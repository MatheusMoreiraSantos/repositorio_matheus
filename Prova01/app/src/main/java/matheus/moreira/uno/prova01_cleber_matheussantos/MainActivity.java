package matheus.moreira.uno.prova01_cleber_matheussantos;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final int Q1 = 1;
    public static final int Q2 = 2;
    public static final int Q3 = 3;
    public static final int Q4 = 4;
    public static final int Q5 = 5;
    public static final int Q6 = 6;
    private TextView tvTitulo, tvData, tvPergunta, tvResposta, tvNome01, tvNome02;
    private EditText edtNumeroQuestao;
    private ImageButton imbClear, imbCheck;
    private ProvaQuestoesRespostas prova01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitulo            = findViewById(R.id.tvTitulo);
        tvData              = findViewById(R.id.tvData);
        tvPergunta          = findViewById(R.id.tvPergunta);
        tvResposta          = findViewById(R.id.tvResposta);
        tvNome01            = findViewById(R.id.tvNome01);
        tvNome02            = findViewById(R.id.tvNome02);
        edtNumeroQuestao    = findViewById(R.id.edtNumeroQuestao);
        imbCheck            = findViewById(R.id.imbCheck);
        imbClear            = findViewById(R.id.imbClear);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setTitle("Desenvolvedores em TI");
        }

        prova01 = new ProvaQuestoesRespostas();

        imbCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edtNumeroQuestao.getText().toString().isEmpty()){

                    Toast.makeText(MainActivity.this, "Por favor, insira o número da questão!", Toast.LENGTH_SHORT).show();

                } else if(Integer.parseInt(edtNumeroQuestao.getText().toString()) == Q2){
                    tvPergunta.setText(prova01.getQuestao02());
                    tvResposta.setText(prova01.getResposta02());
                }else if(Integer.parseInt(edtNumeroQuestao.getText().toString()) == Q3){
                    tvPergunta.setText(prova01.getQuestao03());
                    tvResposta.setText(prova01.getResposta03());
                }else if(Integer.parseInt(edtNumeroQuestao.getText().toString()) == Q4){
                    tvPergunta.setText(prova01.getQuestao04());
                    tvResposta.setText(prova01.getResposta04());
                }else if(Integer.parseInt(edtNumeroQuestao.getText().toString()) == Q5){
                    tvPergunta.setText(prova01.getQuestao05());
                    tvResposta.setText(prova01.getResposta05());
                }else if(Integer.parseInt(edtNumeroQuestao.getText().toString()) == Q6){
                    tvPergunta.setText(prova01.getQuestao06());
                    tvResposta.setText(prova01.getResposta06());
                }else {
                        Toast.makeText(MainActivity.this, "Por favor, insira um número válido!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        imbClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumeroQuestao.setText("");
                tvPergunta.setText("");
                tvResposta.setText("");

                tvPergunta.setText(prova01.getPergunta());
                tvResposta.setText(prova01.getResposta());
            }
        });


        tvPergunta.setText(prova01.getPergunta());
        tvResposta.setText(prova01.getResposta());

        tvNome01.setText(prova01.getNome01());
        tvNome02.setText(prova01.getNome02());



    }

}