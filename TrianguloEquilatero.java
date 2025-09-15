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
        double res =  Math.sqrt(3)/4;
         return res*lado*lado;
    }

    public double calcularPerimetro() {
        return lado*3;
    }

    public String getTipoFigura() {
        return "Triângulo Equilátero";
    }

    public String getDetalhes() {
        return String.format("Lados: %f", lado);
    }

    public String getInfo() {
        return String.format("ID: %s, Cor: %s, Tipo: %s, Lados: %f, Área: %s, Perímetro: %s", getId(), getCor(), getTipoFigura(), lado, calcularArea(), calcularPerimetro());
    }
}
