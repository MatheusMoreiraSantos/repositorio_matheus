package matheus.moreira.uno.tddtesteunitario;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import matheus.moreira.uno.tddtesteunitario.forma.Triangulo;

public class TrianguloTest {
    public static final double LADO_1               = 5;
    public static final double LADO_2               = 7;
    public static final double LADO_3               = 9;
    public static final double SL                   = 6;
    public static final double DIFERENCA_ACEITAVEL  = 0.001;
    private static Triangulo triangulo              = new Triangulo();
    public static final int TAMANHO_ARRAY_INFO_CALCULO_AREA = 3;
    public static final int POSICAO_ZERO_TRINGULO_LADO1     = 0;
    public static final int POSICAO_UM_TRINGULO_LADO2       = 1;
    public static final int POSICAO_DOIS_TRINGULO_LADO3     = 2;
    //Quem gerencia a estrutura do array é a classe pai Forma e os filhos, nesse caso a classe triangulo
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
        double calculoAreaDoTriangulo = 17.4123;
        double DIFERENCA_ACEITAVEL = 0.001;

        Triangulo triangulo = new Triangulo();

        triangulo.setMedidas(POSICAO_ZERO_TRINGULO_LADO1, 5);
        triangulo.setMedidas(POSICAO_UM_TRINGULO_LADO2, 7);
        triangulo.setMedidas(POSICAO_DOIS_TRINGULO_LADO3, 9);

        double x = (triangulo.getMedida(POSICAO_ZERO_TRINGULO_LADO1)
                + triangulo.getMedida(POSICAO_UM_TRINGULO_LADO2)
                + triangulo.getMedida(POSICAO_DOIS_TRINGULO_LADO3))/2;

        double y = x * (x- triangulo.getMedida(POSICAO_ZERO_TRINGULO_LADO1))
                           * (x - triangulo.getMedida(POSICAO_UM_TRINGULO_LADO2))
                * (x - triangulo.getMedida(POSICAO_DOIS_TRINGULO_LADO3));

        double area = Math.sqrt(y);

        assertEquals("A area calculada no papel é:" + calculoAreaDoTriangulo, calculoAreaDoTriangulo, area, DIFERENCA_ACEITAVEL);
    }











}
