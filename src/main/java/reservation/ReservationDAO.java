package reservation;

import javax.persistence.EntityManager;

import dtafly.DatabaseHelper;

public class ReservationDAO {

	public static boolean create(Reservation reservation) {
		
		EntityManager em=DatabaseHelper.createEntityManager();
		DatabaseHelper.beginTx(em);
		em.persist(reservation);
		DatabaseHelper.commitTxAndClose(em);
		
		return false;
	}
}
