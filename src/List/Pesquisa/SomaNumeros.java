package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public int CalcularSoma() {

        int soma = 0;

        for (Integer numero : numerosList) {

            soma += numero;

        }

        return soma;

    }

    public int encontrarMaiorNumero() {

        int maiorNumero = 0;

        if (!numerosList.isEmpty()) {

            for (Integer numero : numerosList) {

                if (numero >= maiorNumero) {

                    maiorNumero = numero;

                }

            }

            return maiorNumero;

        }

        else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {

        int menorNumero = 0;

        if (!numerosList.isEmpty()) {

            for (Integer numero : numerosList) {

                if (numero <= menorNumero) {
                    menorNumero = numero;
                }

            }
            return menorNumero;
        }

        else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {

        if (!numerosList.isEmpty()) {

            System.out.println(this.numerosList);

        } else {

            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(12);

        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();
        
        
        System.out.println("Calculo dos números = " + somaNumeros.CalcularSoma());

        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());

    }

}