package matheus.moreira.uno.morintegracaocomjava.database_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Index;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import matheus.moreira.uno.morintegracaocomjava.database_app.tabelas.Aluno;

@Dao
public interface ICRUDAlunoDAO { //DAO permite a utilização de linguagem SQL na aplicação;

    @Transaction //Utilizada para instruções de Insert;
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertAluno(Aluno tblAluno);

    @Query("SELECT * FROM tbl_aluno where id = id")
    Aluno getEspecificAlunoById(int id);

    @Query("SELECT * FROM tbl_aluno ORDER BY id")
    List<Aluno> getAllAlunos();

    @Transaction
    @Update(entity = Aluno.class, onConflict = OnConflictStrategy.REPLACE)
    void updateAlunos (Aluno tbl_Aluno);

    //Cascade para a tabela AlunoProva;
    @Transaction
    @Delete(entity = Aluno.class)
    void deleteAluno( Aluno tbl_Aluno);

    @Transaction //DELETE não apaga todos os registors da tabela, isso depende da cláusula Where; Exclui registros de tabela sempre em funcção da cláusula Where;
    @Query("DELETE FROM tbl_aluno WHERE id = id")
    void deleteAlunoByID(int id);

    @Transaction
    @Query("DELETE FROM tbl_aluno WHERE id > 0")
    void deleteAllAlunos();
}









