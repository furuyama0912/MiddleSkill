import java.util.Arrays;
import java.util.Comparator;

public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問１のメソッドを呼び出して出力してください（引数５と１０）
		int addition = num(5,10);
		System.out.println(addition);
		//改行
		System.out.println("問２");
		//問２のメソッドを呼び出して出力してください（引数"しんぶんし"）
		String s = "しんぶんし";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);
		//改行
		System.out.println("問３");
		//問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		Integer [] i = {5,3,1,9,4,8};
		descending(i);
		System.out.println(Arrays.toString(i));
		//改行
		System.out.println("問４");
		//問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		int [] k = {5,3,1,9,4,8};
		int min = calcMin(k);
		System.out.println(min);
	}
	//問題1:2つの整数を受け取り、それらの和を返すメソッドを作成してください。
	public static int num(int x , int y) {
		return x+y;
	}
	
	//問題2:文字列を受け取り、その文字列が回文であるかどうかを返すメソッドを作成してください。
	public static boolean isPalindrome (String s) {
		int n = s.length();
		for (int i=0; i<n/2; i++) {
			if (s.charAt(i)!=s.charAt(n-i-1)) {return false;}
		}
		return true;
	}
	
	//問題3:整数の配列を受け取り、その配列の要素を降順にソートするメソッドを作成してください。(for文は利用しないこと)
	public static void descending(Integer[] i) { 
        Arrays.sort(i, Comparator.reverseOrder());
    }
	
	//問題4:整数の配列を受け取り、その配列の中で最小値を持つ要素のインデックスを返すメソッドを作成してください。
	public static int calcMin(int[] k) {
		int minIndex = 0;
        for (int i = 0; i < k.length; i++) {
            minIndex = k[i] < k[minIndex] ? i : minIndex;
        }
		return minIndex;
    }
	
}