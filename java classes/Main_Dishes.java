
package oregano;

public class Main_Dishes extends Menu{
    
    
    Main_Dishes(){
        
    }

    public Main_Dishes(double price, String nameOfItem, String discription, double calories) {
        super(price, nameOfItem, discription, calories);
    }
    
    @Override
    public void display(){ 
        System.out.printf("%-20s %-23s %-15s %-15s\n","Item Name","Description","Price","Calories");
        System.out.printf("%-20s %-23s  %-15.2f %-15.2f\n",super.getNameOfItem(), super.getDiscription(),
                   super.getPrice(), super.getCalories());
          
    }
}

