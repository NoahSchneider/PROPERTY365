package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertiesArray {
    public Properties arrProp[] = new Properties[10000];
    private int size = 0;
    public PropertiesArray()
    {
        try{
            Scanner scFile = new Scanner(new File(""));
            while(scFile.hasNextLine())
            {
                String line = scFile.nextLine();
                Scanner scLine = new Scanner(line).useDelimiter("#");
                int strtNum =  scLine.nextInt();
                String strtName = scLine.next()+ scLine.next();
                String area = scLine.next();
                int nmBds = scLine.nextInt();
                int nmBths = scLine.nextInt();  
                int prce = scLine.nextInt();
                scLine.close();
                arrProp[size] = new Properties(strtNum, strtName, area, nmBds, nmBths, prce);
                size++;
            }
            scFile.close();
        }
        catch (FileNotFoundException ex) {//catch's FileNotFoundException
            Logger.getLogger(PropertiesArray.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    
}
     public int getSize() {//getSize accessor method returns size of the array
        return size;//returns the int of the size of the array
    }//get size of array method
     public void delete(int position)
     {
         for (int i = size; i >= position; i--) {
             arrProp[i] = arrProp[i-1];
         }
         size++;
     }
     public void insert(int position)
     {
         for (int i = position; i < size - 1; i++) {
             arrProp[i] = arrProp[i + 1];
         }
         size--;
     }
}
