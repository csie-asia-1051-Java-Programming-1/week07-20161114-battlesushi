package hw;
//�мg�@��� lcm(x,y,z)�A�D�T�� x�By�Bz ���̤p������
import java.util.Scanner;
public class hw01 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print(lcm(sc.nextInt(),sc.nextInt(),sc.nextInt()));
	}
	public static int lcm(int a,int b,int c) {
		Scanner sc=new Scanner(System.in);
        int max = 1 ,ab=1;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i;   //max���̤j���]��           a*b / max -->���̤p������
            }
        }
        ab=a*b/max;
        for (int i = 2; i <= a; i++) {
            if (ab % i == 0 && c % i == 0) {
                max = i;   //max���̤j���]��           ab*c / max -->���̤p������
            }
        }
		return ab*c / max;
	}

}
