package matheus.moreira.uno.morintegracaocomjava.database_app.tabelas;

public class Respostas {
    private int id, pergunta_id;
    private String resposta;

    public Respostas(Respostas tblRespostas){
        this.id          = tblRespostas.getId();
        this.pergunta_id = tblRespostas.getPergunta_id();
        this.resposta    = tblRespostas.getResposta();
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPergunta_id() {
        return pergunta_id;
    }

    public void setPergunta_id(int pergunta_id) {
        this.pergunta_id = pergunta_id;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}
