
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NaiveBayes b = new NaiveBayes();
//		System.out.println(b.getRating("ótimo bom ok gostei"));
//		System.out.println(b.getRating("ok"));
//		b.format("ótimo[ { } ] ! @ # $ % $ % & * ( ) - _ = + ' ` ~ ^  bom ok e eu gostei achei diferenciado,\'vou\' (fiq)uei \"algo\" sermão çedilãoé");
		b.format("Eu 	não 	gostei		 muito	 do lanche, meio bosta. Ele é 	muito simples, não me satisfez.");
		b.format("Gostei bastante do restaurante, os garçons são educados e fui bem atendida");
		
	}

}
