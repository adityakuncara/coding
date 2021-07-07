import java.util.Scanner;
public class faktorialdowhile{
 	public static void main(String[] args){
  		Scanner input = new Scanner(System.in);
		int i, faktorial, angka;
		
		System.out.print("Masukkan bilangan: ");
		angka = input.nextInt();
		
		faktorial = 1;
		i = 1;
		do {
			faktorial = faktorial * i;
			i++;
		} while (i <= angka);
		System.out.printf("Nilai faktorial dari %d adalah %d\n", angka, faktorial);
	}
}