package ex;
import java.util.Scanner;
/*  
 * Date: 2016/11/14
 * Author: 105021030 ±i§Ê·¶
 */
public class ex04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(fun(sc.nextLong()));
	}
	public static Long fun(Long n) {
		Scanner sc=new Scanner(System.in);
		long sum=1;
		if(n==1)
			return 1L;
		else
		return n*fun(n-1);
	}

}
