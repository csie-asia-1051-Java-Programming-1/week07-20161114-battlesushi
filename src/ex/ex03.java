package ex;
import java.util.Scanner;
/*  請寫一個程式，讓使用者輸入一個整數二維陣列，建立 var2()函式 及std2()
 * 可以分別計算二維陣列的變異數與標準差，並把結果回傳到主程式印出。
 * Date: 2016/11/14
 * Author: 105021030 張廷毓
 */
public class ex03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入n [n*n個數]:");
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
