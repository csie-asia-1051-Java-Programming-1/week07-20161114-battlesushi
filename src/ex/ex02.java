package ex;
import java.util.Scanner;
/*  �ӤW�D�A���Fvar() ��Ƥ��~�A�A�Ϋإߤ@�� std() ��ơA�{���b�������ϥΪ̿�J���@����ư}�C����A
 * �I�sstd()�禡�i�o��}�C���зǮt�A�S�O�`�N�A���n�u�� std() ��ƺ⵲�G�A������std()�h�I�s var() ���
 * ����^�� std() �禡�B�z���A�Ǧ^���D�{���A�D�{���A�⵲�G�L�X�C
 * Date: 2016/11/14
 * Author: 105021030 �i�ʷ�
 */
public class ex02{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�п�J�Ӽ�:");
		int n=sc.nextInt();
		System.out.print(std(n));
	}
	public static double std(int n) {
		double ans=0;
		ans=Math.pow(var(n),1/2f);
		return ans;
	}
	public static float var(int n) {
		Scanner sc=new Scanner(System.in);
		float average=0,sum=0,sum2=0;
		int data[]=new int[n];
		for(int i=0;i<n;i++){
			data[i]=sc.nextInt();
			average+=data[i];
		}
		average=average/n;
		for(int j=0;j<n;j++){
			sum=data[j]-average;
			sum=sum*sum;
			sum2=sum2+sum;
		}
		return sum2/n;
	}
	
}