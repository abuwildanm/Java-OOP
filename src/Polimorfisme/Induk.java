package Polimorfisme;

public abstract class Induk {
    String nama, noTelp, alamat;
    private int noKTP;
    protected int voucher = 0, totalKamar = 0, totalMakan = 0, totalFasilitas = 0;
    String hari[] = {"Weekdays", "Weekend"};
    Object hargaTipeKamar[][] = { {"Single", 200000, 250000}, 
                                  {"Double", 375000, 450000}, 
                                  {"Suite", 750000, 800000}
                                };
    Object hargaMakan[][] = { {"Breakfast", 25000}, 
                              {"Lunch", 25000}, 
                              {"Dinner", 30000}
                            };
    Object hargaFasilitas[][] = { {"Kolam Renang", 25000}, 
                                  {"Sauna", 150000}, 
                                  {"Spa", 150000}
                                };

    public Induk(int noKTP, String nama, String noTelp, String alamat) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.noTelp = noTelp;
        this.alamat = alamat;
    }
    
    public void BiayaKamar() {
        System.out.println("---------------------------------");
        System.out.println("          HARGA KAMAR");
        System.out.println("---------------------------------");
        for (int i = 0; i < hari.length; i++) {
            if (i== 0) System.out.printf("%-10s %-13s", "|", hari[i]);
            else System.out.printf("%-1s %1s", hari[i], "|");
        }
        System.out.println("");
        
        for (int i = 0; i < hargaTipeKamar.length; i++) {
            for (int j = 0; j < hargaTipeKamar[i].length; j++) {
                if (j == 0) System.out.printf("%-1s %-10s", "|", hargaTipeKamar[i][j]);
                else if (j == 2) System.out.printf("%-1s %1s", hargaTipeKamar[i][j], "|");
                else System.out.printf("%-13s", hargaTipeKamar[i][j]);
            }
            System.out.println("");
        }
        System.out.println("---------------------------------\n");
        
        System.out.println("-------------------------------------------------------");
        System.out.println("*Untuk setiap pemesanan kamar mendapatkan voucher makan");
        System.out.println("1. Single : Untuk 1 orang");
        System.out.println("2. Double : Untuk 2 orang");
        System.out.println("3. Suite  : Untuk 6 orang\n");
    }
    
    public void BiayaMakan() {
        System.out.println("-----------------");
        System.out.println("  HARGA MAKAN");
        System.out.println("-----------------");
        for (int i = 0; i < hargaMakan.length; i++) {
            for (int j = 0; j < hargaMakan[i].length; j++) {
                System.out.printf("%-12s", hargaMakan[i][j]);
            }
            System.out.println("");
        }
        System.out.println("-----------------\n");
    }
    
    public void BiayaFasilitas() {
        System.out.println("---------------------");
        System.out.println("   HARGA FASILITAS");
        System.out.println("---------------------");
        for (int i = 0; i < hargaFasilitas.length; i++) {
            for (int j = 0; j < hargaFasilitas[i].length; j++) {
                System.out.printf("%-15s", hargaFasilitas[i][j]);
            }
            System.out.println("");
        }
        System.out.println("---------------------\n");
    }

    public abstract int PesanKamar();
    public abstract void PesanMakan();
    public abstract void PesanFasilitas();
    public abstract void TotalPesanan();

    public String getNama() { return nama; }
    public String getNoTelp() { return noTelp; }
    public String getAlamat() { return alamat; }
    public int getNoKTP() { return noKTP; }
}
