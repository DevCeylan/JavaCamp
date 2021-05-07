package intro;

public class Main {

	public static void main(String[] args) {
		String stringTest = "Test";
		System.out.println(stringTest);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 = "Ankara";
		String sehir2 = "İstanbul";
		sehir1 = sehir2;
		sehir2 = "İzmir";
		System.out.println(sehir1);
		// Stringler ile ilgili durum: char array i olarak tutulur
		
	}

}
