package ex;
import java.util.Scanner;
/*  �мg�@�ӵ{���A���ϥΪ̿�J�@�Ӿ�ƤG���}�C�A�إ� var2()�禡 ��std2()
 * �i�H���O�p��G���}�C���ܲ��ƻP�зǮt�A�ç⵲�G�^�Ǩ�D�{���L�X�C
 * Date: 2016/11/14
 * Author: 105021030 �i�ʷ�
 */
public class ex03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�п�Jn [n*n�Ӽ�]:");
		int n=sc.nextInt();
		System.out.print(var2(n));
		
	}
	
	public static float var2(int n) {
	Scanner sc=new Scanner(System.in);
	float average=0,sum=0,sum2=0;
	int data[][]=new int[n][n];
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			data[i][j]=sc.nextInt();
			average+=data[i][j];
		}
	}
	average=average/(n*n);
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			sum=data[i][j]-average;
			sum=sum*sum;
			sum2=sum2+sum;
		}
	}
	return sum2/(n*n);
		
	}
	public static void std2() {
		
	}
}
