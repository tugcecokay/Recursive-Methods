import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int secim =0;
		secim=Menu();
		Recursive r1 = new Recursive();
		switch (secim) {
		case 1:
			System.out.print("1.Sayiyi giriniz:");
			r1.setSayi1(input.nextInt());
			System.out.print("2.Sayiyi giriniz:");
			r1.setSayi2(input.nextInt());
			System.out.println("Ebob="+r1.Ebob(r1.getSayi1(),r1.getSayi2()));
			break;
		case 2:
			System.out.print("Kaçıncı fibonacci sayısını öğrenmek istiyorsun?");
			r1.setSayi1(input.nextInt());
			System.out.println("Fibonacci="+r1.Fibonacci(r1.getSayi1()));
			break;
		case 3:
			System.out.print("Sayiyi giriniz:");
			r1.setSayi1(input.nextInt());
			System.out.println("="+r1.Siralama(r1.getSayi1()));
			break;
		case 4:
			System.out.print("Sayiyi giriniz:");
			r1.setSayi1(input.nextInt());
			System.out.println("Faktöriyel="+r1.Faktoriyel(r1.getSayi1()));
			break;
		case 5:
			System.out.print("Taban değerini giriniz");
			r1.setSayi1(input.nextInt());
			System.out.print("Üs değerini giriniz:");
			r1.setSayi2(input.nextInt());
			System.out.println("Sonuc"+r1.Us(r1.getSayi1(), r1.getSayi2()));
			break;
		case 6:
			System.out.print("n değerini giriniz:");
			r1.setSayi1(input.nextInt());
			System.out.println("Sonuc"+r1.SumOf1n(r1.getSayi1()));
		default:
		main(args);
			
		}

	}	
		public static int Menu(){
			Scanner input= new Scanner(System.in);
			int sec=0;
			System.out.println("1.Ebob");
			System.out.println("2.Fibonacci sayısı");
			System.out.println("3.Sıralama");
			System.out.println("4.Faktöriyel");
			System.out.println("5.Üs alma");
			System.out.println("6.n. Sayıya kadar toplama");
			sec = input.nextInt();			
			return sec;
			
		}

}
