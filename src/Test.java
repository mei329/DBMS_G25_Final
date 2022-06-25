import java.text.SimpleDateFormat;

public class Test {
	public static void main(String[] args) {
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd hh:mm hh:mm");
		System.out.println(fmt.format("2022-06-25 09:00 12:00"));
	}
}
