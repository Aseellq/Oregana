
package oregano;

import java.util.ArrayList;

public class Manager extends User{

    public Manager() {
    }

    public Manager(int ID, int password, String userName, String name, int age, String phoneNumber, String address) {
        super(ID, password, userName, name, age, phoneNumber, address);
    }
    
    public void delete(int id, ArrayList<User> employees){
        
        Employee emp = null;
        boolean isFound = false;
        
        for (int i = 0; i < employees.size(); i++) {
            emp = (Employee) employees.get(i);
            
            if(emp.getID()==id){
                System.out.println("\n-- "+emp.getName()+ ", Deleted Succussfully...");
                employees.remove(emp);
                isFound=true;
            }
        }
        if(!isFound)
            System.out.println("-- Employee didn't exist -- ");
    }
    
    public void addNew(Employee e, ArrayList<User> employees){
        employees.add(e);
    }
}


