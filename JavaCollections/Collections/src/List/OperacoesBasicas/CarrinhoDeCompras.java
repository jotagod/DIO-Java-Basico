package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    //Atributo

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String produto) {
        itemList.add(new Item(produto));
    }

    public void removerItem(String produto) {
        List<Item> itemParaRemover = new ArrayList<>();
        for(Item i : itemList) {
            if(i.getProduto().equalsIgnoreCase(produto)) {
                itemParaRemover.add(i);
            }
        }
        itemList.removeAll(itemParaRemover);
    }
    
    public int obterNumeroTotalDeItems() {
        return itemList.size();
    }

    public void obterProdutosNoCarrinho() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("O numero total de elementos na lista é: " + carrinhoDeCompras.obterNumeroTotalDeItems());
        
        carrinhoDeCompras.adicionarItem("Item 1");
        carrinhoDeCompras.adicionarItem("Item 1");
        carrinhoDeCompras.adicionarItem("Item 2");

        System.out.println("O numero total de elementos na lista é: " + carrinhoDeCompras.obterNumeroTotalDeItems());
        
        carrinhoDeCompras.removerItem("Item 2");
        System.out.println("O numero total de elementos na lista é: " + carrinhoDeCompras.obterNumeroTotalDeItems());

        carrinhoDeCompras.obterProdutosNoCarrinho();

    }

}
