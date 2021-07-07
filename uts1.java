import java.util.Scanner;
public class uts1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int harga,total,jenis;
		String kategori;
		boolean kuota;
		
		System.out.println("--------------------------------------");
		System.out.println("Kemeja : Rp 85.000 ");
		System.out.println("Celana panjang : Rp 120.000 ");
		System.out.println("kebaya : Rp 198.000");
		System.out.println("Gamis : Rp 230.000");
		System.out.println("Kaos : Rp 55.000 ");
		System.out.println("--------------------------------------");
		System.out.println("Masukkan jenis pakaian yang anda pilih: ");
		jenis = sc.nextInt();
		System.out.println("Berapa yang ingin anda beli: ");
		kuota = sc.nextln();
		
		if (kategori.equals("kemeja")) {
			if (kuota * 85000) {
				if ( total >= 350000) {
					System.out.println("Anda mendapat potongan harga sebesar Rp 50.000");
				}else {
					System.out.println("Anda tidak mendapat potongan harga");
				}
			}else {
				System.out.println("anda tidak mendapat potongan harga");
			}
		System.out.println("Anda mendapatkan masker gratis ");
		}else if (kategori.equals("kebaya")) {
			System.out.println("Anda mendapatkan sarung tangan grtais");
		}
		}
	}