import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) throws ParseException {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		System.out.println("問１");
		//問題1:現在の時刻_出力してください
		Date CurrentTime = new Date();
		System.out.println(CurrentTime);
		//改行
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		SimpleDateFormat date1 = new SimpleDateFormat("yyyy/MM/dd");
		Date dateNum1 = date1.parse(shinyaBirthday);
		SimpleDateFormat date2 = new SimpleDateFormat("yyyy/MM/dd");
		Date dateNum2 = date2.parse(minamiBirthday);
		Date dateNum3= dateNum1.before(dateNum2)? dateNum1:dateNum2;
        String str = new SimpleDateFormat("yyyy/MM/dd").format(dateNum3);
        System.out.println(str);

		//改行
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		SimpleDateFormat dateFuruyama = new SimpleDateFormat("yyyy/MM/dd");
		Date dateNumFuruyama1 = dateFuruyama.parse(furuyamaBirthday);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateNumFuruyama1);
		calendar.add(Calendar.YEAR, 5);
		calendar.add(Calendar.MONTH, 2);
		Date dateFuruyama2 = new Date();
		dateFuruyama2 = calendar.getTime();
		String strFuruyama = new SimpleDateFormat("yyyy/MM/dd").format(dateFuruyama2);
        System.out.println(strFuruyama);
	}
}