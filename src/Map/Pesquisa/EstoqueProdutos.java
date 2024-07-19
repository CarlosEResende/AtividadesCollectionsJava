package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

import Set.Ordenacao.Produto;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {

        estoqueProdutosMap.put(cod, new Produto(null, nome, preco, quantidade));

    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotalEstoque() {

        double valorTotalEstoque = 0;

        if (!estoqueProdutosMap.isEmpty()) {

            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }

        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutosMap.isEmpty()) {

            for (Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                }

            }
        }
        return produtoMaisCaro;

    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
    
       
        estoque.exibirProdutos();
    
        
        estoque.adicionarProduto(1L, "Filtro de Agua", 18, 620.0);
        estoque.adicionarProduto(2L, "Prato", 5, 30.0);
        estoque.adicionarProduto(3L, "Cadeira de Escritorio", 1, 450.0);
        estoque.adicionarProduto(4L, "Microondas", 6, 245.0);
        estoque.adicionarProduto(4L, "Panela de Pressão", 3, 350.0);
        estoque.adicionarProduto(4L, "Cafeteira", 4, 460.0);
    
    
        estoque.exibirProdutos();
    
        
        System.out.println("Valor total do estoque: R$" + estoque.calculaValorTotalEstoque());
    
      
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    
        
      }
}
