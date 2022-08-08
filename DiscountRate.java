public class DiscountRate {
    static private double serviceDiscountPremium=0.2;
    static private double serviceDiscountGold=0.15;
    static private double serviceDiscountSilver=0.1;
    static private double productDiscountPremium=0.1;
    static private double productDiscountGold=0.1;
    static private double productDiscountSilver=0.1;

    static public double getserviceDiscountRate(String type){
        if (type.toLowerCase().equals("premium")){
            return serviceDiscountPremium;
        }
       else if (type.toLowerCase().equals("gold")){
            return serviceDiscountGold;
        } else if (type.toLowerCase().equals("silver")) {
            return serviceDiscountSilver;
        }

  return 0.0;  }
    static public double getProductDiscountRate(String type){
        if (type.toLowerCase().equals("premium")){
            return productDiscountPremium;
        }
        else if (type.toLowerCase().equals("gold")){
            return productDiscountGold;
        } else if (type.toLowerCase().equals("silver")) {
            return productDiscountSilver;
        }

        return 0.0;  }
}
