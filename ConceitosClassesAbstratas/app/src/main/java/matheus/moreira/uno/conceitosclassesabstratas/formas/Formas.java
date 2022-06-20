package matheus.moreira.uno.conceitosclassesabstratas.formas;

/*Java - Guia do Programador - 3ª Edição https://github.com/pjandl/jgp3.git*/

public abstract class Formas {

    // array de medidas
    private double medida[];
    // Construtor parametrizado
    public Formas(int numMedidas) {
        // aloca array de medidas
        medida = new double[numMedidas];
    }
    // Métodos
    // obtém uma medida
    public double getMedida(int i) {
        if (i<0 || i>=medida.length) {
            throw new RuntimeException("Numero invalido de medida.");
        }
        return medida[i];
    }
    // retorna no. de medidas
    public int getNumMedidas () {
        return medida.length;
    }
    // ajusta uma medida
    //método concreto apresenta assinatira, corpo e implementação;
    protected void setMedida (int i, double m) {
        if (i<0 || i>=medida.length) {
            throw new RuntimeException("Numero invalido de medida.");
        }
        if (m<0) {
            throw new RuntimeException("Medida #"+ i + "invalida.");
        }
        medida[i] = m;
    }
    // representação textual
    @Override
    public String toString () {
        StringBuffer sb = new StringBuffer(getClass().getName());
        sb.append("[medidas:");
        for(int i=0; i<medida.length-1; i++) {
            sb.append(medida[i]);  sb.append(",");
        }
        sb.append(medida[medida.length-1]);
        sb.append("]");
        return sb.toString();
    }
    // método abstrato que determinará a área
    //É uma assinatira de método, uma vez que não apresenta corpo(escopo) e termina com ;
    public abstract double area ();







}
