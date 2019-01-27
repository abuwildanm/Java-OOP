package Static_dan_Final;

public class Aplikasi {

    public static void main(String[] args) {
        Mhs mhs1 = new Mhs();
        Mhs mhs2 = new Mhs();
        Mhs mhs3 = new Mhs();
        
        mhs1.nama = "Adi";
        mhs2.nama = "Budi";
        mhs3.nama = "Rudi";
        
        
        System.out.println("Nama mhs1 : " + mhs1.nama);
        System.out.println("Nama mhs2 : " + mhs2.nama);
        System.out.println("Nama mhs3 : " + mhs3.nama);
        System.out.println("Jumlah Objek : " + Mhs.getJmlObjek());
        
        Mhs.jmlObjek = 9;
        
        System.out.println("Jumlah Objek dari mhs1 : " + mhs1.getJmlObjek());
        System.out.println("Jumlah Objek dari mhs2 : " + mhs2.getJmlObjek());
        
        mhs1.setJmlObjek(20);
        
        System.out.println("Jumlah Objek dari mhs2 : " + mhs2.getJmlObjek());
        
        mhs3 = null;
        
        mhs3 = mhs1;
        
        System.out.println(mhs3.nama);
        
        System.gc();
    }
    
}
