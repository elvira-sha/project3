public class BmiService {
    public int calculate(float weight, float height) {
        return (int) (weight / (height * height));
    }
}
