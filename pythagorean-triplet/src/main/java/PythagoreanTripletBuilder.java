import java.util.ArrayList;
import java.util.List;

public class PythagoreanTripletBuilder {
    private int factor;
    private int sum;

    public PythagoreanTripletBuilder withFactorsLessThanOrEqualTo(int factor) {
        this.factor = factor;
        return this;
    }

    public PythagoreanTripletBuilder thatSumTo(int sum) {
        this.sum = sum;
        return this;
    }

    public List<PythagoreanTriplet> build() {
        List<PythagoreanTriplet> triplets = new ArrayList<>();
        int a, b, c;
        for (a = 1; a < factor; a++) {
            for (b = a + 1; b < factor; b++) {
                c = sum - a - b;
                if (c < a || c < b) {
                    break;
                }
                if ((a * a) + (b * b) == (c * c)) {
                    triplets.add(new PythagoreanTriplet(a, b, c));
                }
            }
        }
        return triplets;
    }
}
