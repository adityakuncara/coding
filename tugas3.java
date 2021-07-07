import java.util.Scanner;
class tugas3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double uts, uas, kuis, tugas, nilUts, nilUas, nilKuis, nilTugas, hasilAkhir;
		try{
			System.out.print("Masukkan nilai UTS   : ");
			uts = sc.nextDouble();
			System.out.print("Masukkan nilai UAS   : ");
			uas = sc.nextDouble();
			System.out.print("Masukkan nilai Kuis  : ");
			kuis = sc.nextDouble();
			System.out.print("Masukkan nilai TUGAS : ");
			tugas = sc.nextDouble();
			System.out.println();

			nilUts = 0.30 * uts;	
			nilUas = 0.40 * uas;	
			nilKuis = 0.10 * kuis;	
			nilTugas = 0.20 * tugas;	

			hasilAkhir = nilUts + nilUas + nilKuis + nilTugas;

			System.out.println(uts + " x (30 / 100) = " + nilUts);
			System.out.println(uas + " x (40 / 100) = " + nilUas);
			System.out.println(kuis + " x (10 / 100) = " + nilKuis);
			System.out.println(tugas + " x (20 / 100) = " + nilTugas);
			System.out.println("\t\t    " + hasilAkhir);

			if (hasilAkhir < 65) {
				System.out.println("NILAI ANDA : " + hasilAkhir);
				System.out.println("STATUS     : REMIDI");
			}else{
				System.out.println("NILAI ANDA : " + hasilAkhir);
				System.out.println("STATUS     : LULUS");
			}

		}catch(Exception E){
			System.out.println("MAAF INPUTAN HARUS ANGKA");
			sc.nextLine();
		}
	}	
}