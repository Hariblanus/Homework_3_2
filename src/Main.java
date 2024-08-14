public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 85; // Масса тела в кг.
        double height = 1.75; // Рост в м.
        int bmi = service.calculate(weight, height);

        System.out.println("ИМТ для роста " + height + " м. и веса " + weight + " кг. составляет " + bmi);
    }
}