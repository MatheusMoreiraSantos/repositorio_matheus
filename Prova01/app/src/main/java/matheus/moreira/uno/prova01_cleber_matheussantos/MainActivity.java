package matheus.moreira.uno.prova01_cleber_matheussantos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvTitulo02, tvData, tvPergunta, tvResposta, tvNome01, tvNome02;
    private EditText edtNumeroQuestao;
    private ImageButton imbClear, imbCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvTitulo02          = findViewById(R.id.tvTitulo02);
        tvData              = findViewById(R.id.tvData);
        tvPergunta          = findViewById(R.id.tvPergunta);
        tvResposta          = findViewById(R.id.tvResposta);
        tvNome01            = findViewById(R.id.tvNome01);
        tvNome02            = findViewById(R.id.tvNome02);
        edtNumeroQuestao    = findViewById(R.id.edtNumeroQuestao);
        imbClear            = findViewById(R.id.imbClear);
        imbCheck            = findViewById(R.id.imbCheck);

        imbCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!edtNumeroQuestao.getText().toString().isEmpty()){
                    int pergunta = Integer.valueOf(edtNumeroQuestao.getText().toString());
                    if(edtNumeroQuestao){

                    }


                }else{
                    Toast.makeText(MainActivity.this, "Insira o número da Questão!", Toast.LENGTH_SHORT).show();

                }
            }
        });



    }






}