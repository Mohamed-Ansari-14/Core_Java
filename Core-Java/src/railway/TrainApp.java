package railway;

import java.util.ArrayList;
import java.util.List;

public class TrainApp 
{
	List<String> station = new ArrayList<>();
	double totalCost;
	String res;
	
	public void stationDetails()
	{
		station.add("vandalur");
		station.add("perungulattur");
		station.add("tambaram");
		station.add("sanatorium");
		station.add("chrompet");
		station.add("pallavaram");
		station.add("tirusulam");
		station.add("minambakkam");
		station.add("palavanthangal");
		station.add("st.thomas.mount");
		station.add("guindy");
		station.add("saidapet");
		station.add("mambalam");
		station.add("kodambakkam");
		station.add("nungambakkam");
		station.add("chetpet");
		station.add("egmore");
		station.add("park");
		station.add("fort");
		station.add("beach");
	
	for(String s1:station)
	{
		System.out.println(s1);
	}
	}
	
	public int getIndex(String str)
	{
		return station.indexOf(str);
	}
	
	public double cost(String src, String des)
	{
		return Math.abs((getIndex(des)-getIndex(src)))*5;
	}
	
}

























