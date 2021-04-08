package poo;

public class ContaBancaria {
	private String Banco;
	private String Ag;
	private String Conta;
	private String Titular;
	private String Cpf;
	private double Saldo;
	
	public ContaBancaria (String Banco,String Ag,String Conta,String Titular,String Cpf,double Saldo)
	{
		this.Banco = Banco;
		this.Ag = Ag;
		this.Conta = Conta;
		this.Titular = Titular;
		this.Cpf = Cpf;
		this.Saldo = Saldo;
	}

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}

	public String getAg() {
		return Ag;
	}

	public void setAg(String ag) {
		Ag = ag;
	}

	public String getConta() {
		return Conta;
	}

	public void setConta(String conta) {
		Conta = conta;
	}

	public String getTitular() {
		return Titular;
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	public void imprimirInfo()
	{
		System.out.println("Banco "+Banco+"\nAg. "+Ag+"\nConta. "+Conta+"\nTitular: "+Titular+"\nCPF: "+Cpf+"\nSaldo Atual: "+Saldo);
	}	
	public void saque(double quantidade)
	{
		double novoSaldo = this.Saldo-quantidade;
		this.Saldo = novoSaldo;
		
		System.out.println("Banco "+Banco+"\nAg. "+Ag+"\nConta "+Conta+"\nTitular "+Titular+"\nCPF "+Cpf+"\nSaldo Atual: "+novoSaldo);
	}
	public void deposito(double quantidade)
	{
		double novoSaldo1 = this.Saldo+quantidade;
		this.Saldo = novoSaldo1;		
		System.out.println("Banco "+Banco+"\nAg. "+Ag+"\nConta "+Conta+"\nTitular "+Titular+"\nCPF "+Cpf+"\nSaldo Atual: "+novoSaldo1);
	}
	
	
	
	

}
