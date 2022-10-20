package indivana;

import java.util.ArrayList;

public class dataseris {
	ArrayList<Integer> xDelimitation;
    String seriesIndicator;
    String reportdadta ;
    float cumulativeAverage;
    
    String country;
    ArrayList<Float> values;
   
    public dataseris(String seriesIndicator, ArrayList<Float> values, ArrayList<Integer> xDelimitation, Float cumulativeAverage){
        this.seriesIndicator = seriesIndicator;
        this.values = values;
        this.cumulativeAverage = cumulativeAverage;
        this.xDelimitation = xDelimitation;
    }

    public ArrayList<Float> getValues() {
        return values;
    }

    
    public String getSeriesIndicator() {
        return seriesIndicator;
    }

    public float getCumulativeAverage() {
        return cumulativeAverage;
    }

   
    public String toSeriesString() {
    	


        
        
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
       for(int i = 0; i<values.size(); i++){
    	   reportdadta=values.get(i)+"\t"+xDelimitation.get(i);
    	   System.out.println(values.get(i)+"\t"+xDelimitation.get(i));
       }
      return reportdadta;
    }
    
}
