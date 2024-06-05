package Application;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class IntegrationOpenFoodFacts {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("applicationYuka");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		transaction.begin();
		
		//mettre les transactions ici
		
		
		transaction.commit();

		em.close();

	}

}
