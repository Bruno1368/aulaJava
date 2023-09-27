import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class Principal {
    public static void main(String[] args) {

        // classe mãe = generalização - OU - super classe
        // classes filhas = especializações - sub classe

        Filme filme1 = new Filme();
        filme1.setAnoDeLancamento(1978);
        filme1.setNome("Revolução dos bichos");
        filme1.setDuracaoMinutos(105);
        filme1.setIncluidoNoPlano(true);



        Serie breakingBad = new Serie();

        breakingBad.setNome("Breaking bad");
        breakingBad.setAnoDeLancamento(2008);
        breakingBad.setTemporadas(10);
        breakingBad.setEpisodiosPorTemporada(10);
        breakingBad.setMinutosPorEpisodio(50);
        breakingBad.exibeFichaTecnica();
        System.out.println("Duração do seriado em minutos: " + breakingBad.getDuracaoMinutos());


        // chamada do método
        //filme1.exibeFichaTecnica();
        filme1.avalia(7.5);
        filme1.avalia(8);
        filme1.avalia(5.6);
        //System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        //System.out.println("Média das avaliações: " + filme1.pegaMedia());
        //System.out.println("Nome do filme: " + filme1.getNome());
        //System.out.println("Ano de lançamento: " + filme1.getAnoDeLancamento());
        //System.out.println("Duração do filme: " + filme1.getDuracaoMinutos());
        //System.out.println("O filme está incluido no plano: " + filme1.isIncluidoNoPlano());

    }
}