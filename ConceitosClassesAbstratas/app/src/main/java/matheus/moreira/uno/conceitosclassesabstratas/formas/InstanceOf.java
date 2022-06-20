package matheus.moreira.uno.conceitosclassesabstratas.formas;

/*Java - Guia do Programador - 3ª Edição https://github.com/pjandl/jgp3.git*/

import matheus.moreira.uno.conceitosclassesabstratas.formas.Formas;
import matheus.moreira.uno.conceitosclassesabstratas.formas.Retangulo;
import matheus.moreira.uno.conceitosclassesabstratas.formas.Triangulo;

public class InstanceOf {

    public static void main(String a[]) {
        // cria triângulo
        Object obj = new Triangulo(1.5, 1.5, 2.0);
        // exibe info
        System.out.println(obj);

        // verifica de quem obj e instancia...
        System.out.printf("%s instancia de P0410Triangulo.\n",
                obj instanceof Triangulo ? "E'": "Nao e'");
        System.out.printf("%s instancia de P0409Retangulo.\n",
                obj instanceof Retangulo ? "E'": "Nao e'");
        System.out.printf("%s instancia de P0407Forma.\n",
                obj instanceof Formas ? "E'": "Nao e'");
        System.out.printf("%s instancia de Object.\n",
                obj instanceof Object ? "E'": "Nao e'");
        System.out.printf("%s instancia de Runnable.\n",
                obj instanceof Runnable ? "E'": "Nao e'");
    }















}
