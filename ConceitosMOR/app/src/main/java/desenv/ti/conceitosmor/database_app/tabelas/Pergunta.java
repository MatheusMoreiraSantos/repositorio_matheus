package desenv.ti.conceitosmor.database_app.tabelas;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "tbl_pergunta"
        , indices = {@Index(value = "id", unique = true)
                        , @Index(value = "provaID")}
        , foreignKeys = {@ForeignKey(entity = Prova.class, parentColumns = "id",
        childColumns = "provaID", onUpdate = CASCADE, onDelete = CASCADE)})
public class Pergunta {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String pergunta;
    private int provaID;

    public Pergunta() {}

    public Pergunta(Pergunta tblPergunta){
        this.id       = tblPergunta.getId();
        this.pergunta = tblPergunta.getPergunta();
        this.provaID  = tblPergunta.getProvaID();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public int getProvaID() {
        return provaID;
    }

    public void setProvaID(int provaID) {
        this.provaID = provaID;
    }
}
