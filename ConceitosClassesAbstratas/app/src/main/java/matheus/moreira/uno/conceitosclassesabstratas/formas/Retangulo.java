package matheus.moreira.uno.conceitosclassesabstratas.formas;

/*Java - Guia do Programador - 3ª Edição https://github.com/pjandl/jgp3.git*/


import matheus.moreira.uno.conceitosclassesabstratas.formas.Formas;
//Classe Formas e Retangulo estão no mesmo pacote, portanto não há a necessidade de importar a classe Formas para acessar suas informações;

public class Retangulo extends Formas {
//Ao extender uma classe abstrata é necessário implementar os métodos abstratos dela;
//Classes filhas de classes abstratas são obrigadas a implementar os métodos da classe pai e implementar um construtor;


    public Retangulo (double altura, double largura) {
        super(2); // uso obrigatório do construtor da superclasse
        setMedida(0, altura); // ajuste da medida da altura
        setMedida(1, largura); // ajuste da medida da largura
    }

    // implementação do método abstrato area()
    @Override
    public double area () {
        return getMedida(0)*getMedida(1);

    }
    // implementação de operação específica extra
    public double perimetro () {
        return 2*(getMedida(0)+getMedida(1));
    }


}
