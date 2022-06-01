package matheus.moreira.conceitosintent.utils.app;

public class UtilsApp {
    //Escopo de classe;
    //Variável declarada no inicio da classe recebe o nome de atributo;
    //Se for declarada em um método, passa a ser chamada de argumento ou variável local;
    //O ciclo de vida de uma variável local está restrito ao escopo no qual ela foi declarada;


    //Construtor vazio;
    public UtilsApp() {
        metodo(5);
    }

    private void metodo(int x){
        //A variavel x tem escopo local;
    }

    //Converter para tipos primitivos do Java;
    public int convertToInt(double valorDouble){
        return (int) valorDouble;
    }

    public int convertToInt(byte valorByte){
        return (int) valorByte;
    }

    public int convertToInt (short valorShort){
        return (int) valorShort;
    }

    public int convertToInt (long valorLong){
        return (int) valorLong;
    }


}
