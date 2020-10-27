package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.alura.jpa.modelo.dao.MovimentacaoDAO;

public class TestaSomaDasMovimentacoes {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		System.out.println("Valor somado: " + new MovimentacaoDAO(em).getSomaDasMovimentacoes());
		
		String jpqlAvg = "select avg(m.valor) from Movimentacao m";
		TypedQuery<Double> queryAvg = em.createQuery(jpqlAvg, Double.class);
		
		System.out.println("A média das movimentacoes: " + queryAvg.getSingleResult());
		
	}

}
