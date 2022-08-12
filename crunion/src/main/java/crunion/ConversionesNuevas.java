package crunion;

public class ConversionesNuevas extends Conversiones {

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
        diferenciaCompraVenta = Equivalencias.getInstance().precioCompra(monedaDestino) - Equivalencias.getInstance().precioVenta(monedaDestino);
        precioBaseCompraDolar = Equivalencias.getInstance().precioCompra(monedaDestino);
        if (montoDolar < 3000 ) {
            precioCompraDolar = precioBaseCompraDolar;

        } else if ( Helpers.isBetween(montoDolar, 2999, 6000)) {
            
            precioCompraDolar = precioBaseCompraDolar + (diferenciaCompraVenta*0.15f);

        } else if (Helpers.isBetween(montoDolar, 5999, 9000)) {
            precioCompraDolar = precioBaseCompraDolar + (diferenciaCompraVenta*0.25f);
        } else {
            precioCompraDolar = precioBaseCompraDolar + (diferenciaCompraVenta*0.35f);
        }
        cantidadMonedaFinal = precioCompraDolar * montoDolar;
        return cantidadMonedaFinal;
    }

    // Este metodo es usado cuando el cliente quiere convertir una moneda diferente del dolar. calcula la conversion intermedia monedaOrigen -> Dolar
    private static float VentaDolar(float montoMoneda, String monedaOrigen) {
        precioVentaDolar = Equivalencias.getInstance().precioCompra(monedaOrigen);
        conversionIntermediaDolar = montoMoneda / precioVentaDolar;
        if (conversionIntermediaDolar < 3000) {
            return conversionIntermediaDolar;
        } else if (Helpers.isBetween(conversionIntermediaDolar, 2999, 6000)) {
            conversionIntermediaDolar = conversionIntermediaDolar - (conversionIntermediaDolar*0.01f);
        } else if (Helpers.isBetween(conversionIntermediaDolar, 5999, 9000)) {
            conversionIntermediaDolar = conversionIntermediaDolar - (conversionIntermediaDolar*0.02f);
        } else {
            conversionIntermediaDolar = conversionIntermediaDolar - (conversionIntermediaDolar*0.03f);
        }

        return conversionIntermediaDolar;
    }
    

    
    // Definicion de variables privadas
    private static float cantidadMonedaFinal;
    private static float precioBaseCompraDolar;
    private static float precioCompraDolar;
    private static float precioVentaDolar;
    private static float conversionIntermediaDolar;
    private static float diferenciaCompraVenta;

}