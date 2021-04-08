package poo;

public class Preguica extends Animal{
	private String subir_em_arvores;
	
	public Preguica()
	{
		
	}
	public Preguica(String nome,int idade,String emitir_som)
	{
		super(nome,idade,emitir_som);
	}
	public Preguica(String nome,int idade,String emitir_som,String subir_em_arvores)
	{
		super(nome,idade,emitir_som);
		this.subir_em_arvores = subir_em_arvores;
	}
	public String getSubir_em_arvores()
	{
		return subir_em_arvores;
	}
	public void setSubir_em_arvores(String subir_em_arvores)
	{
		this.subir_em_arvores = subir_em_arvores;
	}
	
	

}
