package hw;
import java.util.Scanner;
//以遞迴設計函數，輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
public class hw02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(fun(n));
	}
	public static int fun(int n) {
		int count=0;
		if(n==0)
		return count;
		else
			return (count+=1)+fun(n/10);
	}
	
}
