package Modelo;

public class Consumo {
    private String dni;
    private String nombre;
    private String direccion;
    private double consumo;
    private double totalPagar;

    // Constructor vacío
    public Consumo() {}

    // Constructor con parámetros
    public Consumo(String dni, String nombre, String direccion, double consumo, double totalPagar) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.consumo = consumo;
        this.totalPagar = totalPagar;
    }

    // Getters y Setters
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public double getConsumo() { return consumo; }
    public void setConsumo(double consumo) { this.consumo = consumo; }

    public double getTotalPagar() { return totalPagar; }
    public void setTotalPagar(double totalPagar) { this.totalPagar = totalPagar; }
}
