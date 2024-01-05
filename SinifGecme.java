package sınıfGecme;

import java.util.Scanner;

public class SinifGecme {

	public static void main(String[] args) {
		
		int matematik, fizik, kimya, turkce, muzik ;
		
		Scanner scanner  =new Scanner(System.in); 
		
		System.out.print("Matematik Ders Notunuz : ");
		matematik = scanner.nextInt();
		
		System.out.print("Fizik Ders Notunuz : ");
		fizik = scanner.nextInt();
		
		System.out.print("Kimya Ders Notunuz : ");
		kimya = scanner.nextInt();

		System.out.print("Türkçe Ders Notunuz : ");
		turkce = scanner.nextInt();
		
		System.out.print("Müzik Ders Notunuz : ");
		muzik = scanner.nextInt();
		
		int dersSayisi = 0;
		int toplamNot = 0;
		boolean gecersizNot = false;
		
		if (matematik>0 && matematik<100) {
			
			dersSayisi++;
			toplamNot += matematik;
			
			}else {
				gecersizNot = true;
				System.out.println("Geçersiz Not Girildi.");
				
			}
		
		if (fizik>0 && fizik<100) {
			
			dersSayisi++;
			toplamNot += fizik;
			
			}else {
				gecersizNot = true;
				System.out.println("Geçersiz Not Girildi.");
			}
		
		
		if (kimya>0 && kimya<100) {
			
			dersSayisi++;
			toplamNot += kimya;
			
			}else {
				gecersizNot = true;
				System.out.println("Geçersiz Not Girildi.");
			}
		
		if (turkce>0 && turkce<100) {
			
			dersSayisi++;
			toplamNot += turkce;
			
			}else {
				gecersizNot = true;
				System.out.println("Geçersiz Not Girildi.");
			}
		
		if (muzik>0 && muzik<100) {
			
			dersSayisi++;
			toplamNot += muzik;
			
			}else {
				gecersizNot = true;
				System.out.println("Geçersiz Not Girildi.");
			}
		
		if (!gecersizNot) {
			
			double ortalama = toplamNot/dersSayisi;
			
			if (ortalama>=55) {
				
				System.out.println("Ortalamanız : " + ortalama + " Sınıfı Geçtiniz...");
				
			}else {
				System.out.println("Ortalamanız : " + ortalama + " Sınıfta Kaldınız...");
			}
			
		}
		
		
	}

}
