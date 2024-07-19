package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEvento() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEveneto(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);

    }

    public  void exibirAgenda(){


        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);

        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){

        LocalDate dataAtual = LocalDate.now();

        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);

        for(Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()){

            if(entry.getKey().equals(dataAtual) || entry.getKey().isAfter(dataAtual)){

                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                
                System.out.println("O Proximo Evento: " + proximaData + " acontecerá na Data " + proximoEvento
                );
            }

            break;

        }
       





    }

    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();

        
        agendaEvento.adicionarEveneto(LocalDate.of
        (2024, Month.JULY, 20), "Evento 2", "Atração B");
        agendaEvento.adicionarEveneto(LocalDate.of
        (2024, Month.JULY, 19), "Pre-Evento 2", "Atração Secreta");
        agendaEvento.adicionarEveneto(LocalDate.of
        (2024, Month.AUGUST, 22), "Evento 3", "Atração C");
        agendaEvento.adicionarEveneto(LocalDate.of
        (2024, Month.SEPTEMBER, 12), "Evento 4", "Atração D");
        agendaEvento.adicionarEveneto(LocalDate.of
        (2024, 9, 03), "Evento 5", "Atração E");
        agendaEvento.adicionarEveneto(LocalDate.of
        (2025, 1, 10), "Evento 6", "Atração F");

        //agendaEvento.exibirAgenda();
        agendaEvento.obterProximoEvento();
    }
    

}
