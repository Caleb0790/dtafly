package vol;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import dtafly.DatabaseHelper;

public class VolDAO {
	
	public static boolean create(Vol vol) {
		
		EntityManager em=DatabaseHelper.createEntityManager();
		DatabaseHelper.beginTx(em);
		em.persist(vol);
		DatabaseHelper.commitTxAndClose(em);
		
		return false;
	}
	
	public static List<Vol> readAll() {
		EntityManager em=DatabaseHelper.createEntityManager();
		DatabaseHelper.beginTx(em);
		TypedQuery<Vol> query = em.createQuery("from Vol", Vol.class);
		List<Vol> vols = query.getResultList();
		em.close();
		return vols;
	}

}
