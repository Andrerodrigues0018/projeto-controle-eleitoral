package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DAO_Voto {
	// Inserir Voto do Eleitor no BD
	public void cadastrarVoto(Voto v) throws Exception {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(v);
		em.getTransaction().commit();

		em.close();
		emf.close();
	}


	public List<Object[]> listarVotos(){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "select count(v) as voto_qtd, v.candidato_id from voto v group by v.candidato_id ORDER BY COUNT(v) DESC";

		@SuppressWarnings("unchecked")
		List<Object[]> votos = em.createQuery(jpql).getResultList();
		
		return votos;		
	}

	public Integer validarVoto(Long eleitor_id) throws Exception {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia_simples");
		EntityManager em = emf.createEntityManager();

		String jpql = "SELECT v FROM voto v WHERE v.eleitor_id='" + eleitor_id + "'";
		Query query = em.createQuery(jpql);		

		System.out.println("tamo aq"); 

		@SuppressWarnings("unchecked")
		List<Voto> votos = query.getResultList();
		System.out.println("dao_jpa eleitores.size(): " + votos.size());

		if (votos.isEmpty()) {
			em.close();
			emf.close();
			System.out.println("Invalido");
			return 0;
		}
		// Se encontrou alguem
		else{
			em.close();
			emf.close();
			System.out.println("Valido");
			int candidato_id = Integer.parseInt(votos.get(0).getCandidatoId());			
			System.out.println("Candidato: " +candidato_id);
			return candidato_id;			
		}

	}


	
}
