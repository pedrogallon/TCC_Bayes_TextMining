import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	static String[] fTrain =  new String[] {};
	static Integer[] aTrain = new Integer[] {};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NaiveBayes b = new NaiveBayes();
		readTrainFile();
		
		b.train(fTrain, aTrain);
		b.showBayes();

		System.out.println(b.getRating("Gostei da comida, é incŕivel. O atendimento é muito bom. 5 estrelas. Comeria de novo e chamaria os amigos."));
//		System.out.println(b.getRating("ok"));
		// Formats funcionando exemplo
		b.showBayes();
//		b.getTokens("Eu não gostei muito do lanche, meio bosta. Ele é muito simples, não me satisfez.");
//		b.getTokens("Gostei bastante do restaurante, os garçons são educados e fui bem atendida");

	}

	private static void readTrainFile() {
		List<String> f = new ArrayList<>();
		List<Integer> a = new ArrayList<>();
		BufferedReader objReader = null;
		try {
			String line;

			objReader = new BufferedReader(new FileReader("src/avaliacoes.txt"));

			while ((line = objReader.readLine()) != null) {
				a.add(Integer.parseInt(line.split(";;")[0]));
				f.add(line.split(";;")[1]);

			}

			fTrain = f.toArray(fTrain);
			aTrain = a.toArray(aTrain);

		} catch (IOException e) {

			fTrain = new String[] {};
			aTrain = new Integer[] {};
			e.printStackTrace();

		} finally {

			try {
				if (objReader != null)
					objReader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		f.toArray();
	}

}
