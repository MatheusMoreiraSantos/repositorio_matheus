package desenv.ti.conceitosmor.database_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import desenv.ti.conceitosmor.database_app.tabelas.Aluno;

@Dao
public interface ICRUDAlunoDAO {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertAluno(Aluno alunoTable);

    @Query("SELECT * FROM tbl_aluno where id = :id")
    public Aluno getEspecificAlunoByID(int id);

    @Query("SELECT * FROM tbl_aluno ORDER BY id DESC")
    public List<Aluno> getAllAlunos();

    @Transaction
    @Update(entity = Aluno.class, onConflict = OnConflictStrategy.REPLACE)
    public void updateAlunos(Aluno alunoTable);

    //O CASCADE deverá funcionar aqui p/ a tabela: AlunoProva
    @Transaction
    @Delete(entity = Aluno.class)
    public void deleteAluno(Aluno alunoTable);

    @Transaction
    @Query("DELETE FROM tbl_aluno WHERE id = :id")
    public void deleteAlunoByID(int id);

    @Transaction
    @Query("DELETE FROM tbl_aluno WHERE id > 0")
    public void deleteAllAlunos();
}
