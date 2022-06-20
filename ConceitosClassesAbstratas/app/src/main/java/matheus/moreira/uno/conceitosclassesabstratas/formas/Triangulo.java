package matheus.moreira.uno.conceitosclassesabstratas.formas;

/*Java - Guia do Programador - 3ª Edição https://github.com/pjandl/jgp3.git*/


import matheus.moreira.uno.conceitosclassesabstratas.formas.Formas;

public class Triangulo extends Formas {

    public Triangulo (double l1, double l2, double l3) {
        super(3); // uso obrigatório do construtor da superclasse
        setMedida(0, l1); // ajuste da medida dos lados
        setMedida(1, l2);
        setMedida(2, l3);
    }

    // implementação do método abstrato area() usando fórmula de Herão
    @Override
    public double area () {
        double sp = (getMedida(0) + getMedida(1) + getMedida(2))/2;
        double aux = sp * (sp-getMedida(0))*(sp-getMedida(1)) * (sp-getMedida(2));
        return Math.sqrt(aux);
    }








}
