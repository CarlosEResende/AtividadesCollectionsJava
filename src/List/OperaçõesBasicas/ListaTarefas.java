package List.OperaçõesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

   
    public ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){

        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for(Tarefa t : tarefaList){

            if(t.getDescricao().equalsIgnoreCase(descricao)){

                tarefasParaRemover.add(t);

            }
        }

        tarefaList.removeAll(tarefasParaRemover);

    }


    public int obterTotalTarefas(){

        return tarefaList.size();

    }

    public void obterDescricoesTarefas(){

        System.out.println(tarefaList);

    }


    public static void main(String[] args){

        ListaTarefas listaTarefas = new ListaTarefas();

        
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 1");
        listaTarefas.adicionarTarefa("Tarefa 3");
        

        listaTarefas.removerTarefa("Tarefa 1");
      
        
        System.out.println("Número Total de elementos na lista: " + listaTarefas.obterTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }






    




}