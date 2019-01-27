package Overload;

public class Database {
    private Object id;
    private boolean status;
    Object[][] data = { { 101, "Paijo", 2000, 1000, 500, 200 },
                        { 102, "Lala", 1750, 900, 500, 200 },
                        { 103, "Lulu", 2150, 1000, 300, 375 },
                        { 104, "Sabar", 1500, 750, 600, 200 },
                        { 105, "Sule", 2500, 850, 500, 300 }
                      };
    
    String kategori[] = {"No. ID", "Nama", "Gaji Pokok", "Tunjangan", "Bonus", "Denda"};
    
    public void get() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (j == 0) System.out.printf("%-10s ", data[i][0]);
                if (j == 1) System.out.printf("%-10s ", data[i][1]);
                if (j == 2) System.out.printf("%-15s ", data[i][2]);
                if (j == 3) System.out.printf("%-15s ", data[i][3]);
                if (j == 4) System.out.printf("%-10s ", data[i][4]);
                if (j == 5) System.out.printf("%-10s ", data[i][5]);
            }
            System.out.println("");
        }
    }
    
    public void get(int id) {
        this.id = (Integer) id;
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][0] != this.id) status = false;
                
                if (data[i][0] == this.id) {
                    status = true;
                    if (j == 0) System.out.printf("%-10s ", data[i][0]);
                    if (j == 1) System.out.printf("%-10s ", data[i][1]);
                    if (j == 2) System.out.printf("%-15s ", data[i][2]);
                    if (j == 3) System.out.printf("%-15s ", data[i][3]);
                    if (j == 4) System.out.printf("%-10s ", data[i][4]);
                    if (j == 5) System.out.printf("%-10s ", data[i][5]);
                }
            }
            if (status == true) System.out.println("");
        }
    }
    
    public void get(String columnName, Object value) {
        int k;
        
        for (k = 0; k < kategori.length; k++)
            if (kategori[k].equalsIgnoreCase(columnName)) break;
        
        for (int i = 0; i < data.length; i++) {
            if (!data[i][k].toString().equalsIgnoreCase(value.toString())) status = false;
            
            if (data[i][k].toString().equalsIgnoreCase(value.toString())) {
                status = true;
                System.out.printf("%-10s ", data[i][0]);
                System.out.printf("%-10s ", data[i][1]);
                System.out.printf("%-15s ", data[i][2]);
                System.out.printf("%-15s ", data[i][3]);
                System.out.printf("%-10s ", data[i][4]);
                System.out.printf("%-10s ", data[i][5]);
            }
            
            if (status == true) System.out.println("");
        }
    }
    
    public void get(String columnName, String operator, Object value) {
        int k;
        
        for (k = 0; k < kategori.length; k++)
            if (kategori[k].equalsIgnoreCase(columnName)) break;
        
        for (int i = 0; i < data.length; i++) {
            int x = Integer.parseInt(data[i][k].toString());
            int y = Integer.parseInt(value.toString());
            
            if (operator.equals("<")) {
                if (x >= y) status = false;
            
                if (x < y) {
                    status = true;
                    System.out.printf("%-10s ", data[i][0]);
                    System.out.printf("%-10s ", data[i][1]);
                    System.out.printf("%-15s ", data[i][2]);
                    System.out.printf("%-15s ", data[i][3]);
                    System.out.printf("%-10s ", data[i][4]);
                    System.out.printf("%-10s ", data[i][5]);
                }

                if (status == true) System.out.println("");
            }
            
            else if (operator.equals("<=")) {
                if (x > y) status = false;
            
                if (x <= y) {
                    status = true;
                    System.out.printf("%-10s ", data[i][0]);
                    System.out.printf("%-10s ", data[i][1]);
                    System.out.printf("%-15s ", data[i][2]);
                    System.out.printf("%-15s ", data[i][3]);
                    System.out.printf("%-10s ", data[i][4]);
                    System.out.printf("%-10s ", data[i][5]);
                }

                if (status == true) System.out.println("");
            }
            
            else if (operator.equals(">=")) {
                if (x < y) status = false;
            
                if (x >= y) {
                    status = true;
                    System.out.printf("%-10s ", data[i][0]);
                    System.out.printf("%-10s ", data[i][1]);
                    System.out.printf("%-15s ", data[i][2]);
                    System.out.printf("%-15s ", data[i][3]);
                    System.out.printf("%-10s ", data[i][4]);
                    System.out.printf("%-10s ", data[i][5]);
                }

                if (status == true) System.out.println("");
            }
            
            else if (operator.equals(">")) {
                if (x <= y) status = false;
            
                if (x > y) {
                    status = true;
                    System.out.printf("%-10s ", data[i][0]);
                    System.out.printf("%-10s ", data[i][1]);
                    System.out.printf("%-15s ", data[i][2]);
                    System.out.printf("%-15s ", data[i][3]);
                    System.out.printf("%-10s ", data[i][4]);
                    System.out.printf("%-10s ", data[i][5]);
                }

                if (status == true) System.out.println("");
            }
            
            else if (operator.equals("==")) {
                if (x != y) status = false;
            
                if (x == y) {
                    status = true;
                    System.out.printf("%-10s ", data[i][0]);
                    System.out.printf("%-10s ", data[i][1]);
                    System.out.printf("%-15s ", data[i][2]);
                    System.out.printf("%-15s ", data[i][3]);
                    System.out.printf("%-10s ", data[i][4]);
                    System.out.printf("%-10s ", data[i][5]);
                }

                if (status == true) System.out.println("");
            }
        }
    }
}