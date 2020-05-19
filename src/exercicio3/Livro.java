package exercicio3;

import java.util.List;

public class Livro {
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

	public Livro(String nomeNacional, int ano, String autores, int edicao, String cidade, String editora,
			String nomeOriginal, String tradutores, int paginas, long isbn) {
		this.nomeNacional = nomeNacional;
		this.ano = ano;
		this.autores=autores;
		this.edicao = edicao;
		this.cidade = cidade;
		this.editora = editora;
		this.nomeOriginal = nomeOriginal;
		this.tradutores = tradutores;
		this.paginas = paginas;
		this.isbn = isbn;
	}

	public String getNomeNacional() {
		return this.nomeNacional;
	}

	public int getAno() {
		return this.ano;
	}

	public String getAutores() {
		return this.autores;
	}

	public int getEdicao() {
		return this.edicao;
	}

	public String getCidade() {
		return this.cidade;
	}

	public String getEditora() {
		return this.editora;
	}

	public String getNomeOriginal() {
		return this.nomeOriginal;
	}

	public String getTradutores() {
		return this.tradutores;
	}

	public int getPaginas() {
		return this.paginas;
	}

	public long getIsbn() {
		return this.isbn;
	}
	
	
}
