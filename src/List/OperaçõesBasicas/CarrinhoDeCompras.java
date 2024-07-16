package List.OperaçõesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> compra;

    public CarrinhoDeCompras(){
        this.compra = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        compra.add(new Item(nome, preco, quantidade));
    }

    public void exibirItens() {
        for (Item item : compra) {
            System.out.println(item);
        }
    }

    public void removerItemDoCarrinho(String nome){

        List<Item> itensParaRemover = new ArrayList<>();

        for(Item i : compra){

            if(i.getNome().equalsIgnoreCase(nome)){

                itensParaRemover.add(i);

            }
        }

        compra.removeAll(itensParaRemover);

    }

    
    public double obterPrecoTotalDoCarrinho() {
        
        double totalCarrinho = 0;
        for (Item item : compra) {
            totalCarrinho += item.getPreco() * item.getQuantidade();
        }
        
        return totalCarrinho
        ;
        
    }

    public static void main(String[] args){
        
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Macarrao", 4.90, 1);
        carrinhoDeCompras.adicionarItem("Feijão", 8.90, 1);
        carrinhoDeCompras.adicionarItem("Sal", 3.10, 1);
        carrinhoDeCompras.adicionarItem("Oleo", 6.90, 1);
        
      
        carrinhoDeCompras.removerItemDoCarrinho("Macarrao");
        carrinhoDeCompras.exibirItens();
        
        
        System.out.println("Valor total de compras do carrinho: " + carrinhoDeCompras.obterPrecoTotalDoCarrinho());
        
        

    }

}
