
package oregano;

public class Payment extends BillService{
    private String paymentType;
    private final double TAX=15;
    

    public Payment(int orderId,int numOfOrder, String paymentType ) {
         super( orderId, numOfOrder );
         this.paymentType=paymentType;   
    }

    public Payment() {
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentType() {
        return paymentType;
    }
    public double calculateTotalPrice(double totalPrice){
        //tax
        return totalPrice+=totalPrice*(TAX/100);
        
    }
   
    public double calculateTotalPrice(double totalPrice,double discountPercent){
        double total= calculateTotalPrice(totalPrice);
        return total-=total*discountPercent;
    }
         
}


