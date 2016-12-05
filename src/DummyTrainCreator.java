import java.util.HashMap;



/* Class purpose:
 * This class is just an interim class. In future this class will be replaced by a database reader which populates all the trains
 */
public class DummyTrainCreator {

//	Train chennaiExpress;
//	Train navjeevanExpress;
//	Train vivekExpress;
//	Train kerelaExpress;
	Train symbi1;
	Train symbi2;
	Train symbi3;
	
	
	void addAllTrains()
	{
//		chennaiExpress = TrainsDummyDB.addChennaiExpress(chennaiExpress);
//		navjeevanExpress = TrainsDummyDB.addNavjeevanExpress(navjeevanExpress);
//		vivekExpress = TrainsDummyDB.addVivekExpress(vivekExpress);
//		kerelaExpress = TrainsDummyDB.addKerelaExpress(kerelaExpress);
//		
		symbi1 = TrainsDummyDB.addSymbiExpress1(symbi1);	
		symbi2 = TrainsDummyDB.addSymbiExpress2(symbi2);
		symbi3 = TrainsDummyDB.addSymbiExpress3(symbi3);
		
	}
	
	

//	public void showAllTrains()
//	{
//		chennaiExpress.showAllStations();
//		navjeevanExpress.showAllStations();
//		vivekExpress.showAllStations();
//		kerelaExpress.showAllStations();
//		
//	}
	
	public HashMap<String, String> getAllUniqueStations()
	{	
		
			HashMap <String, String> hm = Station.getAllUniqueStations(getAllTrains());
			
			return hm;
	}
	
	public Train[] getAllTrains()
	{
		//Train allTrains[] ={chennaiExpress,kerelaExpress,navjeevanExpress,vivekExpress};
		Train allTrains[] ={symbi1,symbi2,symbi3};
		
		return allTrains;
	}

}
