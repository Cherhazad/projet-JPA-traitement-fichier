package Application;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class IntegrationOpenFoodFacts {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("applicationYuka");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		String fileName = "src/main/resources/open-food-facts.csv";
		CSVParser parser = new CSVParserBuilder().withSeparator('|').withIgnoreQuotations(true).build();
		
		List<String[]> records = null;
		
		try (
				CSVReader reader = new CSVReaderBuilder(new FileReader(fileName)).withSkipLines(1).withCSVParser(parser)
						.build()) {
			try {
				records = reader.readAll();
			} catch (CsvException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			transaction.begin();

			// instructions
			
			for (String[] record: records) {
				
			}

			// em.persist(produits);
		}

		// transaction.commit();
		catch (IOException e) {
			e.printStackTrace();
		} finally {

			em.close();
		}

	}

}
