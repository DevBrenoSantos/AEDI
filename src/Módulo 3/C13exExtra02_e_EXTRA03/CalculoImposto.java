package C13exExtra02_e_EXTRA03;

public class CalculoImposto {
    public static double IRPF(double salario, double dependentes) {
        double var, IRPF=0;
        var = salario - (dependentes * 150);
        if (var <= 1000) {
        }
        if (var > 1000 && var <= 5000) {
            IRPF = var * 0.1;
        }
        if (var > 5000 && var <= 10000) {
            IRPF = var * 0.15;
        }
        if (var > 10000) {
            IRPF = var * 0.2;
        }
        return IRPF;
    }
}
