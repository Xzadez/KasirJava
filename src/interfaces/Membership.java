package interfaces;

public interface Membership {
    double PREMIUM_DISC = 0.1;
    double GOLD_DISC = 0.075;
    double SILVER_DISC = 0.05;

    public double getMembershipDiscount();
}
