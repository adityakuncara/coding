import java.util.Scanner;
public class nested1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int nilai;
		
		System.out.print("Masukkan nilai ujian (0 - 100): ");
		nilai = sc.nextInt();
		
		if (nilai >= 0 && nilai <= 100) {
			if (nilai >= 90 && nilai <= 100) {
				System.out.println("Nilai A, SEMPURNA");
			} else if (nilai >= 80 && nilai <= 89) {
				System.out.println("Nilai B, BAIK");
			} else if (nilai >= 60 && nilai <= 79) {
				System.out.println("Nilai C, CUKUP BAIK");
			} else if (nilai >= 50 && nilai <= 59) { 
				System.out.println("Nilai D, CUKUP");
			} else {
				System.out.println("Nilai E, Anda kurang belajar");
			}
		}else {
			if (nilai < 0) {
				System.out.println("Nilai anda masukkan kurang dari 0");
			} else {
				System.out.println("Nilai anda masukkan lebih dari 100");
			}
		}
	}
}