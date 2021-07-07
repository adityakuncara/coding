import java.util.Scanner;
public class pemilihan1{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int bil;
		System.out.print("Masukkan sebuah bilangan: ");
		bil = input.nextInt();
		String output = (bil % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
		System.out.println(output);
		}
	}

