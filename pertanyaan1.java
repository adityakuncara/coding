import java.util.Scanner;
class pertanyaan1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int nomer;

		System.out.print("Masukkan Angka: ");
		nomer =input.nextInt();

		int i;
		for ( i = 1; i <= nomer;  i++) {
			if (i % 5 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}
}