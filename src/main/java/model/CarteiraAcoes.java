package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import service.Observer;

public class CarteiraAcoes {
	private Map<String, Integer> acoes = new HashMap<String, Integer>();
	private List<Observer> observer = new ArrayList<Observer>();
	
	public void adicionaAcoes(String acao, Integer qtd) {
		if (acoes.containsKey(acao)) {
			qtd += acoes.get(acao);
		}
		acoes.put(acao,  qtd);
		notificar(acao, qtd);
	}

	private void notificar(String acao, Integer qtd) {
		for (Observer obs: observer)
			obs.mudancaQuantidade(acao, qtd);
	}
	
	public void addObserver(Observer obs) {
		observer.add(obs);
	}

}
