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
import matheus.moreira.uno.conceitosclassesabstratas.formas.Retangulo;


public class RetanguloFrag extends Fragment {
    private EditText edtBase, edtAltura;
    private TextView tvAreaRetangulo;
    private ImageButton imgbLimpar, imgbCalcular;



    public RetanguloFrag() {
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

        View layoutFragment = inflater.inflate(R.layout.fragment_retangulo, container, false);

        edtBase         = layoutFragment.findViewById(R.id.edtBase);
        edtAltura       = layoutFragment.findViewById(R.id.edtLado2);
        imgbCalcular    = layoutFragment.findViewById(R.id.imgbCalcularRetangulo);
        imgbLimpar      = layoutFragment.findViewById(R.id.imgbLimparRetangulo);
        tvAreaRetangulo = layoutFragment.findViewById(R.id.tvAreaRetangulo);

        imgbCalcular.setOnClickListener(view -> {
            if(edtBase.getText().toString().isEmpty()){
                Toast.makeText(getContext(), "Informe a base do retângulo!", Toast.LENGTH_SHORT).show();

            } else if(edtAltura.getText().toString().isEmpty()){
                Toast.makeText(getContext(), "Informe a altura do retângulo!", Toast.LENGTH_SHORT).show();

            } else{
                Retangulo retangulo = new Retangulo(Double.valueOf(edtBase.getText().toString())
                        , Double.valueOf(edtAltura.getText().toString()));

                String areaFormatada = new DecimalFormat("#,##0.00").format(retangulo.area());
                tvAreaRetangulo.setText(areaFormatada);
            }
        });

        imgbLimpar.setOnClickListener(view -> {
            edtBase.setText("");
            edtAltura.setText("");
            tvAreaRetangulo.setText("");
        });

        return layoutFragment;
    }
}