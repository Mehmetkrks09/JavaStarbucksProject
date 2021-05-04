//package Adaptor;
//
//
//
//import java.rmi.RemoteException;
//import java.time.ZoneId;
//
//import Abstract.CustomerCheckService;
//import Entities.Customer;
//
//
////public class MernisServiceAdaptor implements CustomerCheckService {
//
//	@Override
//	public boolean CheckIfRealPerson(Customer customer) {
//		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
//		boolean result = true;
//		try {
//			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
//					Long.parseLong(customer.getNationalityId()),
//					customer.getFirstName().toUpperCase(),
//					customer.getLastName().toUpperCase(), 
//					customer.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear()
//					);
//		} catch (RemoteException e) {
//		
//			e.printStackTrace();
//		
//		}
//		if(result) {
//			return true;
//		}else {
//			return false;
//		
//		}
//				
//				
//				
//	}
//
//	
//}
