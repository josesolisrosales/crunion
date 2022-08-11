package crunion;

import java.util.Arrays;

// Clase equivalencias, computa los precios de compra y venta de la moneda seleccionada

public class Equivalencias{

    private static Equivalencias equivalencias;

    public static Equivalencias getInstance()
    {
        if (equivalencias==null)
            equivalencias = new Equivalencias();
        return equivalencias;
    }

    public static Equivalencias getInstance(int numeroMonedas)
    {
        if (equivalencias==null)
            equivalencias = new Equivalencias(numeroMonedas);
        return equivalencias;
    }

    public Equivalencias(int numeroMonedas) {
        if (numeroMonedas >= 5 && numeroMonedas <= 25) {
            String[] defaultDescripcionMonedas = new String[]{
                "dolar estadounidense",
                "euros",
                "colones",
                "pesos mexicanos",
                "cordobas oro",
                "pesos argentinos",
                "libra esterlina",
                "yen"
                };

            float[][] defaultValorMonedas = new float[][]{
                {1, 1},
                {0.85f, 0.91f},
                {660, 670},
                {20, 20.5f},
                {33, 36},
                {110, 112.5f},
                {0.70f, 0.76f},
                {119, 122.5f}
            };

            descripcionMonedas = new String[numeroMonedas];
            valorMonedas = new float[numeroMonedas][2];

            for (int i = 0; i < numeroMonedas; i++) {
                try {
                    descripcionMonedas[i] = defaultDescripcionMonedas[i];
                } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
                    descripcionMonedas[i] = "";
                }
            }

            for (int i = 0; i < numeroMonedas; i++) {
                try {
                    valorMonedas[i][0] = defaultValorMonedas[i][0];
                    valorMonedas[i][1] = defaultValorMonedas[i][1];
                } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
                    valorMonedas[i][0] = 0;
                    valorMonedas[i][1] = 0;
                }
            }
                
            } else {
                java.util.logging.Logger.getLogger(Equivalencias.class.getName()).log(java.util.logging.Level.SEVERE, "Initial array length must be between 5 and 25");
            }
    }

    public Equivalencias() {

        descripcionMonedas = new String[]{
            "dolar estadounidense",
            "euros",
            "colones",
            "pesos mexicanos",
            "cordobas oro",
            "pesos argentinos",
            "libra esterlina",
            "yen"
            };

        valorMonedas = new float[][]{
            {1, 1},
            {0.85f, 0.91f},
            {660, 670},
            {20, 20.5f},
            {33, 36},
            {110, 112.5f},
            {0.70f, 0.76f},
            {119, 122.5f}
        };
    }

    private int posicionMoneda(String monedaOrigen) {
        int index = Arrays.asList(descripcionMonedas).indexOf(monedaOrigen.toLowerCase());

        return index;

    }

    public float precioCompra(String monedaOrigen) {

        float precioCompra;
        int indiceMoneda = posicionMoneda(monedaOrigen);

        precioCompra = valorMonedas[indiceMoneda][0];

        return precioCompra;
    }

    public float precioVenta(String monedaOrigen) {

        float precioVenta;
        int indiceMoneda = posicionMoneda(monedaOrigen);

        precioVenta = valorMonedas[indiceMoneda][1];

        return precioVenta;
    }

    public boolean validarExistenciaMoneda(String nombre) {
        for (String descripcionMoneda : this.descripcionMonedas) {
            if (descripcionMoneda.equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public void agregarMoneda(String nombre, float precioCompra, float precioVenta) {
        for (int i = 0; i < this.descripcionMonedas.length; i++) {
            if (this.descripcionMonedas[i].equals("")) {
                this.descripcionMonedas[i] = nombre;
                this.valorMonedas[i][0] = precioCompra;
                this.valorMonedas[i][1] = precioVenta;
                break;
            }
        }
    }

    public void actualizarMoneda(String nombre, float precioCompra, float precioVenta) {
        int index = Arrays.asList(this.descripcionMonedas).indexOf(nombre.toLowerCase());
        this.valorMonedas[index][0] = precioCompra;
        this.valorMonedas[index][1] = precioVenta;
    }

    public String[] getDescripcionesMonedasValidas() {
        int cantidadMonedasValidas = 0;
        for (String descripcionMoneda : this.descripcionMonedas) {
            if (!descripcionMoneda.equals("")) {
                cantidadMonedasValidas++;
            }
        }
        
        String[] labelsMonedasUI = new String[cantidadMonedasValidas];

        for (int i = 0; i < this.descripcionMonedas.length; i++) {
            if (!this.descripcionMonedas[i].equals("")) {
                labelsMonedasUI[i] = this.descripcionMonedas[i];
            }
        }

        return labelsMonedasUI;
    }

    // Definicion de variables privadas
    private String[] descripcionMonedas;
    private float[][] valorMonedas;

}
