package matheus.moreira.uno.conceitofragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import matheus.moreira.uno.conceitofragments.custom.interfac.ToolbarListener;

public class MainActivity extends FragmentActivity implements ToolbarFragment.ToolbarListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onButtonClick(int tamanhofonte, String texto) {
        TextoFragment tvTextoFormatado = (TextoFragment) getSupportFragmentManager().findFragmentById(R.id.frgTexto);
        tvTextoFormatado.trocarPropriedadesDoTexto(tamanhofonte, texto);
    }
}