package eclixtech.com.unitconvertor.Data;

import android.content.Context;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import eclixtech.com.unitconvertor.MainActivity;
import eclixtech.com.unitconvertor.Modle.modelSearch;
import eclixtech.com.unitconvertor.R;

/**
 * Created by rehan on 2/26/2018.
 */
public class data {
    Context getContext;
        public data(Context context){
            getContext = context;
        }
   public List<modelSearch> getListOfUnits(){
        int arrayStrings = R.array.searchmainscreen;
        int arrayimage = R.array.searchmainscreenimage;
        List<modelSearch> dataArrylist = null;
        String[] stringArray = getContext.getResources().getStringArray(arrayStrings);
        List<String> myResArrayStringsList = Arrays.asList(stringArray);
        List<String> myResMutableStringList = new ArrayList<String>(myResArrayStringsList);
        ///
        String[] symbolsArray = getContext.getResources().getStringArray(arrayimage);
        List<String> myResArraySymbolsList = Arrays.asList(symbolsArray);
        List<String> myResMutableSymbolsList = new ArrayList<String>(myResArraySymbolsList);
        int i = 0;
        //  DecimalFormat df = new DecimalFormat("#.##########");
        if (i <= myResMutableStringList.size() ) {
            dataArrylist = new ArrayList<>();
            do {
                modelSearch data = new modelSearch();
                data.setUnitName(myResMutableStringList.get(i));
                data.setImage(myResMutableSymbolsList.get(i));
                //    df.format(evaluate.evaluateLength(item1, i, value1))
                // data.setUnitResult(String.valueOf(getResults(item1, i, value1)));
                dataArrylist.add(data);
                i++;
            } while (i != myResMutableStringList.size());
        } else {
            return null;
        }
        return dataArrylist;
    }
    public List<modelSearch> getListOfUnitsForFav(){
        int arrayStrings = R.array.searchmainscreen;
        int arrayimage = R.array.searchmainscreenimage;
        List<modelSearch> dataArrylist = null;
        String[] stringArray = getContext.getResources().getStringArray(arrayStrings);
        List<String> myResArrayStringsList = Arrays.asList(stringArray);
        List<String> myResMutableStringList = new ArrayList<String>(myResArrayStringsList);
        ///
        String[] symbolsArray = getContext.getResources().getStringArray(arrayimage);
        List<String> myResArraySymbolsList = Arrays.asList(symbolsArray);
        List<String> myResMutableSymbolsList = new ArrayList<String>(myResArraySymbolsList);
        int i = 0;
        //  DecimalFormat df = new DecimalFormat("#.##########");
        if (i <= myResMutableStringList.size() ) {
            dataArrylist = new ArrayList<>();
            do {
                modelSearch data = new modelSearch();
                data.setUnitName(myResMutableStringList.get(i));
                data.setImage(myResMutableSymbolsList.get(i));
                //    df.format(evaluate.evaluateLength(item1, i, value1))
                // data.setUnitResult(String.valueOf(getResults(item1, i, value1)));
                dataArrylist.add(data);
                i++;
            } while (i != myResMutableStringList.size());
        } else {
            return null;
        }
        return dataArrylist;
    }
}
