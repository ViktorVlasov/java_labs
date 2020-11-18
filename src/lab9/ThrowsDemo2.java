package lab9;

import java.util.Scanner;

public class ThrowsDemo2 {
    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next(); // "";
        boolean flag = true;
        while (flag){
            try {
                printDetails(key);
                flag = false;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }
    private String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key;
    }
}
