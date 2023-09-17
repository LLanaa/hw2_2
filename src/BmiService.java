public class BmiService {

    public double pow(double height) {
        return height * height;
    }

    public double calculate(double height, double weight) {

        double bmiPow = pow(height);
        double bmiCount = weight / bmiPow;

        if (bmiCount > 25) {
            System.out.println("Ваш индекс массы тела избыточен:( " + bmiCount);
        } else {
            System.out.println("Поздравляю! Ваш индекс массы тела в норме! " + bmiCount);
        }
        return bmiCount;
    }
}
