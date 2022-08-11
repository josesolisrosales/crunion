package crunion;

public class EquivalenciasNuevas extends Equivalencias 
{
    public static boolean agregarNuevaMoneda(String nombre, float precioVenta, float precioCompra) {
        // Validar que nombre no exista en Equivalencias
        if (!Equivalencias.getInstance().validarExistenciaMoneda(nombre)) {
            Equivalencias.getInstance().agregarMoneda(nombre, precioCompra, precioVenta);
            return true;
        } else {
            java.util.logging.Logger.getLogger(Equivalencias.class.getName()).log(java.util.logging.Level.SEVERE, String.format("Coin with the name %s already exists", nombre));
            return false;
        }
    }

    public static boolean actualizarEquivalencia(String nombre, float precioVenta, float precioCompra) {
        // Validar que nombre exista en Equivalencias
        if (Equivalencias.getInstance().validarExistenciaMoneda(nombre)) {
            Equivalencias.getInstance().actualizarMoneda(nombre, precioCompra, precioVenta);
            return true;
        } else {
            java.util.logging.Logger.getLogger(Equivalencias.class.getName()).log(java.util.logging.Level.SEVERE, String.format("Coin with the name %s does not exist", nombre));
            return false;
        }
    }
}