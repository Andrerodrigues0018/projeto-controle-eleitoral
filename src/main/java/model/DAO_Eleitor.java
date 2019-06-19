package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DAO_Eleitor {
	
	
	public Eleitor validarLogin(Eleitor e) throws Exception {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		Eleitor validaLogin = new Eleitor();

		// Quando VIER VAZIO
		if (e.getTitulo().equals("")) {
			validaLogin.setTitulo("PreenchaNUM");
			return validaLogin;
		}

		String jpql = "SELECT e FROM eleitor e WHERE e.eleitor_titulo='" + 
					   e.getTitulo() + "' and e.eleitor_senha='" + 
					   e.getSenha() + "' ";

		Query query = em.createQuery(jpql);

		@SuppressWarnings("unchecked")
		List<Eleitor> eleitores = query.getResultList();
		System.out.println("dao_jpa eleitores.size(): " + eleitores.size());

		// Se não tem ninguem
		if (eleitores.isEmpty()) {
			em.close();
			emf.close();
			validaLogin.setTitulo("TituloNaoEncontrado");
			return validaLogin;
		}
		// Se encontrou alguem
		else{
			em.close();
			emf.close();
			return eleitores.get(0);			
		}
	}

	// public Eleitor atualizarEleitor(Eleitor e) throws Exception {
		
	// 	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
	// 	EntityManager em = emf.createEntityManager();


	// 	String jpql = "UPDATE eleitor e SET e.eleitor_nome = 'Rodriguinho' " +
	// 	      		  "WHERE e.eleitor_id = :eleitor_id";

	// 	Query q = em.createQuery(jpql, Eleitor.class);
	// 	q.setParameter("eleitor_id", e.getId());
	// 	em.getTransaction().begin();
	// 	System.out.println("Resultado final "+q.executeUpdate()); 
	// 	em.getTransaction().commit();

	// 	return e;
	// }

	// public Eleitor atualizarEleitor(Eleitor e) throws Exception {
		
	// 	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
	// 	EntityManager em = emf.createEntityManager();


	// 	e.setNome("Rodriguinho");

	// 	em.merge(e);

	// 	em.close();
		
	// 	emf.close();

	// 	return e;

	// }
	
	// public void apagarEleitor(Eleitor e) throws Exception {
		
	// 	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
	// 	EntityManager em = emf.createEntityManager();

	// 	em.getTransaction().begin();

	// 	String jpql = "DELETE FROM eleitor WHERE numeroDeTitulo='" + e.getNumeroDeTitulo() + "'";
	// 	Query query = em.createNativeQuery(jpql);

	// 	query.executeUpdate();
	// 	em.getTransaction().commit();

	// 	em.close();
	// 	emf.close();
	// }

	// public Eleitor cadastrarEleitor(Eleitor e) throws Exception {
		
	// 	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
	// 	EntityManager em = emf.createEntityManager();

	// 	DAO_Eleitor eBD = new DAO_Eleitor();
	// 	Eleitor verificaJaCadastrado = eBD.verificarNumeroDeTituloNaoCadastrado(e);

	// 	if (verificaJaCadastrado.getNumeroDeTitulo().equals("numNaoCadastrado")) {

	// 		em.getTransaction().begin();
	// 		em.persist(e);
	// 		em.getTransaction().commit();

	// 		em.close();
	// 		emf.close();
	// 	}

	// 	else {
	// 		return verificaJaCadastrado;
	// 	}
	// 	return e;
	// }

	// public void zerarIDsTabela_eleitor() throws Exception {
		
	// 	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
	// 	EntityManager em = emf.createEntityManager();

	// 	em.getTransaction().begin();

	// 	String jpql = "ALTER TABLE eleitor AUTO_INCREMENT = 1";
	// 	Query query = em.createNativeQuery(jpql);

	// 	query.executeUpdate();
	// 	em.getTransaction().commit();

	// 	em.close();
	// 	emf.close();
	// }
}
