package hw;
import java.util.Scanner;
//�g�@���j��ơA�D m�Bn ��ƪ��̤j���]�� gcd(m,n)����L��J
public class hw04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(gcd(sc.nextInt(),sc.nextInt(),2,1));
	}
	public static int gcd(int m,int n,int i,int max) {  //i= �@�P����  max= �̤j���]��
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
