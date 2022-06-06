package matheus.moreira.uno.prova01_cleber_matheussantos;


public class ProvaQuestoesRespostas {

    public ProvaQuestoesRespostas() {}

    public String getQuestao02(){
        return "Cite pelo menos 3 situações onde a referência “this” pode ser usada. E onde não pode ser usada? ";
    }

    public String getQuestao03(){
        return "Quais detalhes importantes podem ser observados na declaração de uma classe Java? ";
    }

    public String getQuestao04(){
        return "Explique o conceito de escopo presente na linguagem Java";
    }

    public String getQuestao05(){
        return "Como funciona a sobrecarga (overload) de métodos no Java?";
    }

    public String getQuestao06(){
        return "Explique o conceito de cast. Quais os tipos existentes?";
    }


    public String getResposta02(){
        return  "A referência this pode ser utilizada em um método para\n" +
                "referenciar um atributo de classe e diferenciá-lo de uma\n" +
                "variável local de mesmo nome. Pode ser gerado automaticamente\n" +
                "em uma classe estática, ex.: this.cpf = cpf. Também pode ser \n" +
                "usado como um getter que retorna um nome completo. Ele não deve\n" +
                "ser utilizado para referenciar ele mesmo, causando uma duplicação.";
    }

    public String getResposta03(){
        return "Considerar as boas práticas em programação, como identificação para favorecer\n" +
                "a legibilidade do código; De preferência, criar pastas e subpastas em um diretório\n" +
                "fácil localização, nomeado corretamente. Observar se a primeira letra do nome da classe\n" +
                "é maiúscula; Verificar se a classe possui modificadores de acesso (public/private) e se\n" +
                "a classe possui metodos, construtores e atributos de classe. ";
    }

    public String getResposta04(){
        return "O escopo pode ser conceituado como função que\n" +
                "inicia e finaliza o programa e as próprias funções\n" +
                "dentro do mesmo, são utilizadas chaves para identificá-lo. \n" +
                "É o espaço onde podem ser declarados atributos, métodos e \n" +
                "formas de implementar/rodar um programa ou app.";
    }

    public String getResposta05(){
        return "Funciona permitindo a classe utilizar mais de um método com o mesmo\n" +
                "nome, porém os metodos necessariamente devem possuir argumentos\n" +
                "diferentes para funcionar. ";
    }

    public String getResposta06(){
        return "Cast é quando converte-se valores de um tipo para outro. Existem dois\n" +
                "tipos de conversão: as implícitas e as explícitas. As primeiras acontecem\n" +
                "quando um valor menor é convertido em um valor maior. As explícitas acontecem\n" +
                "utilizando comandos de cast como int, byte, double. ";
    }

    public String getNome01(){
        return "Cleber";
    }

    public String getNome02(){
        return "Matheus M. Santos";
    }

    public String getPergunta(){
        return "Pergunta";
    }

    public String getResposta(){
        return "Resposta";
    }

}













