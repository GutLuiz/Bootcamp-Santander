package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    // criando um arrayList vazio para adicionar dados
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // metodos para adicionar tarefa
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    // metodo para remover uma tarefa
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>(); // criando uma lista vazia
        for(Tarefa t : tarefaList){ // pegando cada tarefa que esta dentro da tarefa que esta os dados adicionados
            if ((t.getDescricao().equalsIgnoreCase(descricao))){ // vendo se a descriçao que estou colocando vai ser a mesma do terminal
                tarefasParaRemover.add(t); // adicionando esse dado na lista para remover
            }
        }
        tarefaList.removeAll(tarefasParaRemover); // removendo os dados da lista principal com o parametro da lista para remover.
    }

    // obter o numero total de tarefas:
    public int obterNumeroTotalTarefas(){
        return  tarefaList.size(); // quantidade de elementos que tem na lista
    }

    // obter descricoes de tarefas:
    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefas();
    }
}
