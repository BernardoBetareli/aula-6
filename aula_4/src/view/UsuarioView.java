package view;

import model.ContaCorrente;
import model.ContaPoupanca;

public class UsuarioView {
	Mensagens mensagem = new Mensagens ();
	
	public void InterfaceDoUsuario() {
		int Opcao;
		String OpcaoSelecionada;
		
		OpcaoSelecionada = mensagem.solicitarEntrada(""
				+ "Selecione uma opção"
				+ "\n1 - criar conta"
				+ "\n2 - fazer saque"
				+ "\n3 - verificar saldo");
		
		Opcao = Integer.parseInt(OpcaoSelecionada);
		switch (Opcao) {
		case 1:
			String tipoDeConta;
			tipoDeConta = mensagem.solicitarEntrada(
					"Qual tipo de conta voce deseja?"
					+ "\n1 - Conta polpança"
					+ "\n2 - conta corrente");
			
			String EmailUsuario;
			
			EmailUsuario = mensagem.solicitarEntrada("Digite O email");
			
			if(tipoDeConta.equals("1")) {
				ContaPoupanca conta = new ContaPoupanca(EmailUsuario);
			}

			
			EmailUsuario = mensagem.solicitarEntrada ("digite seu email");
			if(tipoDeConta.equals("2")) {
				ContaCorrente conta = new ContaCorrente(EmailUsuario, 2);
				
			} 		
			
			break;
			
		case 2:
			
			
			break;
		}
		
	}
}
