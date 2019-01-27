package Constructor_dan_Instance_Method;

public class Mahasiswa {
    int NIM, pass;
    
    public Mahasiswa() {
        pass = NIM;
    }
    
    public Mahasiswa(int NIM) {
        this.NIM = NIM;
        this.pass = NIM;
    }
    
    public void setPass(int pass) {
        this.pass = pass;
    }
    
    public int getPass() {
        return pass;
    }
    
    public int getNIM() {
        return NIM;
    }
    
    public void display() {
        System.out.println("NIM         : " + getNIM());
        System.out.println("Password    : " + getPass());
        System.out.println("");
    }
    
}
