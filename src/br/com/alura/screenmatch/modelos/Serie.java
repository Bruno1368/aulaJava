package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }


    //*override* sobreescrever metodo já existente do modelo mãe/parent titulo do qual eu extendo
    @Override
    public int getDuracaoMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome do seriado: " + getNome());
        System.out.println("Ano de lançamento do seriado: " + getAnoDeLancamento());
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Episódio por temporada: " + episodiosPorTemporada);
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")" ;
    }
}
