
package Classes;

public class Properties {
    private String streetName, area;
    private int streetNum, numBeds, numBaths, price;
    public Properties(int s1, String s2, String a, int n1, int n2, int p)
    {
        streetNum = s1;
        streetName = s2;
        area = a;
        numBeds = n1;
        numBaths = n2;
        price = p;
        
    }
    public int getStreetNum()
    {
        return streetNum;
    }
    public void setStreetNum(int s1)
    {
        this.streetNum = s1;
    }
    public String getStreetName()
    {
        return streetName;
    }
    public void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }
    public String getArea()
    {
        return area;
    }
    public void setArea(String area)
    {
        this.area = area;
    }
    public int getNumBeds()
    {
        return numBeds;
    }
    public void setNumBeds(int numBeds)
    {
        this.numBeds = numBeds;
    }
    public int getNumBaths()
    {
        return numBaths;
    }
    public void setNumBaths(int numBaths)
    {
        this.numBaths = numBaths;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    }
