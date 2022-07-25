package matheus.moreira.uno.morintegracaocomjava.database_app.converter;

import android.util.Log;

import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import java.sql.Date;

public class Converters {
    private static final String TAG = "Convertes";


    public Converters() {
    }



    @TypeConverter
    public static String fromLocalDateToString (Date localDate) { //BD não suporta o formato localDate, por isso esse método converte o objeto para String, formato que ele aceita;
        try{
            if(localDate == null){
                return null;
            } else {
                return localDate.toString();
            }
        } catch (Exception e){
            Log.d(TAG, "fromLocalDate: " + e.getMessage());
            e.printStackTrace();
            return null;
     }
    //Método apresenta alta probabilidade de gerar exceção, por isso foi utilizado o try cathch;
  }

















}
