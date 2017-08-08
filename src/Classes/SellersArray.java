package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SellersArray {

    public Sellers arrSellers[] = new Sellers[100000];
    private int size = 0;
    int sellerID;
    String sellerFirstName, sellerSurname, sellerCellNum, sellerUsername, sellerPassword;

    public SellersArray() {
        try {
            Scanner scFile = new Scanner(new File(""));
            while (scFile.hasNextLine()) {
                String line = scFile.nextLine();
                Scanner scLine = new Scanner(line).useDelimiter("#");
                sellerID = scLine.nextInt();
                sellerFirstName = scLine.next();
                sellerSurname = scLine.next();
                sellerCellNum = scLine.next();
                sellerUsername = scLine.next();
                sellerPassword = scLine.next();
                scLine.close();
                arrSellers[size] = new Sellers(sellerID, sellerFirstName,sellerSurname, sellerCellNum,sellerUsername, sellerPassword);
                size++;
            }
            scFile.close();
        } catch (FileNotFoundException ex) {//catch's FileNotFoundException
            Logger.getLogger(SellersArray.class.getName()).log(Level.SEVERE, null, ex);
            {
            }
        }
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

    public int getSize() {//getSize accessor method returns size of the array
        return size;//returns the int of the size of the array
    }//get size of array method
}
