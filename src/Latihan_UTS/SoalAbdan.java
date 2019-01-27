package Latihan_UTS;

public class SoalAbdan {

    public static void main(String[] args) {
        CobaTebak acak1 = new CobaTebak(2, 3);
        CobaTebak acak2 = new CobaTebak(3, 4);

        //Tampil output pada baris ke-1
        tampil(acak1, acak2);
        acak1=acak2;

        //Tampil output pada baris ke-2
        tampil(acak1, acak2);

        //Tampil output pada baris ke-3
        System.out.println(acak1.getCount());
        acak2 = new CobaTebak(4, 4);
//        acak2.setAngka1(5); acak2.setAngka2(9);
//        acak2.setAngka(2, 8);

        //Tampil output pada baris ke-4
        tampil(acak1, acak2);
        acak2 = null;

        //Tampil output pada baris ke-4
        System.out.println(acak2.getCount());
        
        SoalAbdan yoi = new SoalAbdan();

        new CobaTebak();
        
        System.out.println(acak1.cobaOutput);
        
//        String me = new String("Inisialisasi 1");
//        String me;
//        me = new String("Inisialisasi 1");
//        String me;
//        me = new String "Inisialisasi 1";
//        String me;
//        me = "Inisialisasi 1";
    }
    
    private static void tampil(CobaTebak acak1, CobaTebak acak2) {
        System.out.printf("%d %.0f %d %.0f\n", acak1.getAngka1(), acak1.getAngka2(), acak2.getAngka1(), acak2.getAngka2());
    }
    
    public static void coba(int a, String b) { // urutan parameter mempengaruhi overloading
        double k = Double.parseDouble(b);
        int f = Integer.parseInt(b);
    }
    
    public static void coba(String a, int b) {
        
    }

}
