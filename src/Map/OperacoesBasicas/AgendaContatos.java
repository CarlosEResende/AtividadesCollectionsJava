package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero){
        agendaContatosMap.put(nome, numero);
    }

    public void removerContato(String nome){

        if(!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }

    }

    public void exibirContato(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){

        Integer numeroPorNome = null;

        if(!agendaContatosMap.isEmpty()){
            numeroPorNome = agendaContatosMap.get(nome);
        }

        return numeroPorNome;
    }

    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Contato A", 111111);
        agendaContatos.adicionarContato("Contato B", 423111);
        agendaContatos.adicionarContato("Contato C", 145311);
        agendaContatos.adicionarContato("Contato C", 153211);
        agendaContatos.adicionarContato("Contato E", 765611);
        agendaContatos.adicionarContato("Contato C", 112434);
        //agendaContatos.exibirContato();

        agendaContatos.removerContato("Contato E");
        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPorNome("Contato A"));
    }

    

}
