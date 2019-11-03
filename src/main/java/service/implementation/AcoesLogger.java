package service.implementation;

import service.Observer;

public class AcoesLogger implements Observer {

	public void mudancaQuantidade(String acao, Integer quantidade) {
		System.out.println(String.format("Alterada a quantidade da ação %s para %s", acao, quantidade));

	}

}
