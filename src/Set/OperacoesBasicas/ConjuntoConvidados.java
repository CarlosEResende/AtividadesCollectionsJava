package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {

        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite) {

        Convidado convidadoParaRemover = null;

        for (Convidado c : convidadoSet) {

            if (c.getCodigoConvite() == codigoConvite) {

                convidadoParaRemover = c;
                break;
            }
        }

        convidadoSet.remove(convidadoParaRemover);

    }

    public int contarConvidados() {

        return convidadoSet.size();
    }

    public void exibirConvidados(){

        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        

        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        //System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " Convidados dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Felipe", 01);
        conjuntoConvidados.adicionarConvidado("Luana", 02);
        conjuntoConvidados.adicionarConvidado("Pedro", 03);
        conjuntoConvidados.adicionarConvidado("Thiago", 03);
        conjuntoConvidados.adicionarConvidado("Carlos", 04);

        System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " Convidados dentro do Set de Convidados");


        //conjuntoConvidados.removerConvidado(01);
        //System.out.println("Existem: " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
    }

}
