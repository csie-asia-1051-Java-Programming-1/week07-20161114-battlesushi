package hw;
import java.util.Scanner;
//��J��Ӿ�ơA�ϥλ��j��ƩI�s��X C(m,n)�C
public class hw03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		C(sc.nextInt(),sc.nextInt());
	}
	public static void C(int m,int n) {
		fun(m);//m����
		fun(n);//n����
		fun(m-n);//m-n����
		System.out.print(fun(m)/fun(n)/fun(m-n));
	}
	public static int fun(int a) {
		if(a==1)
			return a;
		else
			return a*fun(a-1);
	}
}
