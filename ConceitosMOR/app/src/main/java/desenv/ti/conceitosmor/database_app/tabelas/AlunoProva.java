package desenv.ti.conceitosmor.database_app.tabelas;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

import static androidx.room.ForeignKey.CASCADE;

@Entity(tableName = "tbl_aluno_prova"
        , primaryKeys = {"idAluno", "idProva"}
        , indices = {@Index(value = {"idAluno"}), @Index(value = {"idProva"})}
        , foreignKeys = {@ForeignKey(entity = Aluno.class, parentColumns = "id",
            childColumns = "idAluno", onUpdate = CASCADE, onDelete = CASCADE)
                    , @ForeignKey(entity = Prova.class, parentColumns = "id",
                            childColumns = "idProva", onUpdate = CASCADE, onDelete = CASCADE)})
public class AlunoProva {
    private int idAluno;
    private int idProva;

    public AlunoProva() {}

    //COnstrutor de cópia
    public AlunoProva(AlunoProva tblAlunoProva){
        this.idAluno = tblAlunoProva.getIdAluno();
        this.idProva = tblAlunoProva.getIdProva();
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getIdProva() {
        return idProva;
    }

    public void setIdProva(int idProva) {
        this.idProva = idProva;
    }
}
