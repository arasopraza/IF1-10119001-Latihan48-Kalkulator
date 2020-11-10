/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program kalkulator sederhana
 * berbasis OOP
 */

public class Main {
    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator(7.0, 5.0);
        kalkulator.setNameProject();
        kalkulator.setNoteProject("This project shown you how to manage method in Java");

        System.out.println("VALUE 1 = " + kalkulator.getValue1());
        System.out.println("VALUE 2 = " + kalkulator.getValue2());
        System.out.println("Result Add is = " + kalkulator.add(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Minus is = " + kalkulator.minus(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Multiple is = " + kalkulator.multiplication(kalkulator.getValue1(), kalkulator.getValue2()));
        System.out.println("Result Division is = " + kalkulator.division(kalkulator.getValue1(), kalkulator.getValue2()));
    }
}
