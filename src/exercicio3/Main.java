package exercicio3;

public class Main {

	public static void main(String[] args) {
		Diretor d = new Diretor();
		ConstrutorLivro cl = new ConstrutorLivro();
		
		d.constructContrutorLivro(cl);
		Livro livro = cl.getResult();
		System.out.println(livro.getNomeNacional());
	}

}
