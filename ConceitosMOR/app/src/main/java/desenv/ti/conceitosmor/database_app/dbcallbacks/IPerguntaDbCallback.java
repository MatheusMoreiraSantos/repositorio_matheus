package desenv.ti.conceitosmor.database_app.dbcallbacks;

import java.util.List;

import desenv.ti.conceitosmor.database_app.tabelas.Pergunta;

public interface IPerguntaDbCallback {
    void getPerguntaFromDB(List<Pergunta> tblPergunta);
}
