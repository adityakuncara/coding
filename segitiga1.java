import java.util.Scanner;
public class segitiga1{
 	public static void main (String [] args){
  		Scanner sc= new Scanner (System.in);
  		int sisi1, sisi2 ,sisi3;
		System.out.print ("sisi1 = ");
		sisi1 = sc.nextInt ();
		System.out.print ("sisi2 = ");
		sisi2 = sc.nextInt ();
		System.out.print ("sisi3 = ");
		sisi3 = sc.nextInt ();
		if((sisi1 == 0) || (sisi2 == 0) || (sisi3 == 0)){
		 	System.out.println("Bukan Segitiga");
		}else{
			if ((sisi1 == sisi2) && (sisi3 == sisi1)){
			 	System.out.println("Segitiga Sama Sisi");
			}
			else if ((sisi1 == sisi2) || (sisi1 == sisi3) || (sisi2 == sisi3)){
			 	System.out.println("Segitiga Sama Kaki");
			}else{
		 		System.out.println("Segitiga Sembarang");
		 	}
		}
    }
}