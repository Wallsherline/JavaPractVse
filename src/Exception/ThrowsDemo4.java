package Exception;

import java.util.Scanner;

public class ThrowsDemo4 {

    public void getKey() {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public void printDetails(String key) {
        try { String message = getDetails(key);
            System.out.println( message );
        }catch ( Exception e){
            e.printStackTrace();
        }
    }

    private String getDetails(String key) throws Exception {
        if(key.equals("null")) {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }
}
