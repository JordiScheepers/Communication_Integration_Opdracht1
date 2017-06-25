package nl.hu.fnt.gsos.wsproducer;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.jws.WebService;

import nl.hu.fnt.gsos.wsinterface.ClimatServiceInterface;
import nl.hu.fnt.gsos.wsinterface.Fault;
import nl.hu.fnt.gsos.wsinterface.ObjectFactory;
import nl.hu.fnt.gsos.wsinterface.RequestClimat;
import nl.hu.fnt.gsos.wsinterface.RequestClimat.Country;
import nl.hu.fnt.gsos.wsinterface.ResponseClimat;
import nl.hu.fnt.gsos.wsinterface.ResponseClimat.Climat;
import nl.hu.fnt.gsos.wsinterface.Inputfault;

@WebService(endpointInterface = "nl.hu.fnt.gsos.wsinterface.ClimatServiceInterface")
public class ClimatServiceImpl implements ClimatServiceInterface {
	private static final Logger LOGGER = Logger.getLogger("ClimatServiceImpl");

	@Override
	public ResponseClimat getClimatInfo(RequestClimat request) throws Inputfault {
		ObjectFactory OF = new ObjectFactory();
		ResponseClimat response = OF.createResponseClimat();
		try {
			ArrayList<Climat> climats = ReadCsv.getClimats();
			Country country = request.getCountry();
			String countryName = country.getNameCountry();
			int month = (int) request.getCountry().getMonth().getNumberMonth();
			int code = request.getCountry().getCodeCountry().length();
			String nameMonth = country.getMonth().getNameMonth();

			for (Climat c : climats) {
				if (c.getCountry().getNameCountry().equals(countryName)
						&& c.getMonth().getNameMonth().equals(nameMonth)) {
					response.setClimat(c);
				}
			}
			if (response.getClimat() == null || code > 3) {
				Fault x = OF.createFault();
				x.setMessage("Geen informatie beschikbaar voor dit land of landcode te veel characters");
				x.setErrorCode((short) 1);
				Inputfault fault = new Inputfault("error", x);
				throw fault;
			}

		} catch (RuntimeException | Inputfault ex) {
			Fault x = OF.createFault();
			x.setMessage(x.getMessage() + " " + ex.toString() + "Er is iets mis met jouw input.");
			x.setErrorCode((short) 1);
			LOGGER.log(Level.SEVERE, ex.toString(), ex);
			Inputfault fault = new Inputfault("error", x);
			throw fault;
		}

		return response;

	}

}

