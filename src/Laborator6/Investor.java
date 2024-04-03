package Laborator6;

public class Investor {
    static Share[] shares;
    public static void main(String[] args)
    {
        double[] shareMaxCount = {1, 1, 1, 4, 2};
        double[] sharePrices = {12.3, 10.0, 131.4, 33.6, 12.9};
        double[] shareDividends = {1.1, 0.95, 4.2, 1.0, 0.5};
        double sum = 30.0;

        shares = new Share[shareMaxCount.length];

        for (int i = 0; i< shareMaxCount.length; i++) {
            shares[i] = new Share(sharePrices[i], shareDividends[i], shareMaxCount[i]);
        }

        buyShares(shareMaxCount,sharePrices, shareDividends, sum);
        for (Share share: shares) {
            System.out.println(
                    "Share price: " + share.price + " Dividend rate: " + share.dividendRate +
                            " bought: " + share.bought
            );
        }
    }

    public static void buyShares(double[] shareMaxCount, double[] sharePrices, double[] shareDividents, double sum)
    {
        sort(shares);

        for (Share share: shares) {
            if (sum - share.price * share.maxCount > 0) {
                share.bought = share.maxCount;
                sum -= share.price * share.maxCount;
            } else {
                share.bought = sum / share.price;
                break;
            }
        }
    }


    private static void sort(Share[] shares) {
        int n = shares.length;
        boolean swap;
        for (int i = 0; i < n; i++) {
            swap = false;
            for (int j = 0; j < n-i-1; j++) {
                if(shares[j+1].dividendRate > shares[j].dividendRate ) {
                    Share temp = shares[j];
                    shares[j] = shares[j+1];
                    shares[j+1] = temp;
                    swap = true;
                }
            }
            if (swap == false) {
                break;
            }
        }
    }

    static class Share
    {
        double maxCount;
        double price;
        double dividend;
        double dividendRate;
        double bought;

        public Share(double price, double dividend, double maxCount) {
            this.price = price;
            this.dividend = dividend;
            this.maxCount = maxCount;
            this.dividendRate = dividend/price;
            this.bought = 0.0;
        }
    }
}
