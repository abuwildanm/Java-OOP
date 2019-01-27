package Constructor_dan_Instance_Method;

public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int banyakObjek;
    
    public Student(){
        name = "";
        address = "";
        age = 0;
        banyakObjek++;
    }
    
    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
        banyakObjek++;
    }
    
    public Student(double math, double english, double science){
        mathGrade = math;
        englishGrade = english;
        scienceGrade = science;
    }

    public void setName(String n){
        name = n;
    }
    
    public void setAddress(String a){
        address = a;
    }

    public void setAge(int ag){
        age = ag;
    }

    public void setMath(int math){
        mathGrade = math;
    }

    public void setEnglish(int english){
        englishGrade = english;
    }

    public void setScience(int science){
        scienceGrade = science;
    }

    private double getAverage(){
        double result = 0;
        result = (mathGrade+scienceGrade+englishGrade)/3;
        return result;
    }
    
    private boolean statusAkhir() {
        boolean remidi;
        remidi = getAverage() < 61;
        return remidi;
    }

    public static void jumlahObjek() {
        System.out.println("Jumlah objek : " + banyakObjek);
    }
    
    public void displayMessage(){
        System.out.println("Siswa dengan nama "+name);
        System.out.println("beramalat di "+address);
        System.out.println("berumur "+age);
        System.out.println("mempunyai nilai rata rata "+getAverage());
        System.out.println("Remidi  : " + statusAkhir());
    }
}
