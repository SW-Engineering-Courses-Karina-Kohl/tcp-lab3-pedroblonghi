

public class FiguraGeometrica implements CalculosGeometricos{
    public double calcularArea() {
        return 1;
    }
    public double calcularPerimetro() {
        return 1;
    }
    public String getTipoFigura() {
        return "";
    }
    private String cor;
    private int id;
    private static int totalFiguras = 0;

    public FiguraGeometrica(String cor){
        FiguraGeometrica.totalFiguras++;
        id = FiguraGeometrica.totalFiguras;
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String novaCor) {
        cor = novaCor;
    }

    public static int getTotalFiguras() {
        return totalFiguras;
    }

    public int getId() {
        return id;
    }

    public String getInfo() {
        return "";
    }

    public String getDetalhes() {
        return "";
    }
}
