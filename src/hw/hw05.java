package hw;
import java.util.Scanner;
//�g�@���j��ơA���ϥΪ̿�J�@�Ӫ���ơA�z�L���j��ƹB���o��ϦV���Ʀr�r��æL�X�C
//�Ҧp:��J 1234 �^�� 4321
public class hw05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		fun(sc.nextLong());
	}
	public static long fun(long n) {
		if(n>0){
			System.out.print(n%10);
			return fun(n/10);
			}
		else
			return 0;
	}
}
