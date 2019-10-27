
public class MesoAsciiCal extends MesoAsciiAbstract 
{
	private int ascStringAverage;
	
	private MesoStation station;
	
	public MesoAsciiCal(MesoStation station) {
		this.station = station;
		
	}
	
	@Override
	int calAverage() {
	//TODO
		double ascii = 0;
		
		int finalValue = 0;
		
		double averageValue = 0;
		
		for(int i = 0; i < 4; i++) {
			ascii += station.getStID().charAt(i);
			}
		
		averageValue = ascii / 4;
		
		ascStringAverage = (int) Math.round(averageValue);
		
		finalValue = (ascStringAverage + 79) / 2 ;
	
		return finalValue; 
	}
   
}