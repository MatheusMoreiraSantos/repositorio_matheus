package desenv.ti.conceitosmor.database_app.dbcallbacks;

import java.util.List;

import desenv.ti.conceitosmor.database_app.tabelas.AlunoProva;

public interface IAlunoProvaDbCallback {

    void getAlunoProvaFromDB(List<AlunoProva> tblAlunoProva);
}
