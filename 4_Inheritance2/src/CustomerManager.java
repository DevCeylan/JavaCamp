// �� s�n�f�, ba�ka bir i� s�n�f� kullanacak ise asla somut s�n�ftan gitme. Ba��ml�l�k kafay� yer
// Asla i� s�n�f�n� ba�ka class �n i�inden new leme

public class CustomerManager {

		public void add(Logger logger) {
			
			System.out.println("Musteri eklendi.");
			
			logger.log();
		}
}
