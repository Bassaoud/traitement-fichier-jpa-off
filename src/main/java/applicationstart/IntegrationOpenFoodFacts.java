package applicationstart;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class IntegrationOpenFoodFacts {

	public static void main(String[] args) {
		File file = new File("C:/Users/Momo/Desktop/Diginamic/Cours/open-food-facts/open-food-facts.csv");
		// C:\Users\Momo\Desktop\Diginamic\Cours\open-food-facts
		List<String> lignes;
		try {
			lignes = FileUtils.readLines(file, "UTF-8");
			for (String ligne : lignes) {
				String[] decoupage = ligne.split("\\|");
				System.out.println(ligne);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}