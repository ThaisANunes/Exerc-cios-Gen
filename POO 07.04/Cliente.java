package poo;

public class Cliente {
	private String primeiroNome;
	private String segundoNome;
	private String cpf;
	private double diaDaCompra;	
	private String produtoComprado;
	private String satisfacao;
	
	
	public Cliente (String primeiroNome,String segundoNome,String cpf,double diaDaCompra,String produtoComprado,String satisfacao)
	{
			this.primeiroNome = primeiroNome;
			this.segundoNome = segundoNome;
			this.cpf = cpf;
			this.diaDaCompra = diaDaCompra;
			this.produtoComprado = produtoComprado;
			this.satisfacao = satisfacao;			
	}
	public void ImprimirInfo()
	{
		System.out.println("Nome completo: "+primeiroNome+" "+segundoNome+"\nCPF: "+cpf+"\nDia da Compra: "+diaDaCompra+"\nProduto comprado: "+produtoComprado+"\nNível de Satisfação:"+satisfacao);
	}
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getSegundoNome() {
		return segundoNome;
	}
	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getDiaDaCompra() {
		return diaDaCompra;
	}
	public void setDiaDaCompra(double diaDaCompra) {
		this.diaDaCompra = diaDaCompra;
	}
	public String getProdutoComprado() {
		return produtoComprado;
	}
	public void setProdutoComprado(String produtoComprado) {
		this.produtoComprado = produtoComprado;
	}
	public String getSatisfacao() {
		return satisfacao;
	}
	public void setSatisfacao(String satisfacao) {
		this.satisfacao = satisfacao;
	}
	
	
	
	

}
