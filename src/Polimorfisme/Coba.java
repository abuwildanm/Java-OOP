package Polimorfisme;

public class Coba {

    public static void main(String[] args) {
        Gajah gajah = new Gajah();
        Paus paus = new Paus();
        
        Mammalia mammalia = gajah;
        
//        mammalia.tidur(); ==> tidak bisa karena tipenya masih Mammalia walaupun reference nya sudah gajah

        gajah = (Gajah) mammalia;
//        gajah = (Paus) mammalia; ==> tidak bisa karena tipenya gajah adalah Gajah
//        gajah = paus; ==> sama kaya penjelasan di atas
    }
    
}
