public class Circulo implements AreaCalculable{
    double radio;

    public Circulo() {
    }
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
