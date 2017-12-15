package eclixtech.com.unitconvertor.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import eclixtech.com.unitconvertor.Modle.unitConvertorListModel;
import eclixtech.com.unitconvertor.R;

/**
 * Created by rehan on 12/13/2017.
 */
public class listViewAdapter extends BaseAdapter{
    public Context context;
    private List<unitConvertorListModel> unitConvertorListDataList;
    public listViewAdapter(Context context, List<unitConvertorListModel>  unitConvertorListDataList){
        this.context = context;
        this. unitConvertorListDataList =  unitConvertorListDataList;

    }
    @Override
    public int getCount() {
        return  unitConvertorListDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return  unitConvertorListDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.listviewitom, null);
        TextView unitNameTextView = (TextView) v.findViewById(R.id.unitname);
        String unitNameString =    unitConvertorListDataList.get(position).getUnitName();
       // TextView unitSysbolTextView= (TextView) v.findViewById(R.id.unitsymbol);
     //   String unitSysbolString =    unitConvertorListDataList.get(position).getUnitSymbol();
        TextView unitResutTextView= (TextView) v.findViewById(R.id.unitresult);
        String unitResultString =    unitConvertorListDataList.get(position).getUnitResult();
        unitNameTextView.setText(unitNameString);
        //unitSysbolTextView.setText(unitSysbolString);
        unitResutTextView.setText(unitResultString);
        return v;
    }
}
