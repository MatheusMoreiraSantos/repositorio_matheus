package desenv.ti.conceitosmor;

import android.app.Application;
import android.util.Log;

import desenv.ti.conceitosmor.database_app.DatabaseApp;

public class MorInit extends Application {
    public static final String TAG = "MorInit";

    @Override
    public void onCreate() {
        super.onCreate();

        DatabaseApp databaseApp = DatabaseApp.getInstance(this);
        if(databaseApp != null) {
            Log.d(TAG, "Banco criado na inicialização do app.");
        }
    }
}
