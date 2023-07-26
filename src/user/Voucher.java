package user;

import java.time.LocalDate;

public class Voucher {
    private String code;
    private LocalDate validUntil;
    private double discount;

    public Voucher(String code, LocalDate validUntil, double discount) {
        this.code = code;
        this.validUntil = validUntil;
        this.discount = discount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(LocalDate validUntil) {
        this.validUntil = validUntil;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public boolean isValid() {
        LocalDate today = LocalDate.now();
        return today.isBefore(validUntil) || today.isEqual(validUntil);
    }
}
