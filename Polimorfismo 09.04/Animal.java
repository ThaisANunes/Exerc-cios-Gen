package poo;

public abstract class Animal {
	public String nome;
	public int idade;
	
	
	public abstract void emitir_som();
	public abstract void locomover();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	

}
