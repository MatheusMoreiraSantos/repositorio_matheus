package matheus.moreira.uno.conceitofragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;


public class ToolbarFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {
    private EditText        edtInformarTexto;
    private SeekBar         skbFormatarTexto;
    private Button          btnTexto;
    private ToolbarListener toolbarListener;
    private static int      TEXT_SIZE = 10;

    //Ajuda a ter acesso as views/fragments do layout;
    public interface ToolbarListener{

        public void onButtonClick(int tamanhofonte, String texto);

    }

    public ToolbarFragment() {
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
        View toolBarLayoutInflated = inflater.inflate(R.layout.fragment_toolbar, container, false);


        //findViewById referencia um objeto;
        //Classe R é criada automaticamente e dá acesso a todos os recursos do res;
        edtInformarTexto    = toolBarLayoutInflated.findViewById(R.id.edtInformarTexto);
        skbFormatarTexto    = toolBarLayoutInflated.findViewById(R.id.skbFormatarTexto);
        btnTexto            = toolBarLayoutInflated.findViewById(R.id.btnTexto);



        btnTexto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClicked(v);
            }
        });

        skbFormatarTexto.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) this);
        

        return toolBarLayoutInflated;
    }

    @Override
    public void onAttach(@NonNull Context context) { //Impede que ocorram exceções; Ciclo de vida do fragment;
        super.onAttach(context);

        try {
            toolbarListener = (ToolbarListener) context;

        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString()
            + "Obrigatório implementar a interface ToolbarListener ");
        }

    }

    //Passa essas informações na hora em que há um clique no botão;
    public void buttonClicked(View v) {
        toolbarListener.onButtonClick(TEXT_SIZE, edtInformarTexto.getText().toString());
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

        TEXT_SIZE = i;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }


}