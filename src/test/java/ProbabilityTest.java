import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProbabilityTest {
    Probability tossingCoin1 = new Probability(0.5);
    Probability tossingCoin2 = new Probability(0.5);


    @Test
    public void shouldProbabilityOfTossingHeadEqualsToTossingTail()
    {
       assertTrue(tossingCoin1.equals(tossingCoin2));

    }

    @Test
    public void probabilityOfTossingTwoCoinsIndependently()
    {
        assertEquals(0.25,tossingCoin1.probabilityOfTwoEventsOccurringTogether(tossingCoin2));

    }

    @Test
    public void probabilityOfEventNotOccurringOnTossingACoin()
    {
        assertEquals(0.5,tossingCoin1.probabilityOfEventNotOccurring(tossingCoin2));

    }

    @Test
    public void probabilityOfEitherTwoEventsOnTossingCoins()
    {
        assertEquals(0.75,tossingCoin1.probabilityOfEitherTwoEventsOccurring(tossingCoin2));

    }

}
