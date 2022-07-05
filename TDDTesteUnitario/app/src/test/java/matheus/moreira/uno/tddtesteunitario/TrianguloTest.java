package matheus.moreira.uno.tddtesteunitario;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import matheus.moreira.uno.tddtesteunitario.forma.Triangulo;

public class TrianguloTest {
    public static final double LADO_1               = 1;
    public static final double LADO_2               = 2;
    public static final double LADO_3               = 3;
    public static final double SL                   = 6;
    public static final double DIFERENCA_ACEITAVEL  = 0.001;
    private static Triangulo triangulo              = new Triangulo();
    public static final int POSICAO_ZERO_TRINGULO_LADO1  = 0;
    public static final int POSICAO_UM_TRINGULO_LADO2    = 1;
    public static final int POSICAO_DOIS_TRINGULO_LADO2  = 2;
    //Quem gerencia a estrutura do arry é a classe pai Forma e os filhos, nesse caso a classe triangulo
    //informam quais são as posições e valores que devem ser armazenados;


    //Esse método é executado sempre antes de todos os demais métodos;
    @Before
    public void instanciarObjeto(){
        Triangulo triangulo = new Triangulo();

    }


    @Test
    public void deveriaTerUmValorDaSomaDosLadosDoTriangulo() {

        double sl = LADO_1 + LADO_2 + LADO_3;

        assertEquals("A da soma dos lados deve ser igual a 6", SL, sl, DIFERENCA_ACEITAVEL );

    }


    @Test
    public void deveriaTerOsValoreDaSomaDosLadosDoTrianguloDivididoPorDois(){
        double resultado = 3;

        double resultadoDivisão = SL/2;

        assertEquals("O resultado da operação deve ser igual 3", resultado, resultadoDivisão, DIFERENCA_ACEITAVEL);

    }

    @Test
    public void deveriaCalcularAreaDoPerimetroDoTriangulo(){
        double resultado = 360;


        double perimetro = SL *(SL - LADO_1) * (SL - LADO_2) * (SL - LADO_3);

        assertEquals("O resulado do perimetro deve ser igual a 360", resultado, perimetro, DIFERENCA_ACEITAVEL);

    }



    @Test
    public void deveriaCalcularAreaDoTriangulo(){

    }











}
