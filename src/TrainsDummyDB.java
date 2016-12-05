
public class TrainsDummyDB {
	static public Train addChennaiExpress(Train train) {
		//Adding chennai express

		train = new Train("Chennai Express", "12163",Constants.ChennaiExpressStations );
		Station stations[] = new Station[Constants.ChennaiExpressStations];
		
		String stationName[]={
				"DADAR",
				"KALYAN JN",
				"LONAVALA",
				"PUNE JN",
				"SOLAPUR JN",
				"GULBARGA",
				"SHAHABAD",
				"WADI",
				"YADGIR",
				"SAIDAPUR",
				"RAICHUR",
				"MANTHRALAYAM RD",
				"ADONI",
				"GUNTAKAL",
				"GOOTY",
				"TADIPATRI",
				"YERRAGUNTLA",
				"CUDDAPAH",
				"RAZAMPETA",
				"KODURU",
				"RENIGUNTA JN",
				"ARAKKONAM",
				"PERAMBUR",
				"CHENNAI EGMORE",
		};
		
		String stationCode[]={
				"DR",      
				"KYN",  
				"LNL",  
				"PUNE",     
				"SUR",  
				"GR",      
				"SDB",  
				"WADI",     
				"YG",      
				"SADP",     
				"RC",      
				"MALM",     
				"AD",      
				"GTL",  
				"GY",      
				"TU",      
				"YA",      
				"HX",      
				"RJP",  
				"KOU",  
				"RU",      
				"AJJ",  
				"PER",  
				"MAS",      		
		};
		
		String arrivalReadable[] ={
				"20:30",
				"21:10",
				"22:48",
				"0:05",
				"3:55",
				"6:08",
				"6:33",
				"7:15",
				"7:50",
				"8:08",
				"8:48",
				"9:23",
				"9:58",
				"11:00",
				"11:40",
				"12:23",
				"13:23",
				"14:08",
				"15:08",
				"15:38",
				"16:45",
				"18:03",
				"18:53",
				"19:45",

		};
		String deparureReadable [] = {
				"20:30",
				"21:15",
				"22:50",
				"0:10",
				"4:05",
				"6:10",
				"6:35",
				"7:20",
				"7:52",
				"8:10",
				"8:50",
				"9:25",
				"10:00",
				"11:15",
				"11:42",
				"12:25",
				"13:25",
				"14:10",
				"15:10",
				"15:40",
				"17:00",
				"18:05",
				"18:55",
				"19:45",
	
		};
		
		int day[] = {
				1	,
				1	,
				1	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,

				
		};
		
		double distance[] = {
				0	,
				45	,
				119	,
				183	,
				447	,
				560	,
				586	,
				596	,
				635	,
				658	,
				704	,
				732	,
				773	,
				825	,
				853	,
				901	,
				969	,
				1008	,
				1059	,
				1092	,
				1133	,
				1205	,
				1268	,
				1279	,
	
		};
		
		int arrivalMinute[] =Utility.readableToMinutes(arrivalReadable);
		int departureMinute[] =Utility.readableToMinutes(deparureReadable);
		
		int i=0;
		for(Station station:stations)
		{	station = new Station();
			station.setStationName(stationName[i]);
			station.setStationCode(stationCode[i]);
			station.setArrival(arrivalMinute[i]);
			station.setDeparture(departureMinute[i]);
			station.setDay(day[i]);
			station.setDistance(distance[i]);
			train.addStation(station);
			
			i++;
		
		}
		return train;
		
	}
	
	
	static public Train addNavjeevanExpress(Train train)
	{
		train = new Train("Navjeevan SF Express", "12656",Constants.NavjeevanExpressStations);
		Station stations[] = new Station[Constants.NavjeevanExpressStations];
		
		String stationName[]={
				"Chennai Central	",
				"Gudur Junction	",
				"Nellore	",
				"Kavali	",
				"Ongole	",
				"Chirala	",
				"Bapatla	",
				"Tenali Junction	",
				"Vijayawada Junction	",
				"Khammam	",
				"Mahbubabad	",
				"Warangal	",
				"Manchiryal	",
				"Sirpur Kaghaznagar	",
				"Balharshah Junction	",
				"Chandrapur Maharashtra	",
				"Warora	",
				"Hinganghat	",
				"Wardha Junction	",
				"Dhamangaon	",
				"Badnera Junction	",
				"Murtizapur Junction	",
				"Akola Junction	",
				"Shegaon	",
				"Nandura	",
				"Malkapur	",
				"Bhusaval Junction	",
				"Jalgaon Junction	",
				"Amalner	",
				"Dondaicha	",
				"Nandurbar	",
				"Vyara	",
				"Udhna Junction	",
				"Surat	",
				"Ankleshwar Junction	",
				"Vadodara Junction	",
				"Anand Junction	",
				"Nadiad Junction	",
				"Maninagar	",
				"Ahmedabad Junction	",

		};
		
		String stationCode[]={
				"MAS",
				"GDR",
				"NLR",
				"KVZ",
				"OGL",
				"CLX",
				"BPP",
				"TEL",
				"BZA",
				"KMT",
				"MABD",
				"WL",
				"MCI",
				"SKZR",
				"BPQ",
				"CD",
				"WRR",
				"HGT",
				"WR",
				"DMN",
				"BD",
				"MZR",
				"AK",
				"SEG",
				"NN",
				"MKU",
				"BSL",
				"JL",
				"AN",
				"DDE",
				"NDB",
				"VYA",
				"UDN",
				"ST",
				"AKV",
				"BRC",
				"ANND",
				"ND",
				"MAN",
				"ADI",
		};
		
		String arrivalReadable[] ={
				"9:35",
				"11:50",
				"12:25",
				"13:01",
				"13:56",
				"14:31",
				"14:44",
				"15:13",
				"16:30",
				"17:54",
				"18:41",
				"20:15",
				"21:29",
				"22:28",
				"0:10",
				"0:36",
				"1:18",
				"1:42",
				"2:31",
				"3:07",
				"4:15",
				"4:48",
				"5:15",
				"5:49",
				"6:09",
				"6:29",
				"7:50",
				"8:40",
				"10:00",
				"10:53",
				"11:35",
				"13:43",
				"14:36",
				"14:52",
				"15:36",
				"16:45",
				"17:20",
				"17:37",
				"18:38",
				"19:00",

		};
		String deparureReadable [] = {
				"9:35",
				"12:00",
				"12:26",
				"13:02",
				"13:57",
				"14:33",
				"14:45",
				"15:14",
				"16:45",
				"17:56",
				"18:42",
				"20:20",
				"21:30",
				"22:30",
				"0:20",
				"0:39",
				"1:20",
				"1:44",
				"2:34",
				"3:09",
				"4:20",
				"4:50",
				"5:20",
				"5:50",
				"6:10",
				"6:30",
				"8:05",
				"8:45",
				"10:02",
				"10:55",
				"11:40",
				"13:44",
				"14:38",
				"15:02",
				"15:38",
				"16:50",
				"17:22",
				"17:39",
				"18:40",
				"19:00",
	
		};
		
		int day[] = {
				1	,
				1	,
				1	,
				1	,
				1	,
				1	,
				1	,
				1	,
				1	,
				1	,
				1	,
				1	,
				1	,
				1	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,


				
		};
		
		double distance[] = {
				0	,
				137.4	,
				175.8	,
				226.6	,
				292.6	,
				342	,
				357	,
				399.6	,
				430.9	,
				531.2	,
				578.7	,
				638.8	,
				753.7	,
				812	,
				881.8	,
				895.5	,
				941.9	,
				981	,
				1014.4	,
				1063.9	,
				1109.4	,
				1151.2	,
				1188.4	,
				1225.5	,
				1250.2	,
				1278.1	,
				1327.9	,
				1352.1	,
				1406.7	,
				1467.6	,
				1502	,
				1601.9	,
				1658.8	,
				1662.8	,
				1712.8	,
				1792.6	,
				1828.4	,
				1846.9	,
				1889.3	,
				1892.4	,

	
		};
		
		int arrivalMinute[] =Utility.readableToMinutes(arrivalReadable);
		int departureMinute[] =Utility.readableToMinutes(deparureReadable);
		
		int i=0;
		for(Station station:stations)
		{	station = new Station();
			station.setStationName(stationName[i]);
			station.setStationCode(stationCode[i]);
			station.setArrival(arrivalMinute[i]);
			station.setDeparture(departureMinute[i]);
			station.setDay(day[i]);
			station.setDistance(distance[i]);
			train.addStation(station);
			i++;
		
		}
		return train;
	}

	
	static public Train addVivekExpress(Train train)
	{
		train = new Train("Dibrugarh - Kanyakumari Vivek Express", "15906",Constants.VivekExpressStations);
		Station stations[] = new Station[Constants.VivekExpressStations];
		
		String stationName[]={
				"Dibrugarh",
				"New Tinsukia Junction",
				"Mariani Junction",
				"Furkating Junction",
				"Dimapur",
				"Diphu",
				"Lumding Junction",
				"Jagi Road",
				"Guwahati",
				"Goalpara Town",
				"New Bongaigaon Junction",
				"Kokrajhar",
				"Alipur Duar Junction",
				"New Jalpaiguri Junction",
				"KishanGanj	",
				"Malda Town",
				"Rampurhat",
				"Durgapur",
				"Asansol Junction",
				"Adra Junction",
				"Bankura Junction",
				"Midnapore",
				"Hijli",
				"Balasore",
				"Bhadrak",
				"Cuttack Junction",
				"Bhubaneswar",
				"Khurda Road Junction",
				"Brahmapur",
				"Palasa",
				"Srikakulam Road",
				"Vizianagaram Junction",
				"Visakhapatnam Junction",
				"Duvvada",
				"Samalkot Junction",
				"Rajahmundry",
				"Eluru",
				"Vijayawada Junction",
				"Ongole",
				"Nellore",
				"Renigunta Junction",
				"Katpadi Junction",
				"Jolarpettai Junction",
				"Salem Junction",
				"Erode Junction",
				"Tiruppur",
				"Coimbatore Main Junction",
				"Palakkad Junction",
				"Thrissur",
				"Aluva",
				"Ernakulam Town (North)",
				"Kottayam",
				"Tiruvalla",
				"Chengannur",
				"Kollam Junction",
				"Trivandrum Central",
				"Nagercoil Junction",
				"Kanniyakumari",


		};
		
		String stationCode[]={
				"DBRG",
				"NTSK",
				"MXN",
				"FKG",
				"DMV",
				"DPU",
				"LMG",
				"JID",
				"GHY",
				"GLPT",
				"NBQ",
				"KOJ",
				"APDJ",
				"NJP",
				"KNE",
				"MLDT",
				"RPH",
				"DGR",
				"ASN",
				"ADRA",
				"BQA",
				"MDN",
				"HIJ",
				"BLS",
				"BHC",
				"CTC",
				"BBS",
				"KUR",
				"BAM",
				"PSA",
				"CHE",
				"VZM",
				"VSKP",
				"DVD",
				"SLO",
				"RJY",
				"EE",
				"BZA",
				"OGL",
				"NLR",
				"RU",
				"KPD",
				"JTJ",
				"SA",
				"ED",
				"TUP",
				"CBE",
				"PGT",
				"TCR",
				"AWY",
				"ERN",
				"KTYM",
				"TRVL",
				"CNGR",
				"QLN",
				"TVC",
				"NCJ",
				"CAPE",
		};
		
		String arrivalReadable[] ={
				"23:45",
				"0:45",
				"3:40",
				"4:43",
				"6:10",
				"6:54",
				"7:50",
				"10:01",
				"11:30",
				"13:33",
				"15:00",
				"15:37",
				"16:45",
				"21:45",
				"23:06",
				"2:00",
				"4:45",
				"7:35",
				"8:55",
				"10:00",
				"10:50",
				"12:00",
				"12:56",
				"14:16",
				"15:12",
				"16:33",
				"17:10",
				"17:40",
				"19:45",
				"22:33",
				"23:28",
				"0:25",
				"1:30",
				"2:17",
				"3:45",
				"4:36",
				"5:59",
				"7:20",
				"9:28",
				"10:34",
				"14:10",
				"16:08",
				"17:50",
				"19:35",
				"20:35",
				"21:23",
				"22:30",
				"0:02",
				"1:10",
				"1:58",
				"2:30",
				"3:35",
				"4:03",
				"4:17",
				"5:20",
				"7:00",
				"9:20",
				"9:50",


		};
		String deparureReadable [] = {
				"23:45"	,
				"0:55"	,
				"3:50"	,
				"4:45"	,
				"6:15"	,
				"6:55"	,
				"7:55"	,
				"10:02"	,
				"11:45"	,
				"13:35"	,
				"15:10"	,
				"15:38"	,
				"16:50"	,
				"22:00"	,
				"23:08"	,
				"2:15"	,
				"4:50"	,
				"8:00"	,
				"9:05"	,
				"10:05"	,
				"10:52"	,
				"12:02"	,
				"12:57"	,
				"14:18"	,
				"15:14"	,
				"16:35"	,
				"17:15"	,
				"17:55"	,
				"19:50"	,
				"22:35"	,
				"23:30"	,
				"0:27"	,
				"1:50"	,
				"2:18"	,
				"3:47"	,
				"4:38"	,
				"6:00"	,
				"7:40"	,
				"9:29"	,
				"10:35"	,
				"14:20"	,
				"16:10"	,
				"17:55"	,
				"19:40"	,
				"20:40"	,
				"21:25"	,
				"22:35"	,
				"0:05"	,
				"1:13"	,
				"2:00"	,
				"2:35"	,
				"3:40"	,
				"4:04"	,
				"4:18"	,
				"5:25"	,
				"7:10"	,
				"9:25"	,
				"9:50"	,
	
		};
		
		int day[] = {
				1	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				4	,
				4	,
				4	,
				4	,
				4	,
				4	,
				4	,
				4	,
				4	,
				4	,
				4	,
				4	,
				4	,
				4	,
				4	,
				4	,
				5	,
				5	,
				5	,
				5	,
				5	,
				5	,
				5	,
				5	,
				5	,
				5	,
				5	,



				
		};
		
		double distance[] = {
				0	,
				42	,
				198.7	,
				236.7	,
				306.9	,
				344.2	,
				376.3	,
				500	,
				557.1	,
				687.7	,
				739.1	,
				767	,
				848.2	,
				1016.7	,
				1104	,
				1252.2	,
				1375.9	,
				1494.2	,
				1536.6	,
				1578.1	,
				1631	,
				1733.5	,
				1750.3	,
				1862.5	,
				1925	,
				2040.7	,
				2068.5	,
				2087.5	,
				2234.6	,
				2308.9	,
				2381.9	,
				2451.4	,
				2512.6	,
				2528.9	,
				2662.2	,
				2712.4	,
				2802.3	,
				2861.7	,
				3000	,
				3116.7	,
				3238.6	,
				3363	,
				3446.9	,
				3567.1	,
				3628.4	,
				3678.7	,
				3729.1	,
				3784.4	,
				3860.3	,
				3914.9	,
				3931.7	,
				3991.7	,
				4017.4	,
				4026.4	,
				4087.5	,
				4152.1	,
				4223.1	,
				4238.7	,


	
		};
		
		int arrivalMinute[] =Utility.readableToMinutes(arrivalReadable);
		int departureMinute[] =Utility.readableToMinutes(deparureReadable);
		
		int i=0;
		for(Station station:stations)
		{	station = new Station();
			station.setStationName(stationName[i]);
			station.setStationCode(stationCode[i]);
			station.setArrival(arrivalMinute[i]);
			station.setDeparture(departureMinute[i]);
			station.setDay(day[i]);
			station.setDistance(distance[i]);
			train.addStation(station);
			i++;
		
		}
		return train;
	}

	
	static public Train addKerelaExpress(Train train)
	{
		train = new Train("Kerala Express", "12626",Constants.KerelaExpressStations);
		Station stations[] = new Station[Constants.KerelaExpressStations];
		
		String stationName[]={
				"New Delhi",
				"Mathura Junction",
				"Agra Cantt.",
				"Gwalior Junction",
				"Jhansi Junction",
				"Bina Junction",
				"Bhopal Junction",
				"Itarsi Junction",
				"Nagpur Junction",
				"Sewagram Junction",
				"Balharshah Junction",
				"Ramagundam",
				"Warangal",
				"Vijayawada Junction",
				"Nellore",
				"Gudur Junction",
				"Renigunta Junction",
				"Tirupati Main",
				"Chittoor",
				"Katpadi Junction",
				"Jolarpettai Junction",
				"Salem Junction",
				"Erode Junction",
				"Tiruppur",
				"Coimbatore Main Junction",
				"Palakkad Junction",
				"Ottappalam",
				"Thrissur",
				"Aluva",
				"Ernakulam Junction (South)",
				"Vaikom Road",
				"Kottayam",
				"Changanassery",
				"Tiruvalla",
				"Chengannur",
				"Mavelikara",
				"Kayamkulam Junction",
				"Kollam Junction",
				"Varkala Sivagiri",
				"Thiruvananthapuram Pettah",
				"Trivandrum Central",


		};
		
		String stationCode[]={
				"NDLS",
				"MTJ",
				"AGC",
				"GWL",
				"JHS",
				"BINA",
				"BPL",
				"ET",
				"NGP",
				"SEGM",
				"BPQ",
				"RDM",
				"WL",
				"BZA",
				"NLR",
				"GDR",
				"RU",
				"TPTY",
				"CTO",
				"KPD",
				"JTJ",
				"SA",
				"ED",
				"TUP",
				"CBE",
				"PGT",
				"OTP",
				"TCR",
				"AWY",
				"ERS",
				"VARD",
				"KTYM",
				"CGY",
				"TRVL",
				"CNGR",
				"MVLK",
				"KYJ",
				"QLN",
				"VAK",
				"TVP",
				"TVC",

		};
		
		String arrivalReadable[] ={
				"11:25",
				"13:17",
				"14:30",
				"16:05",
				"17:23",
				"19:35",
				"21:40",
				"23:50",
				"4:00",
				"5:11",
				"7:37",
				"9:30",
				"11:02",
				"14:45",
				"18:08",
				"19:14",
				"20:30",
				"20:52",
				"21:58",
				"23:20",
				"0:33",
				"2:10",
				"3:20",
				"4:08",
				"5:10",
				"6:30",
				"6:58",
				"7:40",
				"8:43",
				"9:40",
				"10:28",
				"11:10",
				"11:33",
				"11:43",
				"11:53",
				"12:07",
				"12:17",
				"13:05",
				"13:30",
				"14:02",
				"14:35",


		};
		String deparureReadable [] = {
				"11:25"	,
				"13:20"	,
				"14:35"	,
				"16:10"	,
				"17:35"	,
				"19:40"	,
				"21:45"	,
				"23:55"	,
				"4:10"	,
				"5:13"	,
				"7:47"	,
				"9:32"	,
				"11:07"	,
				"15:00"	,
				"18:10"	,
				"19:20"	,
				"20:40"	,
				"20:54"	,
				"22:00"	,
				"23:22"	,
				"0:35"	,
				"2:15"	,
				"3:25"	,
				"4:10"	,
				"5:15"	,
				"6:35"	,
				"7:00"	,
				"7:43"	,
				"8:45"	,
				"9:50"	,
				"10:30"	,
				"11:15"	,
				"11:35"	,
				"11:45"	,
				"11:55"	,
				"12:09"	,
				"12:19"	,
				"13:10"	,
				"13:32"	,
				"14:04"	,
				"14:35"	,

	
		};
		
		int day[] = {
				1	,
				1	,
				1	,
				1	,
				1	,
				1	,
				1	,
				1	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				2	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,
				3	,




				
		};
		
		double distance[] = {
				0	,
				141.3	,
				195	,
				313	,
				410.8	,
				564	,
				702.5	,
				794.3	,
				1091.5	,
				1167.7	,
				1300	,
				1441.8	,
				1543	,
				1750.9	,
				2006	,
				2044.4	,
				2127.8	,
				2137.7	,
				2209.6	,
				2242.7	,
				2326.5	,
				2446.7	,
				2508.1	,
				2558.3	,
				2608.8	,
				2664.1	,
				2695.9	,
				2739.9	,
				2794.5	,
				2813.9	,
				2848.8	,
				2873.8	,
				2891.6	,
				2899.5	,
				2908.6	,
				2921.1	,
				2928.8	,
				2969.6	,
				2993.2	,
				3031.8	,
				3034.2	,



	
		};
		
		int arrivalMinute[] =Utility.readableToMinutes(arrivalReadable);
		int departureMinute[] =Utility.readableToMinutes(deparureReadable);
		
		int i=0;
		for(Station station:stations)
		{	station = new Station();
			station.setStationName(stationName[i]);
			station.setStationCode(stationCode[i]);
			station.setArrival(arrivalMinute[i]);
			station.setDeparture(departureMinute[i]);
			station.setDay(day[i]);
			station.setDistance(distance[i]);
			train.addStation(station);
			i++;
		
		}
		return train;
	}

	
	static public Train addSymbiExpress1(Train train)
	{
		train = new Train("Symbi 1 Express", "11126",Constants.Symbi1);
		Station stations[] = new Station[Constants.Symbi1];
		
		String stationName[]={
				"Mumbai",
				"Lonavala",
				"Pune",
				"Solapur"
		};
		
		String stationCode[]={
				"CST",
				"LON",
				"PUNE",
				"SOL"
		};
		
		String arrivalReadable[] ={
				"11:25",
				"13:17",
				"14:30",
				"16:05"
		};
		String deparureReadable [] = {
				"11:25"	,
				"13:20"	,
				"14:35"	,
				"16:10"	
				};
		
		int day[] = {
				1	,
				1	,
				1	,
				1					
		};
		
		double distance[] = {
				0	,
				141.3	,
				195	,
				313	
									
		};
		
		int arrivalMinute[] =Utility.readableToMinutes(arrivalReadable);
		int departureMinute[] =Utility.readableToMinutes(deparureReadable);
		
		int i=0;
		for(Station station:stations)
		{	station = new Station();
			station.setStationName(stationName[i]);
			station.setStationCode(stationCode[i]);
			station.setArrival(arrivalMinute[i]);
			station.setDeparture(departureMinute[i]);
			station.setDay(day[i]);
			station.setDistance(distance[i]);
			train.addStation(station);
			i++;
		
		}
		return train;
	}
	
	static public Train addSymbiExpress2(Train train)
	{
		train = new Train("Symbi Express 2", "12126",Constants.Symbi2);
		Station stations[] = new Station[Constants.Symbi2];
		
		String stationName[]={
				"Ahmedabad",
				"Surat",
				"Pune",
				"Chennai"
		};
		
		String stationCode[]={
				"AMD",
				"ST",
				"PUNE",
				"MAS"
		};
		
		String arrivalReadable[] ={
				"11:25",
				"13:17",
				"14:30",
				"16:05"
		};
		String deparureReadable [] = {
				"11:25"	,
				"13:20"	,
				"14:35"	,
				"16:10"	
				};
		
		int day[] = {
				1	,
				1	,
				1	,
				1					
		};
		
		double distance[] = {
				0	,
				141.3	,
				195	,
				313	
									
		};
		
		int arrivalMinute[] =Utility.readableToMinutes(arrivalReadable);
		int departureMinute[] =Utility.readableToMinutes(deparureReadable);
		
		int i=0;
		for(Station station:stations)
		{	station = new Station();
			station.setStationName(stationName[i]);
			station.setStationCode(stationCode[i]);
			station.setArrival(arrivalMinute[i]);
			station.setDeparture(departureMinute[i]);
			station.setDay(day[i]);
			station.setDistance(distance[i]);
			train.addStation(station);
			i++;
		
		}
		return train;
	}
	static public Train addSymbiExpress3(Train train)
	{
		train = new Train("Symbi 3 Express", "14426",Constants.Symbi3);
		Station stations[] = new Station[Constants.Symbi3];
		
		String stationName[]={
				"Goa",
				"Mumbai",
				"New Delhi",
				"Kolkata"
		};
		
		String stationCode[]={
				"GOA",
				"CST",
				"NYDL",
				"KOL"
		};
		
		String arrivalReadable[] ={
				"11:25",
				"13:17",
				"14:30",
				"16:05"
		};
		String deparureReadable [] = {
				"11:25"	,
				"13:20"	,
				"14:35"	,
				"16:10"	
				};
		
		int day[] = {
				1	,
				1	,
				1	,
				1					
		};
		
		double distance[] = {
				0	,
				141.3	,
				195	,
				313	
									
		};
		
		int arrivalMinute[] =Utility.readableToMinutes(arrivalReadable);
		int departureMinute[] =Utility.readableToMinutes(deparureReadable);
		
		int i=0;
		for(Station station:stations)
		{	station = new Station();
			station.setStationName(stationName[i]);
			station.setStationCode(stationCode[i]);
			station.setArrival(arrivalMinute[i]);
			station.setDeparture(departureMinute[i]);
			station.setDay(day[i]);
			station.setDistance(distance[i]);
			train.addStation(station);
			i++;
		
		}
		return train;
	}
}
