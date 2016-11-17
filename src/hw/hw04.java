package hw;
import java.util.Scanner;
//糶患癹ㄧ计― mn ㄢ计程そ计 gcd(m,n)パ龄絃块
public class hw04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(gcd(sc.nextInt(),sc.nextInt(),2,1));
	}
	public static int gcd(int m,int n,int i,int max) {  //i= 埃计  max= 程そ计
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
