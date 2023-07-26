package items;

import abstracts.Item;
import interfaces.AlatElektronik;
import interfaces.AlatMusik;

public class DrumElektrik extends Item implements AlatMusik, AlatElektronik {

    double discount = AlatMusik.MAX_DISCOUNT + AlatElektronik.MAX_DISCOUNT;
    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public void setOnSale(boolean onSale) {
        super.setOnSale(onSale);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public boolean getOnSale() {
        return super.getOnSale();
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    @Override
    public int getDiscountedPrice() {
        return (int) (getPrice()-(getPrice() * getDiscount()));
    }
}
