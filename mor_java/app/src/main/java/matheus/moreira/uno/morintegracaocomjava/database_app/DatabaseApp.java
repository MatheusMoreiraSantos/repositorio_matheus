package matheus.moreira.uno.morintegracaocomjava.database_app;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.Executors;

import matheus.moreira.uno.morintegracaocomjava.database_app.converter.Converters;

@TypeConverters({Converters.class}) //Adiciona a classe converter na classe banco de dados;
public abstract class DatabaseApp extends RoomDatabase {
    public static final String TAG      = "DatabaseApp";
    private static final String DB_NAME = "db_app.db"; //Nome do banco de dados que será criado;
    private static volatile DatabaseApp sInstance;


    public DatabaseApp() {}


    public static synchronized DatabaseApp getInstance(Context context){

            return null; //Null é um tipo valido para classes abstratas e completas;

    }

    private static DatabaseApp getConnection(Context contextActivity){ //Activity utilizada para pegar uma instância do BD;

            return null;
    }

    static RoomDatabase.Callback initDB = new RoomDatabase.Callback() {
        @Override
        public void onCreate (@NonNull SupportSQLiteDatabase db) {
                super.onCreate(db);
                Executors.newSingleThreadScheduledExecutor().execute(() -> {
                    //Executar métodos e/ou rotinas logo após a criação do banco;
                    Log.d(TAG, "onCreate: Banco criado com sucesso! Executar rotinas posteriores. ");
                } );


            }
    };







}
