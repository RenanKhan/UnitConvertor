package eclixtech.com.unitconvertor.Convertor;

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


    ////////////////////////////Start Torque
    public double evaluateTorque(int item1,int item2,double value)
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
                    itom1ConversionToBase = 1.3558179483314004;
                    itom1ConversionFromBase = 0.7375621494575464935503;
                    break;
                case 2:
                    itom1ConversionToBase =  0.1129848290276167;
                    itom1ConversionFromBase = 8.850745793490557922604;
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
                    itom2ConversionToBase = 1.3558179483314004;
                    itom2ConversionFromBase = 0.7375621494575464935503;
                    break;
                case 2:
                    itom2ConversionToBase =  0.1129848290276167;
                    itom2ConversionFromBase = 8.850745793490557922604;
                    //symbol = "L_100K+from";
                    break;

            }
            temp = calculate.convert(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    ///////////////////////////End Torque


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
}
