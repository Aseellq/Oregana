
package oregano;

public class Beverages extends Menu {

    public Beverages() {
        
    }

    public Beverages(double price, String nameOfItem, String discription, double calories) {
        super(price, nameOfItem, discription, calories);
    }
    
    @Override
    public void display(){ 
         System.out.printf("%-10s %-23s  %5.2f %5.2f\n",super.getNameOfItem(), super.getDiscription(),
                   super.getPrice(), super.getCalories());
        
    }
}

