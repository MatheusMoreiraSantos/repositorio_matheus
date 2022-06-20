package matheus.moreira.uno.conceitosclassesabstratas.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import matheus.moreira.uno.conceitosclassesabstratas.R;


public class MensagemFrag extends Fragment {



    public MensagemFrag() {
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
        View layoutFragment = inflater.inflate(R.layout.fragment_mensagem, container, false);



        return layoutFragment;
    }
}