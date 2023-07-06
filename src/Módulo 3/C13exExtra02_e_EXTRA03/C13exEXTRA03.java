package C13exExtra02_e_EXTRA03;
public class C13exEXTRA03 {
    private String nome;
    private double salario, dependentes, imposto;
    public C13exEXTRA03 (String nome, double salario, double dependentes) {
        this.nome = nome;
        this.salario = salario;
        this.dependentes = dependentes;
        imposto = CalculoImposto.IRPF(this.salario, this.dependentes);
    }
    /* Método para imprimir */
    public void imprimeFuncionario () {
        System.out.println("Nome: "+this.nome);
        System.out.println("Salário: "+this.salario);
        System.out.println("Dependentes: "+this.dependentes);
        if (imposto != 0) {
        System.out.println("Imposto: "+imposto);
        } else {
            System.out.println("Imposto isento");
        }
    }
    public String getNome() {
        return this.nome;
    }
    public double getSalario() {
        return this.salario;
    }
    public double getDependentes() {
        return this.dependentes;
    }
}
    