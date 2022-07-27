package desenv.ti.conceitosmor.database_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import desenv.ti.conceitosmor.database_app.tabelas.Pergunta;

@Dao
public interface ICRUDPerguntaDAO {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertPergunta(Pergunta perguntaTable);

    @Query("SELECT * FROM tbl_pergunta where id = :id")
    public Pergunta getEspecificPerguntaByID(int id);

    @Query("SELECT * FROM tbl_pergunta ORDER BY id DESC")
    public List<Pergunta> getAllPerguntas();

    @Transaction
    @Update(entity = Pergunta.class, onConflict = OnConflictStrategy.REPLACE)
    public void updatePerguntas(Pergunta perguntaTable);

    @Transaction
    @Delete(entity = Pergunta.class)
    public void deletePergunta(Pergunta perguntaTable);

    @Transaction
    @Query("DELETE FROM tbl_pergunta WHERE id = :id")
    public void deletePerguntaByID(int id);

    @Transaction
    @Query("DELETE FROM tbl_pergunta WHERE id > 0")
    public void deleteAllPerguntas();
}
