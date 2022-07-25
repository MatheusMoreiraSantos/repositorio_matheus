package matheus.moreira.uno.morintegracaocomjava.database_app.tabelas;


import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName  = "tbl_aluno",
          indices  = {@Index(value = "id", unique = true)}) //Faz com que as consultas se tornem mais rápidas;

public class Aluno {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nome, celular, email, github_usuario;

    //Construtor de cópia;
    public Aluno(Aluno tblAluno) {
        this.id             = tblAluno.getId();
        this.nome           = tblAluno.getNome();
        this.celular        = tblAluno.getCelular();
        this.email          = tblAluno.getEmail();
        this.github_usuario = tblAluno.getGithub_usuario();
    }


    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGithub_usuario() {
        return github_usuario;
    }

    public void setGithub_usuario(String github_usuario) {
        this.github_usuario = github_usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
