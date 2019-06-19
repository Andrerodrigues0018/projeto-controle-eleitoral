package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DAO_Mesario {
	
	
	public Mesario validarLogin(Mesario e) throws Exception {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		Mesario validaLogin = new Mesario();

		// Quando VIER VAZIO
		if (e.getTitulo().equals("")) {
			validaLogin.setTitulo("PreenchaNUM");
			return validaLogin;
		}

		String jpql = "SELECT e FROM mesario e WHERE e.mesario_titulo='" + 
					   e.getTitulo() + "' and e.mesario_senha='" + 
					   e.getSenha() + "' ";

		Query query = em.createQuery(jpql);

		@SuppressWarnings("unchecked")
		List<Mesario> mesarios = query.getResultList();
		System.out.println("dao_jpa mesarios.size(): " + mesarios.size());

		// Se não tem ninguem
		if (mesarios.isEmpty()) {
			em.close();
			emf.close();
			validaLogin.setTitulo("TituloNaoEncontrado");
			return validaLogin;
		}
		// Se encontrou alguem
		else{
			em.close();
			emf.close();
			return mesarios.get(0);			
		}
	}



	// public void apagarmesario(mesario e) throws Exception {
		
	// 	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
	// 	EntityManager em = emf.createEntityManager();

	// 	em.getTransaction().begin();

	// 	String jpql = "DELETE FROM mesario WHERE numeroDeTitulo='" + e.getNumeroDeTitulo() + "'";
	// 	Query query = em.createNativeQuery(jpql);

	// 	query.executeUpdate();
	// 	em.getTransaction().commit();

	// 	em.close();
	// 	emf.close();
	// }

	// public mesario cadastrarmesario(mesario e) throws Exception {
		
	// 	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
	// 	EntityManager em = emf.createEntityManager();

	// 	DAO_mesario eBD = new DAO_mesario();
	// 	mesario verificaJaCadastrado = eBD.verificarNumeroDeTituloNaoCadastrado(e);

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

	// public void zerarIDsTabela_mesario() throws Exception {
		
	// 	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
	// 	EntityManager em = emf.createEntityManager();

	// 	em.getTransaction().begin();

	// 	String jpql = "ALTER TABLE mesario AUTO_INCREMENT = 1";
	// 	Query query = em.createNativeQuery(jpql);

	// 	query.executeUpdate();
	// 	em.getTransaction().commit();

	// 	em.close();
	// 	emf.close();
	// }
}
