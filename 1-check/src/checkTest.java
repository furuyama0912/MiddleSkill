import java.util.Scanner;
import java.util.logging.Logger;
public class checkTest {
	//問7用
	private static final Logger LOGGER = Logger.getLogger(checkTest.class.getName());
	
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問1 リソースを開く(ファイル名)ショートカットキーは何ですか？
//		Ctrl + Shift + R
		
		//改行
		System.out.println("問２");
		//問2 リファクタリングをする時のショートカットキーは何ですか？
//		Shift + Alt + R
		
		//改行
		System.out.println("問３");
		//問3 デバッグを行う方法を簡潔に記載してください
//		ブレークポイントを貼り、デバッグボタンを押下
//		ステップオーバーやステップインなどでバグの原因を特定する
		
		//改行
		System.out.println("問４");
		//問4 Javaのバージョン8と11の違いを簡潔に答えてください
//		変数としてアンダースコアが使えないようになった
		
		//改行
		System.out.println("問５");
		//問5　Road博物館の入場料金は、一人1000円であるが、10人以上のチームなら一人820円、20人以上の団体なら一人700円である。人数を入力し、入場料の合計を計算するプログラムを作成せよ。(if文で上記文章を作ってください)
		int people = 100;
		if(people >= 20) {
			System.out.println(700 * people + "円");
		} else if(people >= 10) {
			System.out.println(820 * people + "円");
		} else {
			System.out.println(1000 * people + "円");
		}
		
		//改行
		System.out.println("問６");
		//問6　コメントアウトされている箇所にどう言った処理が行われているか記載してください
		Scanner scn = new Scanner(System.in);
		int[] score = new int[5];
		int i, sum;
		double ave;
		
		//for文にてscoreの要素数分を回して、scoreにnextIntメソッドの値を代入している
		for (i = 0; i < score.length; i++) {
			System.out.print("得点を入力してください = ");
			score[i] = scn.nextInt();
			}


			//for文にてscoreの要素数分を回して、回す度にsumへscoreの値を代入している
			sum = 0;
			for (i = 0; i < score.length; i++) {
			sum += score[i];
			}
		
			//sumに格納されている値をscore.lengthで割り、aveに格納している
			ave = sum / (double)score.length;
			//平均値 = 〇〇（ave）を出力している
			System.out.println("平均値 = " + ave);
		
		//改行
		System.out.println("問７");
		//問7　ログ出力が行えるように下記コードを１箇所修正してください
		String message = "Hello World!";
		LOGGER.log(null, "The message is: " + message);
		
		//改行
		System.out.println("問８");
		//問8　問題：
		//入力された文字列を整数に変換し、その結果を出力するプログラムを作成してください。ただし、以下の場合には例外を発生させてください。(Scannerメソッドを使用すること)
		//1.入力された文字列がnullの場合（NullPointerExceptionが発生する）
		//2.入力された文字列が空文字列の場合（Exceptionが発生する）
		//3.入力された文字列が整数に変換できない場合（NumberFormatExceptionが発生する）
//		Scanner scanner = new Scanner(System.in);
//        try {
//			String string= "金子真也はタイ人です";
//		    int num = Integer.parseInt(string); //NumberFormatException
//		    System.out.println(num);
//            if(scanner == null) {
//                throw new NullPointerException();
//            }else if(scanner=="") {
//            	throw new Exception();
//            }else {
//            	System.out.println(num);
//            }
//        } catch(NullPointerException e) {
//            System.out.println("NullPointerExceptionが発生しました");
//        } catch(Exception e) {
//            System.out.println("Exceptionが発生しました");
//        } catch (NumberFormatException e){
//			System.out.println("NumberFormatExceptionが発生しました");
//		}
		
     	//改行
		System.out.println("問９");
		//問9 Java編終わった感想と改善点もしございましたらお願いします。
		//『ここに書いてね』
	}
}
