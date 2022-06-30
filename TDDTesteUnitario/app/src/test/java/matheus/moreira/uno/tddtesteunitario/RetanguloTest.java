package matheus.moreira.uno.tddtesteunitario;

import org.junit.Test;

import static org.junit.Assert.*;

import matheus.moreira.uno.tddtesteunitario.forma.Retangulo;

public class RetanguloTest {
    private static final int POSICAO_ZERO = 0;
    private static final int POSICAO_UM = 1;


    @Test
    public void deveriaCalcularAreaDoRetangulo(){

        Retangulo r = new Retangulo();

        r.setMedidas(POSICAO_ZERO, POSICAO_UM, 3, 2);


        double area01 = 6;
        double area02 = 750;
        double area03 = 36;


        double area = medida1 * medida2;
        


        assertEquals();


    }



}
