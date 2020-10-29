package br.com.alura.jpa.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Movimentacao;
import br.com.alura.jpa.modelo.dao.MovimentacaoDAO;

public class TestaMovimentacoesFiltradasPorDataCriteria {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO(em);
		List<Movimentacao> movimentacaoFiltradasPorData = movimentacaoDAO.getMovimentacaoFiltradasPorData(null, null, 2017);
		for (Movimentacao movimentacao : movimentacaoFiltradasPorData) {
			System.out.println("Descricao -> " + movimentacao.getDescricao());
			System.out.println("Valor -> " + movimentacao.getValor());
			System.out.println("-----------------------");
		}
		
	}

}
