public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 40.5f;
        float height = 1.3f;
        float bmi = service.calculate(weight, height);
        System.out.println("Индекс массы тела = " + bmi);
    }
}