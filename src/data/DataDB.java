package data;

public class DataDB {
    private Object[][] userDB = {
            {"orangA1", "Or4ngA1!", "Mamang", 1, 1},
            {"orangA2", "Or4ngA2@", "Racing", 1, 2},
            {"orangA3", "Or4ngA3#", "Mamang Racing", 1, 3},
            {"karyawanA1", "K4ryawanA1!", "Mamat", 0, 0},
            {"karyawanA2", "K4ryawanA2@", "Almamat", 0, 0},
            {"karyawanA3", "K4ryawanA3#", "Karimun", 0, 0},
    };

    private Object[][] itemsDB = {
            {"Yamahaha", "Y-1", 100000, 2, "DrumE", true},
            {"Casco", "\tC-1", 200000, 2, "DrumE", true},
            {"Yamahaha", "Y-Ea", 300000, 1, "Gitar", true},
            {"Casco", "C-362", 3500000, 2, "DrumE", true},
            {"Rolan", "Ra-114", 1000000, 1, "Gitar", true},
            {"Rolin", "Ri-122", 300000, 1, "Gitar", false},
            {"Kalasan", "K-154", 400000, 1, "Gitar", false},
            {"Alesis", "A-1asd", 500000, 2, "DrumE", false},
    };


    public Object[][] getUserDB() {
        return userDB;
    }

    public Object[][] getItemsDB() {
        return itemsDB;
    }

}
