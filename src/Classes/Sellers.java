package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Sellers {

    private String sellerFirstName, sellerSurname, sellerUsername, sellerPassword, sellerCellNum;
    private int sellerID;

    public Sellers(int i, String n, String s, String c, String u, String p) {
        sellerID = i;
        sellerFirstName = n;
        sellerSurname = s;
        sellerCellNum = c;
        sellerUsername = u;
        sellerPassword = p;
    }

    public int getSellerID() {
        return sellerID;
    }

    public String getSellerName() {
        return sellerFirstName;
    }

    public String getSellerCellNum() {
        return sellerCellNum;
    }

    public String getSellerUsername() {
        return sellerUsername;
    }

    public String getSellerPassword() {
        return sellerPassword;
    }

    public void writeDetailsToFile(int i, String n, String s, String c, String u, String p) throws FileNotFoundException {

        
        File file = new File("Sellers.txt");
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(i);
        printWriter.print(n);
        printWriter.print(s);
        printWriter.print(c);
        printWriter.print(u);
        printWriter.print(p);
        printWriter.close();
    }

   
}
