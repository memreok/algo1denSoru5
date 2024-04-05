import java.util.Scanner;

public class oranti {

	public static void main(String[] args) {
		// kullanıcıdan 5 tane sayı al çiftleri topla
		// tekleri topla çift/tek yap
		
		// tanımlama
		double ciftler = 0;		//for un içinde tanımlasak ulaşamazdık (scope)
		
		
		

		
		double tekler = 0;
		// girdi alma
		Scanner scanner = new Scanner(System.in);
		// for ile istediğimiz sayıda girdi alabiliriz
		for (int i = 1; i < 6; i++) {

			System.out.print(i + ". Sayıyı giriniz: ");
			double sayi = scanner.nextInt();
			// kontroller
			// ilk kontrol pozitif mi değil mi 
			// pozitif değilse tekrar girmesini istiyoruz
			if (sayi > 0) {
				// çift mi tek mi için mod kullanıyoruz
				if (sayi % 2 == 0) {
					ciftler += sayi; // ciftler = ciftler + sayi

				}else {
					tekler += sayi;
				}

			} else {
				System.out.println("Negatf sayı girdiniz." + "Lütfen pozitif sayı giriniz. ");
				i--; 	// burdaki satırla eksik sayıda girdi almasını engelliyoruz.
			}
		}
		// yazdırma işlemi
		System.out.println("Tek sayıların toplamı: "+tekler);
		System.out.println("Çift sayıların toplamı: "+ciftler);
		System.out.println("Çiftlerin toplamının Teklerin toplamına oranı: "+ (ciftler/tekler));
}
}
