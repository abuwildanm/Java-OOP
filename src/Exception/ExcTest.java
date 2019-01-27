package Exception;

public class ExcTest {
    
    static double division(int a, int b) throws Exception {
        if (b == 0) {
            throw new IllegalArgumentException("division by zero!");
        }

        return a / b;
    }
	
    public static void main (String[] x){
        try {
//            double x = division(9, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Horee");
        }

        String yy = "Wildan";
//        String sub = yy.substring(0, yy.length() – 3);
        String sub = yy.substring(0, yy.length() - 3);
    }
}

