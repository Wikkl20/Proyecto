
package Modelo;

public class Pago {
    private int idPago;
    private String dniCliente;
    private String nombre;
    private String fechaPago;
    private double montoPagado;
    private String estado;

    // Constructor vacío
    public Pago() {
    }

    // Constructor con parámetros
    public Pago(int idPago, String dniCliente, String fechaPago, double montoPagado, String estado) {
        this.idPago = idPago;
        this.dniCliente = dniCliente;
        this.fechaPago = fechaPago;
        this.montoPagado = montoPagado;
        this.estado = estado;
    }

    // Getters y setters
    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
