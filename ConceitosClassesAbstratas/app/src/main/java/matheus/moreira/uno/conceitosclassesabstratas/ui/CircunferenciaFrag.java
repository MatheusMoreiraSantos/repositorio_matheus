package matheus.moreira.uno.conceitosclassesabstratas.ui;

import android.icu.text.DecimalFormat;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import matheus.moreira.uno.conceitosclassesabstratas.R;
import matheus.moreira.uno.conceitosclassesabstratas.formas.Circunferencia;


public class CircunferenciaFrag extends Fragment {
    private ImageButton imgbLimpar, imgbCalcular;
    private TextView tvRaioCircunferencia;
    private EditText edtRaio;

    public CircunferenciaFrag() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layoutFragment = inflater.inflate(R.layout.fragment_circunferencia, container, false);

        imgbCalcular         = layoutFragment.findViewById(R.id.imgbCalcular);
        imgbLimpar           = layoutFragment.findViewById(R.id.imgbLimpar);
        tvRaioCircunferencia = layoutFragment.findViewById(R.id.tvRaioCircunferencia);
        edtRaio              = layoutFragment.findViewById(R.id.edtRaio);

        imgbCalcular.setOnClickListener(view -> {
            if(edtRaio.getText().toString().isEmpty()){
                Toast.makeText(getContext(), "Informe a circunferência!", Toast.LENGTH_SHORT).show();
            } else{
                Circunferencia circunferencia = new Circunferencia(Double.valueOf(edtRaio.getText().toString()));

                String areaFormatada = new DecimalFormat("#,##0.00").format(circunferencia.area());
                tvRaioCircunferencia.setText(areaFormatada);
            }
        });

        imgbLimpar.setOnClickListener(view -> {
            edtRaio.setText("");
            tvRaioCircunferencia.setText("");
        });

        return layoutFragment;
    }
}