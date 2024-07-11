package List.OperacoesBasicas;

public class Tarefa {
    
    //atributo
    private String descricao;

    //getter
    public String getDescricao() {
        return descricao;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }

    

}
