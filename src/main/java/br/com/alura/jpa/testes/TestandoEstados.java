package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class TestandoEstados {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setTitular("Almiro");
		conta.setNumero(12345);
		conta.setAgencia(123123);
		conta.setSaldo(100.0);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.remove(conta);
		em.getTransaction().commit();
		
	}

}
