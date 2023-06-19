
package oregano;

import java.util.ArrayList;

public class User {

    private int ID;
    private int password;
    private String userName;
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    
    public User(String name){
        this.name=name;
    }
    
    User(){ }

    public User(int ID, int password, String userName, String name, int age, String phoneNumber, String address) {
        this.ID = ID;
        this.password = password;
        this.userName = userName;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }
    public static User login(int password, String userName,ArrayList<User> staff){
        for (int i = 0; i < staff.size(); i++) {
           if(staff.get(i).getUserName().equalsIgnoreCase(userName)){
            if(staff.get(i).getPassword()==password){
                return staff.get(i);
            }
        }
    }
        return null;
    }


}
