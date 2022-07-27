package desenv.ti.conceitosmor.ui;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import desenv.ti.conceitosmor.R;
import desenv.ti.conceitosmor.database_app.async_crud.AsyncAlunoCRUD;
import desenv.ti.conceitosmor.database_app.tabelas.Aluno;

public class CadastroAlunoActivity extends AppCompatActivity {
    private ImageButton imgbSalvar, imgbCancelar;
    private EditText edtNomeAluno, edtCelular, edtEmail, edtUsuarioGitHub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aluno);

        imgbCancelar     = findViewById(R.id.imgbCancelar);
        imgbSalvar       = findViewById(R.id.imgbSalvar);
        edtCelular       = findViewById(R.id.edtCelular);
        edtEmail         = findViewById(R.id.edtEmail);
        edtNomeAluno     = findViewById(R.id.edtNomeAluno);
        edtUsuarioGitHub = findViewById(R.id.edtUsuarioGitHub);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setTitle("Cadastro de Alunos");
            //actionBar.setDisplayShowHomeEnabled(true);
            //actionBar.setDisplayHomeAsUpEnabled(true);
        }

        imgbSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dataValidation()) {
                    //Construtor p/ operações CRUD do tipo Insert
                    AsyncAlunoCRUD asyncAlunoCRUD = new AsyncAlunoCRUD(getApplicationContext());
                    asyncAlunoCRUD.execute(createAlunoRecord());
                    closeActivity();
                }
            }
        });

        imgbCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closeActivity();
            }
        });

    }

    private boolean dataValidation(){

        if(edtNomeAluno.getText().toString().isEmpty()){
            Toast.makeText(this, "Por favor, informe o nome do aluno.", Toast.LENGTH_SHORT).show();
            edtNomeAluno.requestFocus();
            return  false;
        } else if(edtCelular.getText().toString().isEmpty()){
            Toast.makeText(this, "Por favor, informe o número do celular.", Toast.LENGTH_SHORT).show();
            edtCelular.requestFocus();
            return  false;
        } else if(edtEmail.getText().toString().isEmpty()){
            Toast.makeText(this, "Por favor, informe o email.", Toast.LENGTH_SHORT).show();
            edtEmail.requestFocus();
            return  false;
        } else if(edtUsuarioGitHub.getText().toString().isEmpty()){
            Toast.makeText(this, "Por favor, informe o seu usuário do GitHUb.", Toast.LENGTH_SHORT).show();
            edtUsuarioGitHub.requestFocus();
            return  false;
        }

        return true;
    }

    private void closeActivity(){
        finish();
    }

    private Aluno createAlunoRecord(){

        Aluno tblAluno = new Aluno();
        tblAluno.setNome(edtNomeAluno.getText().toString());
        tblAluno.setCelular(edtCelular.getText().toString());
        tblAluno.setEmail(edtEmail.getText().toString());
        tblAluno.setGitHubUsuario(edtUsuarioGitHub.getText().toString());

        return  tblAluno;
    }
}