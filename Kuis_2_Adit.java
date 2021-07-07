import java.util.Scanner;
public class Kuis_2_Adit {
    static Scanner input = new Scanner(System.in);
    static String daerah[][] = {{"KD01","Mojokerto"},{"KD02","Banyuwangi"},{"KD03","Solo"},{"",""},{"",""}};
    static String tipe[] = {"Konsumsi","NonKonsumsi"};
    static String jasa[] = {"Regular","Kilat","Express"};
    
    public static void main(String[] args) {
        menu();
    }
    
    
    static void menu(){
        System.out.println("1. Daftar Daerah");
        System.out.println("2. Input Daerah");
        System.out.println("3. Daftar Tipe");
        System.out.println("4. Daftar Jasa Pengiriman");
        System.out.println("5. Pengiriman");
        System.out.println("6. Keluar");
        System.out.print("Pilih Nomor : ");
        int pilih = input.nextInt();
        input.nextLine();
        
        switch(pilih){
            case 1:
                daftardaerah();// untuk memanggil fungsi daerah dan menampilkan data daerah
                menu(); // agar setelah melihat daftar daerah bisa kembali lagi ke fungsi daftar
                break;
            case 2:
                inputdaerah();// untuk memanggil fungsi daerah dan menampilkan data daerah
                menu(); // agar setelah melihat daftar daerah bisa kembali lagi ke fungsi daftar
                break;
            case 3:
                daftartipe();// untuk memanggil fungsi daerah dan menampilkan data tipe
                menu(); // agar setelah melihat daftar daerah bisa kembali lagi ke fungsi daftar
                break;
            case 4:
                daftarjasa();// untuk memanggil fungsi daerah dan menampilkan data jasa
                menu();// agar setelah melihat daftar daerah bisa kembali lagi ke fungsi daftar
                break;
            case 5:
                pengiriman();// untuk memanggil fungsi daerah dan menampilkan data pengiriman
                break;
            default:
                System.out.println("SELESAI");
        }
    }
    
    
    static void daftardaerah(){
        System.out.println("=====================================");
        System.out.println("NO KODE DAERAH");
        for(int x=0;x<daerah.length;x++){
            System.out.print(x);
            for(int y=0;y<daerah[0].length;y++){
                System.out.print("   " + daerah[x][y] + "  ");
            }
            System.out.println("");
        }
        System.out.println("=====================================");
    }
    
    
    static void inputdaerah(){
        System.out.println("=====================================");
        System.out.println("MASUKKAN DAERAH KE 4");
        System.out.print("KODE : ");
        daerah[3][0] = input.nextLine();
        System.out.print("DAERAH : ");
        daerah[3][1] = input.nextLine();
        
        System.out.println("MASUKKAN DAERAH KE 5");
        System.out.print("KODE : ");
        daerah[4][0] = input.nextLine();
        System.out.print("DAERAH : ");
        daerah[4][1] = input.nextLine();
        System.out.println("=====================================");
    }
    
    
    static void daftartipe(){
        System.out.println("=====================================");
        System.out.println("NO TIPE");
        for(int x=0;x<tipe.length;x++){
            System.out.println(x + "   " + tipe[x]);
        }
        System.out.println("=====================================");
    }
    
    
    static void daftarjasa(){
        System.out.println("=====================================");
        System.out.println("NO JASA");
        for(int x=0;x<jasa.length;x++){
            System.out.println(x + "   " + jasa[x]);
        }
        System.out.println("=====================================");
    }