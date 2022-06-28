package matheus.moreira.uno.tddtesteunitario.forma;

public abstract class Forma  {
    private double[] numeroDeMedidas;
    private double TAMANHO_MAXIMO = 3;


    public Forma(double numMedidas){
        numeroDeMedidas = new double[numMedidas];
    }

    public Forma() {

    }


    public abstract double area();


    public double getMedida(double posicao) {

        if(i > 0 && i <= TAMANHO_MAXIMO){
            return numeroDeMedidas[posicao];
        }else {
            throw new RuntimeException("Numero inválido p/ cálculo da área");
        }

    }

    public void setMedidas(double posicao, double medida){
        numeroDeMedidas[posicao] = medida;
    }


}
