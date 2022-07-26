package desenv.ti.conceitosmor.database_app.interfaces_dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import desenv.ti.conceitosmor.database_app.tabelas.Prova;

@Dao
public interface ICRUDProvaDAO {

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertProva(Prova provaTable);

    @Query("SELECT * FROM tbl_prova where id = :id")
    public Prova getEspecificProvaByID(int id);

    @Query("SELECT * FROM tbl_prova ORDER BY id DESC")
    public List<Prova> getAllProvas();

    @Transaction
    @Update(entity = Prova.class, onConflict = OnConflictStrategy.REPLACE)
    public void updateProva(Prova provaTable);

    //O CASCADE deverá funcionar aqui p/ a tabela: AlunoProva
    @Transaction
    @Delete(entity = Prova.class)
    public void deleteProva(Prova provaTable);

    @Transaction
    @Query("DELETE FROM tbl_prova WHERE id = :id")
    public void deleteProvaByID(int id);

    @Transaction
    @Query("DELETE FROM tbl_prova WHERE id > 0")
    public void deleteAllProvas();
}
