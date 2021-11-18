
public class CoinToss {
    double tossValue;

    public CoinToss(double tossValue) {
        this.tossValue = tossValue;
    }

    public CoinToss tossingTwoCoins(CoinToss coin){

        return new CoinToss(this.tossValue * coin.tossValue);
    }

    public double probabilityOfNotOccurring (CoinToss coin){

        return (1 - coin.tossValue);
    }

    public CoinToss probabilityOfEitherTwoEvents(CoinToss coin2) {
        return new CoinToss(this.tossValue + coin2.tossValue - (this.tossingTwoCoins(coin2).tossValue));
    }
}
