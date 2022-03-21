package com.company;

public class BaseConverter implements Converter {

    //0 °C + 273,15 = 273,15 K //кельвены
  //(0 °C × 1.8) + 32 = 32 °F //фаренгейты

    @Override
    public double convert(double temperature, char targetTemperature) {
        if (targetTemperature == 'k') {
            return temperature + 273.15;
        }
        if (targetTemperature == 'f') {
            return temperature * 1.8 + 32;
        }
        return 0;
    }

    public BaseConverter() {
    }


}
