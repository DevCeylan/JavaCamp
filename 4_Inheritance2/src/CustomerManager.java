// Ýþ sýnýfý, baþka bir iþ sýnýfý kullanacak ise asla somut sýnýftan gitme. Baðýmlýlýk kafayý yer
// Asla iþ sýnýfýný baþka class ýn içinden new leme

public class CustomerManager {

		public void add(Logger logger) {
			
			System.out.println("Musteri eklendi.");
			
			logger.log();
		}
}
