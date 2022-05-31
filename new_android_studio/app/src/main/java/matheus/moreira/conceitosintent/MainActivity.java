package matheus.moreira.conceitosintent;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button                          btnPergunta;
    private EditText                        edtPergunta;
    private TextView                        tvExibiResposta;
    private TextView                        tvAResposta;
    private ImageButton                     imbLimparLinhaPergunta;
    private static final int                REQUEST_CODE = 5;
    private ActivityResultLauncher<Intent>  activityResultLauncher;
    //<> Indica uma classe genérica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPergunta             = findViewById(R.id.btnPergunta);
        edtPergunta             = findViewById(R.id.edtPergunta);
        tvExibiResposta         = findViewById(R.id.tvExibirResposta);
        imbLimparLinhaPergunta  = findViewById(R.id.imbLimparLinhaPergunta);
        tvAResposta             = findViewById(R.id.tvAResposta);


        Bundle extras = getIntent().getExtras();
        String pergunta = "";
        if (extras != null) {
            pergunta = extras.getString("Pergunta");
            tvExibiResposta.setText(pergunta);
        }

        btnPergunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edtPergunta.getText().toString().isEmpty()) {
                    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.R) {
                        Intent intent = new Intent(MainActivity.this, RespostaActivity.class);

                        String myString = edtPergunta.getText().toString();
                        intent.putExtra("Pergunta", myString);

                        if (!tvExibiResposta.getText().toString().isEmpty()) {
                            String myResposta = tvExibiResposta.getText().toString();
                            intent.putExtra("Resposta", myResposta);
                        }

                        startActivityForResult(intent, REQUEST_CODE);
                    } else {
                        openActivityForResult();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Por favor insira uma pergunta", Toast.LENGTH_SHORT).show();
                }
            }
        });

        imbLimparLinhaPergunta.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick (View view){
                edtPergunta.setText("");
                tvExibiResposta.setText(""); }
        });

        activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    Intent data = result.getData();
                    tvExibiResposta.setText(data.getExtras().toString());
                }
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if ((requestCode == REQUEST_CODE) && (resultCode == RESULT_OK)) {

            String perguntaRetornadaDaActivityResposta = data.getExtras().getString("Pergunta");
            String resposta = data.getExtras().getString("respostaDadaPeloUsuario");

            if (resposta != null) {
                if (!resposta.isEmpty()) {
                    tvAResposta.setVisibility(View.VISIBLE);
                    tvExibiResposta.setText(resposta);
                }
            }

            if (perguntaRetornadaDaActivityResposta != null) {
                if (!perguntaRetornadaDaActivityResposta.isEmpty()) {
                    edtPergunta.setText(perguntaRetornadaDaActivityResposta);
                }
            }
        }





    }

    public void openActivityForResult(){
        //Instanciação dinâmica de objeto;
        //Desta forma, o objeto é considerado uma variável local;
        Intent intent = new Intent(MainActivity.this, RespostaActivity.class);

        intent.putExtra("Pergunta", edtPergunta.getText().toString());

        activityResultLauncher.launch(intent);

    }












}






















