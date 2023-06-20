package ru.inno.course.currency_converter;

import java.util.HashMap;
import java.util.Map;

public class Converter {
    private final Map<Pair, Double> prices;

    // source: https://www.binance.com/ru/markets/overview
    public Converter() {
        prices = new HashMap<>();
        prices.put(new Pair("BTC", "USD"), 26_940.37);
        prices.put(new Pair("ETH", "USD"), 1_731.3);
        prices.put(new Pair("XRP", "USD"), 0.4904);
        prices.put(new Pair("USDT", "USD"), 1.0);
        prices.put(new Pair("DOGE", "USD"), 0.06231);
        prices.put(new Pair("DOT", "USD"), 4.50);
        prices.put(new Pair("BTC", "RUR"), 2_269_639.71);
        prices.put(new Pair("ETH", "RUR"), 145_809.46);
        prices.put(new Pair("XRP", "RUR"), 41.32);
        prices.put(new Pair("USDT", "RUR"), 84.21);
        prices.put(new Pair("DOGE", "RUR"), 5.25);
        prices.put(new Pair("DOT", "RUR"), 378.36);
    }

    /**
     * Конвертирует валюту из `currencyFrom` в `currencyTo` по известной цене
     *
     * @param amount       количество денег в валюте `currencyFrom`
     * @param currencyFrom валюта, из которой переводим
     * @param currencyTo   валюта, в которую переводим
     * @return количество денег в валюте `currencyTo`
     */
    public double convert(double amount, String currencyFrom, String currencyTo) {
        Pair pair = new Pair(currencyFrom, currencyTo);
        double price = computePrice(pair);
        return amount * price;
    }

    private double computePrice(Pair pair) {
        if (pair.getCcy1().equals("RUR") || pair.getCcy1().equals("USD")) { // обратная валютная пара
            Pair normalPair = swap(pair);
            return 1 / prices.get(normalPair);
        } else {
            return prices.get(pair);
        }
    }

    private Pair swap(Pair pair) {
        return new Pair(pair.getCcy2(), pair.getCcy1());
    }
}
