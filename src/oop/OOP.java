package oop;

public class OOP {

    public static void main(String[] args) {
        Mhs mhs1 = new Mhs();
        Dosen dosen1 = new Dosen();
        
        mhs1.Nama = "Adi";
        mhs1.NIM = 123;
        mhs1.JK = 'L';
        
        System.out.println("Nama mhs1 : " + mhs1.Nama); // kalo ini langsung mengakses ke atributnya
        System.out.println("Nama mhs1 : " + mhs1.getNama()); // kalo ini mengaksesnya lewat method, hal ini nanti berpengaruh pada kalo masuk modifiernya
        System.out.println("NIM mhs1 : " + mhs1.getNIM());
        System.out.println("JK mhs1 : " + mhs1.getJK());
        
        dosen1.Nama = "Budi";
        dosen1.NIP = 456;
        dosen1.JK = 'L';
        
        System.out.println("Nama dosen1 : " + dosen1.Nama); // kalo ini langsung mengakses ke atributnya
        System.out.println("Nama dosen1 : " + dosen1.getNama()); // kalo ini mengaksesnya lewat method, hal ini nanti berpengaruh pada kalo masuk modifiernya
        System.out.println("NIP dosen1 : " + dosen1.getNIP());
        System.out.println("JK dosen1 : " + dosen1.getJK());
    }
    
}
