import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MesoEquivalent {
	
	private static final int START_LINE = 2;

	private MesoStation otherStation;
	
	private int ascStringAverage;
	
	private int secondAverage;
	
	private HashMap<String, Integer> storedAverage = new HashMap<String,Integer>();
	
	private Map<String, Integer> sortedAverage = new TreeMap<String,Integer>();

	private String stId;
	
	private int compareTestAvgBase;
	
	public MesoEquivalent(String stId) {
		this.stId = stId;
		compareTestAvgBase = calAverageSecond(stId);
		
//		secondAverage = calAverageSecond();
	}
	

	public  HashMap<String, Integer> calAsciiEqual() throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new FileReader("Mesonet.txt"));
		
		String foundString;
		int skipLineCounter = 0;
		int startIndex = 0;
		int baseIndex = 1;
		int avgValueString = 0;
		int valueIndex = 0;
		
		String strg;
		
		while(((strg = br.readLine()) != null) ){
			
		skipLineCounter++;

			
			if(skipLineCounter > START_LINE) {
				
				strg.trim();
				strg.replace("","");
				String compareString = strg.substring(0,4);
				
				avgValueString = calCompare(compareString);
				if(avgValueString == compareTestAvgBase) {
					storedAverage.put(compareString, compareTestAvgBase);
					sortedAverage.put(compareString,compareTestAvgBase);
				}
				
			}
			
		}
		br.close();
//		String myString = ("\n{");
		
//		for(int i = 0; i < storedAverage.size(); i++) {
//			myString += storedAverage.keySet() + "=" + storedAverage.get(i) + ", ";
//		}
		
//		myString = ("}");
//		 Iterator it = storedAverage.entrySet().iterator();
//		    while (it.hasNext()) {
//		        Map.Entry pair = (Map.Entry)it.next();
//		        System.out.println(pair.getKey() + " = " + pair.getValue());
//		    }
		return storedAverage;

	}

	// gets base ascii and NRMN avg
	int calAverageSecond(String input) {
		double ascii = 0;
		
		double averageValue = 0;
		
		int twoAverage = 0;
		
		for(int i = 0; i < 4; i++) {
			ascii += input.charAt(i);
			}
		
		averageValue = ascii / 4;
		
		ascStringAverage = (int) Math.round(averageValue);
		
		twoAverage = ascStringAverage / 79;
	
		return twoAverage; 
	}

	// calculates ascii value
	int calCompare(String inputString) {
		double ascii = 0;
		int avgValue = 0;
		double averageValue = 0;
		
		for(int i = 0; i < 4; i++) {
			ascii += inputString.charAt(i);
			}
		
		averageValue = ascii / 4;
		
		avgValue = (int) Math.round(averageValue);
	
		return avgValue; 
	}


	
}
