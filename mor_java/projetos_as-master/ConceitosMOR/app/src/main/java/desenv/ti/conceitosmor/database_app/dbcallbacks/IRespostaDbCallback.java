package desenv.ti.conceitosmor.database_app.dbcallbacks;

import java.util.List;

import desenv.ti.conceitosmor.database_app.tabelas.Resposta;

public interface IRespostaDbCallback {
    void getRespostaFromDB(List<Resposta> tblResposta);
}
