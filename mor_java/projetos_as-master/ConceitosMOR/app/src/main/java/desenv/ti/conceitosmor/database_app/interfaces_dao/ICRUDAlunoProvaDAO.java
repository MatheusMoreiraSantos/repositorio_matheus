package desenv.ti.conceitosmor.database_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import desenv.ti.conceitosmor.database_app.tabelas.AlunoProva;

@Dao
public interface ICRUDAlunoProvaDAO {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertAlunoProva(AlunoProva alunoProvaTable);

    @Query("SELECT * FROM tbl_aluno_prova where idAluno = :idAluno AND idProva = :idProva")
    public AlunoProva getEspecificAlunoProvaByID(int idAluno, int idProva);

    @Query("SELECT * FROM tbl_aluno_prova ORDER BY idAluno, idProva DESC")
    public List<AlunoProva> getAllAlunosProvas();

    @Transaction
    @Update(entity = AlunoProva.class, onConflict = OnConflictStrategy.REPLACE)
    public void updateAlunoProva(AlunoProva alunoProvaTable);

    //CASCADE definido nas tabelas base
    @Transaction
    @Delete(entity = AlunoProva.class)
    public void deleteAlunoProva(AlunoProva alunoProvaTable);

    @Transaction
    @Query("DELETE FROM tbl_aluno_prova WHERE idAluno = :idAluno")
    public void deleteAlunoProvaByID(int idAluno);

    @Transaction
    @Query("DELETE FROM tbl_aluno_prova WHERE idAluno > 0")
    public void deleteAllAlunosProvas();
}
