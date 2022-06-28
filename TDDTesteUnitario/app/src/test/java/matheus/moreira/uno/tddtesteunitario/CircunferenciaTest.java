package matheus.moreira.uno.tddtesteunitario;

import org.junit.Test;

import static org.junit.Assert.*;

import matheus.moreira.uno.tddtesteunitario.forma.Circunferencia;


public class CircunferenciaTest {


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
        boolean tamanhoValido




    }



}
