package matheus.moreira.uno.morintegracaocomjava.database_app.tabelas;

public class Prova {
    private int id;
    private String disciplina;

    public Prova(Prova tblProva){
        this.id         = tblProva.getId();
        this.disciplina = tblProva.getDisciplina();
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}
