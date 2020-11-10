public class Kalkulator {
    private double value1, value2;

    public Kalkulator(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setNameProject() {
        System.out.println("Project Calculator");
    }

    public void setNoteProject(String note) {
        System.out.println("This project shown you how to manage method in Java");
    }

    public double add(double val1, double val2) {
        return val1 + val2;
    }

    public double minus(double val1, double val2) {
        return val1 - val2;
    }

    public double multiplication(double val1, double val2) {
        return val1 * val2;
    }

    public double division(double val1, double val2) {
        return val1 / val2;
    }
}
