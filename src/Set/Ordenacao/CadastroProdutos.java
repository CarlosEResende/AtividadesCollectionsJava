package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(Long codigo, String nome, double preco, int quantidade){

        produtoSet.add(new Produto(codigo, nome, preco, quantidade));

    }

    public Set<Produto> exibirProdutosPorNome(){

        Set <Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;

    }


    public Set<Produto> exibirProdutosPorPreco(){

        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);

        return produtoPorPreco;

    }

    public static void main(String[] args) {
        

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto A", 19.90, 1);
        cadastroProdutos.adicionarProduto(2L, "Produto F", 12.90, 1);
        cadastroProdutos.adicionarProduto(3L, "Produto C", 15.90, 1);
        cadastroProdutos.adicionarProduto(4L, "Produto D", 17.90, 1);
        cadastroProdutos.adicionarProduto(4L, "Produto E", 29.90, 1);

        //System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }

    

}
