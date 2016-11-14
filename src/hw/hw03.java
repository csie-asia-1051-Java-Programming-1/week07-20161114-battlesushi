package hw;
import java.util.Scanner;
//輸入兩個整數，使用遞迴函數呼叫輸出 C(m,n)。
public class hw03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		C(sc.nextInt(),sc.nextInt());
	}
	public static void C(int m,int n) {
		fun(m);//m階乘
		fun(n);//n階乘
		fun(m-n);//m-n階乘
		System.out.print(fun(m)/fun(n)/fun(m-n));
	}
	public static int fun(int a) {
		if(a==1)
			return a;
		else
			return a*fun(a-1);
	}
}
