package BelajarModular.main;

import BelajarModular.function.Function;

class BelajarFungsi {
    static Function functions = new Function();

    public static void main(String[] args) {
        functions.ucapSalam();
        functions.ucapin("Hi");
        System.out.println("Luas Persegi dengan panjang sisi 5 adalah " + functions.luasPersegi(5));
    }
}
