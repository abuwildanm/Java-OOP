package oop;

public class Perpustakaan {

    public static void main(String[] args) {
        Mhs mhs1 = new Mhs();
        Mhs mhs2 = new Mhs();
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        Peminjaman pinjam1 = new Peminjaman();
        Peminjaman pinjam2 = new Peminjaman();
        
        //Mahasiswa
        mhs1.Nama = "Budi";
        mhs1.NIM = 999;
        mhs1.JK = 'L';
        mhs2.Nama = "Alin";
        mhs2.NIM = 888;
        mhs2.JK = 'P';
        
        //Buku
        buku1.Judul = "Matkomlan Separuh Jiwaku";
        buku1.Kode = 123;
        buku2.Judul = "Pemrograman Lanjut";
        buku2.Kode = 456;
        
        //Peminjaman
        pinjam1.Peminjam = mhs1;
        pinjam1.yangDipinjam = buku2;
        pinjam2.Peminjam = mhs2;
        pinjam2.yangDipinjam = buku1;
        
        System.out.println("===== SISTEM PEMINJAMAN 1 PERPUSTAKAAN =====");
        System.out.println("Nama Peminjam   : " + pinjam1.Peminjam.Nama); //atau bisa dibuat pinjam1.getdataMhs().getNama() ==> aksesnya tidak secara langsung, tapi lewat method
        System.out.println("Judul Buku      : " + pinjam1.yangDipinjam.Judul); //atau bisa dibuat pinjam1.getdataBuku().getJudul()
        System.out.println("NIM Peminjam    : " + pinjam1.Peminjam.NIM); //atau bisa dibuat pinjam1.getdataMhs().getNIM()
        System.out.println("Kode Buku       : " + pinjam1.yangDipinjam.Kode); //atau bisa dibuat pinjam1.getdataBuku().getKode()
        System.out.println("============================================\n");
        
        System.out.println("===== SISTEM PEMINJAMAN 2 PERPUSTAKAAN =====");
        System.out.println("Nama Peminjam   : " + pinjam2.getdataMhs().getNama());
        System.out.println("Judul Buku      : " + pinjam2.getdataBuku().getJudul());
        System.out.println("NIM Peminjam    : " + pinjam2.getdataMhs().getNIM());
        System.out.println("Kode Buku       : " + pinjam2.getdataBuku().getKode());
        System.out.println("============================================\n");
        
        mhs1.Nama = "Cecep";
        
        System.out.println("===== SISTEM PEMINJAMAN 1 PERPUSTAKAAN =====");
        System.out.println("Nama Peminjam   : " + pinjam1.getdataMhs().getNama());
        System.out.println("Judul Buku      : " + pinjam1.getdataBuku().getJudul());
        System.out.println("NIM Peminjam    : " + pinjam1.getdataMhs().getNIM());
        System.out.println("Kode Buku       : " + pinjam1.getdataBuku().getKode());
        System.out.println("============================================\n");
    }
}
