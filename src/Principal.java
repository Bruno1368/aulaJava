import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class Principal {
    public static void main(String[] args) {

        // classe mãe = generalização - OU - super classe
        // classes filhas = especializações - sub classe

        Filme silencioDosInocentes = new Filme();
        silencioDosInocentes.setAnoDeLancamento(1978);
        silencioDosInocentes.setNome("Revolução dos bichos");
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
        silencioDosInocentes.avalia(7.5);
        silencioDosInocentes.avalia(8);
        silencioDosInocentes.avalia(5.6);
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
        System.out.println("Tempo dos filmes: " + calculadora.getTempoTotal());


    }
}