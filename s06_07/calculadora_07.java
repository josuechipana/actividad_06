     package s06_07;
     public class calculadora_07 {
     public calculadora_07() {
    }

    public calculadora_07(double num1, double num2) {
        System.out.println("Suma: " + sumar(num1, num2)); //metodos
        System.out.println("Resta: " + restar(num1, num2));
        System.out.println("Multiplicación: " + multiplicar(num1, num2));
        double resultadoDivision = dividir(num1, num2);//atributos
        if (!Double.isNaN(resultadoDivision)) {
            System.out.println("División: " + resultadoDivision);
        }
    }

    // Métodos con sobrecarga
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    public double restar(double num1, double num2) {
        return num1 - num2;
    }

    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; 
        }
    }

}
