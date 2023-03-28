
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println("Saldo: R$"+ contaDoPaulo.saldo);
		contaDoPaulo.saca(20);
		System.out.println("Saldo: R$"+ contaDoPaulo.saldo);
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);	
		System.out.println("Saldo: R$"+ contaDaMarcela.saldo);
		contaDaMarcela.transfere(300, contaDoPaulo);
		if(contaDaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("Transferência feita com sucesso");
		} else System.out.println("Saldo insuficiente");
		System.out.println("Saldo: R$"+ contaDaMarcela.saldo);
		System.out.println("Saldo: R$"+ contaDoPaulo.saldo);
	}

}
