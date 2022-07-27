package desenv.ti.conceitosmor.database_app.dbcallbacks;

import java.util.List;

import desenv.ti.conceitosmor.database_app.tabelas.Prova;

public interface IProvaDbCallback {
    void getProvaFromDB(List<Prova> tblProva);
}
