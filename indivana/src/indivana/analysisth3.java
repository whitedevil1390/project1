package indivana;




import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.Year;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.util.ArrayList;


public class analysisth3 {
    String[] analysisNames;
    String[] seriesName;
    
    ArrayList<TimeSeriesCollection> timeSeriesList;
   
    float cum = (float)0.0;
 

    
    public analysisth3( ArrayList<dataseris> series) {

        
        seriesName = new String[]{"CO2 Emissions (Per Capita)","GDP (Per Capita)","Co2:GDP"};        
        timeSeriesList = new ArrayList<>();    
        StringBuilder stringBuilder = new StringBuilder();
       

        
        for (int i  = 0; i < 2; i++) {
            TimeSeriesCollection timeSeriesCollection = new TimeSeriesCollection();          
            TimeSeries timeseries = new TimeSeries(seriesName[i]);

            if (i == series.size()) {
                int a = 0;
                int b = 0;
                while (a < series.get(0).xDelimitation.size() && b < series.get(1).xDelimitation.size()) {
                    if (series.get(0).xDelimitation.get(a).equals(series.get(1).xDelimitation.get(b))) {
                          double val = series.get(0).getValues().get(a) / series.get(1).getValues().get(b);
                        System.out.print(val+"vvvv");
                        
                        timeseries.add(new Year(series.get(0).xDelimitation.get(a)), val);
                        
                        a++;
                        b++;

                    } else if (series.get(0).xDelimitation.get(a) < series.get(1).xDelimitation.get(b)) {
                        b++;

                    } else {
                        a++;
                    }
                }
            } else {
                cum += series.get(i).cumulativeAverage;
                for (int j = 0; j < series.get(i).getValues().size(); j++) {
                    
                    timeseries.add(new Year(series.get(i).xDelimitation.get(j)), series.get(i).getValues().get(j));
                }
            }
           
            timeSeriesCollection.addSeries(timeseries);
           

           
            timeSeriesList.add(timeSeriesCollection);
           
        }
        
 
     
       




    }
   
}
