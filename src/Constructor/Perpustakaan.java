package Constructor;

public class Perpustakaan {

    public static void main(String[] args) {
        
        //Mahasiswa 1
        Mhs mhs1 = new Mhs("Wildan", 165150200111002L);
        mhs1.set_Fakultas("Fakultas Ilmu Komputer");
        mhs1.set_Prodi("Teknik Informatika");
        
        //Mahasiswa 2
        Mhs mhs2 = new Mhs("Rezha", 165150200111010L);
        mhs2.set_Fakultas("Fakultas Teknik");
        mhs2.set_Prodi("Teknik Nuklir");
        
        //Buku 1
        Buku buku1 = new Buku("Kalkulus", 123);
        buku1.set_Penulis("Dayat");
        buku1.set_Penerbit("Erlangga");
        buku1.set_TahunTerbit(2004);
        
        //Buku 2
        Buku buku2 = new Buku("Pemrograman Lanjut", 456);
        buku2.set_Penulis("Akbar");
        buku2.set_Penerbit("Gramedia");
        buku2.set_TahunTerbit(2009);
        
        //Proses Peminjaman 1
        Peminjaman pinjam1 = new Peminjaman();
        pinjam1.Peminjam = mhs1;
        pinjam1.yangDipinjam = buku2;
        
        //Proses Peminjaman 2
        Peminjaman pinjam2 = new Peminjaman();
        pinjam2.Peminjam = mhs2;
        pinjam2.yangDipinjam = buku1;

        pinjam1.displayMessage(1);
        pinjam2.displayMessage(2);
        
    }
}
