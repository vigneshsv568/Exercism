import java.util.*;

public class PythagoreanTriplet{
    private int first_digit;
    private int second_digit;
    private int third_digit;

    PythagoreanTriplet(int first_digit, int second_digit, int third_digit){
        this.first_digit = first_digit;
        this.second_digit= second_digit;
        this.third_digit = third_digit;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof PythagoreanTriplet)) {
            return false;
        }
        PythagoreanTriplet temp = (PythagoreanTriplet) obj;
        return this.first_digit == temp.first_digit && this.second_digit == temp.second_digit && this.third_digit == temp.third_digit;
    }

    public static PythagoreanTripletBuilder makeTripletsList() {
        return new PythagoreanTripletBuilder();
    }
}


