import java.util.Scanner;
public class faktorialwhile{
 	public static void main(String[] args){
  		Scanner input = new Scanner(System.in);
		int i, faktorial, angka, a, n;
		
		System.out.print("Masukkan bilangan: ");
		angka = input.nextInt();
		
		faktorial = 1;
		i = 1;
		a = 2;
		n = 4;
		while (i <= n){
			faktorial = faktorial * 1;
			i++;
		}
		System.out.printf("Nilai faktorial dari %d adalah %d\n", angka, faktorial);
	}
}