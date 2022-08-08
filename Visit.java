import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name, Date date) {
this.customer=new Customer(name);
this.date=date;
    }
    public String getName(){
      String name = customer.getName();
   return name; }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double ex) {
        serviceExpense = ex;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double ex) {
        productExpense = ex;
    }
    public double getTotalExpense(){
       double total= this.productExpense+this.serviceExpense;
  return total;  }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
