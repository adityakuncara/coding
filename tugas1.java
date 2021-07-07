import java.util.Scanner; 
public class tugas1 {
 
 	public static void main(String[] args) {
 		int bilPertama, bilKedua;
 		Scanner sc = new Scanner(System.in);
  	
  		System.out.println("MENENTUKAN BILANGAN TERBESAR");
  		try{
  			System.out.print("Masukkan bil pertama   : ");
	 		bilPertama = sc.nextInt();
	  
	 		System.out.print("Masukkan bil kedua   : ");
	 		bilKedua = sc.nextInt();
	  		
	  		System.out.println();

			if(bilPertama > bilKedua && bilKedua < bilPertama){
			
			 	System.out.println(bilPertama + " > " + bilKedua);
			 	// System.out.println(bilKedua + " < " + bilPertama);
			 	System.out.println("Bil pertama lebih besar dari bil kedua");
			
			}else if(bilKedua > bilPertama && bilPertama < bilKedua){

			 	System.out.println(bilKedua + " > " + bilPertama);
			 	// System.out.println(bilPertama + " < " + bilKedua);
			 	System.out.println("Bil kedua lebih besar dari bil pertama");
			
			}else{
			
			 	System.out.println(bilPertama + " = " + bilKedua);
			 	System.out.println("Bilangan pertama dan kedua nilainya sama");
			
			}
  		}catch(Exception e){
  			System.out.println("Inputan harus angka");
  			sc.nextLine();
  		}
  
 	}
 
}