package Collections.List.Pesquisa;

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
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLivro("Livro 1" , "autor 1", 2020);
        catalagoLivros.adicionarLivro("Livro 2" , "autor 1", 2024);
        catalagoLivros.adicionarLivro("Livro 3" , "autor 3", 2023);
        catalagoLivros.adicionarLivro("Livro 4" , "autor 4", 2022);
        catalagoLivros.adicionarLivro("Livro 5" , "autor 5", 2021);

        System.out.println(catalagoLivros.pesquisaPorAutor("autor 1"));
        System.out.println(catalagoLivros.pesquisaPorIntervalo(2021, 2022));
        System.out.println(catalagoLivros.pesquisarPorTitulo("livro 1"));
    }

}
