package user;

import abstracts.Person;

public class Karyawan extends Person {
    double DISCOUNT = 0.125;

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
