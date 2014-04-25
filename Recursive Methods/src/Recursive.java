import java.util.Scanner;


public class Recursive {
	
private int sayi1;
private int sayi2;
	
public int getSayi1() {
	return sayi1;
}
public void setSayi1(int sayi1) {
	this.sayi1 = sayi1;
}
public int getSayi2() {
	return sayi2;
}
public void setSayi2(int sayi2) {
	this.sayi2 = sayi2;
}
public static int SumOf1n (int n){
	if(n==1){
		return 1;
	
}	else{
	return n=SumOf1n(n-1) ;
}
}
public static int Faktoriyel(int n){
	
		if (n==0) {
		return 1;
		}
		else if(n==1){
			return 1;
		}
		else if(n<0){
			return -1;
		}
		return n*Faktoriyel(n-1);

}
public static int Ebob (int x , int y){
	if(y==0){
		return x;
	}
	
	return Ebob(y,x%y);
	
	
}
public static int Us(int x, double d){
	if(d==0){
		return 1;
	}
	
		return  x*Us(x,d-1);
}
public static String Siralama(int n){
	if(n<10){
		return Integer.toString(n);
	}
	else
		return n%10 + " " +Siralama(n/10);
		
}

public static int Fibonacci(int n){
	if(n==0){
		return 0;
	}
	else if(n==1){
		return 1;
	}
	else
		return Fibonacci(n-2)+Fibonacci(n-1);
		
}


}

