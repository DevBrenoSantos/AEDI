package Conteudo15;
public class Aluno {
    private String nome, ra, curso;
    private int anoNasc, periodo, ano=2023;
    /* método constructor */
    public Aluno(String nome, String ra, String curso, int anoNasc, int periodo) {
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
        this.anoNasc = anoNasc;
        this.periodo = periodo;
    }

    /* método para imprimir */
    public void ImprimeAluno() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Registro Acadêmico: "+this.ra);
        System.out.println("Curso: "+this.curso);
        System.out.println("Periodo: "+periodo);
        System.out.println("Idade: "+(ano - anoNasc));
    }

    /* método get */
    public String getNome() {
        return this.nome;
    }
    public String getRa() {
        return this.ra;
    }
    public String getCurso() {
        return this.curso;
    }
    public int getAnoNasc() {
        return this.anoNasc;
    }
    public int getPeriodo() {
        return this.periodo;
    }

    /* método set */
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }


}
