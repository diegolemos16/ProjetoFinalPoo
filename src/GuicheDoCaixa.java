public class GuicheDoCaixa implements SistemaDoCaixa{
    private int numeroGuiche;
    private boolean guicheAberto;



    public int getNumeroGuiche() {
        return numeroGuiche;
    }

    public void setNumeroGuiche(int numeroGuiche) {
        this.numeroGuiche = numeroGuiche;
    }

    public boolean isGuicheAberto() {
        return guicheAberto;
    }

    public void setGuicheAberto(boolean guicheAberto) {
        this.guicheAberto = guicheAberto;
    }

    @Override
    public boolean abrirCaixa() {
        if (isGuicheAberto() == false) {
            System.out.println("você deve abrir o caixa");
        }else {
            System.out.println("o caixa já está aberto");
        }
        return guicheAberto;
    }

    @Override
    public void registrarPagamento() {

    }

    @Override
    public void registrarSaidaProduto() {

    }


}
