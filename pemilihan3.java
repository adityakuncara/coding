import java.util.Scanner;
public class pemilihan3{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int umur;
		System.out.print("Masukkan umur anda: ");
		umur = input.nextInt();
		if (umur >= 65){
			System.out .println("Lansia");
		} else if (( umur > 18)&&(umur <= 65)){
			System.out.println("Dewasa");
		} else if (( umur > 12)&&(umur <= 18)){
			System.out.println("Remaja");
		} else if (( umur > 5)&&(umur <= 12)){
			System.out.println("Anak-anak");
		} else if (umur <= 0){
			System.out.println("Maaf umur yang anda masukkan salah");
		} else {
			System.out.println("Toddler");
		}
	}
}