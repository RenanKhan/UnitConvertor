package eclixtech.com.unitconvertor.Convertor;
import eclixtech.com.unitconvertor.Convertor.ConvertingUnits;

/**
 * Created by rehan on 12/12/2017.
 */

public class Evaluate {
    private ConvertingUnits.Length caLength;
    private ConvertingUnits.Area caArea;
    private ConvertingUnits.Temperature caTemp;
    private ConvertingUnits.Weight caWeight;
    private ConvertingUnits caFuel;

    public double evaluateLength(int item1, int item2, double value)
    {
        caLength = new ConvertingUnits.Length();
        double temp = 0.0;
        if (item1 == item2)
            return value;
        else {
            switch (item1) {
                case 0:
                    temp = caLength.NanoToMeter(value);
                    break;
                case 1:
                    temp = caLength.MilliToMeter(value);
                    break;
                case 2:
                    temp = caLength.CentiToMeter(value);
                    break;
                case 3:
                    temp = value;
                    break;
                case 4:
                    temp = caLength.KiloToMeter(value);
                    break;
                case 5:
                    temp = caLength.InchToMeter(value);
                    break;
                case 6:
                    temp = caLength.FootToMeter(value);
                    break;
                case 7:
                    temp = caLength.YardToMeter(value);
                    break;
                case 8:
                    temp = caLength.MileToMeter(value);
                    break;
            }

            switch (item2) {
                case 0:
                    temp = caLength.MeterToNano(temp);
                    break;
                case 1:
                    temp = caLength.MeterToMilli(temp);
                    break;
                case 2:
                    temp = caLength.MeterToCenti(temp);
                    break;
                case 4:
                    temp = caLength.MeterToKilo(temp);
                    break;
                case 5:
                    temp = caLength.MeterToInch(temp);
                    break;
                case 6:
                    temp = caLength.MeterToFoot(temp);
                    break;
                case 7:
                    temp = caLength.MeterToYard(temp);
                    break;
                case 8:
                    temp = caLength.MeterToMile(temp);
                    break;
            }
            return temp;
        }
    }
    ///////////////////////////////Area \
    public double evaluateArea(int item1, int item2, double value) {
        double temp = 0.0;
        if (item1 == item2)
            return value;
        else {
            switch (item1) {
                case 0:
                    temp = caArea.sqMilliToMeter(value);
                    break;
                case 1:
                    temp = caArea.sqCentiToMeter(value);
                    break;
                case 2:
                    temp = value;
                    break;
                case 3:
                    temp = caArea.sqKiloToMeter(value);
                    break;
                case 4:
                    temp = caArea.AcreToMeter(value);
                    break;
                case 5:
                    temp = caArea.HectareToMeter(value);
                    break;
            }

            switch (item2) {
                case 0:
                    temp = caArea.sqMeterToMilli(temp);
                    break;
                case 1:
                    temp = caArea.sqMeterToCenti(temp);
                    break;
                case 3:
                    temp = caArea.sqMeterToKilo(temp);
                    break;
                case 4:
                    temp = caArea.sqMeterToAcre(temp);
                    break;
                case 5:
                    temp = caArea.sqMeterToHectare(temp);
                    break;
            }
            return temp;
        }
    }
    ///////////////////////////////end Area
    ///////////////////////// Start Tempterature
    public double evaluateTemp(int item1, int item2, double value) {
        caTemp = new ConvertingUnits.Temperature();

        double temp = 0.0;
        if (item1 == item2)
            return value;
        else {
            switch (item1) {
                case 0:
                    temp = caTemp.CelsiTokelvin(value);
                    break;
                case 1:
                    temp = caTemp.FerToKelvin(value);
                    break;
                case 2:
                    temp = value;
                    break;
            }

            switch (item2) {
                case 0:
                    temp = caTemp.KelvinToCelsi(temp);
                    break;
                case 1:
                    temp = caTemp.KelvinToFer(temp);
                    break;
            }
            return temp;
        }
    }
    ////////////////////////End tempterature
    //////////////////////////////Start Weight
    public double evaluateWeight(int item1, int item2, double value) {
        caWeight = new ConvertingUnits.Weight();

        double temp = 0.0;
        if (item1 == item2)
            return value;
        else {
            switch (item1) {
                case 0:
                    temp = caWeight.MilliToKilo(value);
                    break;
                case 1:
                    temp = caWeight.CentiToKilo(value);
                    break;
                case 2:
                    temp = caWeight.DeciToKilo(value);
                    break;
                case 3:
                    temp = caWeight.GramToKilo(value);
                    break;
                case 4:
                    temp = value;
                    break;
                case 5:
                    temp = caWeight.MetricTonnesToKilo(value);
                    break;
                case 6:
                    temp = caWeight.PoundsToKilo(value);
                    break;
                case 7:
                    temp = caWeight.OuncesToKilo(value);
                    break;
            }

            switch (item2) {
                case 0:
                    temp = caWeight.KiloToMilli(temp);
                    break;
                case 1:
                    temp = caWeight.KiloToCenti(temp);
                    break;
                case 2:
                    temp = caWeight.KiloToDeci(temp);
                    break;
                case 3:
                    temp = caWeight.KiloToGram(temp);
                    break;
                case 5:
                    temp = caWeight.KiloToMetricTonnes(temp);
                    break;
                case 6:
                    temp = caWeight.KiloToPounds(temp);
                    break;
                case 7:
                    temp = caWeight.KiloToOunces(temp);
                    break;
            }
            return temp;
        }
    }
    ////////////////////////////End Weight
    ////////////////////////////Start fuel
    public double evaluateFuel(int item1,int item2,double value)
    {
        caFuel = new ConvertingUnits();
        // here itom1 = from
        //here itom2 = to
        double itom1ConversionToBase = 0.0;
        double itom1ConversionFromBase = 0.0 ;
        double itom2ConversionToBase = 0.0;
        double itom2ConversionFromBase = 0.0;
        String symbol = "";
        double temp = 0.0;
        if(item1 == item2)
            return value;
        else
        {
            switch (item1)
            {
                case 0:
                    itom1ConversionToBase = 1.0;
                    itom1ConversionFromBase = 1.0;
                    break;
                case 1:
                    itom1ConversionToBase = 0.83267418460479;
                    itom1ConversionFromBase = 1.2009499255398;
                    break;
                case 2:
                    itom1ConversionToBase = 235.214582;
                    itom1ConversionFromBase = 235.214582;
                    symbol = "L_100K+from";
                    break;
                case 3:
                    itom1ConversionToBase = 2.352145833;
                    itom1ConversionFromBase = 0.42514370749052;
                    break;
                case 4:
                    itom1ConversionToBase = 3.7854118;
                    itom1ConversionFromBase = 0.264172052;
                    break;
            }
            switch (item2)
            {
                case 0:
                    itom2ConversionToBase = 1.0;
                    itom2ConversionFromBase = 1.0;
                    break;
                case 1:
                    itom2ConversionToBase = 0.83267418460479;
                    itom2ConversionFromBase = 1.2009499255398;
                    break;
                case 2:
                    itom2ConversionToBase = 235.214582;
                    itom2ConversionFromBase = 235.214582;
                    symbol = "L_100K+to";
                    break;
                case 3:
                    itom2ConversionToBase = 2.352145833;
                    itom2ConversionFromBase = 0.42514370749052;
                    break;
                case 4:
                    itom2ConversionToBase = 3.7854118;
                    itom2ConversionFromBase = 0.264172052;
                    break;
            }
            temp = caFuel.convertFuelValue(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    //Base Unit - Miles per Gallon US
    /*
       MPG_US, R.string.mpg_us, 1.0, 1.0
       MPG_UK, R.string.mpg_uk, 0.83267418460479, 1.2009499255398
       L_100K, R.string.l_100k, 235.214582, 235.214582)
       KM_L, R.string.km_l, 2.352145833, 0.42514370749052)
       MILES_L, R.string.miles_l, 3.7854118, 0.264172052)
     */
    ///////////////////////////End fuel
}
