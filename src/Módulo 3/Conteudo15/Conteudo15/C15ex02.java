package Conteudo15;

public class C15ex02 {
    private String nomeInst, endereco;

    public C15ex02(String nomeInst, String endereco) {
        this.nomeInst = nomeInst;
        this.endereco = endereco;
    }

    public void imprimeInstituicao() {
        System.out.println("Instituição: " + nomeInst);
        System.out.println("Endereço: " + endereco);
    }
}
