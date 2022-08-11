package crunion;

//Clase para realizar las conversiones
public class Conversiones {

    //Este metodo recibe la cantidad inicial, la moneda de origen y la moneda de destino y retorna el valor final que el banco debe entregar al cliente
    public static float ConversionMonedas(float cantidadMonedaInicial, String monedaOrigen, String monedaDestino) {

        if (monedaOrigen.equals(monedaDestino)) {
            // Escenario Origen == Destino, no se debe calcular nada en este caso
            cantidadMonedaFinal = cantidadMonedaInicial;
            return cantidadMonedaFinal;

        } else if (monedaOrigen.equals("dolar estadounidense")) {
            // Escenario Compra, se obtiene el valor final en dolares del metodo cantidadMonedaFinal
            cantidadMonedaFinal = CompraDolar(cantidadMonedaInicial, monedaDestino);
            return cantidadMonedaFinal;

        } else {
            // Escenario Venta, cuando la moneda origen es diferente del dolar primero se calcula el intermediario en dolares y luego se usa el metodo compraDolar para convertir de dolares a moneda destino
            conversionIntermediaDolar = VentaDolar(cantidadMonedaInicial, monedaOrigen);
            cantidadMonedaFinal = CompraDolar(conversionIntermediaDolar, monedaDestino);
            return cantidadMonedaFinal;

        }
    }
    
    // Este metodo es usado cuando el cliente quiere convertir de dolares a otra moneda, calcula el precio de compra y devuelve la cantidad en dolares
    private static float CompraDolar(float montoDolar, String monedaDestino) {
        precioCompraDolar = Equivalencias.getInstance().precioCompra(monedaDestino);
        cantidadMonedaFinal = precioCompraDolar * montoDolar;
        return cantidadMonedaFinal;
    }

    // Este metodo es usado cuando el cliente quiere convertir una moneda diferente del dolar. calcula la conversion intermedia monedaOrigen -> Dolar
    private static float VentaDolar(float montoMoneda, String monedaOrigen) {
        precioVentaDolar = Equivalencias.getInstance().precioCompra(monedaOrigen);
        conversionIntermediaDolar = montoMoneda / precioVentaDolar;
        return conversionIntermediaDolar;
    }

    // Definicion de variables privadas
    private static float cantidadMonedaFinal;
    private static float precioCompraDolar;
    private static float precioVentaDolar;
    private static float conversionIntermediaDolar;

}
