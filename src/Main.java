public class Main {
    public static void main(String[] args) {
        double bmiService = 0;
        BmiService bmi = new BmiService();

        double bmiCount1 = bmi.calculate(1.71, 55);
        double bmiCount2 = bmi.calculate(1.71, 90);
        double bmiCount3 = bmi.calculate(1.83, 95);

        //System.out.println("ОР: ? " + "ФР: " + bmiCount1);
    }
}
