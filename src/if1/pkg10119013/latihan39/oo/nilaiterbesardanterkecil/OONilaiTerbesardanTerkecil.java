/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan39.oo.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author Fiona Avila
 */


public class OONilaiTerbesardanTerkecil {
    
    static Scanner scan = new Scanner (System.in);
    
    public int nilai[];
    public int banyakMahasiswa;
    public String nama;
    
    public void inputNilaiMahasiswa(){
        nilai = new int[banyakMahasiswa];
        for(int i=0;i<banyakMahasiswa;i++){
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + "\t\t: ");
            nilai[i] = scan.nextInt();
        }
    }    
    
    public int nilaiTerkecil(){
        int nilaiTerkecil = nilai[0];
        for(int n : nilai){
            if(nilaiTerkecil > n){
                nilaiTerkecil = n;
            }
        }
        return nilaiTerkecil;
    }
    
    public int nilaiTerbesar(){
        int nilaiTerbesar = nilai[0];
        for (int n : nilai){
            if(nilaiTerbesar < n){
                nilaiTerbesar = n;
            }
        }
        return nilaiTerbesar;
    }
    
    public void tampilNilaiMahasiswa(){
        int j = 0;
        for(int n : nilai){
            System.out.println("Data Nilai Mahasiswa ke-" + (j+1) + " = " + n);
            j++;
        }
    }
    
    public static void main(String[] args) {
        
        OONilaiTerbesardanTerkecil nilai = new OONilaiTerbesardanTerkecil();
        
        System.out.println();
        System.out.println("=====PROGRAM NILAI TERBESAR DAN TERKECIL MAHASISWA=====");
        System.out.println();
        System.out.print("Masukkan nama petugas\t: ");
        nilai.nama = scan.next();
        System.out.println("---------------------------------------");
        System.out.print("Masukkan banyak mahasiswa\t: ");
        nilai.banyakMahasiswa = scan.nextInt();
        
        nilai.inputNilaiMahasiswa();
        
        System.out.println();
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        
        nilai.tampilNilaiMahasiswa();
        System.out.println();
        
        System.out.println("Nilai terkecil adalah " + nilai.nilaiTerkecil());
        System.out.println("Nilai terbesar adalah " + nilai.nilaiTerbesar());
        System.out.println();
        
        System.out.println("------------------------");
        System.out.println("Petugas\t\t: " + nilai.nama);
    }
    
}
