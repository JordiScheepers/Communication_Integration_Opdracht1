package nl.hu.fnt.gsos.wsproducer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import nl.hu.fnt.gsos.wsinterface.ObjectFactory;
import nl.hu.fnt.gsos.wsinterface.ResponseClimat.Climat.Country;
import nl.hu.fnt.gsos.wsinterface.ResponseClimat.Climat.Month;
import nl.hu.fnt.gsos.wsinterface.ResponseClimat.Climat;

public class ReadCsv {
	private static final Logger LOGGER = Logger.getLogger("ClimatServiceImpl");

	public static ArrayList<Climat> getClimats() {
		URL csvFile= ReadCsv.class.getClassLoader().getResource("data.csv");
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ";";
		int countryIndex = 0;
		int monthIndex = 0;
		ObjectFactory OF = new ObjectFactory();
		ArrayList<Climat> climats = new ArrayList<Climat>();
		ArrayList<Country> countries = new ArrayList<Country>();
		String countrienames = "Afganistan Belgium China Duitsland Fillepijnen Griekenland";
		String[] countrySplitted = countrienames.split(" ");
		int index = 0;
		while (index < 6) {
			Country country = OF.createResponseClimatClimatCountry();
			country.setNameCountry(countrySplitted[index]);
			index++;
			countries.add(country);

		}

		try {

			br = new BufferedReader(new FileReader(csvFile.getPath()));

			while ((line = br.readLine()) != null) {
				String[] arrayline = line.split(cvsSplitBy);

				Climat climat = OF.createResponseClimatClimat();
				Month month = OF.createResponseClimatClimatMonth();

				arrayline[0] = arrayline[0].replaceAll("\\s+", "");
				arrayline[1] = arrayline[1].replaceAll("\\s+", "");
				arrayline[2] = arrayline[2].replaceAll("\\s+", "");
				arrayline[3] = arrayline[3].replaceAll("\\s+", "");
				arrayline[4] = arrayline[4].replaceAll("\\s+", "");
				month.setNameMonth(arrayline[0]);
				climat.setMaxTemp(Integer.parseInt(arrayline[1]));
				climat.setMinTemp(Integer.parseInt(arrayline[2]));
				climat.setMeanRainDays(Integer.parseInt(arrayline[3]));
				climat.setMeanSunDays(Integer.parseInt(arrayline[4]));

				if (monthIndex == 12) {
					monthIndex = 0;
					countryIndex++;
					monthIndex++;
				} else {
					monthIndex++;
				}
				climat.setMonth(month);
				climat.setCountry(countries.get(countryIndex));
				climats.add(climat);
			}

		} catch (FileNotFoundException e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					LOGGER.log(Level.SEVERE, e.getMessage(), e);
				}
			}
		}
		return climats;

	}

}
