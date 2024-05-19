package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicado){
        livroList.add(new Livro(titulo,autor,anoPublicado));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for(Livro l : livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervalo(int anoInicial, int anoFinal){
             List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
             if(!livroList.isEmpty()){
                 for(Livro l : livroList){
                     if(l.getAnoPublicado() >= anoInicial && l.getAnoPublicado() <= anoFinal){
                         livrosPorIntervaloAnos.add(l);
                     }
                 }
             }
             return livrosPorIntervaloAnos;
    }
    
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                     livroPorTitulo = l;
                    brake;
                }
            }
        }
        return livroPorTitulo;
    }
}
