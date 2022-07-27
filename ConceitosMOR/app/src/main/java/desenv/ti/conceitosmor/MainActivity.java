package desenv.ti.conceitosmor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.nambimobile.widgets.efab.ExpandableFab;
import com.nambimobile.widgets.efab.FabOption;

import desenv.ti.conceitosmor.ui.CadastroAlunoActivity;

public class MainActivity extends AppCompatActivity {
    private ExpandableFab expandableFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableFab = findViewById(R.id.expandable_fab);

        FabOption fabOptionAluno = findViewById(R.id.fabOptionAluno);
        fabOptionAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CadastroAlunoActivity.class);
                startActivity(intent);
            }
        });

        FabOption fabOptionProva = findViewById(R.id.fabOptionProva);
        fabOptionProva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Não implementado", Toast.LENGTH_SHORT).show();
            }
        });

        FabOption fabOptionAlunoProva = findViewById(R.id.fabOptionAlunoProva);
        fabOptionAlunoProva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Não implementado", Toast.LENGTH_SHORT).show();
            }
        });

        FabOption fabOptionPergunta = findViewById(R.id.fabOptionPergunta);
        fabOptionPergunta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Não implementado", Toast.LENGTH_SHORT).show();
            }
        });

        FabOption fabOptionResposta = findViewById(R.id.fabOptionResposta);
        fabOptionResposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Não implementado", Toast.LENGTH_SHORT).show();
            }
        });




    }
}