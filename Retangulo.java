public class Retangulo extends FiguraGeometrica{
    private double largura;
    private double altura;

    public Retangulo(String cor, double larg, double alt) {
        super(cor);
        largura = larg;
        altura = alt;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea() {
        return largura*altura;
    }

    public double calcularPerimetro() {
        return 2*(largura+altura);
    }

    public String getTipoFigura() {
        return "Retângulo";
    }

    

    public String getDetalhes() {
        return String.format("ID: %s, Cor: %s, Tipo: %s, Largura: %f, Altura: %f, Área: %s, Perímetro: %s", getId(), getCor(), getTipoFigura(), largura, altura, calcularArea(), calcularPerimetro());
    }


}
