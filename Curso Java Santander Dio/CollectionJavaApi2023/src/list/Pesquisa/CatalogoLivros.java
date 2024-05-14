package list.Pesquisa;


import java.util.ArrayList;
import java.util.List;


public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livroList.add(new Livro(titulo, autor, anoPublicacao));
		
	}
    
    public List<Livro> pesquisarPorAutor(String autor){
    	List<Livro> livrosPorAutor = new ArrayList<>();
    	if(!livroList.isEmpty()) {
    		for (Livro livro : livroList) {
				if(livro.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(livro);
				}
			}
    	}
    	return livrosPorAutor;
    }
    
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
    	List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
    	if(!livroList.isEmpty()) {
    		for (Livro livro : livroList) {
				if(livro.getAnoPublicacao() >= anoInicial  &&  livro.getAnoPublicacao() <= anoFinal) {
					livrosPorIntervaloDeAnos.add(livro);
				}
			}
    	}
    	
    	return livrosPorIntervaloDeAnos;
    }
    
    public Livro pesquisarPorTitulo(String titulo) {
    	Livro livroPorTitulo = null;
    	
    	if(!livroList.isEmpty()) {
    		for (Livro livro : livroList) {
				if(livro.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = livro;
					break;
				}
			}
    	}
    	return livroPorTitulo;
    }
    
    public static void main(String[] args) {
		CatalogoLivros catalogoLivros = new CatalogoLivros();
		
		catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2010);
		catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2022);
		catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2023);
		catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2024);
		catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2025);
		catalogoLivros.adicionarLivro("Livro 5", "Autor 1", 2026);
		catalogoLivros.adicionarLivro("Livro 6", "Autor 3", 2027);
		catalogoLivros.adicionarLivro("Livro 2", "Autor 3", 1999);
		
		System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
		System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 2"));
		System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2022, 2025));
	}

}
