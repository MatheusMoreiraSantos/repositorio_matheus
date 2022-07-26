package matheus.moreira.uno.morintegracaocomjava.database_app.async_crud;

import android.content.Context;
import android.os.AsyncTask;


import java.util.List;

import matheus.moreira.uno.morintegracaocomjava.database_app.tabelas.Aluno;

public class AsyncAlunoCRUD extends AsyncTask<Aluno, Integer, List<Aluno>> {

   private static String TAG = "AsyncAlunoCRUD";
   private Context contextActivityOrFragment;
   private List<Aluno> lista = null;













    @Override
    protected List<Aluno> doInBackground(Aluno... alunos) {
        return null;
    }
}
