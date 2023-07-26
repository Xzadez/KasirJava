package user;

import abstracts.Person;
import interfaces.Membership;

public class Pelanggan extends Person implements Membership {
    String memberType = "";


    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getMemberType() {
        return memberType;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getMembershipDiscount() {
        if (getMemberType().equals("SILVER_DISC") ){
            return SILVER_DISC;
        } else if (getMemberType().equals("GOLD_DISC")) {
            return GOLD_DISC;
        } else if (getMemberType().equals("PREMIUM_DISC")) {
            return PREMIUM_DISC;
        } else {
            return 0.0;
        }
    }
}
