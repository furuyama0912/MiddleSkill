public class test1 {
	public static void main(String[] args) {
		
//		1.数字の5と9の変数を定義し、足した数字を出力しなさい。
		int n = 5;
		int m = 9;
		System.out.println(n + m);
//		2.64ビット整数の「1111111111」を定義し2倍した値を出力しなさい。
		long x = 1111111111;
		System.out.println(x * 2);
//		3.boolean型の変数の値に不正な文字列比較を入れてfalseを出力してください。	
		String a = "うんこ";
		String b = "うんち";
		boolean c = a.equals(b);
		System.out.println(c);
	}
}