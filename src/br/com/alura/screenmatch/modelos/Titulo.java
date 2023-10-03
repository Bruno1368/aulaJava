package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>  {
                    // implementando comparable

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    //modificador de acesso
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    //usado o get para acessar informações de um dado encapsulado, privado, pegar direto pelo método, não pelo atributo, pelo "coração"
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    //método, void pois não retorna nada, apenas exibe
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    //retorna valor, return igual JS, porém tipado com o double no começo
    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        //não preicsa reiventar a roda, se compareto já compara duas strings alfabeticamente, use ela
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}


