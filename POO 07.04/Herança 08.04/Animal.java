package poo;

public class Animal {
	private String nome;
	private int idade;
	private String emitir_som;
	
	public Animal()
	{
		
	}
	public Animal(String nome,int idade,String emitir_som)
	{
		this.nome = nome;
		this.idade = idade;
		this.emitir_som = emitir_som;		
	}
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
	public String getEmitir_som() {
		return emitir_som;
	}
	public void setEmitir_som(String emitir_som) {
		this.emitir_som = emitir_som;
	}
}
