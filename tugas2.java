import java.util.Scanner; 
public class tugas2 {
 
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		int umur;
  		System.out.println("MENENTUKAN UMUR BERKENDARA");
  		try{
  			System.out.print("Masukkan umur anda : ");
	 		umur = sc.nextInt();
	  		
	  		System.out.println();
	  		if (umur <= 0) {
	  			System.out.println("Maaf tidak ada umur dibawah 0");
	  		}else{
				if(umur >= 17){
				 	System.out.println("ANDA BOLEH BERKENDARA");
				}else{
				 	System.out.println("UMUR ANDA KURANG");
				 	System.out.println("ANDA TIDAK BOLEH BERKENDARA");
				}
	  		}
  		}catch(Exception e){
  			System.out.println("MAAF INPUTAN HARUS ANGKA");
  			sc.nextLine();
  		}
  
 	}
 
}