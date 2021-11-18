import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTossTest {
    CoinToss coin1 = new CoinToss(0.5);
    CoinToss coin2 = new CoinToss(0.5);


    @Test
    public void tossingHeadEqualsTossingTail()
    {
       assertEquals(coin1.tossValue,coin2.tossValue);

    }

    @Test
    public void probabilityOfTossingTwoCoins()
    {
        assertEquals(0.25,coin1.tossingTwoCoins(coin2).tossValue);

    }

    @Test
    public void probabilityOfEventNotOccurringOnTossingACoin()
    {
        assertEquals(0.5,coin1.probabilityOfNotOccurring(coin1));

    }

    @Test
    public void probabilityOfEitherTwoEventsOnTossingCoins()
    {
        assertEquals(0.75,coin1.probabilityOfEitherTwoEvents(coin2).tossValue);

    }

}
