package dtafly;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import org.hibernate.id.EntityIdentifierNature;

import vol.TypeAvion;
import vol.Vol;
import vol.VolServices;

public class DTAFly {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);
	

		boolean menu1 = true;

		while (menu1) {
			System.out.println("Welcome to DATA-Fly");
			System.out.println("===================================================");
			System.out.println("1) Gestion des vols");
			System.out.println("2) Gestion des réservations");
			System.out.println("3) Quitter");
			
			Byte menu = Byte.parseByte(sc.nextLine());
			
			switch (menu) {
			case 1:
				menuVol();
				break;
			case 2:
				break;
			case 3:
				System.out.println("Merci de votre visite!");
				menu1 = false;
				break;
			default:
				System.out.println("Commande non reconnue!");
				break;
			}
		}

	}

	private static void menuVol() {

		
		Scanner sc = new Scanner(System.in);
		
		boolean menu1 = true;

		while (menu1) {
			System.out.println("Menu Vols");
			System.out.println("===================================================");
			System.out.println("1) Création d'un vol");
			System.out.println("2) Suppression d'un vol");
			System.out.println("3) Afficher les vols");
			System.out.println("4) Quitter");

			byte menu = Byte.parseByte(sc.nextLine());
			
			switch (menu) {
			case 1:
				System.out.println("Entrez un numéro de vol:");
				String numVol=sc.nextLine();
				
				System.out.println("Entrez une type d'avien (A330, A340, A380, B747)");
				String ta=sc.nextLine();
				TypeAvion typeAvion=TypeAvion.valueOf(ta);
				
				System.out.println("Entrez le nombre de place:");
				int nbPlace=Integer.parseInt(sc.nextLine());
				
				System.out.println("Entrez la ville de départ:");
				String villeDep=sc.nextLine();
				
				System.out.println("Entrez la ville d'arrivé:");
				String villeArr=sc.nextLine();
				
				System.out.println("Entrez la date du vol (JJ/MM/AAAA): ");
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				String date=sc.nextLine();
				LocalDate dateDep=LocalDate.parse(date, formatter);
				
				Vol vol = new Vol(numVol, typeAvion, nbPlace, villeDep, villeArr, dateDep);
				VolServices.createVol(vol);
				break;
			case 2:
				break;
			case 3:
				List<Vol> vols=VolServices.readAll();
				for (Vol vol2 : vols) {
					System.out.println(vol2.toString());
				}
				break;
			case 4:
				menu1 = false;
				break;
			default:
				System.out.println("Commande non reconnue!");
				break;
			}
		}
	}

}
