package firstProgram;

import firstProgram.namaku;
import newPackage.callBedaPackage;

public class fungsi {
    public static void main(String[] args){
        int a = 2;
        int b = 4;
        int c = 6;
        int d = 8;

        namaku.Indah();
        callBedaPackage.printNama();
        Tambah(a,c);
        Tambah(c,d);
    }

    public static int Tambah(int a, int b){
        int hasilTambah = a+b;
        System.out.println("hasil tambahnya adalah:" + hasilTambah);
        return hasilTambah;
    }
}
