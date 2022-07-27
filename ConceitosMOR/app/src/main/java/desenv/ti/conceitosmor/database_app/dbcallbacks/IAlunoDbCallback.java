package desenv.ti.conceitosmor.database_app.dbcallbacks;

import java.util.List;

import desenv.ti.conceitosmor.database_app.tabelas.Aluno;

public interface IAlunoDbCallback {
    void getAlunoFromDB(List<Aluno> tblAluno);
}
