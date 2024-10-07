public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 40.5f; // вес в кг
        float height = 1.3f;  // рост в метрах

        // Возвращаемый результат - целое число
        int bmi = service.calculate(weight, height);

        // Выводим результат
        System.out.println("Индекс массы тела = " + bmi);
    }
}
