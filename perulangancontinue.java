import java.util.Scanner;
public class perulangancontinue{
 	public static void main(String[] args){
  		Scanner input = new Scanner(System.in);
		
		int angka, b, i, count;
		double avg, total;
		
		b = 0;
		count = 0;
		for (i = 0; i< 5; i++) {
			System.out.print("Masukkan bilangn: ");
			angka = input.nextInt();
			if (angka >= 50) {
				continue;
			}
			b += angka;
			count++;
		}
		total = (double) b;
		System.out.printf("Jumlah angka kurang dari 50: %.2f\n", total);
		avg = (double) b / count;
		System.out.printf("Rata-rata kurang dari 50: %.2f\n", avg);
	}
}