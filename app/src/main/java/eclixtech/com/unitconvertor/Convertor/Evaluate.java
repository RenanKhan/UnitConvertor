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
            temp = caFuel.convert(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    /////////////////end digital



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
    ///////////////////////////End fuel

    /////Volume
    public double evaluateVolume(int item1,int item2,double value)
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
            temp = caFuel.convert(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    /////////////////end Volume

    ////////////////////////////Start Time
    public double evaluateTime(int item1,int item2,double value)
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
            temp = caFuel.convert(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    ///////////////////////////End Time


    ////////////////////////////Start Torque
    public double evaluateTorque(int item1,int item2,double value)
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
            temp = caFuel.convert(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    ///////////////////////////End Torque


    ////////////////////////////Start Speed
    public double evaluateSpeed(int item1,int item2,double value)
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
            temp = caFuel.convert(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    ///////////////////////////End Speed


    ////////////////////////////Start Pressure
    public double evaluatePressure(int item1,int item2,double value)
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
            temp = caFuel.convert(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    ///////////////////////////End Pressure

    ////////////////////////////Start Power
    public double evaluatePower(int item1,int item2,double value)
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
            temp = caFuel.convert(value,itom1ConversionToBase,itom1ConversionFromBase,itom2ConversionToBase,itom2ConversionFromBase,symbol);
            return temp;
        }
    }
    ///////////////////////////End Power

}
