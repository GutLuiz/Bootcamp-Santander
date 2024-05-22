package Collections.Set.OperacoesBasicas;

public class ConjuntoPalavras {

    // atributos:
    private String palavraUnica;

    public ConjuntoPalavras(String palavraUnica) {
        this.palavraUnica = palavraUnica;
    }

    public String getPalavraUnica() {
        return palavraUnica;
    }

    @Override
    public String toString() {
        return "ConjuntoPalavras{" +
                "palavraUnica='" + palavraUnica + '\'' +
                '}';
    }
}
