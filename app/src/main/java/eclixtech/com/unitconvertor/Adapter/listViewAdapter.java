package eclixtech.com.unitconvertor.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import eclixtech.com.unitconvertor.Modle.unitConvertorListModel;
import eclixtech.com.unitconvertor.R;

/**
 * Created by rehan on 12/13/2017.
 */
public class listViewAdapter extends BaseAdapter{
    public Context context;
    private List<unitConvertorListModel> dataList,filterList,fulldata;;
    public listViewAdapter(Context context, List<unitConvertorListModel> dataList){
        this.context = context;
        this.dataList = dataList;

        this.fulldata = new ArrayList<>();
        this.fulldata.addAll(dataList);

    }
    @Override
    public int getCount() {
        return  dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return  dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.listviewitom, null);
        TextView unitNameTextView = (TextView) v.findViewById(R.id.unitname);
        String unitNameString =    dataList.get(position).getUnitName();
        TextView unitSysbolTextView= (TextView) v.findViewById(R.id.unitsymbol);
       String unitSysbolString =    dataList.get(position).getUnitSymbol();
        TextView unitResutTextView= (TextView) v.findViewById(R.id.unitresult);
        String unitResultString =    dataList.get(position).getUnitResult();
        unitNameTextView.setText(unitNameString);
        unitSysbolTextView.setText(unitSysbolString);
        unitResutTextView.setText(unitResultString);
        return v;
    }
    public class filter_here extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults Result = new FilterResults();
            String filterString = constraint.toString().toLowerCase();
            String filterAbleString;
            filterList = new ArrayList<>();
            //filterList.clear();
            for(int i = 0; i< dataList.size(); i++){
                filterAbleString = dataList.get(i).getUnitName();
                if(filterAbleString.toLowerCase().contains(filterString)){
                    if(dataList.get(i).getUnitName().length() != 1) {
                        filterList.add(dataList.get(i));
                        Log.e("filtersize", String.valueOf(filterList.size()));
                        Log.e("homersize", String.valueOf(dataList.size()));
                    }
                    else {
                        //  filterList.clear();
                        Log.e("singleword", String.valueOf(dataList.size()));
                        //   isgetaltername=false;
                    }}
            }
            if(constraint.equals("")){
                filterList.clear();
                dataList.clear();
                filterList.addAll(fulldata);
            }
            Result.values = filterList;
            Result.count = filterList.size();
            return Result;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            if(filterList.size() < fulldata.size()){
                dataList.clear();
                dataList.addAll(filterList);
                notifyDataSetChanged();
            } else {
                dataList.addAll(fulldata);
                notifyDataSetChanged();
            }
        }
    }

    public Filter getFilter() {
        // TODO Auto-generated method stub
        Filter fill = new filter_here();
        return fill;
    }
}
