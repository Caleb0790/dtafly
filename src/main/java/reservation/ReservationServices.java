package reservation;


public class ReservationServices {
	
	public static boolean createReservation(Reservation reservation) {
		
		return ReservationDAO.create(reservation);	
	}


}
