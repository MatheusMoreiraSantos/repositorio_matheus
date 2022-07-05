package matheus.moreira.uno.tddtesteunitario.forma;

public class Retangulo extends Forma {


    private static final int TAMANHO_ARRAY_INFO_CALCULO_AREA_RETANGULO = 2;

    /*public Retangulo(int numMedidas) {
        super(numMedidas);
    }*/

    public Retangulo(){
        super(TAMANHO_ARRAY_INFO_CALCULO_AREA_RETANGULO);
    }

    @Override
    public double area() {
        return getMedida(0) * getMedida(1);
    }

    @Override
    public double area(double resultado) {
        return 0;
    }
}
