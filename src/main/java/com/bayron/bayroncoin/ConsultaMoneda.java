package com.bayron.bayroncoin;

import com.google.gson.Gson;

public class ConsultaMoneda {

    private final String apiKey = "e44b00c1791e99654d9b9d11";

    public Moneda buscaMoneda(String monedaBase, String monedaDestino, double cantidad) {
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/pair/"
                + monedaBase + "/" + monedaDestino + "/" + cantidad;

        Conexion conexion = new Conexion();
        String json = conexion.buscarDatos(url);

        Gson gson = new Gson();
        return gson.fromJson(json, Moneda.class);
    }
}