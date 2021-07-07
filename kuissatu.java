import java.util.Scanner;
class kuissatu{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int beratBadan, angkagram, gram, angkaton;
	float ton;
	System.out.println("Masukkan berat badan : ");
	beratBadan = sc.nextInt();
	System.out.println("Masukkana angka menjadi gram : ");
	angkagram = sc.nextInt();
	System.out.println("Masukkana angka menjadi ton : ");
	angkaton = sc.nextInt();
	gram = (beratBadan * angkagram);
	ton = (beratBadan / angkaton);
	System.out.println();
	System.out.println("Berat badan anda: " + beratBadan);
	System.out.println("Dalam gram: " + gram);
	System.out.println("dalam ton: " + beratBadan);
}
}