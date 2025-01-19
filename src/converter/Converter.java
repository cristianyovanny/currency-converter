package converter;

import api.CurrencyAPI;

public class Converter {
    private final String baseCurrency;
    private final String quoteCurrency;
    private final Double amountCurrency;

    public Converter(String baseCurrency, String quoteCurrency, String amountCurrency) {
        this.baseCurrency = baseCurrency;
        this.quoteCurrency = quoteCurrency;
        this.amountCurrency = Double.parseDouble(amountCurrency);
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public String getQuoteCurrency() {
        return quoteCurrency;
    }

    public Double getAmountCurrency() {
        return amountCurrency;
    }

    public String makeCurrencyExchange() {
        CurrencyAPI currencyAPI = new CurrencyAPI();
        // Llamamos a la API para obtener el valor de la conversión
        String conversionResult = currencyAPI.getAPI_URL(baseCurrency, quoteCurrency, amountCurrency);

        // Realizamos la conversión con el valor obtenido
        double convertedAmount = Double.parseDouble(conversionResult);
        String message = "La conversión de " + amountCurrency + " " + baseCurrency + " a " + quoteCurrency + " es: " + convertedAmount;
        return message;
    }
}