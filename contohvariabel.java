public class contohvariabel{
	public static void main(String[] args){
		String myHobby = "Bermain layangan";
		boolean isPandai = true;
		char jenisKelamin = 'L';
		byte umurSaya = 18;
		double $ipk = 3.24, tinggi = 180;
		
		System.out.println(myHobby);
		System.out.println("apakah kamu pandai ? " + isPandai);
		System.out.println("jenis Kelamin ? " + jenisKelamin);
		System.out.println("Umurku saat ini ? "  + umurSaya);
		System.out.println(String.format("Saya beripk %s, tinggi badan %s cm", $ipk, tinggi));
	}
}