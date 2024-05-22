package Collections.Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;


    public ConjuntoConvidados(Set<Convidado> convidadoSet) {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado (String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {

        Set<Convidado> convidados = new HashSet<>();


        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados(convidados);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");
        conjuntoConvidados.adicionarConvidado("condidado 1" , 1234);
        conjuntoConvidados.adicionarConvidado("condidado 2" , 1235);
        conjuntoConvidados.adicionarConvidado("condidado 3" , 1236);
        conjuntoConvidados.adicionarConvidado("condidado 4" , 1236);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");
        conjuntoConvidados.exibirConvidados();
        conjuntoConvidados.removerConvidadoPorCodigo(1234);
        conjuntoConvidados.exibirConvidados();
    }
}


