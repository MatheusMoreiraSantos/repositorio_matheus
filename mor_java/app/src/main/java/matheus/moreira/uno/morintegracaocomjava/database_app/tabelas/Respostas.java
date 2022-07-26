package matheus.moreira.uno.morintegracaocomjava.database_app.tabelas;

import static androidx.room.ForeignKey.CASCADE;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

@Entity(tableName = "tbl_respostas"
        , primaryKeys = {"id", "pergunta_id"}
        , indices = {@Index(value = {"id"}), @Index(value = {"pergunta_id"})}
        , foreignKeys = {@ForeignKey(entity = Pergunta.class, parentColumns = "id",
        childColumns = "pergunta_id", onUpdate = CASCADE, onDelete = CASCADE)})

public class Respostas {
    private int id, pergunta_id;
    private String resposta;

    public Respostas(Respostas tblRespostas){
        this.id          = tblRespostas.getId();
        this.pergunta_id = tblRespostas.getPergunta_id();
        this.resposta    = tblRespostas.getResposta();
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPergunta_id() {
        return pergunta_id;
    }

    public void setPergunta_id(int pergunta_id) {
        this.pergunta_id = pergunta_id;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
