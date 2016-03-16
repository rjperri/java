package sandbox.codewars_solutions;
import java.lang.Math.*;

/**
 *
 * @author rjperri
 */
public class WindInfo {
    
    public static String message(String rwy, int windDirection, int windSpeed) {
        int headingOffset = 360 - extractHeading(rwy);
        double headWind =  getWindHeadWind(windDirection, windSpeed, headingOffset);
        double crosswind = getWindCrossWind(windDirection, windSpeed, headingOffset);
        
        String hwDirection = (headWind >= 0) ? "Headwind" : "Tailwind"; 
        String cwDirectin = (crosswind >= 0) ? "right" : "left"; 
        
        return hwDirection + " " + (int) Math.abs(headWind)  + " knots. Crosswind " + (int) Math.abs(crosswind) + " knots from your " + cwDirectin + "."; 
    }
    
    protected static int extractHeading(String heading) {
        String intValue = heading.replaceAll("[^0-9]", "");
        return Integer.parseInt(intValue) * 10;
    }
    
    protected static double getWindHeadWind(int windDirection, int windSpeed, int headingOffset) {
        return Math.round(Math.cos(Math.toRadians(windDirection + headingOffset)) * windSpeed);
    }

    protected static double getWindCrossWind(int windDirection, int windSpeed, int headingOffset) {
        return Math.round(Math.sin(Math.toRadians(windDirection + headingOffset)) * windSpeed);
    }
    
  
}
