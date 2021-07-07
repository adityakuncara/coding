import java.util.Scanner;
public class faktorialfor{
 	public static void main(String[] args){
  		Scanner input = new Scanner(System.in);
		int i, faktorial, angka;
		
		System.out.print("Masukkan bilangan: ");
		angka = input.nextInt();
		
		faktorial = 1;
		for (i=1; i<=angka; i++) {
			faktorial = faktorial * i;
		}
		System.out.printf("Nilai faktorial dari %d adalah %d\n", angka, faktorial);
	}
}