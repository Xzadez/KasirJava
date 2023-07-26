package user;

import items.DrumElektrik;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Cashier {
    Pelanggan p = new Pelanggan();
    double currentPrice;
    double currentDiscount[];
    double total;

    private Object[][] cart;
    DrumElektrik drumE = new DrumElektrik();
    Voucher voucher[] = new Voucher[4];

    public void list(double type, boolean member) {
        Scanner inpt = new Scanner(System.in);

        System.out.println("----------- List -----------");
        for (int i = 0; i < getCart().length; i++){
            if (getCart()[i][0] != null) {
                System.out.println((i + 1) + ". Brand : " + getCart()[i][0] + "\t" + getCart()[i][1]);
                addPrice((int) getCart()[i][2], (double) getCart()[i][4], (int) getCart()[i][5]);
                currentPrice += (int) getCart()[i][5];
            }
        }
        System.out.println("\tTotal Semua Barang : " + currentPrice);
        System.out.println("============ Pembayaran ============");
        addDisc(type, member);
        setTotal((currentPrice - (currentPrice*type)));
        System.out.println("\tTotal : " + getTotal());
        System.out.print("Voucher code : ");
        String vchr = inpt.nextLine();

        addVoucher(vchr);
    }
    public void addPrice(double price, double disc ,double priceDIsc){
        System.out.println("\tHarga barang : " + price);
        System.out.println("\tDiskon per-Barang : " + disc);
        System.out.println("\tTotal Harga Disc per-Barang : " + priceDIsc);

    }

    public void addDisc(double type, boolean member) {
        System.out.println((member == true ? ("\tDiskon Membership : " + type) : ("\tDiskon Karyawan : " + type)));
    }

    public void addVoucher(String code) {
        voucher[0] = new Voucher("ABC123", LocalDate.of(2023, 5, 31), 0.05);
        voucher[1] = new Voucher("VOUCHER1", LocalDate.of(2023, 5, 31), 0.01);
        voucher[2] = new Voucher("VOUCHER2", LocalDate.of(2023, 5, 31), 0.02);
        voucher[3] = new Voucher("VOUCHER3", LocalDate.of(2023, 5, 31), 0.1);

        for (int i = 0; i < voucher.length; i++){
            if (code.equals(voucher[i].getCode())) {
                if (voucher[i].isValid()){
                    System.out.println("Anda mendapatkan discount " + voucher[i].getDiscount());
                    System.out.println("Total semuanya menjadi : Rp " + (getTotal() - (getTotal() * voucher[i].getDiscount())));
                } else {
                    System.out.println("Masa berlaku sudah habis!");
                }
                return;
            }
        }

        System.out.println("Code Voucher tidak Valid");
    }

    public Object[][] getCart() {
        return cart;
    }

    public void setCart(Object[][] cart) {
        this.cart = cart;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
