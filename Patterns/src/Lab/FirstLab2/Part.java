package Lab.FirstLab2;

import AggretationsAndComposition.Aggreatations.Student;

import java.util.List;

public class Part {
    private double price ;
    private Pricepolicy pricePolicy ;


    public void setPricePolicy(Pricepolicy pricePolicy) {
        this.pricePolicy = pricePolicy;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return pricePolicy.getPrice(price);
    }

    public double calculateTotal(List<Part> parts){
        double total = 0.0;
        for(int i = 0 ; i< parts.size() ; i++){
            total = total + parts.get(i).getPrice();
        }
        return total ;
    }
}
