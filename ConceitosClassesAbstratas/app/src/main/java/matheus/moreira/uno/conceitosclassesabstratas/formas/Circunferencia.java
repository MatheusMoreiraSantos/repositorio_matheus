package matheus.moreira.uno.conceitosclassesabstratas.formas;

/*Java - Guia do Programador - 3ª Edição https://github.com/pjandl/jgp3.git*/


import static java.lang.Math.*;

public class Circunferencia extends Formas {

    public Circunferencia (double raio) {
        super(1); // uso obrigatório do construtor da superclasse
        setRaio(raio); // ajuste da medida do raio
    }

    // implementação do método abstrato area()
    @Override
    public double area () {
        return PI*Math.pow(getMedida(0), 2);
    }

    // novo método para ajuste do raio
    public void setRaio(double raio) {
        setMedida(0, raio);
    }

    // alterações para exemplo 4.53
    public static int comparador(Circunferencia a, Circunferencia b) {
        return (int) (a.area() - b.area());
    }

    public int comparador2(Circunferencia b) {
        return (int) (this.area() - b.area());
    }





}
