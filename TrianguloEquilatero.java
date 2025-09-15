public class TrianguloEquilatero extends FiguraGeometrica{
    private double lado;
    
    public TrianguloEquilatero (String cor, double lado) {
        super(cor);
        this.lado = lado;
    }

    public void setLado(double novoLado) { 
        lado = novoLado;
    }

    public double getLado() {
        return lado;
    }

    public double calcularArea() {
        return Math.sqrt(3/4)*lado*lado;
    }

    public double calcularPerimetro() {
        return lado*3;
    }

    public String getTipoFigura() {
        return "Triângulo Equilátero";
    }

    public String getDetalhes() {
        return "";
    }

    public String getInfo() {
        return "";
    }
}
