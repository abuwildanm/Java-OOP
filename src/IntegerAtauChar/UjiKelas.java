package IntegerAtauChar;

public class UjiKelas {
    
    public static boolean isNumberInt(Object data) {
        return data.getClass() == Integer.class;
    }
    
    public static boolean isCharacter(Object data) {
        return data.getClass() == Character.class;
    }

    public static void main(String[] args) {
        Object sesuatu1 = 'B';
        Object sesuatu2 = 3;
        
        if (isNumberInt(sesuatu1)) {
            System.out.println("Iya betul angka");
        } else {
            System.out.println("Salah bos");
        }
    }
    
}
