package proyecto.atmosfera.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Registro {

    private String sector;
    private LocalDate fecha;
    private String hora;
    private double mp10;
    private double mp25;
    private String fechasas;

    public Registro(String sector,LocalDate fecha, String hora, double mp10, double mp25){
        this.fecha = fecha;
        this.hora = hora + ":00";
        this.sector = sector;
        this.mp10 = mp10;
        this.mp25 = mp25;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechasas = fecha.format(dateTimeFormatter);
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public double getMp10() {
        return mp10;
    }

    public void setMp10(double mp10) {
        this.mp10 = mp10;
    }

    public double getMp25() {
        return mp25;
    }

    public void setMp25(double mp25) {
        this.mp25 = mp25;
    }

    public String getFechasas() {
        return fechasas;
    }

    @Override
    public String toString() {
        return "Registro: " + "sector= " + sector + ", fecha= " + fecha.format(DateTimeFormatter.ofPattern("dd/MM/yy")) + ", hora= " + hora + ", mp10= " + mp10 + ", mp25= " + mp25 + "\n";
    }

}