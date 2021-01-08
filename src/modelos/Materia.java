package modelos;

public class Materia {
    public String codigo;
    public String nombre;
    public String facultad;
    private double notaInicial;
    private double notaFinal;
    private double notaTotal;
    public double getNotaInicial() {
        return notaInicial;
    }
    public double getNotaFinal() {
        return notaFinal;
    }
    public double getNotaTotal() { return notaTotal;
    }
}
