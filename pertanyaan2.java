import java.util.Scanner;
class pertanyaan2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0, y = 1, n, count = 0;
		double jumlah, avg;
		System.out.print("Masukkan Angka : ");
		n= input.nextInt();
		System.out.println("Banyaknya bilangan genap dari 1 sampai " + n + " adalah " + n/2);
		int i;
		for ( i = 1;i <= n;i++) {

			if (i % 2 == 0) {
				continue;
			}

			x += i;
			count++;

			System.out.println("Bilangan genap " + y++ + " adalah \t = " + i);
		}
		jumlah = (double) x; 
		System.out.printf("Jumlah bilangan genap dari 1 sampai 10 adalah : %.2f", jumlah); 
		avg = (double) x / count; 
		System.out.printf("Rata rata bilangan genap dari 1 sampai 10 adalah : %.2f", avg);

	}
}