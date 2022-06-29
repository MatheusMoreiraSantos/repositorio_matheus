package matheus.moreira.uno.tddtesteunitario.forma;

public class Circunferencia extends Forma {
    private static final int TAMANHO_ARRAY_INFO_CALCULO_AREA = 1;
    private static final int TAMANHO_MAXIMO_ARRAY = 1; //porque só uma informação é necessária para o cálculo, no caso o raio;
    private static final int POSICAO_ZERO = 0;
    private static final int EXPOENTE_2 = 2;



    /*public Circunferencia(double numMedidas){
        super(numMedidas);
    }*/

    public Circunferencia(int i){
        super(TAMANHO_MAXIMO_ARRAY);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getMedida(POSICAO_ZERO), EXPOENTE_2);
    }


    @Override
    public double area(double raio) {
       double resultado = (Math.PI * Math.pow(raio, 2));

        return resultado;
    }
}
