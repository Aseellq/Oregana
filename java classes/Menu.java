
package oregano;

public class Menu {
    
    private double price; 
    private String nameOfItem;
    private String discription;
    private double calories;
    
    public Menu(){
        
    }

    public Menu(double price, String nameOfItem, String discription, double calories) {
        this.price = price;
        this.nameOfItem = nameOfItem;
        this.discription = discription;
        this.calories = calories;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNameOfItem(String nameOfItem) {
        this.nameOfItem = nameOfItem;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public String getNameOfItem() {
        return nameOfItem;
    }

    public String getDiscription() {
        return discription;
    }

    public double getCalories() {
        return calories;
    }
    
    public void display(){
     
        System.out.printf("%-10s %-23s  %5.2f %5.2f\n",this.nameOfItem, this.discription,this.price, this.calories);
          
        
    }
}
