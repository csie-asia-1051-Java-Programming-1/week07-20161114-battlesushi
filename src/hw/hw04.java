package hw;
import java.util.Scanner;
//寫一遞迴函數，求 m、n 兩數的最大公因數 gcd(m,n)由鍵盤輸入
public class hw04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(gcd(sc.nextInt(),sc.nextInt(),2,1));
	}
	public static int gcd(int m,int n,int i,int max) {
        if(m % i == 0 && n % i == 0){
        	max=i;
        	return max=gcd(m,n,i+1,max);
        }
        else if(i<m)
        	return gcd(m,n,i+1,max);
        else
        	return max;
	}
}
