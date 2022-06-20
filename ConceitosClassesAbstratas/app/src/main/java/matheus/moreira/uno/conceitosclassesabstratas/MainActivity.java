package matheus.moreira.uno.conceitosclassesabstratas;


import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import matheus.moreira.uno.conceitosclassesabstratas.formas.Circunferencia;
import matheus.moreira.uno.conceitosclassesabstratas.formas.Formas;
import matheus.moreira.uno.conceitosclassesabstratas.formas.Retangulo;
import matheus.moreira.uno.conceitosclassesabstratas.formas.Triangulo;
import matheus.moreira.uno.conceitosclassesabstratas.ui.CircunferenciaFrag;
import matheus.moreira.uno.conceitosclassesabstratas.ui.MensagemFrag;
import matheus.moreira.uno.conceitosclassesabstratas.ui.RetanguloFrag;
import matheus.moreira.uno.conceitosclassesabstratas.ui.TrianguloFrag;

/*Java - Guia do Programador - 3ª Edição https://github.com/pjandl/jgp3*/

//public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
public class MainActivity extends FragmentActivity implements AdapterView.OnItemSelectedListener{
    static final String TAG                     = "MainActivity";
    private static final String CIRCUNFERENCIA  = "Circunferência";
    private static final String RETANGULO       = "Retângulo";
    private static final String TRIANGULO       = "Triângulo";

    private Spinner spiOpcoes;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spiOpcoes   = findViewById(R.id.spiOpcoes);

        ArrayAdapter<String> adapterFormas = new ArrayAdapter<>(this
                , android.R.layout.simple_spinner_item
                , getResources().getStringArray(R.array.formas_geometricas));
        adapterFormas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spiOpcoes.setAdapter(adapterFormas);
        spiOpcoes.setOnItemSelectedListener(this);

        fragmentManager = getSupportFragmentManager();



        Circunferencia c = new Circunferencia(1.5);
        System.out.println("areaCirc = " + c.area());

        Retangulo r = new Retangulo(2.5, 4.0);
        System.out.println("areaRet = " + r.area());

        Formas formas[] = new Formas[3];
        formas[0] = c;
        formas[1] = r;
        formas[2] = new Triangulo(1.0, 2.0, 2.0);
        for (int i = 0; i < formas.length; i++) {
            System.out.println(formas[i]);
            System.out.println("área = " + formas[i].area());
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        if(fragmentManager != null)
            fragmentManager.popBackStack();

        if(adapterView.getItemAtPosition(i).toString().equals(CIRCUNFERENCIA)){
            if(fragmentManager != null){
                fragmentManager.beginTransaction()
                        .replace(R.id.mainFragment, CircunferenciaFrag.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Circunferência")
                        .commit();
            }

        } else if(adapterView.getItemAtPosition(i).toString().equals(RETANGULO)){
            if(fragmentManager != null){
                fragmentManager.beginTransaction()
                        .replace(R.id.mainFragment, RetanguloFrag.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Retângulo")
                        .commit();
            }

        } else if(adapterView.getItemAtPosition(i).toString().equals(TRIANGULO)){
            if(fragmentManager != null){
                fragmentManager.beginTransaction()
                        .replace(R.id.mainFragment, TrianguloFrag.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("Triângulo")
                        .commit();
            }

        } else {
            fragmentManager.beginTransaction()
                    .replace(R.id.mainFragment, MensagemFrag.class, null)
                    .setReorderingAllowed(true)
                    .addToBackStack("MensagemFrag")
                    .commit();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }




}