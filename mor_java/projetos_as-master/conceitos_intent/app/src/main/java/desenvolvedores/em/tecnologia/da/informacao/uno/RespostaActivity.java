package desenvolvedores.em.tecnologia.da.informacao.uno;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class RespostaActivity extends AppCompatActivity {
    private Button btnResponder;
    private TextView tvPergunta;
    private EditText edtResposta;
    private ImageButton btnDeleteResposta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayShowHomeEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        btnResponder         = findViewById(R.id.btnResponder);
        tvPergunta           = findViewById(R.id.tvPergunta);
        edtResposta          = findViewById(R.id.edtResposta);
        btnDeleteResposta    = findViewById(R.id.btnDeleteResposta);
        Bundle extras        = getIntent().getExtras();


        String pergunta = "";
        if(extras != null){
            pergunta = extras.getString("Pergunta");
            tvPergunta.setText(pergunta + "?");
        }

        btnDeleteResposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtResposta.setText("");
                tvPergunta.setText("");
            }
        });

        btnResponder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }

    @Override
    public void finish() {
        Intent data = new Intent();

        String returnString = edtResposta.getText().toString();
        data.putExtra("returnData", returnString);

        setResult(RESULT_OK, data);
        super.finish();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{
                finish();
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }


}

