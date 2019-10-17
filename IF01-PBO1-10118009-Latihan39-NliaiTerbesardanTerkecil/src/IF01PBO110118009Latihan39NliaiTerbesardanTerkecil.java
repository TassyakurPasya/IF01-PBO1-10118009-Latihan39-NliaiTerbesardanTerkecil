
import java.util.Scanner;

/*
 * NAMA              : Tassyakur Pasya
 * KELAS             : IF-01
 * NIM               : 10118009
 * DESKRIPSI PROGRAM : Nilai Terbesar dan Terkecil  
 */

public class IF01PBO110118009Latihan39NliaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static int[] nilaiMhs = new int[10];
    public static int nilaiTerbesar;
    public static int nilaiTerkecil;
    public static int banyakMhs;
    
    public static void main(String[] args) {
        // TODO code application logic here
        String namaPetugas;
        int banyakMhs;
        
        System.out.println("====Program Nilai Terbesar dan Terkecil Nilai Mahasisiwa====");
        System.out.print("Masukan Nama Petugas = ");
        Scanner nama = new Scanner(System.in);
        namaPetugas = nama.next();
        System.out.print("Masukan Banyaknya Nilai Mahasiswa = ");
        banyakMhs = nama.nextInt();
        nilaiMhs = new int[banyakMhs];
        System.out.print("Masukan Nilai Mahasiswa Ke-" + 1 + " = ");
        nilaiMhs[0] = nama.nextInt();
        nilaiTerbesar = nilaiMhs[0];
        nilaiTerkecil = nilaiMhs[0];
        for ( int i = 1;i < banyakMhs; i++){
            System.out.print("Masukan Nilai Mahasiswa Ke-" + (i+1)+ " = ");
            nilaiMhs[i] = nama.nextInt();
            if (nilaiMhs[i] > nilaiTerbesar)
                nilaiTerbesar = nilaiMhs[i];
            if (nilaiMhs[i] < nilaiTerkecil)
                nilaiTerkecil = nilaiMhs[i];
                    
        }
              System.out.println("Nilai Terbesar adalah "+nilaiTerbesar);
              System.out.println("Nilai Terkecil adalah "+nilaiTerkecil);
              System.out.println("Petugas : pasya ");
        
        
        
        
    }

}
