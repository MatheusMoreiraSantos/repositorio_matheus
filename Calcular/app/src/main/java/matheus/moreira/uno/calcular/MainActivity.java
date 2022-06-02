package matheus.moreira.uno.calcular;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtOperando, edtOperando2;
    private TextView tvOpcao, tvOperacao, tvResultado;
    private View spiOpcoes;
    private ImageView imgOperacao, imageView2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtOperando     = findViewById(R.id.edtOperando1);
        edtOperando2    = findViewById(R.id.edtOperando2);
        tvOpcao         = findViewById(R.id.tvOpcao);
        tvOperacao      = findViewById(R.id.tvOperacao);
        tvResultado     = findViewById(R.id.tvResultado);
        spiOpcoes       = findViewById(R.id.spiOpcoes);
        imgOperacao     = findViewById(R.id.imgOperacao);
        imageView2      = findViewById(R.id.imageView2);








    }
}