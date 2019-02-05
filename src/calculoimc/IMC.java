package calculoimc;

public class IMC {

    double res;

    public double calcular(double peso, double altura) {
        this.res = peso / (altura * altura);
        return this.res;
    }

    public String situacao(String situacao) {
        if (this.res <= 17) {
            return "Muito abaixo do peso";
        } else if ((this.res > 17) && (this.res <= 18.49)) {
            return "Abaixo do peso";
        } else if ((this.res > 18.49) && (this.res <= 24.99)) {
            return "Peso normal";
        } else if ((this.res > 24.99) && (this.res <= 29.99)) {
            return "Acima do peso";
        } else {
            return "Obeso";
        }
    }

}
