package hw;
import java.util.Scanner;
//�H���j�]�p��ơA��J�@�ӥ���ƭ�(���t 0)�A�Ǧ^�ӼƭȬO�X���(# ofdigits)�C
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
