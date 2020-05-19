package exercicio3;

import java.util.List;

public class ConstrutorLivro implements InterfaceLivro{
	private String nomeNacional;
	private int ano;
	private String autores;
	private int edicao;
	private String cidade;
	private String editora;
	private String nomeOriginal;
	private String tradutores;
	private int paginas;
	private long isbn;

	
	
	@Override
	public void setNomeNacional(String nome) {
		this.nomeNacional = nome;
	}

	@Override
	public void setAno(int ano) {
		this.ano = ano;
	}

	@Override
	public void setAutores(String  autor) {
		this.autores = autor;
	}

	@Override
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	@Override
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Override
	public void setNomeOriginal(String nomeOriginal) {
		this.nomeOriginal = nomeOriginal;
	}

	@Override
	public void setTradutores(String  tradutores) {
		this.tradutores = tradutores;
;	}

	@Override
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
	public Livro getResult() {
		return new Livro(nomeNacional,ano,autores,edicao,cidade,editora,nomeOriginal,tradutores,paginas,isbn);
	}
	

}
