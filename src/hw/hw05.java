package hw;
import java.util.Scanner;
//寫一遞迴函數，讓使用者輸入一個長整數，透過遞迴函數運算後得到反向的數字字串並印出。
//例如:輸入 1234 回傳 4321
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
