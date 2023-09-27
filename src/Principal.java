import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme filme1 = new Filme();
        filme1.setAnoDeLancamento(1978);
        filme1.setNome("Revolução dos bichos");
        filme1.setDuracaoMinutos(105);
        filme1.setIncluidoNoPlano(true);


        // chamada do método
        filme1.exibeFichaTecnica();
        filme1.avalia(7.5);
        filme1.avalia(8);
        filme1.avalia(5.6);
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + filme1.pegaMedia());
        System.out.println("Nome do filme: " + filme1.getNome());
        System.out.println("Ano de lançamento: " + filme1.getAnoDeLancamento());
        System.out.println("Duração do filme: " + filme1.getDuracaoMinutos());
        System.out.println("O filme está incluido no plano: " + filme1.isIncluidoNoPlano());

    }
}