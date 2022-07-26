package desenv.ti.conceitosmor.database_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import desenv.ti.conceitosmor.database_app.tabelas.Resposta;


@Dao
public interface ICRUDRespostaDAO {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertResposta(Resposta respostaTable);

    @Query("SELECT * FROM tbl_resposta where id = :id")
    public Resposta getEspecificRespostaByID(int id);

    @Query("SELECT * FROM tbl_resposta ORDER BY id DESC")
    public List<Resposta> getAllRespostas();

    @Transaction
    @Update(entity = Resposta.class, onConflict = OnConflictStrategy.REPLACE)
    public void updateRespostas(Resposta respostaTable);

    //O CASCADE
    @Transaction
    @Delete(entity = Resposta.class)
    public void deleteResposta(Resposta respostaTable);

    @Transaction
    @Query("DELETE FROM tbl_resposta WHERE id = :id")
    public void deleteRespostaByID(int id);

    @Transaction
    @Query("DELETE FROM tbl_resposta WHERE id > 0")
    public void deleteAllResposta();
}
