import java.util.Objects;

public class Probability{
    private double probabilityValue;
    private double totalProbability =1;

    public Probability(double probabilityValue) {
        this.probabilityValue = probabilityValue;
    }

    public double probabilityOfTwoEventsOccurringTogether(Probability event){

        return (this.probabilityValue * event.probabilityValue);
    }

    public double probabilityOfEventNotOccurring (Probability event){

        return (totalProbability - event.probabilityValue);
    }

    public double probabilityOfEitherTwoEventsOccurring(Probability event) {
        return (this.probabilityValue + event.probabilityValue - (this.probabilityOfTwoEventsOccurringTogether(event)));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(that.probabilityValue, probabilityValue) == 0 && Double.compare(that.totalProbability, totalProbability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(probabilityValue, totalProbability);
    }
}
