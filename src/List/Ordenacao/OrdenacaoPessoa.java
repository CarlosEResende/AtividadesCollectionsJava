package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadaPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new Pessoa.ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();

        ordenacaoPessoas.adicionarPessoa("Renan", 22, 1.86);
        ordenacaoPessoas.adicionarPessoa("Breno", 28, 1.78);
        ordenacaoPessoas.adicionarPessoa("Clara", 20, 1.69);
        ordenacaoPessoas.adicionarPessoa("Guilherme", 19, 1.74);

        System.out.println("Lista de Pessoas: " + ordenacaoPessoas.pessoaList);
        System.out.println("Por Idade: " + ordenacaoPessoas.ordenadaPorIdade());
        System.out.println("Por Altura: " + ordenacaoPessoas.ordenarPorAltura());
    }
}
