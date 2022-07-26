package matheus.moreira.uno.morintegracaocomjava.database_app.tabelas;


import android.renderscript.Sampler;

import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.Insert;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_prova"
        , indices = {@Index(value = "id", unique = true)})


public class Prova {
    @PrimaryKey()
    private int id;
    private String disciplina;

    public Prova(Prova tblProva){
        this.id         = tblProva.getId();
        this.disciplina = tblProva.getDisciplina();
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
