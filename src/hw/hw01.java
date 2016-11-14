package hw;
//叫糶ㄧ计 lcm(x,y,z)―计 xyz ぇ程そ计
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
                max = i;   //max程そ计           a*b / max -->程そ计
            }
        }
        ab=a*b/max;
        for (int i = 2; i <= a; i++) {
            if (ab % i == 0 && c % i == 0) {
                max = i;   //max程そ计           ab*c / max -->程そ计
            }
        }
		return ab*c / max;
	}

}
