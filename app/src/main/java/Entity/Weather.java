package Entity;

import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dbakti7 on 1
public class Weather {
    private String condition;0/19/2015.
            */
    private double windSpeed;
    private double precipitation;
    private double humidity;
    Weather() {
        condition = null;
        windSpeed = 0;
        precipitation = 0;
        humidity = 0;
    }
    public void setWeather() {
        // from API
    }
    public List getWeatherDetails(){
        List weatherDetails = new ArrayList();
        weatherDetails.add(condition);
        weatherDetails.add(windSpeed);
        weatherDetails.add(precipitation);
        weatherDetails.add(humidity);
        return weatherDetails;
    }
}
