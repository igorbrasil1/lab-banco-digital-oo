
public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new PessoaFisica("13549685615", "Venilton");
		Cliente cliente1 = new Cliente(pessoa);

		Agencia agencia = new Agencia();
		agencia.setNome("Praça");
		agencia.setNumero(123);
		
		Conta cc = new ContaCorrente(cliente1, agencia);
		Conta poupanca = new ContaPoupanca(cliente1, agencia);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
