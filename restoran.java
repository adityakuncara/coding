Aimport java.util.Scanner;
public class restoran{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String productName;
		int action;
		double productPrice, delivery, total;

		System.out.println("DElIVERY");
		System.out.print("nama produk  : ");
		productName = sc.nextLine();
		System.out.print("harga produk : ");
		productPrice = sc.nextDouble();
		System.out.print("apakah anda ingin menggunakan pengiriman express ? [0 = tidak , 1 = ya] ? : ");
		action = sc.nextInt();
		System.out.println("--------------------------------------");
		
		System.out.println();

		if (action == 1) {
			System.out.println("EXPRESS");
			System.out.println("----------------------------------");
			System.out.println("STRUK ANDA");
			if (productPrice >= 100000) {
				delivery = 30000;
				System.out.println(productName + "\t\t : Rp." + productPrice);
				System.out.println("Shipping Costs \t\t : Rp." + delivery);
				System.out.println("Additional Cost \t : Rp." + 25000);
				total = productPrice + delivery + 25000;
				System.out.println("Total\t\t\t : Rp." + total);
			}else{
				delivery = 20000;
				System.out.println(productName + "\t\t : Rp." + productPrice);
				System.out.println("Shipping Costs \t\t : Rp." + delivery);
				System.out.println("Additional Cost \t : Rp." + 25000);
				total = productPrice + delivery + 25000;
				System.out.println("Total\t\t\t : Rp." + total);
			}
			System.out.println("-----------------------------------");
		}else{
			System.out.println("REGULAR");
			System.out.println("----------------------------------");
			System.out.println("STRUK ANDA");
			if (productPrice >= 100000) {
				delivery = 30000;
				System.out.println(productName + "\t\t : Rp." + productPrice);
				System.out.println("Shipping Costs \t\t : Rp." + delivery);
				System.out.println("Additional Cost \t : Rp. 0 ,-");
				total = productPrice + delivery;
				System.out.println("Total\t\t\t : Rp." + total);
			}else{
				delivery = 20000;
				System.out.println(productName + "\t\t : Rp." + productPrice);
				System.out.println("Shipping Costs \t\t : Rp." + delivery);
				System.out.println("Additional Cost \t : Rp. 0 ,-");
				total = productPrice + delivery;
				System.out.println("Total\t\t\t : Rp." + total);
			}
			System.out.println("-----------------------------------");
		}
	}
}