package user;

import data.DataDB;
import items.DrumElektrik;
import items.Gitar;

import java.util.Scanner;

public class Home {
    Pelanggan p = new Pelanggan();
    Karyawan k = new Karyawan();
    DataDB db = new DataDB();
    DrumElektrik drumE = new DrumElektrik();
    Gitar gitar = new Gitar();
    Cashier cashier = new Cashier();
    private Object[][] cart = new Object[3][6];

    Scanner inptStr = new Scanner(System.in);
    Scanner inptNmbr = new Scanner(System.in);
    public void login() {
        System.out.print("Masukkan username : ");
        String username = inptStr.nextLine();

        System.out.print("Masukkan password : ");
        String password = inptStr.nextLine();

        for (int i = 0; i < db.getUserDB().length; i++){
            if (username.equals(db.getUserDB()[i][0]) && password.equals(db.getUserDB()[i][1])){
                if ((int) db.getUserDB()[i][3] == 0) {
                    k.setName(db.getUserDB()[i][2].toString());
                    dashboard(false);

                    return;
                } else if ((int) db.getUserDB()[i][3] == 1) {
                    p.setName(db.getUserDB()[i][2].toString());
                    switch ((int )db.getUserDB()[i][4]) {
                        case 1:
                            p.setMemberType("SILVER_DISC");
                            break;
                        case 2:
                            p.setMemberType("GOLD_DISC");
                            break;
                        case 3:
                            p.setMemberType("PREMIUM_DISC");
                            break;
                        default:
                            break;
                    }
                    dashboard(true);

                    return;
                }
            }
        }

        System.out.println("Username atau Password salah!!");
        login();
    }

    public void search(int repeat, boolean member){
        System.out.print("Pilih Menu : ");
        int pilih = inptNmbr.nextInt();

        if (pilih > db.getItemsDB().length) {

            System.out.println("Barang tidak ada");
            if (member == true) {
                dashboard( true);
            } else {
                dashboard(false);
            }
        } else {
            for (int i = 0; i < db.getItemsDB().length; i++) {
                if (db.getItemsDB()[i] == db.getItemsDB()[(pilih - 1)]) {
                    if (db.getItemsDB()[i][4].toString() == "DrumE") {
                        drumE.setBrand(db.getItemsDB()[i][0].toString());
                        drumE.setModel(db.getItemsDB()[i][1].toString());
                        drumE.setPrice((int) db.getItemsDB()[i][2]);
                        drumE.setOnSale((boolean) db.getItemsDB()[i][5]);

                        cart[repeat][0] = drumE.getBrand();
                        cart[repeat][1] = drumE.getModel();
                        cart[repeat][2] = drumE.getPrice();
                        cart[repeat][3] = drumE.getOnSale();
                        cart[repeat][4] = drumE.getDiscount();
                        cart[repeat][5] = drumE.getDiscountedPrice();

                        cashier.setCart(cart);
                    } else if (db.getItemsDB()[i][4].toString() == "Gitar") {
                        gitar.setBrand(db.getItemsDB()[i][0].toString());
                        gitar.setModel(db.getItemsDB()[i][1].toString());
                        gitar.setPrice((int) db.getItemsDB()[i][2]);
                        gitar.setOnSale((boolean) db.getItemsDB()[i][5]);

                        cart[repeat][0] = gitar.getBrand();
                        cart[repeat][1] = gitar.getModel();
                        cart[repeat][2] = gitar.getPrice();
                        cart[repeat][3] = gitar.getOnSale();
                        cart[repeat][4] = gitar.getDiscount();
                        cart[repeat][5] = gitar.getDiscountedPrice();

                        cashier.setCart(cart);
                    }
                }
            }
        }
        return;
    }
    public void dashboard(boolean member) {

        int repeat = 0;
        String again;

        System.out.println("Selamat Datang " + (member == true ? p.getName() : k.getName()));
        System.out.println("Menu");
        for (int i = 0; i < db.getItemsDB().length; i++){
            System.out.println((i+1) + ".\tBrand : " + db.getItemsDB()[i][0] + "\n\tModel : " + db.getItemsDB()[i][1] + "\n\tPrice : " + db.getItemsDB()[i][2]);
        }

        do {
            search(repeat, member);

            System.out.print("Ada lagi? y/n ");
            String lagi = inptStr.nextLine();

            again = lagi;
            repeat++;
        } while (again.equals("y") || again.equals("Y"));

        cashier.list(member == true ? (double) p.getMembershipDiscount() : k.getDISCOUNT(), member);
    }
}
