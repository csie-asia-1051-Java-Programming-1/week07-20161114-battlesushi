package ex;
import java.util.Scanner;
/*  承上題，除了var() 函數之外，再用建立一個 std() 函數，程式在接收完使用者輸入的一維整數陣列之後，
 * 呼叫std()函式可得到陣列的標準差，特別注意，不要只用 std() 函數算結果，必須由std()去呼叫 var() 函數
 * 之後回到 std() 函式處理完再傳回給主程式，主程式再把結果印出。
 * Date: 2016/11/14
 * Author: 105021030 張廷毓
 */
public class ex02{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入個數:");
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