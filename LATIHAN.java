import java.util.Scanner;

public class LATIHAN {
    public static void main(String[] args) {
        Scanner input = new Scanner alam(System.in);
        String nama,mk,prodi;
        int mp , uts , uas;
        System.out.print ("Siapa Nama Anda : ");
        nama = input.nextLine();
        System.out.print ("Nama Matakuliah : ");
        mk = input.nextLine();
        System.out.print ("Program Studi : ");
        prodi = input.nextLine();
        System.out.print ("Nilai MP : ");
        mp = input.nextInt();
        System.out.print ("Nilai UTS : ");
        uts = input.nextInt();
        System.out.print ("Nilai UAS : ");
        uas = input.nextInt();
        int nilaiAkhir;
        nilaiAkhir = (6 * mp + 2 * uts + 2 * uas) / 10;

        System.out.println("--HASIL INPUTAN--");
        System.out.println("Nama\t : " + nama);
        System.out.println("Matakuliah\t : " + mk);
        System.out.println("Program Studi\t : " + prodi);
        System.out.println("Nilai MP\t : " + mp);
        System.out.println("Nilai UTS\t : " + uts);
        System.out.println("Nilai UAS\t : " + uas);
        System.out.println("Nilai Akhir\t : " + nilaiAkhir);
        input.close();
    }

       } 

