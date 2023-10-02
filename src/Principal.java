import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // classe mãe = generalização - OU - super classe
        // classes filhas = especializações - sub classe

        Filme silencioDosInocentes = new Filme();
        silencioDosInocentes.setAnoDeLancamento(1978);
        silencioDosInocentes.setNome("Silêncio dos Inocentes");
        silencioDosInocentes.setDuracaoMinutos(105);
        silencioDosInocentes.setIncluidoNoPlano(true);

        Filme belezaAmericana = new Filme();
        belezaAmericana.setAnoDeLancamento(1996);
        belezaAmericana.setNome("Beleza Americana");
        belezaAmericana.setDuracaoMinutos(90);
        belezaAmericana.setIncluidoNoPlano(true);





        Serie breakingBad = new Serie();

        breakingBad.setNome("Breaking bad");
        breakingBad.setAnoDeLancamento(2008);
        breakingBad.setTemporadas(10);
        breakingBad.setEpisodiosPorTemporada(10);
        breakingBad.setMinutosPorEpisodio(50);
        breakingBad.exibeFichaTecnica();
        //System.out.println("Duração do seriado em minutos: " + breakingBad.getDuracaoMinutos());


        // chamada do método
        //silencioDosInocentes.exibeFichaTecnica();
        silencioDosInocentes.avalia(1);
        silencioDosInocentes.avalia(1);
        silencioDosInocentes.avalia(0);
        //System.out.println("Total de avaliações: " + silencioDosInocentes.getTotalDeAvaliacoes());
        //System.out.println("Média das avaliações: " + silencioDosInocentes.pegaMedia());
        //System.out.println("Nome do filme: " + silencioDosInocentes.getNome());
        //System.out.println("Ano de lançamento: " + silencioDosInocentes.getAnoDeLancamento());
        //System.out.println("Duração do filme: " + silencioDosInocentes.getDuracaoMinutos());
        //System.out.println("O filme está incluido no plano: " + silencioDosInocentes.isIncluidoNoPlano());

        CalculadoraDeTempo calculadora  = new CalculadoraDeTempo();

        calculadora.inclui(silencioDosInocentes);
        calculadora.inclui(belezaAmericana);
        calculadora.inclui(breakingBad);
        System.out.println("Tempo : " + calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();

        Episodio episodio = new Episodio();
                    //serie do tipo Serie, breakingbad já foi instanciado aqui
        episodio.setSerie(breakingBad);
        episodio.setNumero(10);
        episodio.setTotalVisualizacoes(500);

        filtro.filtra(episodio);

        Filme brunoFilme = new Filme();
        brunoFilme.setNome("O poderoso chefão");
        brunoFilme.setAnoDeLancamento(1972);
        brunoFilme.avalia(9);


        //pode ser criado como var, inferência
        var filmeDoVal = new Filme();

        //como declarar uma arraylist
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(brunoFilme);
        listaDeFilmes.add(belezaAmericana);
        listaDeFilmes.add(silencioDosInocentes);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("O primeiro filme da lista é: " + listaDeFilmes.get(0).getNome());
        System.out.println("Lista de filmes: " + listaDeFilmes);
        System.out.println("toString do filme: " + listaDeFilmes.get(0).toString());






    }
}