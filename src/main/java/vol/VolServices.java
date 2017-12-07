package vol;

import java.util.List;

public class VolServices {
	
	public static boolean createVol(Vol vol) {
		return VolDAO.create(vol);
	}

	public static List<Vol> readAll(){
		return VolDAO.readAll();
	}
}
