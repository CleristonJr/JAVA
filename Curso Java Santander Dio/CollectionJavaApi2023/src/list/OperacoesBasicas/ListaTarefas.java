package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

	private List<Tarefas> tarefaList;
	
	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefas(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefas> tarefasParaRemover = new ArrayList<>();
		for (Tarefas t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
		
	}
	
	public void obterDescricoesTarefas() {
		
		System.out.println(tarefaList);
		
	}
	
	public static void main(String[] args) {
		ListaTarefas listaTarefas = new ListaTarefas();
		
		System.out.println("O numero total de elemeno na lista é " + listaTarefas.obterNumeroTotalTarefas());
		
		listaTarefas.adicionarTarefa("Tarefa 1");
		listaTarefas.adicionarTarefa("Tarefa 1");
		listaTarefas.adicionarTarefa("Tarefa 3");
		System.out.println("O numero total de elemeno na lista é " + listaTarefas.obterNumeroTotalTarefas());
		
		listaTarefas.removerTarefa("Tarefa 3");
		System.out.println("O numero total de elemeno na lista é " + listaTarefas.obterNumeroTotalTarefas());
		
		listaTarefas.obterDescricoesTarefas();

		
	}

}
