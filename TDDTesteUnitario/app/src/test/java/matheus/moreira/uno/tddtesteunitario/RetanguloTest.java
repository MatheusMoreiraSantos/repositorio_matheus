package matheus.moreira.uno.tddtesteunitario;

import org.junit.Test;

import static org.junit.Assert.*;

import matheus.moreira.uno.tddtesteunitario.forma.Retangulo;

public class RetanguloTest {


    private static Retangulo retangulo = new Retangulo();


    @Test
    public void calcularAreaDoRetangulo(){
        double area_BaseXAltura     = 10;
        double DIFERENCA_ACEITAVEL  = 0.001;

        retangulo.setMedidas(0, 5);
        retangulo.setMedidas(1, 2);

        //double baser = retangulo.getMedidas(0);
        //double alturar = retangulo.getMedidas(1);
        double area = retangulo.getMedida(0) * retangulo.getMedida(1);



        assertEquals("A area de uma de um retangulo: " + area_BaseXAltura, area_BaseXAltura,
                area, DIFERENCA_ACEITAVEL);
        /*Double calculoPapel = new Double(area_BaseXAltura);
        boolean x = calculoPapel.equals(new Double(area));
        assertTrue(x);*/

    }

    @Test
    public void calcularPerimetroRetangulo(){
        double perimetro_Base5Altura2 = 20;
        int PRECISAO_4_CASAS_DECIMAIS = 4;

        retangulo.setMedidas(0, 5);
        retangulo.setMedidas(1, 2);

        double perimetro = retangulo.area() * 2;

        assertEquals("O perimetro de um retangulo de base 5 e altura 2 é: 20", perimetro_Base5Altura2,
                perimetro, PRECISAO_4_CASAS_DECIMAIS);
    }



}
