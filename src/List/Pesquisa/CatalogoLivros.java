package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){

        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){

        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){

            for(Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                    
                }
            }
        }

        return livrosPorAutor;
        
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if(!livroList.isEmpty()){

            for(Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    
                    
                    livrosPorIntervaloAno.add(l);

                    
                }
            }

        }

        return livrosPorIntervaloAno;
    
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
          for (Livro l : livroList) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
              livroPorTitulo = l;
              break;
            }
          }
          return livroPorTitulo;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }

    public static void main(String[] args) {
            

        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro A", "Autor A", 2000);
        catalogoLivros.adicionarLivro("Livro B", "Autor A", 2008);
        catalogoLivros.adicionarLivro("Livro B", "Autor B", 2013);
        catalogoLivros.adicionarLivro("Livro D", "Autor D", 2019);


        //System.out.println(catalogoLivros.pesquisarPorAutor("Autor B"));
        //System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2020));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro B"));
    }



}

    


