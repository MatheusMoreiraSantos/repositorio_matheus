package desenv.ti.conceitosmor.database_app.async_crud;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.lang.ref.WeakReference;
import java.util.List;

import desenv.ti.conceitosmor.database_app.DatabaseApp;
import desenv.ti.conceitosmor.database_app.dbcallbacks.IAlunoDbCallback;
import desenv.ti.conceitosmor.database_app.dbcallbacks.IRespostaDbCallback;
import desenv.ti.conceitosmor.database_app.tabelas.Aluno;
import desenv.ti.conceitosmor.database_app.tabelas.Resposta;
import desenv.ti.conceitosmor.utils_app.UtilsApp;

public class AsyncRespostaCRUD extends AsyncTask<Resposta, Integer, List<Resposta>> {
    private static String TAG = "AsyncRespostaCRUD";
    private UtilsApp.DataBaseCrudOperations dbOperations;
    private Context contextActivityOrFragment;
    private List<Resposta> lista = null;

    //Evitar leak de memória
    private WeakReference<IRespostaDbCallback> dbCallBack;

    public AsyncRespostaCRUD(UtilsApp.DataBaseCrudOperations dbOperations
            , Context context
            , IRespostaDbCallback callBack){
        this.dbOperations              = dbOperations;
        this.contextActivityOrFragment = context;
        dbCallBack                     = new WeakReference(callBack);
    }


    @Override
    protected List<Resposta> doInBackground(Resposta... respostas) {
        try{
            DatabaseApp databaseApp = DatabaseApp.getInstance(contextActivityOrFragment);
            lista                   = null;

            switch (dbOperations){
                case CREATE:{
                    for(Resposta resposta : respostas) {
                        databaseApp.respostasDAO().insertResposta(resposta);
                    }
                    break;
                }
                case READ:{
                    lista = databaseApp.respostasDAO().getAllRespostas();
                    break;
                }
                case UPDATE:{
                    databaseApp.respostasDAO().updateRespostas(respostas[0]);
                    break;
                }
                case DELETE:{
                    databaseApp.respostasDAO().deleteResposta(respostas[0]);
                    break;
                }
            }
        } catch (Exception e){
            Log.d(TAG, "doInBackground: FALHA - " + e.getMessage());
            e.printStackTrace();
        }

        return lista;
    }

    @Override
    protected void onPostExecute(List<Resposta> respostas) {
        super.onPostExecute(respostas);

        if(dbOperations == UtilsApp.DataBaseCrudOperations.CREATE
                || dbOperations == UtilsApp.DataBaseCrudOperations.READ) {
            IRespostaDbCallback callBack = dbCallBack.get();
            if (callBack != null) {
                callBack.getRespostaFromDB(respostas);
            }
        }
    }
}
