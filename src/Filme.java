public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoMinutos;
    //método, void pois não retorna nada, apenas exibe
    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
        //retorna valor, return igual JS, porém tipado com o double no começo
    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}


