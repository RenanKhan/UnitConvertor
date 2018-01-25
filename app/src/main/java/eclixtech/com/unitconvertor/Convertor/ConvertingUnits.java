package eclixtech.com.unitconvertor.Convertor;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Anubhav on 16-03-2016.
 */

//Class to convert from one unit to SI unit
public class ConvertingUnits
{
    //class to convert units of area
   public static class Area{
        public double sqMilliToMeter(double milli)
        {
            return (milli/1000000);
        }

        public double sqMeterToMilli(double meter)
        {
            return (meter*1000000);
        }

        public double sqCentiToMeter(double Centi)
        {
            return (Centi/10000);
        }

        public double sqMeterToCenti(double meter)
        {
            return (meter*10000);
        }

        public double sqKiloToMeter(double Kilo)
        {
            return (Kilo*1000000);
        }

        public double sqMeterToKilo(double meter)
        {
            return (meter/1000000);
        }

        public double AcreToMeter(double acre)
        {
            return (acre*4046.86);
        }

        public double sqMeterToAcre(double meter)
        {
            return (meter/4046.86);
        }

        public double HectareToMeter(double Hectare)
        {
            return (Hectare*10000);
        }

        public double sqMeterToHectare(double meter)
        {
            return (meter/10000);
        }
    }

    //class to convert units of length
 public    static class Length{
        public double MilliToMeter(double milli)
        {
            return (milli/1000);
        }

        public double MeterToMilli(double meter)
        {
            return (meter*1000);
        }

        public double CentiToMeter(double Centi)
        {
            return (Centi/100);
        }

        public double MeterToCenti(double meter)
        {
            return (meter*100);
        }

        public double KiloToMeter(double Kilo)
        {
            return (Kilo*1000);
        }

        public double MeterToKilo(double meter)
        {
            return (meter/1000);
        }

        public double InchToMeter(double Inch)
        {
            return (Inch/39.3701);
        }

        public double MeterToInch(double meter)
        {
            return (meter*39.3701);
        }

        public double FootToMeter(double Foot)
        {
            return (Foot/3.28084);
        }

        public double MeterToFoot(double meter)
        {
            return (meter*3.28084);
        }

        public double YardToMeter(double Yard)
        {
            return (Yard/1.09361);
        }

        public double MeterToYard(double meter)
        {
            return (meter*1.09361);
        }

        public double MileToMeter(double Mile)
        {
            return (Mile/0.000621371);
        }

        public double MeterToMile(double meter)
        {
            return (meter*0.000621371);
        }

        public double NanoToMeter(double milli)
        {
            return (milli/1000000000);
        }

        public double MeterToNano(double meter)
        {
            return (meter*1000000000);
        }
    }

    //class to convert units of temperature
  public   static class Temperature{
        public double FerToKelvin(double fer)
        {
            return ((fer+459.67)*5/9);
        }

        public double KelvinToFer(double kelvin)
        {
            return ((kelvin*9/5)-459.67);
        }

        public double CelsiTokelvin(double Celsi)
        {
            return (Celsi+273.15);
        }

        public double KelvinToCelsi(double Kelvin)
        {
            return (Kelvin-273.15);
        }
    }

    //class to convert units of mass/weight
   public static class Weight
    {
        public double MilliToKilo(double milli)
        {
            return (milli/1000000);
        }

        public double KiloToMilli(double Kilo)
        {
            return (Kilo*1000000);
        }

        public double GramToKilo(double Gram)
        {
            return (Gram/1000);
        }

        public double KiloToGram(double Kilo)
        {
            return (Kilo*1000);
        }

        public double CentiToKilo(double Centi)
        {
            return (Centi/100000);
        }

        public double KiloToCenti(double Kilo)
        {
            return (Kilo*100000);
        }

        public double DeciToKilo(double Deci)
        {
            return (Deci/10000);
        }

        public double KiloToDeci(double Kilo)
        {
            return (Kilo*10000);
        }

        public double MetricTonnesToKilo(double MetricTonnes)
        {
            return (MetricTonnes*1000);
        }

        public double KiloToMetricTonnes(double Kilo)
        {
            return (Kilo/1000);
        }

        public double PoundsToKilo(double Pounds)
        {
            return (Pounds/2.20462);
        }

        public double KiloToPounds(double Kilo)
        {
            return (Kilo*2.20462);
        }

        public double OuncesToKilo(double Ounces)
        {
            return (Ounces/35.274);
        }

        public double KiloToOunces(double Kilo)
        {
            return (Kilo*35.274);
        }
    }



    //// Gernal Convert
    public double convert(double value, double itom1ConversionToBase, double itom1ConversionFromBase,double itom2ConversionToBase, double itom2ConversionFromBase,String fromOrTo) {
        double result = 0;
            // use BigDecimal to eliminate multiplication rounding errors
            BigDecimal multiplier = new BigDecimal(itom1ConversionToBase).multiply(new BigDecimal(itom2ConversionFromBase));
            BigDecimal bdResult = new BigDecimal(value).multiply(multiplier);
            result = bdResult.doubleValue();
       return result;
    }
        //////end Gernal Convert

    //// Force
    public double convertForce(double value,double multiplayer ) {
        double result = 0;
        // use BigDecimal to eliminate multiplication rounding errors
      //  BigDecimal multiplier = new BigDecimal(itom1ConversionToBase).multiply(new BigDecimal(itom2ConversionFromBase));
        BigDecimal bdResult;


             bdResult = new BigDecimal(value).multiply(BigDecimal.valueOf(multiplayer));

        result = bdResult.doubleValue();
        return result;
    }
    //////end Force
    ////////////////////////////Start Fuel
    //  here itom1 = from
    //here itom2 = to
    //double conversionToBase, double conversionFromBase
    public double convertFuelValue(double value, double itom1ConversionToBase, double itom1ConversionFromBase,double itom2ConversionToBase, double itom2ConversionFromBase,String fromOrTo) {
        double result = value;
        if(value != 0) {
            if (fromOrTo == "L_100K+from")   // Litres/100km
            {
                BigDecimal toBase = new BigDecimal(itom1ConversionToBase);
                BigDecimal fromBase = new BigDecimal(itom2ConversionFromBase);
                BigDecimal resultBd = toBase.divide(new BigDecimal(value), RoundingMode.UP).multiply(fromBase);
                result = resultBd.doubleValue();
            } else if (fromOrTo == "L_100K+to")   // Litres/100km
            {
                BigDecimal fromBase = new BigDecimal(itom2ConversionFromBase);
                BigDecimal toBase = new BigDecimal(itom1ConversionToBase);
                BigDecimal resultBd = fromBase.divide(new BigDecimal(value).multiply(toBase), RoundingMode.UP);
                result = resultBd.doubleValue();
            } else {
                BigDecimal multiplier = new BigDecimal(itom1ConversionToBase).multiply(new BigDecimal(itom2ConversionFromBase));
                BigDecimal bdResult = new BigDecimal(value).multiply(multiplier);
                result = bdResult.doubleValue();
            }
        }
        return result;
    }
    /////////////////////////End Fuel
}
