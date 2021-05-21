package Adapter;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements GamerCheckService {

	

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(gamer.getNationalityId(), gamer.getFirsName(), gamer.getLastName(),gamer.getDateOfBirth());
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return false;
	}

}

	


