package matheus.moreira.uno.tddtesteunitario.forma;

public class Triangulo extends Forma {
    public static final int TAMANHO_ARRAY_INFO_CALCULO_AREA = 3;
    public static final int POSICAO_ZERO_TRINGULO_LADO1     = 0;
    public static final int POSICAO_UM_TRINGULO_LADO2       = 1;
    public static final int POSICAO_DOIS_TRINGULO_LADO3     = 2;


    public Triangulo() {
        super(TAMANHO_ARRAY_INFO_CALCULO_AREA);

    }

    @Override
    public double area() {

        double x = (getMedida(POSICAO_ZERO_TRINGULO_LADO1)
                + getMedida(POSICAO_UM_TRINGULO_LADO2)
                + getMedida(POSICAO_DOIS_TRINGULO_LADO3))/2;

        double y = x * (x- getMedida(POSICAO_ZERO_TRINGULO_LADO1))
                * (x - getMedida(POSICAO_UM_TRINGULO_LADO2))
                * (x - getMedida(POSICAO_DOIS_TRINGULO_LADO3));

        return Math.sqrt(y);

    }

    @Override
    public double area(double resultado) {

        return 0;
    }
}
