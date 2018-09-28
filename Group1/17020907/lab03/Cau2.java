import java.util.Scanner;

public class Cau2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		PS ps1 = new PS(1, 2);
		PS ps2 = new PS(1, 4);
		PS ps3 = ps1.cong(ps2);
		System.out.println(ps3.getTu() +"  "+ ps3.getMau());
		if(ps1.equals(ps2)) System.out.println("yes");
		else System.out.println("no");
		input.close();
	}
	
}