package matheus.moreira.uno.conceitofragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;


public class TextoFragment extends Fragment {
    private EditText    edtInformarTexto;
    private SeekBar     skbFormatarTexto;
    private Button      btnTexto;
    private TextView    tvTextoFormatado;


    public TextoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View textoLayoutInflated = inflater.inflate(R.layout.fragment_texto, container, false);


        edtInformarTexto    = textoLayoutInflated.findViewById(R.id.edtInformarTexto);
        skbFormatarTexto    = textoLayoutInflated.findViewById(R.id.skbFormatarTexto);
        btnTexto            = textoLayoutInflated.findViewById(R.id.btnTexto);
        tvTextoFormatado    = textoLayoutInflated.findViewById(R.id.tvTextoFormatado);

        return textoLayoutInflated;
    }

    public void trocarPropriedadesDoTexto(int tamanhofonte, String text){
        tvTextoFormatado.setTextSize(tamanhofonte);
        tvTextoFormatado.setText(text);
    }





}