import java.util.Scanner;
public class pemilihan2{
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double nilai1, nilai2, hasil;
		System.out.println("Masukkan nilai 1: ");
		nilai1 = input.nextDouble();
		System.out.println("Masukkan nilai 2: ");
		nilai2 = input.nextDouble();
		hasil = (nilai1 + nilai2)/2;
		if(hasil>=100){
			hasil-=5;
		}else{
			System.out.println("Hasil akhir adalah:" + hasil);
		}
	}
}