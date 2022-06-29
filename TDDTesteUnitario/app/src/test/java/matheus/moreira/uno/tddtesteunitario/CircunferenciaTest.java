package matheus.moreira.uno.tddtesteunitario;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.Math;

import matheus.moreira.uno.tddtesteunitario.forma.Circunferencia;


public class CircunferenciaTest {
    private static final int POSICAO_ZERO = 0;
    private static final int EXPOENTE_2 = 2;


    @Test
    public void deveriaTerUmaMedidaDeRaioMaiorDoQueZeroNoArrayDeMedidas(){
    //tem esse tamanho porque muitas vezes, ao rodarmos em linha de comando, não temos muitas informações sobre o método;
    //método teste é sempre void e sua lista de argumentos está sempre vazia;

        Circunferencia c = new Circunferencia(1);
        c.setMedidas(0, 3);


        //variavel local double;
        //
        double raio = c.getMedida(3);

        boolean x = raio > 0;

        assertTrue(x);
        //assertEquals(true, raio > 0 );
        //pode-se utiilizar qualque um desses asserts;


    }


    @Test
    public void deveriaTerUmLimiteNoTamanhoDoVetorDeInformacoesDoCalculoDaArea(){
        //boolean tamanhoValido = c.setMedida(0,3) > c.TAMANHO_ARRAY_INFO_CALCULO_AEREA;


    }


    @Test
    public void deveriaCalcularAreaDaCircunferencia(){

        int PRECISAO_4_CASAS_DECIMAIS = 4;

        double area_raio3 = 28.2743;
        double area_raio4 = 50.2655;
        double area_raio5 = 78.5398;

        Circunferencia c = new Circunferencia(1);

        //Raio armazenado na estrutura de dados da classe Pai (Forma);
        c.setMedidas(POSICAO_ZERO, 3);

        double area = Math.PI * Math.pow(c.getMedida(POSICAO_ZERO), EXPOENTE_2);

        assertEquals("A área de uma circinferência de raio 3 é 28,2743"
                , area_raio3
                , area
                , PRECISAO_4_CASAS_DECIMAIS);
        //Não é usual um caso de teste com muitos asserts, no máximo três, sendo o ideal um caso de teste para cada dos asserts;


        //c.area(2);






    }


}
