package Collections.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<ConjuntoPalavras> conjuntoPalavrasSet;

    public ConjuntoPalavrasUnicas(Set<ConjuntoPalavras> conjuntoPalavrasSet) {
        this.conjuntoPalavrasSet = new HashSet<>();
    }

    //Adicionando palavra:
    public void adicionarPalavra(String palavra){
        conjuntoPalavrasSet.add(new ConjuntoPalavras(palavra));
    }

    public void removerPalavra(String palavra){
        ConjuntoPalavras remover = null;
        for(ConjuntoPalavras c : conjuntoPalavrasSet){
            if (c.getPalavraUnica() == palavra) {
                remover = c;
            }
        }
        conjuntoPalavrasSet.remove(remover);
    }

    public boolean verificarPalavra(String palavra){
        return conjuntoPalavrasSet.contains(palavra);
    }

    public void exibirPalavra(){
        System.out.println(conjuntoPalavrasSet);
    }




    public static void main(String[] args) {
        Set<ConjuntoPalavras> ConjuntoPalavras = new  HashSet<>();
        ConjuntoPalavrasUnicas unicas = new ConjuntoPalavrasUnicas(ConjuntoPalavras);

        unicas.adicionarPalavra("Santos");
        unicas.adicionarPalavra("Santoss");
        unicas.removerPalavra("Santoss");
        unicas.exibirPalavra();
        unicas.verificarPalavra("Santos");
        unicas.exibirPalavra();


    }
}
