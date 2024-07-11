package List.OperacoesBasicas;

public class Item {

    //atributo
    private String produto;

    //getter
    public String getProduto() {
        return produto;
    }

    public Item (String produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return produto;
    }

    
}
