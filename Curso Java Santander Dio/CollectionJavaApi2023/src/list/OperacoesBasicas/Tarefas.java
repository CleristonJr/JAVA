package list.OperacoesBasicas;

public class Tarefas {
	
	private String descricao;
	
	public Tarefas(String descricao) {
		this.descricao = descricao;
		// TODO Auto-generated constructor stub
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tarefa {" +
				"descricao= ' " + descricao + '\'' +
				'}';
	}
	
	

}
