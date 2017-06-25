package nl.hu.fnt.gsos.utils;

import java.util.ArrayList;

import nl.hu.fnt.gsos.wsinterface.ResponseClimat.Climat;
import nl.hu.fnt.gsos.wsproducer.ReadCsv;

public class MatchParams {
	public static boolean matchParams(String county, String month) {
		ArrayList<Climat> climats = ReadCsv.getClimats();
		boolean matchingName = false;
		for (Climat c : climats) {
			if (c.getCountry().getNameCountry().equals(county) && c.getMonth().getNameMonth().equals(month)) {
				matchingName = true;

			}
		}
		return matchingName;
	}
}
