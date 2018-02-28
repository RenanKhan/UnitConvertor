package eclixtech.com.unitconvertor.Convertor;

import java.math.BigDecimal;

/**
 * Created by rehan on 12/12/2017.
 */

public class Evaluate {
    private ConvertingUnits.Length caLength;
    private ConvertingUnits.Area caArea;
    private ConvertingUnits.Temperature caTemp;
    private ConvertingUnits.Weight caWeight;
    private ConvertingUnits calculate;

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
        caArea = new ConvertingUnits.Area();
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

    /////DigiTle Storage
    public double evaluateDigitalStorage(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
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
                    itom1ConversionToBase = 0.00000011920928955078;
                    itom1ConversionFromBase = 8388608.0;
                    break;
                case 1:
                    itom1ConversionToBase = 0.00000095367431640625;
                    itom1ConversionFromBase = 1048576.0;
                    break;
                case 2:
                    itom1ConversionToBase = 0.0001220703125;
                    itom1ConversionFromBase = 8192.0;
                   // symbol = "L_100K+from";
                    break;
                case 3:
                    itom1ConversionToBase =  0.0009765625;
                    itom1ConversionFromBase = 1024.0;
                    break;
                case 4:
                    itom1ConversionToBase = 0.125;
                    itom1ConversionFromBase = 8.0;
                    break;
                //
                case 5:
                    itom1ConversionToBase = 1.0;
                    itom1ConversionFromBase = 1.0;
                    break;
                case 6:
                    itom1ConversionToBase =  128.0;
                    itom1ConversionFromBase = 0.0078125;
                    // symbol = "L_100K+from";
                    break;
                case 7:
                    itom1ConversionToBase =  1024.0;
                    itom1ConversionFromBase = 0.0009765625;
                    break;
                case 8:
                    itom1ConversionToBase = 131072.0;
                    itom1ConversionFromBase = 0.00000762939453125;
                    break;
                case 9:
                    itom1ConversionToBase =  1048576.0;
                    itom1ConversionFromBase = 0.00000095367431640625;
                    break;
            }
            switch (item2)
            {
                case 0:
                    itom2ConversionToBase = 0.00000011920928955078;
                    itom2ConversionFromBase = 8388608.0;
                    break;
                case 1:
                    itom2ConversionToBase = 0.00000095367431640625;
                    itom2ConversionFromBase = 1048576.0;
                    break;
                case 2:
                    itom2ConversionToBase = 0.0001220703125;
                    itom2ConversionFromBase = 8192.0;
                    // symbol = "L_100K+from";
                    break;
                case 3:
                    itom2ConversionToBase =  0.0009765625;
                    itom2ConversionFromBase = 1024.0;
                    break;
                case 4:
                    itom2ConversionToBase = 0.125;
                    itom2ConversionFromBase = 8.0;
                    break;
                //
                case 5:
                    itom2ConversionToBase = 1.0;
                    itom2ConversionFromBase = 1.0;
                    break;
                case 6:
                    itom2ConversionToBase =  128.0;
                    itom2ConversionFromBase = 0.0078125;
                    // symbol = "L_100K+from";
                    break;
                case 7:
                    itom2ConversionToBase =  1024.0;
                    itom2ConversionFromBase = 0.0009765625;
                    break;
                case 8:
                    itom2ConversionToBase = 131072.0;
                    itom2ConversionFromBase = 0.00000762939453125;
                    break;
                case 9:
                    itom2ConversionToBase =  1048576.0;
                    itom2ConversionFromBase = 0.00000095367431640625;
                    break;
            }
            temp = calculate.convert(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    /////////////////end digital


    ////////////////////////////Start fuel
    public double evaluateFuel(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
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
            temp = calculate.convertFuelValue(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    ///////////////////////////End fuel

    /////Volume
    public double evaluateVolume(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
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
                    itom1ConversionToBase = 0.0000049289215938;
                    itom1ConversionFromBase = 202884.136211058;
                    break;
                case 1:
                    itom1ConversionToBase = 0.0000147867647812;
                    itom1ConversionFromBase = 67628.045403686;
                    break;
                case 2:
                    itom1ConversionToBase = 0.0002365882365;
                    itom1ConversionFromBase = 4226.7528377304;
                    // symbol = "L_100K+from";
                    break;
                case 3:
                    itom1ConversionToBase =  0.0000295735295625;
                    itom1ConversionFromBase = 33814.0227018429972;
                    break;
                case 4:
                    itom1ConversionToBase = 0.0000284130625;
                    itom1ConversionFromBase = 35195.07972785404600437;
                    break;
                //
                case 5:
                    itom1ConversionToBase = 0.000473176473;
                    itom1ConversionFromBase =  2113.37641886518732;
                    break;
                case 6:
                    itom1ConversionToBase =  0.00056826125;
                    itom1ConversionFromBase = 1759.753986392702300218;
                    // symbol = "L_100K+from";
                    break;
                case 7:
                    itom1ConversionToBase =  0.000946352946;
                    itom1ConversionFromBase = 1056.68820943259366;
                    break;
                case 8:
                    itom1ConversionToBase = 0.0011365225;
                    itom1ConversionFromBase = 879.8769931963511501092;
                    break;
                case 9:
                    itom1ConversionToBase =  0.003785411784;
                    itom1ConversionFromBase = 264.172052358148415;
                    break;
                case 10:
                    itom1ConversionToBase =   0.00454609;
                    itom1ConversionFromBase = 219.9692482990877875273;
                    break;
                case 11:
                    itom1ConversionToBase = 0.119240471196;
                    itom1ConversionFromBase = 8.38641436057614017079;
                    break;
                //
                case 12:
                    itom1ConversionToBase = 0.16365924;
                    itom1ConversionFromBase =  6.11025689719688298687;
                    break;
                case 13:
                    itom1ConversionToBase =  0.000001;
                    itom1ConversionFromBase = 1000000.0;
                    // symbol = "L_100K+from";
                    break;
                case 14:
                    itom1ConversionToBase =   0.001;
                    itom1ConversionFromBase = 1000.0;
                    break;
                case 15:
                    itom1ConversionToBase = 0.000001;
                    itom1ConversionFromBase = 1000000.0;
                    break;
                case 16:
                    itom1ConversionToBase =  1.0;
                    itom1ConversionFromBase = 1.0;
                    break;
                case 17:
                    itom1ConversionToBase =  0.000016387064;
                    itom1ConversionFromBase = 61023.744094732284;
                    // symbol = "L_100K+from";
                    break;
                case 18:
                    itom1ConversionToBase =  0.028316846592;
                    itom1ConversionFromBase = 35.3146667214885903;
                    break;
                case 19:
                    itom1ConversionToBase = 0.7645548692741148;
                    itom1ConversionFromBase =  1.3079506;
                    break;
            }
            switch (item2)
            {
                case 0:
                    itom2ConversionToBase = 0.0000049289215938;
                    itom2ConversionFromBase = 202884.136211058;
                    break;
                case 1:
                    itom2ConversionToBase = 0.0000147867647812;
                    itom2ConversionFromBase = 67628.045403686;
                    break;
                case 2:
                    itom2ConversionToBase = 0.0002365882365;
                    itom2ConversionFromBase = 4226.7528377304;
                    // symbol = "L_100K+from";
                    break;
                case 3:
                    itom2ConversionToBase =  0.0000295735295625;
                    itom2ConversionFromBase = 33814.0227018429972;
                    break;
                case 4:
                    itom2ConversionToBase = 0.0000284130625;
                    itom2ConversionFromBase = 35195.07972785404600437;
                    break;
                //
                case 5:
                    itom2ConversionToBase = 0.000473176473;
                    itom2ConversionFromBase =  2113.37641886518732;
                    break;
                case 6:
                    itom2ConversionToBase =  0.00056826125;
                    itom2ConversionFromBase = 1759.753986392702300218;
                    // symbol = "L_100K+from";
                    break;
                case 7:
                    itom2ConversionToBase =  0.000946352946;
                    itom2ConversionFromBase = 1056.68820943259366;
                    break;
                case 8:
                    itom2ConversionToBase = 0.0011365225;
                    itom2ConversionFromBase = 879.8769931963511501092;
                    break;
                case 9:
                    itom2ConversionToBase =  0.003785411784;
                    itom2ConversionFromBase = 264.172052358148415;
                    break;
                case 10:
                    itom2ConversionToBase =   0.00454609;
                    itom2ConversionFromBase = 219.9692482990877875273;
                    break;
                case 11:
                    itom2ConversionToBase = 0.119240471196;
                    itom2ConversionFromBase = 8.38641436057614017079;
                    break;
                //
                case 12:
                    itom2ConversionToBase = 0.16365924;
                    itom2ConversionFromBase =  6.11025689719688298687;
                    break;
                case 13:
                    itom2ConversionToBase =  0.000001;
                    itom2ConversionFromBase = 1000000.0;
                    // symbol = "L_100K+from";
                    break;
                case 14:
                    itom2ConversionToBase =   0.001;
                    itom2ConversionFromBase = 1000.0;
                    break;
                case 15:
                    itom2ConversionToBase = 0.000001;
                    itom2ConversionFromBase = 1000000.0;
                    break;
                case 16:
                    itom2ConversionToBase =  1.0;
                    itom2ConversionFromBase = 1.0;
                    break;
                case 17:
                    itom2ConversionToBase =  0.000016387064;
                    itom2ConversionFromBase = 61023.744094732284;
                    // symbol = "L_100K+from";
                    break;
                case 18:
                    itom2ConversionToBase =  0.028316846592;
                    itom2ConversionFromBase = 35.3146667214885903;
                    break;
                case 19:
                    itom2ConversionToBase = 0.7645548692741148;
                    itom2ConversionFromBase =  1.3079506;
                    break;
            }
            temp = calculate.convert(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    /////////////////end Volume

    ////////////////////////////Start Time
    public double evaluateTime(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
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
                    itom1ConversionToBase = 31536000.0;
                    itom1ConversionFromBase = 0.0000000317097919837645865;
                    break;
                case 1:
                    itom1ConversionToBase = 2628000.0;
                    itom1ConversionFromBase =0.0000003805175;
                    break;
                case 2:
                    itom1ConversionToBase = 604800.0;
                    itom1ConversionFromBase = 0.00000165343915343915344;
                    //symbol = "L_100K+from";
                    break;
                case 3:
                    itom1ConversionToBase = 86400.0;
                    itom1ConversionFromBase = 0.0000115740740740740741;
                    break;
                case 4:
                    itom1ConversionToBase = 3600.0;
                    itom1ConversionFromBase = 0.000277777777777777778;
                    break;
                case 5:
                    itom1ConversionToBase = 60.0;
                    itom1ConversionFromBase = 0.0166666666666666667;
                    break;
                case 6:
                    itom1ConversionToBase = 1.0;
                    itom1ConversionFromBase = 1.0;
                    break;
                case 7:
                    itom1ConversionToBase = 0.001;
                    itom1ConversionFromBase = 1000.0;
                    break;
                case 8:
                    itom1ConversionToBase =  0.000000001;
                    itom1ConversionFromBase = 1000000000.0;
                    break;
            }
            switch (item2)
            {
                case 0:
                    itom2ConversionToBase = 31536000.0;
                    itom2ConversionFromBase = 0.0000000317097919837645865;
                    break;
                case 1:
                    itom2ConversionToBase = 2628000.0;
                    itom2ConversionFromBase =0.0000003805175;
                    break;
                case 2:
                    itom2ConversionToBase = 604800.0;
                    itom2ConversionFromBase = 0.00000165343915343915344;
                    //symbol = "L_100K+from";
                    break;
                case 3:
                    itom2ConversionToBase = 86400.0;
                    itom2ConversionFromBase = 0.0000115740740740740741;
                    break;
                case 4:
                    itom2ConversionToBase = 3600.0;
                    itom2ConversionFromBase = 0.000277777777777777778;
                    break;
                case 5:
                    itom2ConversionToBase = 60.0;
                    itom2ConversionFromBase = 0.0166666666666666667;
                    break;
                case 6:
                    itom2ConversionToBase = 1.0;
                    itom2ConversionFromBase = 1.0;
                    break;
                case 7:
                    itom2ConversionToBase = 0.001;
                    itom2ConversionFromBase = 1000.0;
                    break;
                case 8:
                    itom2ConversionToBase =  0.000000001;
                    itom2ConversionFromBase = 1000000000.0;
                    break;
            }
            temp = calculate.convert(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    ///////////////////////////End Time



    ////////////////////////////Start Speed
    public double evaluateSpeed(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
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
                    itom1ConversionToBase =  0.27777777777778;
                    itom1ConversionFromBase = 3.6;
                    break;
                case 1:
                    itom1ConversionToBase = 0.44704;
                    itom1ConversionFromBase = 2.2369362920544;
                    break;
                case 2:
                    itom1ConversionToBase =  1.0;
                    itom1ConversionFromBase =  1.0;
                    //symbol = "L_100K+from";
                    break;
                case 3:
                    itom1ConversionToBase = 0.3048;
                    itom1ConversionFromBase = 3.2808398950131;
                    break;
                case 4:
                    itom1ConversionToBase = 0.51444444444444;
                    itom1ConversionFromBase = 1.9438444924406;
                    break;

            }
            switch (item2)
            {
                case 0:
                    itom2ConversionToBase =  0.27777777777778;
                    itom2ConversionFromBase = 3.6;
                    break;
                case 1:
                    itom2ConversionToBase = 0.44704;
                    itom2ConversionFromBase = 2.2369362920544;
                    break;
                case 2:
                    itom2ConversionToBase =  1.0;
                    itom2ConversionFromBase =  1.0;
                    //symbol = "L_100K+from";
                    break;
                case 3:
                    itom2ConversionToBase = 0.3048;
                    itom2ConversionFromBase = 3.2808398950131;
                    break;
                case 4:
                    itom2ConversionToBase = 0.51444444444444;
                    itom2ConversionFromBase = 1.9438444924406;
                    break;

            }
            temp = calculate.convert(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    ///////////////////////////End Speed


    ////////////////////////////Start Pressure
    public double evaluatePressure(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
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
                    itom1ConversionToBase = 1000000.0;
                    itom1ConversionFromBase =  0.000001;
                    break;
                case 1:
                    itom1ConversionToBase = 1000.0;
                    itom1ConversionFromBase =0.001;
                    break;
                case 2:
                    itom1ConversionToBase =  1.0;
                    itom1ConversionFromBase =  1.0;
                    //symbol = "L_100K+from";
                    break;
                case 3:
                    itom1ConversionToBase = 100000.0;
                    itom1ConversionFromBase =  0.00001;
                    break;
                case 4:
                    itom1ConversionToBase = 6894.757293168361;
                    itom1ConversionFromBase = 0.000145037737730209222;
                    break;
                case 5:
                    itom1ConversionToBase =  47.880258980335840277777777778;
                    itom1ConversionFromBase = 0.020885434233150127968;
                    //symbol = "L_100K+from";
                    break;
                case 6:
                    itom1ConversionToBase =  101325.0;
                    itom1ConversionFromBase = 0.0000098692326671601283;
                    break;
                case 7:
                    itom1ConversionToBase =  98066.5;
                    itom1ConversionFromBase =  0.0000101971621297792824257;
                    break;
                case 8:
                    itom1ConversionToBase = 133.322387415;
                    itom1ConversionFromBase = 0.007500615758456563339513;
                    //symbol = "L_100K+from";
                    break;
                case 9:
                    itom1ConversionToBase =   133.3223684210526315789;
                    itom1ConversionFromBase =  0.00750061682704169751;
                    break;
            }
            switch (item2)
            {
                case 0:
                    itom2ConversionToBase = 1000000.0;
                    itom2ConversionFromBase =  0.000001;
                    break;
                case 1:
                    itom2ConversionToBase = 1000.0;
                    itom2ConversionFromBase =0.001;
                    break;
                case 2:
                    itom2ConversionToBase =  1.0;
                    itom2ConversionFromBase =  1.0;
                    //symbol = "L_100K+from";
                    break;
                case 3:
                    itom2ConversionToBase = 100000.0;
                    itom2ConversionFromBase =  0.00001;
                    break;
                case 4:
                    itom2ConversionToBase = 6894.757293168361;
                    itom2ConversionFromBase = 0.000145037737730209222;
                    break;
                case 5:
                    itom2ConversionToBase =  47.880258980335840277777777778;
                    itom2ConversionFromBase = 0.020885434233150127968;
                    //symbol = "L_100K+from";
                    break;
                case 6:
                    itom2ConversionToBase =  101325.0;
                    itom2ConversionFromBase = 0.0000098692326671601283;
                    break;
                case 7:
                    itom2ConversionToBase =  98066.5;
                    itom2ConversionFromBase =  0.0000101971621297792824257;
                    break;
                case 8:
                    itom2ConversionToBase = 133.322387415;
                    itom2ConversionFromBase = 0.007500615758456563339513;
                    //symbol = "L_100K+from";
                    break;
                case 9:
                    itom2ConversionToBase =   133.3223684210526315789;
                    itom2ConversionFromBase =  0.00750061682704169751;
                    break;

            }
            temp = calculate.convert(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    ///////////////////////////End Pressure

    ////////////////////////////Start Power
    public double evaluatePower(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
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
                    itom1ConversionToBase = 1000.0;
                    itom1ConversionFromBase = 0.001;
                    break;
                case 2:
                    itom1ConversionToBase = 1000000.0;
                    itom1ConversionFromBase =  0.000001;
                    //symbol = "L_100K+from";
                    break;
                case 3:
                    itom1ConversionToBase = 735.49875;
                    itom1ConversionFromBase = 0.00135962161730390432;
                    break;
                case 4:
                    itom1ConversionToBase = 745.69987158227022;
                    itom1ConversionFromBase = 0.00134102208959502793;
                    break;
                case 5:
                    itom1ConversionToBase =  1.3558179483314004;
                    itom1ConversionFromBase = 0.737562149277265364;
                    //symbol = "L_100K+from";
                    break;
                case 6:
                    itom1ConversionToBase = 4.1868;
                    itom1ConversionFromBase = 0.23884589662749594;
                    break;
                case 7:
                    itom1ConversionToBase =  1055.05585262;
                    itom1ConversionFromBase = 0.0009478171203133172;
                    break;
                case 8:
                    itom1ConversionToBase = 1000.0;
                    itom1ConversionFromBase = 0.001;
                    //symbol = "L_100K+from";
                    break;
            }
            switch (item2)
            {
                case 0:
                    itom2ConversionToBase = 1.0;
                    itom2ConversionFromBase = 1.0;
                    break;
                case 1:
                    itom2ConversionToBase = 1000.0;
                    itom2ConversionFromBase = 0.001;
                    break;
                case 2:
                    itom2ConversionToBase = 1000000.0;
                    itom2ConversionFromBase =  0.000001;
                    //symbol = "L_100K+from";
                    break;
                case 3:
                    itom2ConversionToBase = 735.49875;
                    itom2ConversionFromBase = 0.00135962161730390432;
                    break;
                case 4:
                    itom2ConversionToBase = 745.69987158227022;
                    itom2ConversionFromBase = 0.00134102208959502793;
                    break;
                case 5:
                    itom2ConversionToBase =  1.3558179483314004;
                    itom2ConversionFromBase = 0.737562149277265364;
                    //symbol = "L_100K+from";
                    break;
                case 6:
                    itom2ConversionToBase = 4.1868;
                    itom2ConversionFromBase = 0.23884589662749594;
                    break;
                case 7:
                    itom2ConversionToBase =  1055.05585262;
                    itom2ConversionFromBase = 0.0009478171203133172;
                    break;
                case 8:
                    itom2ConversionToBase = 1000.0;
                    itom2ConversionFromBase = 0.001;
                    //symbol = "L_100K+from";
                    break;
            }
            temp = calculate.convert(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    ///////////////////////////End Power

    /////Energy
    public double evaluateEnergy(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
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
                    itom1ConversionToBase =  1000.0;
                    itom1ConversionFromBase = 0.001;
                    break;
                case 2:
                    itom1ConversionToBase = 4.184;
                    itom1ConversionFromBase = 0.2390057361376673040153;
                    // symbol = "L_100K+from";
                    break;
                case 3:
                    itom1ConversionToBase =  4184.0;
                    itom1ConversionFromBase = 0.0002390057361376673040153;
                    break;
                case 4:
                    itom1ConversionToBase = 1055.05585262;
                    itom1ConversionFromBase =  0.0009478171203133172000128;
                    break;
                //
                case 5:
                    itom1ConversionToBase = 1.3558179483314004;
                    itom1ConversionFromBase =  0.7375621494575464935503;
                    break;
                case 6:
                    itom1ConversionToBase =  0.1129848290276167;
                    itom1ConversionFromBase = 8.850745793490557922604;
                    // symbol = "L_100K+from";
                    break;
                case 7:
                    itom1ConversionToBase = 3600000.0;
                    itom1ConversionFromBase = 0.0000002777777777777777777778;
                    break;

            }
            switch (item2)
            {
                case 0:
                    itom2ConversionToBase = 1.0;
                    itom2ConversionFromBase = 1.0;
                    break;
                case 1:
                    itom2ConversionToBase =  1000.0;
                    itom2ConversionFromBase = 0.001;
                    break;
                case 2:
                    itom2ConversionToBase = 4.184;
                    itom2ConversionFromBase = 0.2390057361376673040153;
                    // symbol = "L_100K+from";
                    break;
                case 3:
                    itom2ConversionToBase =  4184.0;
                    itom2ConversionFromBase = 0.0002390057361376673040153;
                    break;
                case 4:
                    itom2ConversionToBase = 1055.05585262;
                    itom2ConversionFromBase =  0.0009478171203133172000128;
                    break;
                //
                case 5:
                    itom2ConversionToBase = 1.3558179483314004;
                    itom2ConversionFromBase =  0.7375621494575464935503;
                    break;
                case 6:
                    itom2ConversionToBase =  0.1129848290276167;
                    itom2ConversionFromBase = 8.850745793490557922604;
                    // symbol = "L_100K+from";
                    break;
                case 7:
                    itom2ConversionToBase = 3600000.0;
                    itom2ConversionFromBase = 0.0000002777777777777777777778;
                    break;
            }
            temp = calculate.convert(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    /////////////////end energy


    ////////////////////////////Start Force
    public double evaluateForce(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
        // here itom1 = from
        //here itom2 = to
     double multiplayer = 0;
        double formulavalue2 = 0.0 ;

        String symbol = "";
        double temp = 0.0;
        if(item1 == item2)
            return value;
        else
        {
            switch (item1)
            {
                //from
                case 0://giganewton
                    switch (item2){
                        case 1:
                            multiplayer = 1000;
                            break;
                        case 2:
                            multiplayer = 1000000;
                            break;
                        case 3:
                            multiplayer = 1000000000;
                            break;
                        case 4:
                            multiplayer = 1000000000000.0;
                            break;
                        case 5:
                            multiplayer = 1000000000000000.0;
                            break;
                        case 6:
                            multiplayer = 1000000000000000000.0;
                            break;
                    }
                    ///innner switch end
                    break;
                case 1://meganewton
                    switch (item2){
                        case 0:
                            multiplayer = 0.001;
                            break;
                        case 2:
                            multiplayer = 1000;
                            break;
                        case 3:
                            multiplayer = 1000000;
                            break;
                        case 4:
                            multiplayer = 1000000000.0;
                            break;
                        case 5:
                            multiplayer = 1000000000000.0;
                            break;
                        case 6:
                            multiplayer = 1000000000000000.0;
                            break;
                    }
                    ///innner switch end
                    break;
                case 2://kilonewton
                    switch (item2){
                        case 0:
                            multiplayer = 1000000;
                            break;
                        case 1:
                            multiplayer = 0.001;
                            break;
                        case 3:
                            multiplayer = 1000;
                            break;
                        case 4:
                            multiplayer = 1000000.0;
                            break;
                        case 5:
                            multiplayer = 1000000000.0;
                            break;
                        case 6:
                            multiplayer = 1000000000000.0;
                            break;
                    }
                    ///innner switch end
                    break;
                case 3://newton
                    switch (item2){
                        case 0:
                            multiplayer = 1000000000;
                            break;
                        case 1:
                            multiplayer = 1000000;
                            break;
                        case 2:
                            multiplayer = 0.001;
                            break;
                        case 4:
                            multiplayer = 1000.0;
                            break;
                        case 5:
                            multiplayer = 1000000.0;
                            break;
                        case 6:
                            multiplayer = 1000000000.0;
                            break;
                    }
                    ///innner switch end
                    break;
                case 4://millinewton
                    switch (item2){
                        case 0:
                            multiplayer = 0.000000000001;
                            break;
                        case 1:
                            multiplayer = 0.000000001;
                            break;
                        case 2:
                            multiplayer = 0.000001;
                            break;
                        case 3:
                            multiplayer = 0.001;
                            break;
                        case 5:
                            multiplayer = 1000;
                            break;
                        case 6:
                            multiplayer = 1000000.0;
                            break;
                    }
                    ///innner switch end
                    break;
                case 5://micronewton
                    switch (item2){
                        case 0:
                            multiplayer = 0.000000000000001;
                            break;
                        case 1:
                            multiplayer = 0.000000000001;
                            break;
                        case 2:
                            multiplayer = 0.000000001;
                            break;
                        case 3:
                            multiplayer = 0.001;
                            break;
                        case 4:
                            multiplayer = 0.000001;
                            break;
                        case 6:
                            multiplayer = 1000;
                            break;
                    }
                    ///innner switch end
                    break;
                case 6://nanonewton
                    switch (item2){
                        case 0:
                            multiplayer = 0.000000000000000001;
                            break;
                        case 1:
                            multiplayer = 0.000000000000001;
                            break;
                        case 2:
                            multiplayer = 0.000000000001;
                            break;
                        case 3:
                            multiplayer = 0.000000001;
                            break;
                        case 4:
                            multiplayer = 0.001;
                            break;
                        case 5:
                            multiplayer = 0.000001;
                            break;
                    }
                    ///innner switch end
                    break;

            }
            //outer switch end
            temp = calculate.convertForce(value,multiplayer);
            return temp;
        }
    }
    ///////////////////////////End Force

    ////////////////////////////Start data transfer
    public double evaluateDataTransfer(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
        // here itom1 = from
        //here itom2 = to
        double multiplayer = 0;
        double formulavalue2 = 0.0 ;

        String symbol = "";
        double temp = 0.0;
        if(item1 == item2)
            return value;
        else
        {
            switch (item1)
            {
                //from
                case 0://AGP
                    switch (item2){
                        case 1:
                            multiplayer = 0.5;
                            break;
                        case 2:
                            multiplayer = 0.25;
                            break;
                        case 3:
                            multiplayer = 0.125;
                            break;
                        case 4:
                            multiplayer = 13.76344086;
                            break;
                        case 5:
                            multiplayer = 2133333333.3;
                            break;
                        case 6:
                            multiplayer = 266666666.67;
                            break;
                        case 7:
                            multiplayer = 148.14814815;
                            break;
                        case 8:
                            multiplayer = 111.11111111;
                            break;
                        case 9:
                            multiplayer = 1777.7777778;
                            break;
                        case 10:
                            multiplayer = 74.074074074;
                            break;
                        case 11:  ///cdrom end
                            multiplayer = 888.88888889;
                            break;
                        case 12://startEPTA
                            multiplayer = 1111.1111111;
                            break;
                        case 13:
                            multiplayer = 1041.6666667;
                            break;
                        case 14:
                            multiplayer = 277.77777778;
                            break;
                        case 15:
                            multiplayer = 252.52525253;
                            break;
                        case 16:
                            multiplayer = 69.444444444;
                            break;
                        case 17:
                            multiplayer = 62.073246431;
                            break;
                        case 18:  //starteEthernet
                            multiplayer = 213.33333333;
                            break;
                        case 19:
                            multiplayer = 0.21333333333;
                            break;
                        case 20:
                            multiplayer = 21.333333333;
                            break;
                        case 21:
                            multiplayer = 2.1333333333;
                            break;
                        case 22:
                            multiplayer = 0.66666666667;
                            break;
                        case 23:
                            multiplayer = 5.3333333333;
                            break;
                    }
                    ///innner switch end
                    break;
                case 1://AGP 2X
                    switch (item2){
                        case 0:
                            multiplayer = 2;
                            break;
                        case 2:
                            multiplayer = 0.5;
                            break;
                        case 3:
                            multiplayer = 0.25;
                            break;
                        case 4:
                            multiplayer = 27.52688172;
                            break;
                        case 5:
                            multiplayer = 4266666666.7;
                            break;
                        case 6:
                            multiplayer = 533333333.33;
                            break;
                        case 7://start CD Rom
                            multiplayer = 296.2962963;
                            break;
                        case 8:
                            multiplayer = 222.22222222;
                            break;
                        case 9:
                            multiplayer = 3555.5555556;
                            break;
                        case 10:
                            multiplayer = 148.14814815;
                            break;
                        case 11:  ///cdrom end
                            multiplayer = 1777.7777778;
                            break;
                        case 12://startEPTA
                            multiplayer = 2222.2222222;
                            break;
                        case 13:
                            multiplayer = 2083.3333333;
                            break;
                        case 14:
                            multiplayer = 555.55555556;
                            break;
                        case 15:
                            multiplayer = 505.05050505;
                            break;
                        case 16:
                            multiplayer = 138.88888889;
                            break;
                        case 17:
                            multiplayer = 124.14649286;
                            break;
                        case 18:  //starteEthernet
                            multiplayer = 426.66666667;
                            break;
                        case 19:
                            multiplayer = 0.42666666667;
                            break;
                        case 20:
                            multiplayer = 42.666666667;
                            break;
                        case 21:
                            multiplayer = 4.2666666667;
                            break;
                        case 22:
                            multiplayer = 1.3333333333;
                            break;
                        case 23:
                            multiplayer = 10.666666667;
                            break;
                    }
                    ///innner switch end
                    break;
                case 2://agp 4x
                    switch (item2){
                        case 0:
                            multiplayer = 4;
                            break;
                        case 1:
                            multiplayer = 2;
                            break;
                        case 3:
                            multiplayer = 0.5;
                            break;
                        case 4:
                            multiplayer = 55.053763441;
                            break;
                        case 5:
                            multiplayer = 8533333333.3;
                            break;
                        case 6:
                            multiplayer = 1066666666.7;
                            break;
                        case 7://start CD Rom
                            multiplayer = 592.59259259;
                            break;
                        case 8:
                            multiplayer = 444.44444444;
                            break;
                        case 9:
                            multiplayer = 7111.1111111;
                            break;
                        case 10:
                            multiplayer = 296.2962963;
                            break;
                        case 11:  ///cdrom end
                            multiplayer = 148.14814815;
                            break;
                        case 12://startEPTA
                            multiplayer = 4444.4444444;
                            break;
                        case 13:
                            multiplayer = 4166.6666667;
                            break;
                        case 14:
                            multiplayer = 1111.1111111;
                            break;
                        case 15:
                            multiplayer = 1010.1010101;
                            break;
                        case 16:
                            multiplayer = 277.77777778;
                            break;
                        case 17:
                            multiplayer = 248.29298572;
                            break;
                        case 18:  //starteEthernet
                            multiplayer = 853.33333333;
                            break;
                        case 19:
                            multiplayer = 0.85333333333;
                            break;
                        case 20:
                            multiplayer = 85.333333333;
                            break;
                        case 21:
                            multiplayer = 8.5333333333;
                            break;
                        case 22:
                            multiplayer = 2.6666666667;
                            break;
                        case 23:
                            multiplayer = 21.333333333;
                            break;
                    }
                    ///innner switch end
                    break;
                case 3://newton
                    switch (item2){
                        case 0:
                            multiplayer = 8;
                            break;
                        case 1:
                            multiplayer = 4;
                            break;
                        case 2:
                            multiplayer = 2;
                            break;
                        case 4:
                            multiplayer = 110.10752688;
                            break;
                        case 5:
                            multiplayer = 17066666667.0;
                            break;
                        case 6:
                            multiplayer = 2133333333.3;
                            break;
                        case 7://start CD Rom
                            multiplayer = 1185.1851852;
                            break;
                        case 8:
                            multiplayer = 888.88888889;
                            break;
                        case 9:
                            multiplayer = 14222.222222;
                            break;
                        case 10:
                            multiplayer = 592.59259259;
                            break;
                        case 11:  ///cdrom end
                            multiplayer = 7111.1111111;
                            break;
                        case 12://startEPTA
                            multiplayer = 8888.8888889;
                            break;
                        case 13:
                            multiplayer = 8333.3333333;
                            break;
                        case 14:
                            multiplayer = 2222.2222222;
                            break;
                        case 15:
                            multiplayer = 2020.2020202;
                            break;
                        case 16:
                            multiplayer = 555.55555556;
                            break;
                        case 17:
                            multiplayer = 496.58597145;
                            break;
                        case 18:  //starteEthernet
                            multiplayer = 1706.6666667;
                            break;
                        case 19:
                            multiplayer = 1.7066666667;
                            break;
                        case 20:
                            multiplayer = 170.66666667;
                            break;
                        case 21:
                            multiplayer = 17.066666667;
                            break;
                        case 22:
                            multiplayer = 5.3333333333;
                            break;
                        case 23:
                            multiplayer = 42.666666667;
                            break;
                    }
                    ///innner switch end
                    break;
                case 4://ATM
                    switch (item2){
                        case 0:
                            multiplayer = 0.07265625;
                            break;
                        case 1:
                            multiplayer = 0.036328125;
                            break;
                        case 2:
                            multiplayer = 0.0181640625;
                            break;
                        case 3:
                            multiplayer = 0.00908203125;
                            break;
                        case 5:
                            multiplayer = 155000000;
                            break;
                        case 6:
                            multiplayer = 19375000;
                            break;
                        case 7://start CD Rom
                            multiplayer = 10.763888889;
                            break;
                        case 8:
                            multiplayer = 8.0729166667;
                            break;
                        case 9:
                            multiplayer = 129.16666667;
                            break;
                        case 10:
                            multiplayer = 5.3819444444;
                            break;
                        case 11:  ///cdrom end
                            multiplayer = 64.583333333;
                            break;
                        case 12://startEPTA
                            multiplayer = 80.729166667;
                            break;
                        case 13:
                            multiplayer = 75.68359375;
                            break;
                        case 14:
                            multiplayer = 20.182291667;
                            break;
                        case 15:
                            multiplayer = 18.347537879;
                            break;
                        case 16:
                            multiplayer = 5.0455729167;
                            break;
                        case 17:
                            multiplayer = 4.510009311;
                            break;
                        case 18:  //starteEthernet
                            multiplayer = 15.5;
                            break;
                        case 19:
                            multiplayer = 0.0155;
                            break;
                        case 20:
                            multiplayer = 1.55;
                            break;
                        case 21:
                            multiplayer = 0.155;
                            break;
                        case 22:
                            multiplayer = 0.0484375;
                            break;
                        case 23:
                            multiplayer = 0.3875;
                            break;
                    }
                    ///innner switch end
                    break;
                case 5://bit/second
                    switch (item2){
                        case 0:
                            multiplayer = 4.6875e-10;
                            break;
                        case 1:
                            multiplayer = 2.34375e-10;
                            break;
                        case 2:
                            multiplayer = 1.171875e-10;
                            break;
                        case 3:
                            multiplayer = 5.859375e-11;
                            break;
                        case 4:
                            multiplayer = 6.4516129032e-9;
                            break;
                        case 6:
                            multiplayer = 0.125;
                            break;
                        case 7://start CD Rom
                            multiplayer = 6.9444444444e-8;
                            break;
                        case 8:
                            multiplayer =5.2083333333e-8;
                            break;
                        case 9:
                            multiplayer = 8.3333333333e-7;
                            break;
                        case 10:
                            multiplayer = 3.4722222222e-8;
                            break;
                        case 11:  ///cdrom end
                            multiplayer = 4.1666666667e-7;
                            break;
                        case 12://startEPTA
                            multiplayer = 5.2083333333e-7;
                            break;
                        case 13:
                            multiplayer = 4.8828125e-7;
                            break;
                        case 14:
                            multiplayer = 1.3020833333e-7;
                            break;
                        case 15:
                            multiplayer = 1.1837121212e-7;
                            break;
                        case 16:
                            multiplayer = 3.2552083333e-8;
                            break;
                        case 17:
                            multiplayer = 2.9096834264e-8;
                            break;
                        case 18:  //starteEthernet
                            multiplayer = 1e-7;
                            break;
                        case 19:
                            multiplayer = 1e-10;
                            break;
                        case 20:
                            multiplayer = 1e-8;
                            break;
                        case 21:
                            multiplayer = 1e-9;
                            break;
                        case 22:
                            multiplayer = 3.125e-10;
                            break;
                        case 23:
                            multiplayer = 2.5e-9;
                            break;
                    }
                    ///innner switch end
                    break;
                case 6://byte/second
                    switch (item2){
                        case 0:
                            multiplayer = 3.75e-9;
                            break;
                        case 1:
                            multiplayer = 1.875e-9;
                            break;
                        case 2:
                            multiplayer = 9.375e-10;
                            break;
                        case 3:
                            multiplayer = 4.6875e-10;
                            break;
                        case 4:
                            multiplayer = 5.1612903226e-8;
                            break;
                        case 5:
                            multiplayer = 8;
                            break;
                        case 7://start CD Rom
                            multiplayer = 5.5555555556e-7;
                            break;
                        case 8:
                            multiplayer = 4.1666666667e-7;
                            break;
                        case 9:
                            multiplayer = 0.0000066666666667;
                            break;
                        case 10:
                            multiplayer = 2.7777777778e-7;
                            break;
                        case 11:  ///cdrom end
                            multiplayer = 0.0000033333333333;
                            break;
                        case 12://startEPTA
                            multiplayer = 0.0000041666666667;
                            break;
                        case 13:
                            multiplayer = 0.00000390625;
                            break;
                        case 14:
                            multiplayer = 0.0000010416666667;
                            break;
                        case 15:
                            multiplayer = 9.4696969697e-7;
                            break;
                        case 16:
                            multiplayer = 2.6041666667e-7;
                            break;
                        case 17:
                            multiplayer = 2.3277467412e-7;
                            break;
                        case 18:  //starteEthernet
                            multiplayer = 8e-7;
                            break;
                        case 19:
                            multiplayer = 8e-10;
                            break;
                        case 20:
                            multiplayer = 8e-8;
                            break;
                        case 21:
                            multiplayer = 8e-9;
                            break;
                        case 22:
                            multiplayer = 2.5e-9;
                            break;
                        case 23:
                            multiplayer = 2e-8;
                            break;
                    }
                    ///innner switch end
                    break;
                        ///case end

                case 7://cd-rom 12x
                    switch (item2){
                        case 0:
                            multiplayer = 0.00675;
                            break;
                        case 1:
                            multiplayer =0.003375;
                            break;
                        case 2:
                            multiplayer = 0.0016875;
                            break;
                        case 3:
                            multiplayer = 0.00084375;
                            break;
                        case 4:
                            multiplayer = 0.092903225806;
                            break;
                        case 5:
                            multiplayer = 14400000;
                            break;
                        case 6://start CD Rom
                            multiplayer = 1800000;
                            break;
                        case 8:
                            multiplayer = 0.75;
                            break;
                        case 9:
                            multiplayer = 12;
                            break;
                        case 10:
                            multiplayer = 0.5;
                            break;
                        case 11:  ///cdrom end
                            multiplayer = 6;
                            break;
                        case 12://startEPTA
                            multiplayer = 7.5;
                            break;
                        case 13:
                            multiplayer = 7.03125;
                            break;
                        case 14:
                            multiplayer = 1.875;
                            break;
                        case 15:
                            multiplayer = 1.7045454545;
                            break;
                        case 16:
                            multiplayer = 0.46875;
                            break;
                        case 17:
                            multiplayer = 0.41899441341;
                            break;
                        case 18:  //starteEthernet
                            multiplayer = 1.44;
                            break;
                        case 19:
                            multiplayer = 0.00144;
                            break;
                        case 20:
                            multiplayer = 0.144;
                            break;
                        case 21:
                            multiplayer = 0.0144;
                            break;
                        case 22:
                            multiplayer = 0.0045;
                            break;
                        case 23:
                            multiplayer = 0.036;
                            break;
                    }
                    ///innner switch end
                    break;
                ///case end

                case 8://cd-rom 16x
                    switch (item2){
                        case 0:
                            multiplayer = 0.009;
                            break;
                        case 1:
                            multiplayer = 0.0045;
                            break;
                        case 2:
                            multiplayer = 0.00225;
                            break;
                        case 3:
                            multiplayer = 0.001125;
                            break;
                        case 4:
                            multiplayer = 0.12387096774;
                            break;
                        case 5:
                            multiplayer = 19200000;
                            break;
                        case 6:
                            multiplayer = 2400000;
                            break;
                        case 7://start CD Rom
                            multiplayer = 1.3333333333;
                            break;
                        case 9:
                            multiplayer = 16;
                            break;
                        case 10:
                            multiplayer = 0.66666666667;
                            break;
                        case 11:  ///cdrom end
                            multiplayer = 8;
                            break;
                        case 12://startEPTA
                            multiplayer = 10;
                            break;
                        case 13:
                            multiplayer = 9.375;
                            break;
                        case 14:
                            multiplayer = 2.5;
                            break;
                        case 15:
                            multiplayer = 2.2727272727;
                            break;
                        case 16:
                            multiplayer = 0.625;
                            break;
                        case 17:
                            multiplayer = 0.55865921788;
                            break;
                        case 18:  //starteEthernet
                            multiplayer = 1.92;
                            break;
                        case 19:
                            multiplayer = 0.00192;
                            break;
                        case 20:
                            multiplayer = 0.192;
                            break;
                        case 21:
                            multiplayer = 0.0192;
                            break;
                        case 22:
                            multiplayer = 0.006;
                            break;
                        case 23:
                            multiplayer = 0.048;
                            break;
                    }
                    ///innner switch end
                    break;
                ///case end
                case 9://cd-rom 1x
                    switch (item2){
                        case 0:
                            multiplayer = 0.0005625;
                            break;
                        case 1:
                            multiplayer = 0.00028125;
                            break;
                        case 2:
                            multiplayer = 0.000140625;
                            break;
                        case 3:
                            multiplayer = 0.0000703125;
                            break;
                        case 4:
                            multiplayer = 0.0077419354839;
                            break;
                        case 5:
                            multiplayer = 1200000;
                            break;
                        case 6:
                            multiplayer = 150000;
                            break;
                        case 7://start CD Rom
                            multiplayer = 0.083333333333;
                            break;
                        case 8:
                            multiplayer = 0.0625;
                            break;
                        case 10:
                            multiplayer = 0.041666666667;
                            break;
                        case 11:  ///cdrom end
                            multiplayer = 0.5;
                            break;
                        case 12://startEPTA
                            multiplayer = 0.625;
                            break;
                        case 13:
                            multiplayer = 0.5859375;
                            break;
                        case 14:
                            multiplayer = 0.0390625;
                            break;
                        case 15:
                            multiplayer = 0.14204545455;
                            break;
                        case 16:
                            multiplayer = 0.0390625;
                            break;
                        case 17:
                            multiplayer = 0.034916201117;
                            break;
                        case 18:  //starteEthernet
                            multiplayer = 0.12;
                            break;
                        case 19:
                            multiplayer = 0.00012;
                            break;
                        case 20:
                            multiplayer = 0.012;
                            break;
                        case 21:
                            multiplayer = 0.0012;
                            break;
                        case 22:
                            multiplayer = 0.000375;
                            break;
                        case 23:
                            multiplayer = 0.003;
                            break;
                    }
                    ///innner switch end
                    break;
                ///case end
                case 10://cd-rom 24x
                    switch (item2){
                        case 0:
                            multiplayer = 0.0135;
                            break;
                        case 1:
                            multiplayer = 0.00675;
                            break;
                        case 2:
                            multiplayer = 0.003375;
                            break;
                        case 3:
                            multiplayer = 0.0016875;
                            break;
                        case 4:
                            multiplayer = 0.18580645161;
                            break;
                        case 5:
                            multiplayer = 28800000;
                            break;
                        case 6:
                            multiplayer = 3600000;
                            break;
                        case 7://start CD Rom
                            multiplayer = 2;
                            break;
                        case 8:
                            multiplayer = 1.5;
                            break;
                        case 9:
                            multiplayer = 24;
                            break;
                        case 11:  ///cdrom end
                            multiplayer = 12;
                            break;
                        case 12://startEPTA
                            multiplayer = 15;
                            break;
                        case 13:
                            multiplayer = 14.0625;
                            break;
                        case 14:
                            multiplayer = 3.75;
                            break;
                        case 15:
                            multiplayer = 3.4090909091;
                            break;
                        case 16:
                            multiplayer = 0.9375;
                            break;
                        case 17:
                            multiplayer = 0.83798882682;
                            break;
                        case 18:  //starteEthernet
                            multiplayer = 2.88;
                            break;
                        case 19:
                            multiplayer = 0.00288;
                            break;
                        case 20:
                            multiplayer = 0.288;
                            break;
                        case 21:
                            multiplayer = 0.0288;
                            break;
                        case 22:
                            multiplayer = 0.009;
                            break;
                        case 23:
                            multiplayer = 0.072;
                            break;
                    }
                    ///innner switch end
                    break;
                ///case end
                case 11://cd-rom 2x
                    switch (item2){
                        case 0:
                            multiplayer = 0.001125;
                            break;
                        case 1:
                            multiplayer = 0.0005625;
                            break;
                        case 2:
                            multiplayer = 0.00028125;
                            break;
                        case 3:
                            multiplayer = 0.000140625;
                            break;
                        case 4:
                            multiplayer = 0.015483870968;
                            break;
                        case 5:
                            multiplayer = 2400000;
                            break;
                        case 6:
                            multiplayer = 300000;
                            break;
                        case 7://start CD Rom
                            multiplayer = 0.16666666667;
                            break;
                        case 8:
                            multiplayer = 0.125;
                            break;
                        case 9:
                            multiplayer = 2;
                            break;
                        case 10:  ///cdrom end
                            multiplayer = 1.25;
                            break;
                        case 12://startEPTA
                            multiplayer = 15;
                            break;
                        case 13:
                            multiplayer = 1.171875;
                            break;
                        case 14:
                            multiplayer = 0.3125;
                            break;
                        case 15:
                            multiplayer = 0.28409090909;
                            break;
                        case 16:
                            multiplayer = 0.078125;
                            break;
                        case 17:
                            multiplayer = 0.069832402235;
                            break;
                        case 18:  //starteEthernet
                            multiplayer = 0.24;
                            break;
                        case 19:
                            multiplayer = 0.00024;
                            break;
                        case 20:
                            multiplayer = 0.024;
                            break;
                        case 21:
                            multiplayer = 0.0024;
                            break;
                        case 22:
                            multiplayer = 0.00075;
                            break;
                        case 23:
                            multiplayer = 0.006;
                            break;
                    }
                    ///innner switch end
                    break;
                ///case end
                case 12://E.P.T.A(payload)
                    switch (item2){
                        case 0:
                            multiplayer = 0.0009;
                            break;
                        case 1:
                            multiplayer = 0.00045;
                            break;
                        case 2:
                            multiplayer = 0.000225;
                            break;
                        case 3:
                            multiplayer = 0.0001125;
                            break;
                        case 4:
                            multiplayer = 0.012387096774;
                            break;
                        case 5:
                            multiplayer = 1920000;
                            break;
                        case 6:
                            multiplayer = 240000;
                            break;
                        case 7://start CD Rom
                            multiplayer = 0.13333333333;
                            break;
                        case 8:
                            multiplayer = 0.1;
                            break;
                        case 9:
                            multiplayer = 1.6;
                            break;
                        case 10:
                            multiplayer = 0.066666666667;
                            break;


                        case 11:///cdrom end
                            multiplayer = 0.8;
                            break;
                        case 13://startEPTA
                            multiplayer = 0.9375;
                            break;
                        case 14:
                            multiplayer = 0.25;
                            break;
                        case 15:
                            multiplayer = 0.22727272727;
                            break;
                        case 16:
                            multiplayer = 0.0625;
                            break;
                        case 17:
                            multiplayer = 0.055865921788;
                            break;
                        case 18:  //starteEthernet
                            multiplayer = 0.192;
                            break;
                        case 19:
                            multiplayer = 0.000192;
                            break;
                        case 20:
                            multiplayer = 0.0192;
                            break;
                        case 21:
                            multiplayer = 0.00192;
                            break;
                        case 22:
                            multiplayer = 0.0006;
                            break;
                        case 23:
                            multiplayer = 0.0048;
                            break;
                    }
                    ///innner switch end
                    break;
                ///case end

            }
            //outer switch end
            temp = calculate.convertForce(value,multiplayer);
            return temp;
        }
    }
    ///////////////////////////End data transfer


    ////////////////////////////Start current
    public double evaluateCurret(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
        // here itom1 = from
        //here itom2 = to
        double multiplayer = 0;
        double formulavalue2 = 0.0 ;

        String symbol = "";
        double temp = 0.0;
        if(item1 == item2)
            return value;
        else
        {
            switch (item1)
            {
                //from
                case 0:////abmampear
                    switch (item2){
                        case 1:
                            multiplayer = 10;
                            break;
                        case 2:
                            multiplayer = 1;
                            break;
                        case 3:
                            multiplayer = 1;
                            break;
                        case 4:
                            multiplayer = 29979245368.0;
                            break;
                        case 5:
                            multiplayer = 1;
                            break;
                        case 6:
                            multiplayer = 29979245368.0;
                            break;
                        case 7:
                            multiplayer = 0.01;
                            break;
                        case 8:
                            multiplayer = 10000;
                            break;
                        case 9:
                            multiplayer = 29979245368.0;
                            break;
                    }
                    ///innner switch end
                    break;
                case 1://ampare
                    switch (item2){
                        case 0:
                            multiplayer = 0.1;//abmpeare
                            break;
                        case 2:
                            multiplayer = 0.1;
                            break;
                        case 3:
                            multiplayer = 0.1;
                            break;
                        case 4:
                            multiplayer = 2997924536.8;
                            break;
                        case 5:
                            multiplayer = 0.1;
                            break;
                        case 6:
                            multiplayer = 2997924536.8;
                            break;
                        case 7:
                            multiplayer = 0.001;
                            break;
                        case 8:
                            multiplayer = 1000;
                            break;
                        case 9:
                            multiplayer = 2997924536.8;
                            break;
                    }
                    ///innner switch end
                    break;
                case 2://biot
                    switch (item2){
                        case 0:
                            multiplayer = 1;
                            break;
                        case 1:
                            multiplayer = 10;
                            break;
                        case 3:
                            multiplayer = 1;
                            break;
                        case 4:
                            multiplayer = 29979245368.0;
                            break;
                        case 5:
                            multiplayer = 1;
                            break;
                        case 6:
                            multiplayer = 29979245368.0;
                            break;
                        case 7:
                            multiplayer = 0.01;
                            break;
                        case 8:
                            multiplayer = 10000;
                            break;
                        case 9:
                            multiplayer = 29979245368.0;
                            break;    }

                    ///innner switch end
                    break;
                case 3://newton
                    switch (item2){
                        case 0:
                            multiplayer = 1;
                            break;
                        case 1:
                            multiplayer = 10;
                            break;
                        case 2:
                            multiplayer = 1;
                            break;
                        case 4:
                            multiplayer = 29979245368.0;
                            break;
                        case 5:
                            multiplayer = 1;
                            break;
                        case 6:
                            multiplayer = 29979245368.0;
                            break;
                        case 7:
                            multiplayer = 0.01;
                            break;
                        case 8:
                            multiplayer = 10000;
                            break;
                        case 9:
                            multiplayer = 29979245368.0;
                            break;
                    }
                    ///innner switch end
                    break;
                case 4://millinewton
                    switch (item2){
                        case 0:
                            multiplayer = 3.335641e-11;
                            break;
                        case 1:
                            multiplayer = 3.335641e-10;
                            break;
                        case 2:
                            multiplayer = 3.335641e-11;
                            break;
                        case 3:
                            multiplayer = 3.335641e-11;
                            break;
                        case 5:
                            multiplayer = 3.335641e-11;
                            break;
                        case 6:
                            multiplayer = 1;
                            break;
                        case 7:
                            multiplayer = 3.335641e-13;
                            break;
                        case 8:
                            multiplayer = 3.335641e-7;
                            break;
                        case 9:
                            multiplayer = 1;
                            break;
                    }
                    ///innner switch end
                    break;
                case 5://micronewton
                    switch (item2){
                        case 0:
                            multiplayer = 1;
                            break;
                        case 1:
                            multiplayer = 10;
                            break;
                        case 2:
                            multiplayer = 1;
                            break;
                        case 3:
                            multiplayer = 1;
                            break;
                        case 4:
                            multiplayer = 29979245368.0;
                            break;
                        case 6:
                            multiplayer = 29979245368.0;
                            break;
                        case 7:
                            multiplayer = 0.01;
                            break;
                        case 8:
                            multiplayer = 10000;
                            break;
                        case 9:
                            multiplayer = 29979245368.0;
                            break;
                    }
                    ///innner switch end
                    break;
                case 6://nanonewton
                    switch (item2){
                        case 0:
                            multiplayer = 1;
                            break;
                        case 1:
                            multiplayer = 3.335641e-10;
                            break;
                        case 2:
                            multiplayer = 3.335641e-11;
                            break;
                        case 3:
                            multiplayer = 3.335641e-11;
                            break;
                        case 4:
                            multiplayer = 1;
                            break;
                        case 5:
                            multiplayer = 3.335641e-11;
                            break;
                        case 7:
                            multiplayer = 3.335641e-13;
                            break;
                        case 8:
                            multiplayer = 3.335641e-7;
                            break;
                        case 9:
                            multiplayer = 1;
                            break;
                    }
                    ///innner switch end
                    break;
                case 7://nanonewton
                    switch (item2){
                        case 0:
                            multiplayer = 100;
                            break;
                        case 1:
                            multiplayer = 1000;
                            break;
                        case 2:
                            multiplayer = 100;
                            break;
                        case 3:
                            multiplayer = 100;
                            break;
                        case 4:
                            multiplayer = 2997924536800.0;
                            break;
                        case 5:
                            multiplayer = 100;
                            break;
                        case 6:
                            multiplayer = 2997924536800.0;
                            break;
                        case 8:
                            multiplayer = 1000000.0;
                            break;
                        case 9:
                            multiplayer = 2997924536800.0;
                            break;
                    }
                    ///innner switch end
                    break;
                case 8://nanonewton
                    switch (item2){
                        case 0:
                            multiplayer = 0.0001;
                            break;
                        case 1:
                            multiplayer = 0.001;
                            break;
                        case 2:
                            multiplayer = 0.0001;
                            break;
                        case 3:
                            multiplayer = 0.0001;
                            break;
                        case 4:
                            multiplayer = 2997924.5368;
                            break;
                        case 5:
                            multiplayer = 0.0001;
                            break;
                        case 6:
                            multiplayer = 2997924.5368;
                            break;
                        case 7:
                            multiplayer = 0.000001;
                            break;
                        case 9:
                            multiplayer = 2997924.5368;
                            break;
                    }
                    ///innner switch end
                    break;
                case 9://nanonewton
                    switch (item2){
                        case 0:
                            multiplayer = 3.335641e-11;
                            break;
                        case 1:
                            multiplayer = 3.335641e-10;
                            break;
                        case 2:
                            multiplayer = 3.335641e-11;
                            break;
                        case 3:
                            multiplayer = 3.335641e-11;
                            break;
                        case 4:
                            multiplayer = 1;
                            break;
                        case 5:
                            multiplayer = 3.335641e-11;
                            break;
                        case 6:
                            multiplayer = 1;
                            break;
                        case 7:
                            multiplayer = 3.335641e-13;
                            break;
                        case 8:
                            multiplayer = 3.335641e-7;
                            break;
                    }
                    ///innner switch end
                    break;
            }
            //outer switch end
            temp = calculate.convertForce(value,multiplayer);
            return temp;
        }
    }
    ///////////////////////////End current
    //// get list for listing

    ///
    ////////////////////////////Start DigitalImageResolution
    public double evaluateDigitalImageResolution(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
        // here itom1 = from
        //here itom2 = to
        double multiplayer = 0;
        double formulavalue2 = 0.0 ;

        String symbol = "";
        double temp = 0.0;
        if(item1 == item2)
            return value;
        else
        {
            switch (item1)
            {
                //from
                case 0://dot/inch
                    switch (item2){
                        case 1:
                            multiplayer = 39.37007874;
                            break;
                        case 2:
                            multiplayer = 0.03937007874;
                            break;
                        case 3:
                            multiplayer = 1;
                            break;
                    }
                    ///innner switch end
                    break;
                case 1://dot meter
                    switch (item2){
                        case 0:
                            multiplayer = 0.0254;
                            break;
                        case 2:
                            multiplayer = 0.001;
                            break;
                        case 3:
                            multiplayer = 0.0254;
                            break;
                    }
                    ///innner switch end
                    break;
                case 2://dot/milimeter
                    switch (item2){
                        case 0:
                            multiplayer = 25.4;
                            break;
                        case 1:
                            multiplayer = 1000;
                            break;
                        case 3:
                            multiplayer = 25.4;
                            break;
                    }
                    ///innner switch end
                    break;
                case 3://pixel/inch
                    switch (item2){
                        case 0:
                            multiplayer = 1;
                            break;
                        case 1:
                            multiplayer = 39.37007874;
                            break;
                        case 2:
                            multiplayer = 0.03937007874;
                            break;

                    }
                    ///innner switch end
                    break;
            }
            //outer switch end
            temp = calculate.convertForce(value,multiplayer);
            return temp;
        }
    }
    ///////////////////////////End DigitalImageResolution

    ////////////////////////////Start Electric Field
    public double evaluateElectricField(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
        // here itom1 = from
        //here itom2 = to
        double multiplayer = 0;
        double formulavalue2 = 0.0 ;

        String symbol = "";
        double temp = 0.0;
        if(item1 == item2)
            return value;
        else
        {
            switch (item1)
            {
                //from
                case 0:////abvoilt/centimeter
                    switch (item2){
                        case 1:
                            multiplayer = 1e-11;
                            break;
                        case 2:
                            multiplayer = 1;
                            break;
                        case 3:
                            multiplayer = 0.001;
                            break;
                        case 4:
                            multiplayer = 3.335646048e-11;
                            break;
                        case 5:
                            multiplayer = 8.4725409617e-11;
                            break;
                        case 6:
                            multiplayer = 1e-8;
                            break;
                        case 7:
                            multiplayer = 2.54e-8;
                            break;
                        case 8:
                            multiplayer = 0.000001;
                            break;

                    }
                    ///innner switch end
                    break;
                case 1://kilovolt/centimeter
                    switch (item2){
                        case 0:
                            multiplayer = 100000000000.0;//abmpeare
                            break;
                        case 2:
                            multiplayer = 100000000000.0;
                            break;
                        case 3:
                            multiplayer = 100000000.0;
                            break;
                        case 4:
                            multiplayer = 3.335646048;
                            break;
                        case 5:
                            multiplayer = 8.4725409617;
                            break;
                        case 6:
                            multiplayer = 1000;
                            break;
                        case 7:
                            multiplayer = 2540;
                            break;
                        case 8:
                            multiplayer = 100000;
                            break;

                    }
                    ///innner switch end
                    break;
                case 2://microvolt/meter
                    switch (item2){
                        case 0:
                            multiplayer = 1;
                            break;
                        case 1:
                            multiplayer = 1e-11;
                            break;
                        case 3:
                            multiplayer = 0.001;
                            break;
                        case 4:
                            multiplayer = 3.335646048e-11;
                            break;
                        case 5:
                            multiplayer = 8.4725409617e-11;
                            break;
                        case 6:
                            multiplayer = 1e-8;
                            break;
                        case 7:
                            multiplayer = 2.54e-8;
                            break;
                        case 8:
                            multiplayer = 0.000001;
                            break;
                    }
                    ///innner switch end
                    break;
                case 3://milivolt/meter
                    switch (item2){
                        case 0:
                            multiplayer = 1000;
                            break;
                        case 1:
                            multiplayer = 1e-8;
                            break;
                        case 2:
                            multiplayer = 1000;
                            break;
                        case 4:
                            multiplayer = 3.335646048e-8;
                            break;
                        case 5:
                            multiplayer = 8.4725409617e-8;
                            break;
                        case 6:
                            multiplayer = 0.00001;
                            break;
                        case 7:
                            multiplayer = 0.0000254;
                            break;
                        case 8:
                            multiplayer = 0.001;
                            break;
                    }
                    ///innner switch end
                    break;
                case 4://statvolt/centimeter
                    switch (item2){
                        case 0:
                            multiplayer = 29979199999.0;
                            break;
                        case 1:
                            multiplayer = 0.29979199999;
                            break;
                        case 2:
                            multiplayer = 29979199999.0;
                            break;
                        case 3:
                            multiplayer = 29979199.999;
                            break;
                        case 5:
                            multiplayer = 2.5399999999;
                            break;
                        case 6:
                            multiplayer = 299.79199999;
                            break;
                        case 7:
                            multiplayer = 761.47167998;
                            break;
                        case 8:
                            multiplayer = 29979.199999;
                            break;
                    }
                    ///innner switch end
                    break;
                case 5://statvolt/inch
                    switch (item2){
                        case 0:
                            multiplayer = 11802834646.0;
                            break;
                        case 1:
                            multiplayer = 0.11802834646;
                            break;
                        case 2:
                            multiplayer = 11802834646.0;
                            break;
                        case 3:
                            multiplayer = 11802834.646;
                            break;
                        case 4:
                            multiplayer = 0.39370078741;
                            break;
                        case 6:
                            multiplayer = 118.02834646;
                            break;
                        case 7:
                            multiplayer = 299.792;
                            break;
                        case 8:
                            multiplayer = 11802.834646;
                            break;
                    }
                    ///innner switch end
                    break;
                case 6://volt/centimeter
                    switch (item2){
                        case 0:
                            multiplayer = 100000000.0;
                            break;
                        case 1:
                            multiplayer = 0.001;
                            break;
                        case 2:
                            multiplayer = 100000000.0;
                            break;
                        case 3:
                            multiplayer = 100000;
                            break;
                        case 4:
                            multiplayer = 0.003335646048;
                            break;
                        case 5:
                            multiplayer = 0.0084725409617;
                            break;
                        case 7:
                            multiplayer = 2.54;
                            break;
                        case 8:
                            multiplayer = 100;
                            break;
                    }
                    ///innner switch end
                    break;
                case 7://volt/inch
                    switch (item2){
                        case 0:
                            multiplayer = 39370078.74;
                            break;
                        case 1:
                            multiplayer = 0.0003937007874;
                            break;
                        case 2:
                            multiplayer = 39370078.74;
                            break;
                        case 3:
                            multiplayer = 39370.07874;
                            break;
                        case 4:
                            multiplayer = 0.0013132464756;
                            break;
                        case 5:
                            multiplayer = 0.0033356460479;
                            break;
                        case 6:
                            multiplayer = 0.3937007874;
                            break;
                        case 8:
                            multiplayer = 39.37007874;
                            break;
                    }
                    ///innner switch end
                    break;
                case 8://volt/meter
                    switch (item2){
                        case 0:
                            multiplayer = 1000000.0;
                            break;
                        case 1:
                            multiplayer = 0.00001;
                            break;
                        case 2:
                            multiplayer = 1000000.0;
                            break;
                        case 3:
                            multiplayer = 1000;
                            break;
                        case 4:
                            multiplayer = 0.00003335646048;
                            break;
                        case 5:
                            multiplayer = 0.000084725409617;
                            break;
                        case 6:
                            multiplayer = 0.01;
                            break;
                        case 7:
                            multiplayer = 0.0254;
                            break;
                    }
                    ///innner switch end
                    break;

            }
            //outer switch end
            temp = calculate.convertForce(value,multiplayer);
            return temp;
        }
    }
    ///////////////////////////End Electric Field

    ////////////////////////////Start Resistivity Conversions
    public double evaluateResistivity(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
        // here itom1 = from
        //here itom2 = to
        double multiplayer = 0;
        double formulavalue2 = 0.0 ;

        String symbol = "";
        double temp = 0.0;
        if(item1 == item2)
            return value;
        else
        {
            switch (item1)
            {
                case 0:////Abohm centimeter
                    switch (item2){
                        case 1:
                            multiplayer = 0.006015304934;
                            break;
                        case 2:
                            multiplayer = 0.001;
                            break;
                        case 3:
                            multiplayer = 0.0003937007874;
                            break;
                        case 4:
                            multiplayer = 1e-9;
                            break;
                        case 5:
                            multiplayer = 3.937007874e-10;
                            break;
                        case 6:
                            multiplayer = 1e-11;
                            break;
                        case 7:
                            multiplayer = 1.112653456e-21;
                            break;

                    }
                    ///innner switch end
                    break;
                case 1://Circular mill ohm
                    switch (item2){
                        case 0:
                            multiplayer = 166.2426113;//abmpeare
                            break;
                        case 2:
                            multiplayer = 0.1662426113;
                            break;
                        case 3:
                            multiplayer = 0.065449846969;
                            break;
                        case 4:
                            multiplayer = 1.662426113e-7;
                            break;
                        case 5:
                            multiplayer = 6.5449846969e-8;
                            break;
                        case 6:
                            multiplayer = 1.662426113e-9;
                            break;
                        case 7:
                            multiplayer = 1.84970416e-19;
                            break;

                    }
                    ///innner switch end
                    break;
                case 2://Microhm centimeter
                    switch (item2){
                        case 0:
                            multiplayer = 1000;
                            break;
                        case 1:
                            multiplayer = 6.015304934;
                            break;
                        case 3:
                            multiplayer = 0.3937007874;
                            break;
                        case 4:
                            multiplayer = 0.000001;
                            break;
                        case 5:
                            multiplayer = 3.937007874e-7;
                            break;
                        case 6:
                            multiplayer = 1e-8;
                            break;
                        case 7:
                            multiplayer = 1.112653456e-18;
                            break;
                    }

                    ///innner switch end
                    break;
                case 3://micrhm inch
                    switch (item2){
                        case 0:
                            multiplayer = 2540;
                            break;
                        case 1:
                            multiplayer = 15.278874532;
                            break;
                        case 2:
                            multiplayer = 2.54;
                            break;
                        case 4:
                            multiplayer = 0.00000254;
                            break;
                        case 5:
                            multiplayer = 0.000001;
                            break;
                        case 6:
                            multiplayer = 2.54e-8;
                            break;
                        case 7:
                            multiplayer = 2.8261397782e-18;
                            break;

                    }
                    ///innner switch end
                    break;
                case 4://ohm  centimeter
                    switch (item2){
                        case 0:
                            multiplayer = 1000000000.0;
                            break;
                        case 1:
                            multiplayer = 6015304.934;
                            break;
                        case 2:
                            multiplayer = 1000000;
                            break;
                        case 3:
                            multiplayer = 393700.7874;
                            break;
                        case 5:
                            multiplayer = 0.3937007874;
                            break;
                        case 6:
                            multiplayer = 0.01;
                            break;
                        case 7:
                            multiplayer = 1.112653456e-12;
                            break;

                    }
                    ///innner switch end
                    break;
                case 5://ohm inch
                    switch (item2){
                        case 0:
                            multiplayer = 2540000000.0;
                            break;
                        case 1:
                            multiplayer = 15278874.532;
                            break;
                        case 2:
                            multiplayer = 2540000;
                            break;
                        case 3:
                            multiplayer = 1000000;
                            break;
                        case 4:
                            multiplayer = 2.54;
                            break;
                        case 6:
                            multiplayer = 0.0254;
                            break;
                        case 7:
                            multiplayer = 2.8261397782e-12;
                            break;

                    }
                    ///innner switch end
                    break;
                case 6://ohm meter
                    switch (item2){
                        case 0:
                            multiplayer = 100000000000.0;
                            break;
                        case 1:
                            multiplayer = 601530493.4;
                            break;
                        case 2:
                            multiplayer = 100000000.0;
                            break;
                        case 3:
                            multiplayer = 39370078.74;
                            break;
                        case 4:
                            multiplayer = 100;
                            break;
                        case 5:
                            multiplayer = 39.37007874;
                            break;
                        case 7:
                            multiplayer = 1.112653456e-10;
                            break;

                    }
                    ///innner switch end
                    break;
                case 7://Statohm centimeter
                    switch (item2){
                        case 0:
                            multiplayer = 898752432400000000000.0;
                            break;
                        case 1:
                            multiplayer = 5406269941100000000.0;
                            break;
                        case 2:
                            multiplayer = 898752432400000000.0;
                            break;
                        case 3:
                            multiplayer = 353839540310000000.0;
                            break;
                        case 4:
                            multiplayer = 898752432400.0;
                            break;
                        case 5:
                            multiplayer = 353839540310.0;
                            break;
                        case 6:
                            multiplayer = 8987524324.0;
                            break;

                    }
                    ///innner switch end
                    break;


            }
            //outer switch end
            temp = calculate.convertForce(value,multiplayer);
            return temp;
        }
    }
    ///////////////////////////EndResistivity Conversions
    ////////////////////////////Start Chemical Conversions
    public double evaluateChemical(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
        // here itom1 = from
        //here itom2 = to
        double multiplayer = 0;
        double formulavalue2 = 0.0 ;

        String symbol = "";
        double temp = 0.0;
        if(item1 == item2)
            return value;
        else
        {
            switch (item1)
            {
                case 0:////Atmosphere(gram/cubic centimeter)
                    switch (item2){
                        case 1:
                            multiplayer = 1;
                            break;
                        case 2:
                            multiplayer = 0.035314666721;
                            break;
                        case 3:
                            multiplayer = 0.001;
                            break;
                        case 4:
                            multiplayer = 0.016018463532;
                            break;
                        case 5:
                            multiplayer = 0.00101325;
                            break;
                        case 6:
                            multiplayer = 101.325;
                            break;


                    }
                    ///innner switch end
                    break;
                case 1://Atmosphere(Kilogram/ cubic foot)
                    switch (item2){
                        case 0:
                            multiplayer = 28.316846593;//abmpeare
                            break;
                        case 2:
                            multiplayer = 0.028316846593;
                            break;
                        case 3:
                            multiplayer = 0.45359237448;
                            break;
                        case 4:
                            multiplayer = 0.02869204481;
                            break;
                        case 5:
                            multiplayer = 2869.204481;
                            break;


                    }
                    ///innner switch end
                    break;
                case 2://Atmosphere (Kilogram/cubic meter)
                    switch (item2){
                        case 0:
                            multiplayer = 1000;
                            break;
                        case 1:
                            multiplayer = 35.314666721;
                            break;
                        case 3:
                            multiplayer = 16.018463532;
                            break;
                        case 4:
                            multiplayer = 1.01325;
                            break;
                        case 5:
                            multiplayer = 101325;
                            break;


                    }

                    ///innner switch end
                    break;
                case 3://Atmosphere(pound/cubic foot)
                    switch (item2){
                        case 0:
                            multiplayer = 62.427959961;
                            break;
                        case 1:
                            multiplayer = 2.2046226001;
                            break;
                        case 2:
                            multiplayer = 0.062427959961;
                            break;
                        case 4:
                            multiplayer = 0.06325513043;
                            break;
                        case 5:
                            multiplayer = 6325.513043;
                            break;


                    }
                    ///innner switch end
                    break;
                case 4://Bar(Kilogram/ cubic meter)
                    switch (item2){
                        case 0:
                            multiplayer = 986.92326672;
                            break;
                        case 1:
                            multiplayer = 34.852866243;
                            break;
                        case 2:
                            multiplayer = 0.98692326672;
                            break;
                        case 3:
                            multiplayer = 15.808994357;
                            break;
                        case 5:
                            multiplayer = 100000;
                            break;


                    }
                    ///innner switch end
                    break;
                case 5://Newton meter/kilogram
                    switch (item2){
                        case 0:
                            multiplayer = 0.0098692326672;
                            break;
                        case 1:
                            multiplayer = 0.00034852866243;
                            break;
                        case 2:
                            multiplayer = 0.0000098692326672;
                            break;
                        case 3:
                            multiplayer = 0.00015808994357;
                            break;
                        case 4:
                            multiplayer = 0.00001;
                            break;

                    }
                    ///innner switch end
                    break;



            }
            //outer switch end
            temp = calculate.convertForce(value,multiplayer);
            return temp;
        }
    }
    ///////////////////////////End Chemical Conversions

    ////////////////////////////Start Velocity  Conversions
    public double evaluateVelocity(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
        // here itom1 = from
        //here itom2 = to
        double multiplayer = 0;
        double formulavalue2 = 0.0 ;

        String symbol = "";
        double temp = 0.0;
        if(item1 == item2)
            return value;
        else
        {
            switch (item1)
            {
                case 0:////centimeter/hour
                    switch (item2){
                        case 1:
                            multiplayer = 0.016666666667;
                            break;
                        case 2:
                            multiplayer = 0.00027777777778;
                            break;
                        case 3:
                            multiplayer = 0.03280839895;
                            break;
                        case 4:
                            multiplayer = 0.00054680664917;
                            break;
                        case 5:
                            multiplayer = 0.0000091134441528;
                            break;
                        case 6:
                            multiplayer = 0.00001;
                            break;
                        case 7:
                            multiplayer = 1.6666666667e-7;
                            break;
                        case 8:
                            multiplayer = 2.7777777778e-9;
                            break;
                        case 9:
                            multiplayer = 0.0000053995680346;
                            break;
                        case 10:
                            multiplayer = 9.2656693111e-15;
                            break;
                        case 11:
                            multiplayer = 8.3804313576e-9;
                            break;
                        case 12:
                            multiplayer = 9.4147150339e-9;
                            break;
                        case 13:
                            multiplayer = 0.01;
                            break;
                        case 14:
                            multiplayer = 0.00016666666667;
                            break;
                        case 15:
                            multiplayer = 0.0000027777777778;
                            break;
                        case 16:
                            multiplayer = 0.0000062137119224;
                            break;
                        case 17:
                            multiplayer = 1.0356186537e-7;
                            break;
                        case 18:
                            multiplayer = 1.7260310895e-9;
                            break;
                        case 19:
                            multiplayer = 0.010936132983;
                            break;
                        case 20:
                            multiplayer = 0.00018226888306;
                            break;
                        case 21:
                            multiplayer = 0.0000030378147176;
                            break;

                    }
                    ///innner switch end
                    break;
                case 1:////centimeter/minute
                    switch (item2){

                        case 0:
                            multiplayer = 60;
                            break;

                        case 2:
                            multiplayer = 0.016666666667;
                            break;
                        case 3:
                            multiplayer = 1.968503937;
                            break;
                        case 4:
                            multiplayer = 0.03280839895;
                            break;
                        case 5:
                            multiplayer = 0.00054680664917;
                            break;
                        case 6:
                            multiplayer = 0.0006;
                            break;
                        case 7:
                            multiplayer = 0.00001;
                            break;
                        case 8:
                            multiplayer = 1.6666666667e-7;
                            break;
                        case 9:
                            multiplayer = 0.00032397408207;
                            break;
                        case 10:
                            multiplayer = 5.5594015866e-13;
                            break;
                        case 11:
                            multiplayer = 5.0282588145e-7;
                            break;
                        case 12:
                            multiplayer = 5.6488290203e-7;
                            break;
                        case 13:
                            multiplayer = 0.6;
                            break;
                        case 14:
                            multiplayer = 0.01;
                            break;
                        case 15:
                            multiplayer = 0.00016666666667;
                            break;
                        //////
                        case 16:
                            multiplayer = 0.035314666721;
                            break;
                        case 17:
                            multiplayer = 0.001;
                            break;
                        case 18:
                            multiplayer = 0.016018463532;
                            break;
                        case 19:
                            multiplayer = 0.00101325;
                            break;
                        case 20:
                            multiplayer = 101.325;
                            break;
                        case 21:
                            multiplayer = 101.325;
                            break;


                    }
                    ///innner switch end
                    break;
                case 2://centimeter/sound
                    switch (item2){
                        case 0:
                            multiplayer = 3600;
                            break;
                        case 1:
                            multiplayer = 60;
                            break;

                        case 3:
                            multiplayer = 118.11023622;
                            break;
                        case 4:
                            multiplayer = 1.968503937;
                            break;
                        case 5:
                            multiplayer = 0.03280839895;
                            break;
                        case 6:
                            multiplayer = 0.036;
                            break;
                        case 7:
                            multiplayer = 0.0006;
                            break;
                        case 8:
                            multiplayer = 0.00001;
                            break;
                        case 9:
                            multiplayer = 0.019438444924;
                            break;
                        case 10:
                            multiplayer = 3.335640952e-11;
                            break;
                        case 11:
                            multiplayer = 0.000030169552887;
                            break;
                        case 12:
                            multiplayer = 0.000033892974122;
                            break;
                        case 13:
                            multiplayer = 36;
                            break;
                        case 14:
                            multiplayer = 0.6;
                            break;
                        case 15:
                            multiplayer = 0.01;
                            break;

                        case 16:
                            multiplayer = 0.035314666721;
                            break;
                        case 17:
                            multiplayer = 0.001;
                            break;
                        case 18:
                            multiplayer = 0.016018463532;
                            break;
                        case 19:
                            multiplayer = 0.00101325;
                            break;
                        case 20:
                            multiplayer = 101.325;
                            break;
                        case 21:
                            multiplayer = 101.325;
                            break;


                    }

                    ///innner switch end
                    break;
                case 3://foot/hour
                    switch (item2){
                        case 0:
                            multiplayer = 30.48;
                            break;
                        case 1:
                            multiplayer = 0.508;
                            break;
                        case 2:
                            multiplayer = 0.0084666666667;
                            break;

                        case 4:
                            multiplayer = 0.016666666667;
                            break;
                        case 5:
                            multiplayer = 0.00027777777778;
                            break;
                        case 6:
                            multiplayer = 0.0003048;
                            break;
                        case 7:
                            multiplayer = 0.00000508;
                            break;
                        case 8:
                            multiplayer = 8.4666666667e-8;
                            break;
                        case 9:
                            multiplayer = 8.4666666667e-8;
                            break;
                        case 10:
                            multiplayer = 2.824176006e-13;
                            break;
                        case 11:
                            multiplayer = 2.5543554778e-7;
                            break;
                        case 12:
                            multiplayer = 2.8696051423e-7;
                            break;
                        case 13:
                            multiplayer = 0.3048;
                            break;
                        case 14:
                            multiplayer = 0.00508;
                            break;
                        case 15:
                            multiplayer = 0.000084666666667;
                            break;


                        case 16:
                            multiplayer = 0.035314666721;
                            break;
                        case 17:
                            multiplayer = 0.001;
                            break;
                        case 18:
                            multiplayer = 0.016018463532;
                            break;
                        case 19:
                            multiplayer = 0.00101325;
                            break;
                        case 20:
                            multiplayer = 101.325;
                            break;
                        case 21:
                            multiplayer = 101.325;
                            break;


                    }
                    ///innner switch end
                    break;
                case 4://foot/minute
                    switch (item2){
                        case 0:
                            multiplayer = 1828.8;
                            break;
                        case 1:
                            multiplayer = 30.48;
                            break;
                        case 2:
                            multiplayer = 0.508;
                            break;
                        case 3:
                            multiplayer = 60;
                            break;

                        case 5:
                            multiplayer = 0.016666666667;
                            break;
                        case 6:
                            multiplayer = 0.018288;
                            break;
                        case 7:
                            multiplayer = 0.0003048;
                            break;
                        case 8:
                            multiplayer = 0.00000508;
                            break;
                        case 9:
                            multiplayer = 0.0098747300216;
                            break;
                        case 10:
                            multiplayer = 1.6945056036e-11;
                            break;
                        case 11:
                            multiplayer = 0.000015326132867;
                            break;
                        case 12:
                            multiplayer = 0.000017217630854;
                            break;
                        case 13:
                            multiplayer = 18.288;
                            break;
                        case 14:
                            multiplayer = 0.3048;
                            break;
                        case 15:
                            multiplayer = 0.00508;


                            break;
                        case 16:
                            multiplayer = 0.035314666721;
                            break;
                        case 17:
                            multiplayer = 0.001;
                            break;
                        case 18:
                            multiplayer = 0.016018463532;
                            break;
                        case 19:
                            multiplayer = 0.00101325;
                            break;
                        case 20:
                            multiplayer = 101.325;
                            break;
                        case 21:
                            multiplayer = 101.325;
                            break;


                    }
                    ///innner switch end
                    break;
                case 5://foot/second
                    switch (item2){
                        case 0:
                            multiplayer = 109728;
                            break;
                        case 1:
                            multiplayer = 1828.8;
                            break;
                        case 2:
                            multiplayer = 30.48;
                            break;
                        case 3:
                            multiplayer = 3600;
                            break;
                        case 4:
                            multiplayer = 60;
                            break;

                        case 6:
                            multiplayer = 1.09728;
                            break;
                        case 7:
                            multiplayer = 0.018288;
                            break;
                        case 8:
                            multiplayer = 0.0003048;
                            break;
                        case 9:
                            multiplayer = 0.5924838013;
                            break;
                        case 10:
                            multiplayer = 1.0167033622e-9;
                            break;
                        case 11:
                            multiplayer = 0.000919567972;
                            break;
                        case 12:
                            multiplayer = 0.0010330578512;
                            break;
                        case 13:
                            multiplayer = 1097.28;
                            break;
                        case 14:
                            multiplayer = 18.288;
                            break;
                        case 15:
                            multiplayer = 0.3048;
                            break;


                        case 16:
                            multiplayer = 0.035314666721;
                            break;
                        case 17:
                            multiplayer = 0.001;
                            break;
                        case 18:
                            multiplayer = 0.016018463532;
                            break;
                        case 19:
                            multiplayer = 0.00101325;
                            break;
                        case 20:
                            multiplayer = 101.325;
                            break;
                        case 21:
                            multiplayer = 101.325;
                            break;

                    }
                    ///innner switch end
                    break;
                case 6://kilometer/houre
                    switch (item2){
                        case 0:
                            multiplayer = 100000;
                            break;
                        case 1:
                            multiplayer = 1666.6666667;
                            break;
                        case 2:
                            multiplayer = 27.777777778;
                            break;
                        case 3:
                            multiplayer = 3280.839895;
                            break;
                        case 4:
                            multiplayer = 54.680664917;
                            break;
                        case 5:
                            multiplayer = 0.91134441528;
                            break;

                        case 7:
                            multiplayer = 0.016666666667;
                            break;
                        case 8:
                            multiplayer = 0.00027777777778;
                            break;
                        case 9:
                            multiplayer = 0.53995680346;
                            break;
                        case 10:
                            multiplayer = 9.2656693111e-10;
                            break;
                        case 11:
                            multiplayer = 0.00083804313576;
                            break;
                        case 12:
                            multiplayer = 0.00094147150339;
                            break;
                        case 13:
                            multiplayer = 1000;
                            break;
                        case 14:
                            multiplayer = 16.666666667;
                            break;
                        case 15:
                            multiplayer = 0.27777777778;
                            break;


                        case 16:
                            multiplayer = 0.035314666721;
                            break;
                        case 17:
                            multiplayer = 0.001;
                            break;
                        case 18:
                            multiplayer = 0.016018463532;
                            break;
                        case 19:
                            multiplayer = 0.00101325;
                            break;
                        case 20:
                            multiplayer = 101.325;
                            break;
                        case 21:
                            multiplayer = 101.325;
                            break;


                    }
                    ///innner switch end
                    break;
                case 7://kilometer/minute
                    switch (item2){
                        case 0:
                            multiplayer = 6000000;
                            break;
                        case 1:
                            multiplayer = 100000;
                            break;
                        case 2:
                            multiplayer = 1666.6666667;
                            break;
                        case 3:
                            multiplayer = 196850.3937;
                            break;
                        case 4:
                            multiplayer = 3280.839895;
                            break;
                        case 5:
                            multiplayer = 54.680664917;
                            break;
                        case 6:
                            multiplayer = 60;
                            break;

                        case 8:
                            multiplayer = 0.016666666667;
                            break;
                        case 9:
                            multiplayer = 32.397408207;
                            break;
                        case 10:
                            multiplayer = 5.5594015866e-8;
                            break;
                        case 11:
                            multiplayer = 0.050282588145;
                            break;
                        case 12:
                            multiplayer = 0.056488290203;
                            break;
                        case 13:
                            multiplayer = 60000;
                            break;
                        case 14:
                            multiplayer = 1000;
                            break;
                        case 15:
                            multiplayer = 16.666666667;
                            break;


                        case 16:
                            multiplayer = 0.035314666721;
                            break;
                        case 17:
                            multiplayer = 0.001;
                            break;
                        case 18:
                            multiplayer = 0.016018463532;
                            break;
                        case 19:
                            multiplayer = 0.00101325;
                            break;
                        case 20:
                            multiplayer = 101.325;
                            break;
                        case 21:
                            multiplayer = 101.325;
                            break;

                    }
                    ///innner switch end
                    break;
                case 8://kilometer/second
                    switch (item2){
                        case 0:
                            multiplayer = 360000000;
                            break;
                        case 1:
                            multiplayer = 6000000;
                            break;
                        case 2:
                            multiplayer = 100000;
                            break;
                        case 3:
                            multiplayer = 11811023.622;
                            break;
                        case 4:
                            multiplayer = 196850.3937;
                            break;
                        case 5:
                            multiplayer = 3280.839895;
                            break;
                        case 6:
                            multiplayer = 3600;
                            break;
                        case 7:
                            multiplayer = 60;
                            break;

                        case 9:
                            multiplayer = 1943.8444924;
                            break;
                        case 10:
                            multiplayer = 0.000003335640952;
                            break;
                        case 11:
                            multiplayer = 3.0169552887;
                            break;
                        case 12:
                            multiplayer = 3.3892974122;
                            break;
                        case 13:
                            multiplayer = 3600000;
                            break;
                        case 14:
                            multiplayer = 60000;
                            break;
                        case 15:
                            multiplayer = 1000;
                            break;


                        case 16:
                            multiplayer = 0.035314666721;
                            break;
                        case 17:
                            multiplayer = 0.001;
                            break;
                        case 18:
                            multiplayer = 0.016018463532;
                            break;
                        case 19:
                            multiplayer = 0.00101325;
                            break;
                        case 20:
                            multiplayer = 101.325;
                            break;
                        case 21:
                            multiplayer = 101.325;
                            break;

                    }
                    ///innner switch end
                    break;
                case 9://knot
                    switch (item2){
                        case 0:
                            multiplayer = 185200;
                            break;
                        case 1:
                            multiplayer = 3086.6666667;
                            break;
                        case 2:
                            multiplayer = 51.444444444;
                            break;
                        case 3:
                            multiplayer = 6076.1154856;
                            break;
                        case 4:
                            multiplayer = 101.26859143;
                            break;
                        case 5:
                            multiplayer = 1.6878098571;
                            break;
                        case 6:
                            multiplayer = 1.852;
                            break;
                        case 7:
                            multiplayer = 0.030866666667;
                            break;
                        case 8:
                            multiplayer = 0.00051444444444;
                            break;

                        case 10:
                            multiplayer = 1.7160019564e-9;
                            break;
                        case 11:
                            multiplayer = 0.0015520558874;
                            break;
                        case 12:
                            multiplayer = 0.0017436052243;
                            break;
                        case 13:
                            multiplayer = 1852;
                            break;
                        case 14:
                            multiplayer = 30.866666667;
                            break;
                        case 15:
                            multiplayer = 0.51444444444;
                            break;


                        case 16:
                            multiplayer = 0.035314666721;
                            break;
                        case 17:
                            multiplayer = 0.001;
                            break;
                        case 18:
                            multiplayer = 0.016018463532;
                            break;
                        case 19:
                            multiplayer = 0.00101325;
                            break;
                        case 20:
                            multiplayer = 101.325;
                            break;
                        case 21:
                            multiplayer = 101.325;
                            break;

                    }
                    ///innner switch end
                    break;
                case 10://light
                    switch (item2){
                        case 0:
                            multiplayer = 107925284880000.0;
                            break;
                        case 1:
                            multiplayer = 1798754748000.0;
                            break;
                        case 2:
                            multiplayer = 29979245800.0;
                            break;
                        case 3:
                            multiplayer = 3540855803100.0;
                            break;
                        case 4:
                            multiplayer = 59014263386.0;
                            break;
                        case 5:
                            multiplayer = 983571056.43;
                            break;
                        case 6:
                            multiplayer = 1079252848.8;
                            break;
                        case 7:
                            multiplayer = 17987547.48;
                            break;
                        case 8:
                            multiplayer = 299792.458;
                            break;
                        case 9:
                            multiplayer = 582749918.36;
                            break;

                        case 11:
                            multiplayer = 904460.44168;
                            break;
                        case 12:
                            multiplayer = 1016085.8021;
                            break;
                        case 13:
                            multiplayer = 1079252848800.0;
                            break;
                        case 14:
                            multiplayer = 17987547480.0;
                            break;
                        case 15:
                            multiplayer = 299792458;
                            break;


                        case 16:
                            multiplayer = 0.035314666721;
                            break;
                        case 17:
                            multiplayer = 0.001;
                            break;
                        case 18:
                            multiplayer = 0.016018463532;
                            break;
                        case 19:
                            multiplayer = 0.00101325;
                            break;
                        case 20:
                            multiplayer = 101.325;
                            break;
                        case 21:
                            multiplayer = 101.325;
                            break;


                    }
                    ///innner switch end
                    break;
                case 11://mach (at sea level)
                    switch (item2){
                        case 0:
                            multiplayer = 119325600.0;
                            break;
                        case 1:
                            multiplayer = 1988760;
                            break;
                        case 2:
                            multiplayer = 33146;
                            break;
                        case 3:
                            multiplayer = 3914881.8898;
                            break;
                        case 4:
                            multiplayer = 65248.031496;
                            break;
                        case 5:
                            multiplayer = 1087.4671916;
                            break;
                        case 6:
                            multiplayer = 1193.256;
                            break;
                        case 7:
                            multiplayer = 19.8876;
                            break;
                        case 8:
                            multiplayer = 0.33146;
                            break;
                        case 9:
                            multiplayer = 644.30669546;
                            break;
                        case 10:
                            multiplayer = 0.0000011056315499;
                            break;

                        case 12:
                            multiplayer = 1.1234165202;
                            break;
                        case 13:
                            multiplayer = 1193256;
                            break;
                        case 14:
                            multiplayer = 19887.6;
                            break;
                        case 15:
                            multiplayer = 331.46;
                            break;


                        case 16:
                            multiplayer = 0.035314666721;
                            break;
                        case 17:
                            multiplayer = 0.001;
                            break;
                        case 18:
                            multiplayer = 0.016018463532;
                            break;
                        case 19:
                            multiplayer = 0.00101325;
                            break;
                        case 20:
                            multiplayer = 101.325;
                            break;
                        case 21:
                            multiplayer = 101.325;
                            break;


                    }
                    ///innner switch end
                    break;
                case 12://mach (SI standard)
                    switch (item2){
                        case 0:
                            multiplayer = 106216704;
                            break;
                        case 1:
                            multiplayer = 1770278.4;
                            break;
                        case 2:
                            multiplayer = 29504.64;
                            break;
                        case 3:
                            multiplayer = 3484800;
                            break;
                        case 4:
                            multiplayer = 58080;
                            break;
                        case 5:
                            multiplayer = 968;
                            break;
                        case 6:
                            multiplayer = 1062.16704;
                            break;
                        case 7:
                            multiplayer = 17.702784;
                            break;
                        case 8:
                            multiplayer = 0.2950464;
                            break;
                        case 9:
                            multiplayer = 573.52431965;
                            break;
                        case 10:
                            multiplayer = 9.8416885458e-7;
                            break;
                        case 11:
                            multiplayer = 0.8901417969;
                            break;

                        case 13:
                            multiplayer = 1062167.04;
                            break;
                        case 14:
                            multiplayer = 17702.784;
                            break;
                        case 15:
                            multiplayer = 295.0464;
                            break;


                        case 16:
                            multiplayer = 0.035314666721;
                            break;
                        case 17:
                            multiplayer = 0.001;
                            break;
                        case 18:
                            multiplayer = 0.016018463532;
                            break;
                        case 19:
                            multiplayer = 0.00101325;
                            break;
                        case 20:
                            multiplayer = 101.325;
                            break;
                        case 21:
                            multiplayer = 101.325;
                            break;

                    }
                    ///innner switch end
                    break;
                case 13://meter/houre
                    switch (item2){
                        case 0:
                            multiplayer = 100;
                            break;
                        case 1:
                            multiplayer = 1.6666666667;
                            break;
                        case 2:
                            multiplayer = 0.027777777778;
                            break;
                        case 3:
                            multiplayer = 3.280839895;
                            break;
                        case 4:
                            multiplayer = 0.054680664917;
                            break;
                        case 5:
                            multiplayer = 0.00091134441528;
                            break;
                        case 6:
                            multiplayer = 0.001;
                            break;
                        case 7:
                            multiplayer = 0.000016666666667;
                            break;
                        case 8:
                            multiplayer = 2.7777777778e-7;
                            break;
                        case 9:
                            multiplayer = 0.00053995680346;
                            break;
                        case 10:
                            multiplayer = 9.2656693111e-13;
                            break;
                        case 11:
                            multiplayer = 8.3804313576e-7;
                            break;
                        case 12:
                            multiplayer = 9.4147150339e-7;
                            break;

                        case 14:
                            multiplayer = 0.016666666667;
                            break;
                        case 15:
                            multiplayer = 0.00027777777778;
                            break;


                        case 16:
                            multiplayer = 0.035314666721;
                            break;
                        case 17:
                            multiplayer = 0.001;
                            break;
                        case 18:
                            multiplayer = 0.016018463532;
                            break;
                        case 19:
                            multiplayer = 0.00101325;
                            break;
                        case 20:
                            multiplayer = 101.325;
                            break;
                        case 21:
                            multiplayer = 101.325;
                            break;
                    }
                    ///innner switch end
                    break;
                case 14://meter/minute
                    switch (item2){
                        case 0:
                            multiplayer = 6000;
                            break;
                        case 1:
                            multiplayer = 100;
                            break;
                        case 2:
                            multiplayer = 1.6666666667;
                            break;
                        case 3:
                            multiplayer = 196.8503937;
                            break;
                        case 4:
                            multiplayer = 3.280839895;
                            break;
                        case 5:
                            multiplayer = 0.054680664917;
                            break;
                        case 6:
                            multiplayer = 0.06;
                            break;
                        case 7:
                            multiplayer = 0.001;
                            break;
                        case 8:
                            multiplayer = 0.000016666666667;
                            break;
                        case 9:
                            multiplayer = 0.032397408207;
                            break;
                        case 10:
                            multiplayer = 5.5594015866e-11;
                            break;
                        case 11:
                            multiplayer = 0.000050282588145;
                            break;
                        case 12:
                            multiplayer = 0.000056488290203;
                            break;
                        case 13:
                            multiplayer = 60;
                            break;

                        case 15:
                            multiplayer = 0.016666666667;
                            break;


                        case 16:
                            multiplayer = 0.035314666721;
                            break;
                        case 17:
                            multiplayer = 0.001;
                            break;
                        case 18:
                            multiplayer = 0.016018463532;
                            break;
                        case 19:
                            multiplayer = 0.00101325;
                            break;
                        case 20:
                            multiplayer = 101.325;
                            break;
                        case 21:
                            multiplayer = 101.325;
                            break;

                    }
                    ///innner switch end
                    break;
                case 15://meter/second
                    switch (item2){
                        case 0:
                            multiplayer = 360000;
                            break;
                        case 1:
                            multiplayer = 6000;
                            break;
                        case 2:
                            multiplayer = 100;
                            break;
                        case 3:
                            multiplayer = 11811.023622;
                            break;
                        case 4:
                            multiplayer = 196.8503937;
                            break;
                        case 5:
                            multiplayer = 3.280839895;
                            break;
                        case 6:
                            multiplayer = 3.6;
                            break;
                        case 7:
                            multiplayer = 0.06;
                            break;
                        case 8:
                            multiplayer = 0.001;
                            break;
                        case 9:
                            multiplayer = 1.9438444924;
                            break;
                        case 10:
                            multiplayer = 3.335640952e-9;
                            break;
                        case 11:
                            multiplayer = 0.0030169552887;
                            break;
                        case 12:
                            multiplayer = 0.0033892974122;
                            break;
                        case 13:
                            multiplayer = 3600;
                            break;
                        case 14:
                            multiplayer = 60;
                            break;


                        case 15:
                            multiplayer = 1;
                            break;
                        case 16:
                            multiplayer = 0.035314666721;
                            break;
                        case 17:
                            multiplayer = 0.001;
                            break;
                        case 18:
                            multiplayer = 0.016018463532;
                            break;
                        case 19:
                            multiplayer = 0.00101325;
                            break;
                        case 20:
                            multiplayer = 101.325;
                            break;
                        case 21:
                            multiplayer = 101.325;
                            break;

                    }
                    ///innner switch end
                    break;
            }
            //outer switch end
            temp = calculate.convertForce(value,multiplayer);
            return temp;
        }
    }
    ///////////////////////////End velocity Conversions

    ////////////////////////////Start Sound Conversions
    public double evaluateSound(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
        // here itom1 = from
        //here itom2 = to
        double multiplayer = 0;
        double formulavalue2 = 0.0 ;

        String symbol = "";
        double temp = 0.0;
        if(item1 == item2)
            return value;
        else
        {
            switch (item1)
            {
                case 0:////Bel
                    switch (item2){
                        case 1:
                            multiplayer = 10;
                            break;
                        case 2:
                            multiplayer = 1.1512779185;
                            break;
                    }
                    ///innner switch end
                    break;
                case 1://Decibel
                    switch (item2){
                        case 0:
                            multiplayer = 0.1;//abmpeare
                            break;
                        case 2:
                            multiplayer = 0.11512779185;
                            break;
                    }
                    ///innner switch end
                    break;
                case 2://Neper
                    switch (item2){
                        case 0:
                            multiplayer = 0.8686;
                            break;
                        case 1:
                            multiplayer = 8.686;
                            break;
                    }
                    ///innner switch end
                    break;
            }
            //outer switch end
            temp = calculate.convertForce(value,multiplayer);
            return temp;
        }
    }
    ///////////////////////////End Sound Conversions

    ////////////////////////////Start Conductance Conversions
    public double evaluateConductance(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
        // here itom1 = from
        //here itom2 = to
        double multiplayer = 0;
        double formulavalue2 = 0.0 ;

        String symbol = "";
        double temp = 0.0;
        if(item1 == item2)
            return value;
        else
        {
            switch (item1)
            {
                case 0:////abmho
                    switch (item2){
                        case 1:
                            multiplayer = 1000000000000000.0;
                            break;
                        case 2:
                            multiplayer = 1000000;
                            break;
                        case 3:
                            multiplayer = 1000;
                            break;
                        case 4:
                            multiplayer = 1000000000.0;
                            break;
                        case 5:
                            multiplayer = 1000000000000000.0;
                            break;
                        case 6:
                            multiplayer = 1000000000000000.0;
                            break;
                        case 7:
                            multiplayer = 1000000000000.0;
                            break;
                        case 8:
                            multiplayer = 1000000000.0;
                            break;
                        case 9:
                            multiplayer = 899000000000000000000.0;
                            break;

                    }
                    ///innner switch end
                    break;
                case 1:////gemmho
                    switch (item2){

                        case 0:
                            multiplayer = 1e-15;
                            break;

                        case 2:
                            multiplayer = 1e-9;
                            break;
                        case 3:
                            multiplayer = 1e-12;
                            break;
                        case 4:
                            multiplayer = 0.000001;
                            break;
                        case 5:
                            multiplayer = 1;
                            break;
                        case 6:
                            multiplayer = 1;
                            break;
                        case 7:
                            multiplayer = 0.001;
                            break;
                        case 8:
                            multiplayer = 0.000001;
                            break;
                        case 9:
                            multiplayer = 899000;
                            break;

                    }
                    ///innner switch end
                    break;
                case 2://kilosiemens
                    switch (item2){
                        case 0:
                            multiplayer = 0.000001;
                            break;
                        case 1:
                            multiplayer = 1000000000.0;
                            break;

                        case 3:
                            multiplayer = 0.001;
                            break;
                        case 4:
                            multiplayer = 1000;
                            break;
                        case 5:
                            multiplayer = 1000000000.0;
                            break;
                        case 6:
                            multiplayer = 1000000000.0;
                            break;
                        case 7:
                            multiplayer = 1000000;
                            break;
                        case 8:
                            multiplayer = 1000;
                            break;
                        case 9:
                            multiplayer = 899000000000000.0;
                            break;


                    }

                    ///innner switch end
                    break;
                case 3://megasiemens
                    switch (item2){
                        case 0:
                            multiplayer = 0.001;
                            break;
                        case 1:
                            multiplayer = 1000000000000.0;
                            break;
                        case 2:
                            multiplayer = 1000;
                            break;

                        case 4:
                            multiplayer = 1000000;
                            break;
                        case 5:
                            multiplayer = 1000000000000.0;
                            break;
                        case 6:
                            multiplayer = 1000000000000.0;
                            break;
                        case 7:
                            multiplayer = 1000000000.0;
                            break;
                        case 8:
                            multiplayer = 1000000;
                            break;
                        case 9:
                            multiplayer = 899000000000000000.0;
                            break;


                    }
                    ///innner switch end
                    break;
                case 4://mho
                    switch (item2){
                        case 0:
                            multiplayer = 1e-9;
                            break;
                        case 1:
                            multiplayer = 1000000;
                            break;
                        case 2:
                            multiplayer = 0.001;
                            break;
                        case 3:
                            multiplayer = 0.000001;
                            break;

                        case 5:
                            multiplayer = 1000000;
                            break;
                        case 6:
                            multiplayer = 1000000;
                            break;
                        case 7:
                            multiplayer = 1000;
                            break;
                        case 8:
                            multiplayer = 1;
                            break;
                        case 9:
                            multiplayer = 899000000000.0;
                            break;

                    }
                    ///innner switch end
                    break;
                case 5://micromho
                    switch (item2){
                        case 0:
                            multiplayer = 1e-15;
                            break;
                        case 1:
                            multiplayer = 1;
                            break;
                        case 2:
                            multiplayer = 1e-9;
                            break;
                        case 3:
                            multiplayer = 1e-12;
                            break;
                        case 4:
                            multiplayer = 0.000001;
                            break;

                        case 6:
                            multiplayer = 1;
                            break;
                        case 7:
                            multiplayer = 0.001;
                            break;
                        case 8:
                            multiplayer = 0.000001;
                            break;
                        case 9:
                            multiplayer = 899000;
                            break;



                    }
                    ///innner switch end
                    break;
                case 6://microsiemens
                    switch (item2){
                        case 0:
                            multiplayer = 1e-15;
                            break;
                        case 1:
                            multiplayer = 1;
                            break;
                        case 2:
                            multiplayer = 1e-9;
                            break;
                        case 3:
                            multiplayer = 1e-12;
                            break;
                        case 4:
                            multiplayer = 0.000001;
                            break;
                        case 5:
                            multiplayer = 1;
                            break;

                        case 7:
                            multiplayer = 0.001;
                            break;
                        case 8:
                            multiplayer = 0.000001;
                            break;
                        case 9:
                            multiplayer = 899000;
                            break;


                    }
                    ///innner switch end
                    break;
                case 7://millisiemens
                    switch (item2){
                        case 0:
                            multiplayer = 1e-12;
                            break;
                        case 1:
                            multiplayer = 1000;
                            break;
                        case 2:
                            multiplayer = 0.000001;
                            break;
                        case 3:
                            multiplayer = 1e-9;
                            break;
                        case 4:
                            multiplayer = 0.001;
                            break;
                        case 5:
                            multiplayer = 1000;
                            break;
                        case 6:
                            multiplayer = 1000;
                            break;

                        case 8:
                            multiplayer = 0.001;
                            break;
                        case 9:
                            multiplayer = 899000000;
                            break;


                    }
                    ///innner switch end
                    break;
                case 8://siemens
                    switch (item2){
                        case 0:
                            multiplayer = 1e-9;
                            break;
                        case 1:
                            multiplayer = 1000000;
                            break;
                        case 2:
                            multiplayer = 0.001;
                            break;
                        case 3:
                            multiplayer = 0.000001;
                            break;
                        case 4:
                            multiplayer = 1;
                            break;
                        case 5:
                            multiplayer = 1000000;
                            break;
                        case 6:
                            multiplayer = 1000000;
                            break;
                        case 7:
                            multiplayer = 1000;
                            break;

                        case 9:
                            multiplayer = 899000000000.0;
                            break;


                    }
                    ///innner switch end
                    break;
                case 9://statmho
                    switch (item2){
                        case 0:
                            multiplayer = 1.1123470523e-21;
                            break;
                        case 1:
                            multiplayer = 0.0000011123470523;
                            break;
                        case 2:
                            multiplayer = 1.1123470523e-15;
                            break;
                        case 3:
                            multiplayer = 1.1123470523e-18;
                            break;
                        case 4:
                            multiplayer = 1.1123470523e-12;
                            break;
                        case 5:
                            multiplayer = 0.0000011123470523;
                            break;
                        case 6:
                            multiplayer = 0.0000011123470523;
                            break;
                        case 7:
                            multiplayer = 1.1123470523e-9;
                            break;
                        case 8:
                            multiplayer = 1.1123470523e-12;
                            break;
                    }
                    ///innner switch end
                    break;

            }
            //outer switch end
            temp = calculate.convertForce(value,multiplayer);
            return temp;
        }
    }
    ///////////////////////////End Conductance Conversions

    ////////////////////////////Start Radiation Conversions
    public double evaluateRadiation(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
        // here itom1 = from
        //here itom2 = to
        double multiplayer = 0;
        double formulavalue2 = 0.0 ;

        String symbol = "";
        double temp = 0.0;
        if(item1 == item2)
            return value;
        else
        {
            switch (item1)
            {
                case 0:////becquerel
                    switch (item2){
                        case 1:
                            multiplayer = 2.7027027027e-11;
                            break;
                        case 2:
                            multiplayer = 60;
                            break;
                        case 3:
                            multiplayer = 1;
                            break;
                        case 4:
                            multiplayer = 1e-9;
                            break;
                        case 5:
                            multiplayer = 0.001;
                            break;
                        case 6:
                            multiplayer = 2.7027027027e-14;
                            break;
                        case 7:
                            multiplayer = 0.000001;
                            break;
                        case 8:
                            multiplayer = 0.000027027027027;
                            break;
                        case 9:
                            multiplayer = 1000;
                            break;
                        case 10:
                            multiplayer = 2.7027027027e-8;
                            break;
                        case 11:
                            multiplayer = 0.027027027027;
                            break;
                        case 12:
                            multiplayer = 27.027027027;
                            break;
                        case 13:
                            multiplayer = 0.000001;
                            break;
                        case 14:
                            multiplayer = 1e-12;
                            break;


                    }
                    ///innner switch end
                    break;
                case 1:////curie
                    switch (item2){

                        case 0:
                            multiplayer = 37000000000.0;
                            break;

                        case 2:
                            multiplayer = 2220000000000.0;
                            break;
                        case 3:
                            multiplayer = 37000000000.0;
                            break;
                        case 4:
                            multiplayer = 37;
                            break;
                        case 5:
                            multiplayer = 37000000;
                            break;
                        case 6:
                            multiplayer = 0.001;
                            break;
                        case 7:
                            multiplayer = 37000;
                            break;
                        case 8:
                            multiplayer = 1000000;
                            break;
                        case 9:
                            multiplayer = 37000000000000.0;
                            break;
                        case 10:
                            multiplayer = 1000;
                            break;
                        case 11:
                            multiplayer = 1000000000;
                            break;
                        case 12:
                            multiplayer = 1000000000000.0;
                            break;
                        case 13:
                            multiplayer = 37000;
                            break;
                        case 14:
                            multiplayer = 0.037;
                            break;


                    }
                    ///innner switch end
                    break;
                case 2://disintegrations/minute
                    switch (item2){
                        case 0:
                            multiplayer = 0.016666666667;
                            break;
                        case 1:
                            multiplayer = 4.5045045045e-13;
                            break;

                        case 3:
                            multiplayer = 0.016666666667;
                            break;
                        case 4:
                            multiplayer = 1.6666666667e-11;
                            break;
                        case 5:
                            multiplayer = 0.000016666666667;
                            break;
                        case 6:
                            multiplayer = 4.5045045045e-16;
                            break;
                        case 7:
                            multiplayer = 1.6666666667e-8;
                            break;
                        case 8:
                            multiplayer = 4.5045045045e-7;
                            break;
                        case 9:
                            multiplayer = 16.666666667;
                            break;
                        case 10:
                            multiplayer = 4.5045045045e-10;
                            break;
                        case 11:
                            multiplayer = 0.00045045045045;
                            break;
                        case 12:
                            multiplayer = 0.45045045045;
                            break;
                        case 13:
                            multiplayer = 1.6666666667e-8;
                            break;
                        case 14:
                            multiplayer = 1.6666666667e-14;
                            break;




                    }

                    ///innner switch end
                    break;
                case 3://disintegrations
                    switch (item2){
                        case 0:
                            multiplayer = 1;
                            break;
                        case 1:
                            multiplayer = 2.7027027027e-11;
                            break;
                        case 2:
                            multiplayer = 60;
                            break;

                        case 4:
                            multiplayer = 1e-9;
                            break;
                        case 5:
                            multiplayer = 0.001;
                            break;
                        case 6:
                            multiplayer = 2.7027027027e-14;
                            break;
                        case 7:
                            multiplayer = 0.000001;
                            break;
                        case 8:
                            multiplayer = 0.000027027027027;
                            break;
                        case 9:
                            multiplayer = 1000;
                            break;
                        case 10:
                            multiplayer = 2.7027027027e-8;
                            break;
                        case 11:
                            multiplayer = 0.027027027027;
                            break;
                        case 12:
                            multiplayer = 27.027027027;
                            break;
                        case 13:
                            multiplayer = 0.000001;
                            break;
                        case 14:
                            multiplayer = 1e-12;
                            break;




                    }
                    ///innner switch end
                    break;
                case 4://gigabecquerel
                    switch (item2){
                        case 0:
                            multiplayer = 1000000000.0;
                            break;
                        case 1:
                            multiplayer = 0.027027027027;
                            break;
                        case 2:
                            multiplayer = 60000000000.0;
                            break;
                        case 3:
                            multiplayer = 1000000000.0;
                            break;

                        case 5:
                            multiplayer = 1000000;
                            break;
                        case 6:
                            multiplayer = 0.000027027027027;
                            break;
                        case 7:
                            multiplayer = 1000;
                            break;
                        case 8:
                            multiplayer = 27027.027027;
                            break;
                        case 9:
                            multiplayer = 1000000000000.0;
                            break;
                        case 10:
                            multiplayer = 27.027027027;
                            break;
                        case 11:
                            multiplayer = 27027027.027;
                            break;
                        case 12:
                            multiplayer = 27027027027.0;
                            break;
                        case 13:
                            multiplayer = 1000;
                            break;
                        case 14:
                            multiplayer = 0.001;
                            break;



                    }
                    ///innner switch end
                    break;
                case 5://kilobecquerel
                    switch (item2){
                        case 0:
                            multiplayer = 1000;
                            break;
                        case 1:
                            multiplayer = 2.7027027027e-8;
                            break;
                        case 2:
                            multiplayer = 60000;
                            break;
                        case 3:
                            multiplayer = 1000;
                            break;
                        case 4:
                            multiplayer = 0.000001;
                            break;

                        case 6:
                            multiplayer = 2.7027027027e-11;
                            break;
                        case 7:
                            multiplayer = 0.001;
                            break;
                        case 8:
                            multiplayer = 0.027027027027;
                            break;
                        case 9:
                            multiplayer = 1000000;
                            break;
                        case 10:
                            multiplayer = 0.000027027027027;
                            break;
                        case 11:
                            multiplayer = 27.027027027;
                            break;
                        case 12:
                            multiplayer = 27027.027027;
                            break;
                        case 13:
                            multiplayer = 0.001;
                            break;
                        case 14:
                            multiplayer = 1e-9;
                            break;



                    }
                    ///innner switch end
                    break;
                case 6://kilocurie
                    switch (item2){
                        case 0:
                            multiplayer = 37000000000000.0;
                            break;
                        case 1:
                            multiplayer = 1000;
                            break;
                        case 2:
                            multiplayer = 2220000000000000.0;
                            break;
                        case 3:
                            multiplayer = 37000000000000.0;
                            break;
                        case 4:
                            multiplayer = 37000;
                            break;
                        case 5:
                            multiplayer = 37000000000.0;
                            break;

                        case 7:
                            multiplayer = 37000000;
                            break;
                        case 8:
                            multiplayer = 1000000000.0;
                            break;
                        case 9:
                            multiplayer = 37000000000000000.0;
                            break;
                        case 10:
                            multiplayer = 1000000;
                            break;
                        case 11:
                            multiplayer = 1000000000000.0;
                            break;
                        case 12:
                            multiplayer = 1000000000000000.0;
                            break;
                        case 13:
                            multiplayer = 37000000;
                            break;
                        case 14:
                            multiplayer = 37;
                            break;




                    }
                    ///innner switch end
                    break;
                case 7://megabecquerel
                    switch (item2){
                        case 0:
                            multiplayer = 1000000;
                            break;
                        case 1:
                            multiplayer = 0.000027027027027;
                            break;
                        case 2:
                            multiplayer = 60000000;
                            break;
                        case 3:
                            multiplayer = 1000000;
                            break;
                        case 4:
                            multiplayer = 0.001;
                            break;
                        case 5:
                            multiplayer = 1000;
                            break;
                        case 6:
                            multiplayer = 2.7027027027e-8;
                            break;

                        case 8:
                            multiplayer = 27.027027027;
                            break;
                        case 9:
                            multiplayer = 1000000000.0;
                            break;
                        case 10:
                            multiplayer = 0.027027027027;
                            break;
                        case 11:
                            multiplayer = 27027.027027;
                            break;
                        case 12:
                            multiplayer = 27027027.027;
                            break;
                        case 13:
                            multiplayer = 1;
                            break;
                        case 14:
                            multiplayer = 0.000001;
                            break;



                    }
                    ///innner switch end
                    break;
                case 8://microcurie
                    switch (item2){
                        case 0:
                            multiplayer = 37000;
                            break;
                        case 1:
                            multiplayer = 0.000001;
                            break;
                        case 2:
                            multiplayer = 2220000;
                            break;
                        case 3:
                            multiplayer = 37000;
                            break;
                        case 4:
                            multiplayer = 0.000037;
                            break;
                        case 5:
                            multiplayer = 37;
                            break;
                        case 6:
                            multiplayer = 1e-9;
                            break;
                        case 7:
                            multiplayer = 0.037;
                            break;

                        case 9:
                            multiplayer = 37000000;
                            break;
                        case 10:
                            multiplayer = 0.001;
                            break;
                        case 11:
                            multiplayer = 1000;
                            break;
                        case 12:
                            multiplayer = 1000000;
                            break;
                        case 13:
                            multiplayer = 0.037;
                            break;
                        case 14:
                            multiplayer = 3.7e-8;
                            break;




                    }
                    ///innner switch end
                    break;
                case 9://millibecquerel
                    switch (item2){
                        case 0:
                            multiplayer = 0.001;
                            break;
                        case 1:
                            multiplayer = 2.7027027027e-14;
                            break;
                        case 2:
                            multiplayer = 0.06;
                            break;
                        case 3:
                            multiplayer = 0.001;
                            break;
                        case 4:
                            multiplayer = 1e-12;
                            break;
                        case 5:
                            multiplayer = 0.000001;
                            break;
                        case 6:
                            multiplayer = 2.7027027027e-17;
                            break;
                        case 7:
                            multiplayer = 1e-9;
                            break;
                        case 8:
                            multiplayer = 2.7027027027e-8;
                            break;

                        case 10:
                            multiplayer = 2.7027027027e-11;
                            break;
                        case 11:
                            multiplayer = 0.000027027027027;
                            break;
                        case 12:
                            multiplayer = 0.027027027027;
                            break;
                        case 13:
                            multiplayer = 1e-9;
                            break;
                        case 14:
                            multiplayer = 1e-15;
                            break;




                    }
                    ///innner switch end
                    break;
                case 10://millicurie
                    switch (item2){
                        case 0:
                            multiplayer = 37000000;
                            break;
                        case 1:
                            multiplayer = 0.001;
                            break;
                        case 2:
                            multiplayer = 2220000000.0;
                            break;
                        case 3:
                            multiplayer = 37000000;
                            break;
                        case 4:
                            multiplayer = 0.037;
                            break;
                        case 5:
                            multiplayer = 37000;
                            break;
                        case 6:
                            multiplayer = 0.000001;
                            break;
                        case 7:
                            multiplayer = 37;
                            break;
                        case 8:
                            multiplayer = 1000;
                            break;
                        case 9:
                            multiplayer = 37000000000.0;
                            break;

                        case 11:
                            multiplayer = 1000000;
                            break;
                        case 12:
                            multiplayer = 1000000000.0;
                            break;
                        case 13:
                            multiplayer = 37;
                            break;
                        case 14:
                            multiplayer = 0.000037;
                            break;




                    }
                    ///innner switch end
                    break;
                case 11://nanocurie
                    switch (item2){
                        case 0:
                            multiplayer = 37;
                            break;
                        case 1:
                            multiplayer = 1e-9;
                            break;
                        case 2:
                            multiplayer = 2220;
                            break;
                        case 3:
                            multiplayer = 37;
                            break;
                        case 4:
                            multiplayer = 3.7e-8;
                            break;
                        case 5:
                            multiplayer = 0.037;
                            break;
                        case 6:
                            multiplayer = 1e-12;
                            break;
                        case 7:
                            multiplayer = 0.000037;
                            break;
                        case 8:
                            multiplayer = 0.001;
                            break;
                        case 9:
                            multiplayer = 37000;
                            break;
                        case 10:
                            multiplayer = 0.000001;
                            break;

                        case 12:
                            multiplayer = 1000;
                            break;
                        case 13:
                            multiplayer = 0.000037;
                            break;
                        case 14:
                            multiplayer = 3.7e-11;
                            break;




                    }
                    ///innner switch end
                    break;
                case 12://picocurie
                    switch (item2){
                        case 0:
                            multiplayer = 0.037;
                            break;
                        case 1:
                            multiplayer = 1e-12;
                            break;
                        case 2:
                            multiplayer = 2.22;
                            break;
                        case 3:
                            multiplayer = 0.037;
                            break;
                        case 4:
                            multiplayer = 3.7e-11;
                            break;
                        case 5:
                            multiplayer = 0.000037;
                            break;
                        case 6:
                            multiplayer = 1e-15;
                            break;
                        case 7:
                            multiplayer = 3.7e-8;
                            break;
                        case 8:
                            multiplayer = 0.000001;
                            break;
                        case 9:
                            multiplayer = 37;
                            break;
                        case 10:
                            multiplayer = 1e-9;
                            break;
                        case 11:
                            multiplayer = 0.001;
                            break;

                        case 13:
                            multiplayer = 3.7e-8;
                            break;
                        case 14:
                            multiplayer = 3.7e-14;
                            break;




                    }
                    ///innner switch end
                    break;
                case 13://rutherford
                    switch (item2){
                        case 0:
                            multiplayer = 1000000;
                            break;
                        case 1:
                            multiplayer = 0.000027027027027;
                            break;
                        case 2:
                            multiplayer = 60000000;
                            break;
                        case 3:
                            multiplayer = 1000000;
                            break;
                        case 4:
                            multiplayer = 0.001;
                            break;
                        case 5:
                            multiplayer = 1000;
                            break;
                        case 6:
                            multiplayer = 2.7027027027e-8;
                            break;
                        case 7:
                            multiplayer = 1;
                            break;
                        case 8:
                            multiplayer = 27027027.027;
                            break;
                        case 9:
                            multiplayer = 1000000000;
                            break;
                        case 10:
                            multiplayer = 0.027027027027;
                            break;
                        case 11:
                            multiplayer = 27027.027027;
                            break;
                        case 12:
                            multiplayer = 27027027.027;
                            break;
                        case 14:
                            multiplayer = 0.000001;
                            break;



                    }
                    ///innner switch end
                    break;
                case 14://terabecquerel
                    switch (item2){
                        case 0:
                            multiplayer = 1000000000000.0;
                            break;
                        case 1:
                            multiplayer = 27.027027027;
                            break;
                        case 2:
                            multiplayer = 60000000000000.0;
                            break;
                        case 3:
                            multiplayer = 1000000000000.0;
                            break;
                        case 4:
                            multiplayer = 1000;
                            break;
                        case 5:
                            multiplayer = 1000000000;
                            break;
                        case 6:
                            multiplayer = 0.027027027027;
                            break;
                        case 7:
                            multiplayer = 1000000;
                            break;
                        case 8:
                            multiplayer = 27027027.027;
                            break;
                        case 9:
                            multiplayer = 1000000000000000.0;
                            break;
                        case 10:
                            multiplayer = 27027.027027;
                            break;
                        case 11:
                            multiplayer = 27027027027.0;
                            break;
                        case 12:
                            multiplayer = 27027027027000.0;
                            break;
                        case 13:
                            multiplayer = 1000000;
                            break;



                    }
                    ///innner switch end
                    break;

            }
            //outer switch end
            temp = calculate.convertForce(value,multiplayer);
            return temp;
        }
    }
    ///////////////////////////End Radiation  Conversions

    ////////////////////////////Start Radiation dose_equivalent Conversions
    public double evaluateRadiationDoesEquivalent(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
        // here itom1 = from
        //here itom2 = to
        double multiplayer = 0;
        double formulavalue2 = 0.0 ;

        String symbol = "";
        double temp = 0.0;
        if(item1 == item2)
            return value;
        else
        {
            switch (item1)
            {
                case 0:////gray(Wr=1, X-ray, gamma ray, electr.)
                    switch (item2){
                        case 1:
                            multiplayer = 0.05;
                            break;
                        case 2:
                            multiplayer = 1;
                            break;
                        case 3:
                            multiplayer = 1;
                            break;
                        case 4:
                            multiplayer = 1000000;
                            break;
                        case 5:
                            multiplayer = 100000;
                            break;
                        case 6:
                            multiplayer = 1000;
                            break;
                        case 7:
                            multiplayer = 100;
                            break;
                        case 8:
                            multiplayer = 1;
                            break;
                        case 9:
                            multiplayer = 1;
                            break;

                    }
                    ///innner switch end
                    break;
                case 1:////gray (Wr=20, alpha particles)
                    switch (item2){

                        case 0:
                            multiplayer = 20;
                            break;

                        case 2:
                            multiplayer = 20;
                            break;
                        case 3:
                            multiplayer = 20;
                            break;
                        case 4:
                            multiplayer = 20000000;
                            break;
                        case 5:
                            multiplayer = 2000000;
                            break;
                        case 6:
                            multiplayer = 20000;
                            break;
                        case 7:
                            multiplayer = 2000;
                            break;
                        case 8:
                            multiplayer = 20;
                            break;
                        case 9:
                            multiplayer = 20;
                            break;

                    }
                    ///innner switch end
                    break;
                case 2://intensity millicurie
                    switch (item2){
                        case 0:
                            multiplayer = 1;
                            break;
                        case 1:
                            multiplayer = 0.05;
                            break;

                        case 3:
                            multiplayer = 1;
                            break;
                        case 4:
                            multiplayer = 1000000;
                            break;
                        case 5:
                            multiplayer = 100000;
                            break;
                        case 6:
                            multiplayer = 1000;
                            break;
                        case 7:
                            multiplayer = 100;
                            break;
                        case 8:
                            multiplayer = 1;
                            break;
                        case 9:
                            multiplayer = 1;
                            break;


                    }

                    ///innner switch end
                    break;
                case 3://joule/kilogram
                    switch (item2){
                        case 0:
                            multiplayer = 1;
                            break;
                        case 1:
                            multiplayer = 0.05;
                            break;
                        case 2:
                            multiplayer = 1;
                            break;

                        case 4:
                            multiplayer = 1000000;
                            break;
                        case 5:
                            multiplayer = 100000;
                            break;
                        case 6:
                            multiplayer = 1000;
                            break;
                        case 7:
                            multiplayer = 100;
                            break;
                        case 8:
                            multiplayer = 1;
                            break;
                        case 9:
                            multiplayer = 1;
                            break;



                    }
                    ///innner switch end
                    break;
                case 4://microsievert
                    switch (item2){
                        case 0:
                            multiplayer = 0.000001;
                            break;
                        case 1:
                            multiplayer = 5e-8;
                            break;
                        case 2:
                            multiplayer = 0.000001;
                            break;
                        case 3:
                            multiplayer = 0.000001;
                            break;

                        case 5:
                            multiplayer = 0.1;
                            break;
                        case 6:
                            multiplayer = 0.001;
                            break;
                        case 7:
                            multiplayer = 0.0001;
                            break;
                        case 8:
                            multiplayer = 0.000001;
                            break;
                        case 9:
                            multiplayer = 0.000001;
                            break;

                    }
                    ///innner switch end
                    break;
                case 5://millirem
                    switch (item2){
                        case 0:
                            multiplayer = 0.00001;
                            break;
                        case 1:
                            multiplayer = 5e-7;
                            break;
                        case 2:
                            multiplayer = 0.00001;
                            break;
                        case 3:
                            multiplayer = 0.00001;
                            break;
                        case 4:
                            multiplayer = 10;
                            break;

                        case 6:
                            multiplayer = 0.01;
                            break;
                        case 7:
                            multiplayer = 0.001;
                            break;
                        case 8:
                            multiplayer = 0.00001;
                            break;
                        case 9:
                            multiplayer = 0.00001;
                            break;


                    }
                    ///innner switch end
                    break;
                case 6://millisievert
                    switch (item2){
                        case 0:
                            multiplayer = 0.001;
                            break;
                        case 1:
                            multiplayer = 0.00005;
                            break;
                        case 2:
                            multiplayer = 0.001;
                            break;
                        case 3:
                            multiplayer = 0.001;
                            break;
                        case 4:
                            multiplayer = 1000;
                            break;
                        case 5:
                            multiplayer = 100;
                            break;

                        case 7:
                            multiplayer = 0.1;
                            break;
                        case 8:
                            multiplayer = 0.001;
                            break;
                        case 9:
                            multiplayer = 0.001;
                            break;



                    }
                    ///innner switch end
                    break;
                case 7://Rem
                    switch (item2){
                        case 0:
                            multiplayer = 0.01;
                            break;
                        case 1:
                            multiplayer = 0.0005;
                            break;
                        case 2:
                            multiplayer = 0.01;
                            break;
                        case 3:
                            multiplayer = 0.01;
                            break;
                        case 4:
                            multiplayer = 10000;
                            break;
                        case 5:
                            multiplayer = 1000;
                            break;
                        case 6:
                            multiplayer = 10;
                            break;

                        case 8:
                            multiplayer = 0.01;
                            break;
                        case 9:
                            multiplayer = 0.01;
                            break;


                    }
                    ///innner switch end
                    break;
                case 8://sievert
                    switch (item2){
                        case 0:
                            multiplayer = 1;
                            break;
                        case 1:
                            multiplayer = 0.05;
                            break;
                        case 2:
                            multiplayer = 1;
                            break;
                        case 3:
                            multiplayer = 1;
                            break;
                        case 4:
                            multiplayer = 1000000;
                            break;
                        case 5:
                            multiplayer = 100000;
                            break;
                        case 6:
                            multiplayer = 1000;
                            break;
                        case 7:
                            multiplayer = 100;
                            break;

                        case 9:
                            multiplayer = 1;
                            break;


                    }
                    ///innner switch end
                    break;
                case 9://square meter/square second
                    switch (item2){
                        case 0:
                            multiplayer = 1;
                            break;
                        case 1:
                            multiplayer = 0.05;
                            break;
                        case 2:
                            multiplayer = 1;
                            break;
                        case 3:
                            multiplayer = 1;
                            break;
                        case 4:
                            multiplayer = 1000000;
                            break;
                        case 5:
                            multiplayer = 100000;
                            break;
                        case 6:
                            multiplayer = 1000;
                            break;
                        case 7:
                            multiplayer = 100;
                            break;
                        case 8:
                            multiplayer = 1;
                            break;



                    }
                    ///innner switch end
                    break;

            }
            //outer switch end
            temp = calculate.convertForce(value,multiplayer);
            return temp;
        }
    }
    ///////////////////////////End Radiation dose_equivalent Conversions


    ////////////////////////////Start Radiation Exposure Conversions
    public double evaluateRadiationExposure(int item1,int item2,double value)
    {
        calculate = new ConvertingUnits();
        // here itom1 = from
        //here itom2 = to
        double multiplayer = 0;
        double formulavalue2 = 0.0 ;

        String symbol = "";
        double temp = 0.0;
        if(item1 == item2)
            return value;
        else
        {
            switch (item1)
            {
                case 0:////coulomb/kilogram
                    switch (item2){
                        case 1:
                            multiplayer = 1000000;
                            break;
                        case 2:
                            multiplayer = 1000;
                            break;
                        case 3:
                            multiplayer = 3875.9689922;
                            break;

                    }
                    ///innner switch end
                    break;
                case 1://microcoulomb/kilogram
                    switch (item2) {
                        case 0:
                            multiplayer = 0.000001;
                            break;
                        case 2:
                            multiplayer = 0.001;
                            break;
                        case 3:
                            multiplayer = 0.0038759689922;
                            break;

                    }
                    ///innner switch end
                    break;
                case 2://millicoulomb/kilogram
                    switch (item2){
                        case 0:
                            multiplayer = 0.001;
                            break;
                        case 1:
                            multiplayer = 1000;
                            break;
                        case 3:
                            multiplayer = 3.8759689922;
                            break;

                    }
                    ///innner switch end
                    break;
                case 3://roentgen
                    switch (item2){
                        case 0:
                            multiplayer = 0.000258;
                            break;
                        case 1:
                            multiplayer = 258;
                            break;
                        case 2:
                            multiplayer = 0.258;
                            break;

                    }
                    ///innner switch end
                    break;


            }
            //outer switch end
            temp = calculate.convertForce(value,multiplayer);
            return temp;
        }
    }
    ///////////////////////////End Radiation Exposure Conversions
// start Torque
    public double evaluateTorque(int item1, int item2, double value){
        calculate = new ConvertingUnits();
        double [] valuesArray =  {1.0,0.01,10.0,0.001019716213,0.00001019716213,0.01019716213,0.000001019716213,1.019716213e-8,0.00001019716213,
                1e-10,0.00001,1e-7,0.0001,0.0000011800994078,0.000014161192894,7.3756212117e-8,8.850745454e-7};
            return  calculate.covertWithThirdModel(valuesArray[item1],valuesArray[item2],value);
    }
    // end Torque
}

