package C14ex02;

public class calculos {
    static double resultado;
    static double pi = 3.1416;
    public static double quadrado (double lado) {
        resultado = lado * lado;
        return resultado;
    }
    public static double retangulo (double lado, double altura) {
        resultado = lado * altura;
        return resultado;
    }
    public static double triangulo (double base, double altura) {
        resultado = (base * altura) /2;
        return resultado;
    }
    public static double circulo (double raio) {
        resultado = pi * Math.pow(raio, 2);
        return resultado;
    }
}
