package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){

        contatoSet.add(new Contato(nome, numero));

    }

    public void exibirContato(){

        System.out.println(contatoSet);

    }

    public Set<Contato> pesquisarPorNome(String nome){

        Set<Contato> contatoPorNome = new HashSet<>();

        for(Contato c: contatoSet){

            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;


    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Contato A", 983459);
        agendaContatos.adicionarContato("Contato A", 232349);
        agendaContatos.adicionarContato("Contato C", 93654);
        agendaContatos.adicionarContato("Contato D", 145234);
        agendaContatos.adicionarContato("Contato E", 692123);

        agendaContatos.exibirContato();

        agendaContatos.atualizarNumeroContato("Contato C", 784354);


        agendaContatos.exibirContato();

    }
    
    



}
