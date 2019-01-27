package Constructor;

public class Peminjaman {
    Mhs Peminjam;
    Buku yangDipinjam;
    
    public Mhs getdataMhs() {
        return Peminjam;
    }
    
    public Buku getdataBuku() {
        return yangDipinjam;
    }
    
    public void displayMessage(int counter) {
        System.out.println("===== SISTEM PEMINJAMAN " + counter + " PERPUSTAKAAN =====\n");
        System.out.println("Identitas Peminjam");
        System.out.println("Nama            : " + Peminjam.get_Nama());
        System.out.println("NIM             : " + Peminjam.get_NIM());
        System.out.println("Fakultas        : " + Peminjam.get_Fakultas());
        System.out.println("Prodi           : " + Peminjam.get_Prodi());
        System.out.println("--------------------------------------------");
        System.out.println("Identitas Buku");
        System.out.println("Judul           : " + yangDipinjam.get_Judul()); 
        System.out.println("Kode            : " + yangDipinjam.get_Kode());
        System.out.println("Penulis         : " + yangDipinjam.get_Penulis());
        System.out.println("Penerbit        : " + yangDipinjam.get_Penerbit());
        System.out.println("Tahun Terbit    : " + yangDipinjam.get_TahunTerbit());
        System.out.println("============================================\n");
    }
}
