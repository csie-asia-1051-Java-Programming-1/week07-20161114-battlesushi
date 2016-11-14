package hw;
import java.util.Scanner;
//糶患癹ㄧ计― mn ㄢ计程そ计 gcd(m,n)パ龄絃块
public class hw04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(gcd(sc.nextInt(),sc.nextInt(),2));
	}
	public static int gcd(int m,int n,int i) {
        if(i<m && m % i == 0 && n % i == 0)
        	return i=gcd(m,n,i+1);
        else if(i<m)
        	return gcd(m,n,i+1);
        else
        	return i;
	}
}
