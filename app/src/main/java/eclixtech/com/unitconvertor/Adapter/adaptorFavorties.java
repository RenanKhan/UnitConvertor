package eclixtech.com.unitconvertor.Adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import eclixtech.com.unitconvertor.Model.unitModel;
import eclixtech.com.unitconvertor.Modle.unitConvertorListModel;
import eclixtech.com.unitconvertor.R;

/**
 * Created by rehan on 2/28/2018.
 */
public class adaptorFavorties extends BaseAdapter{
    public Context context;
    private List<unitModel> dataList,filterList,fulldata;;
    public adaptorFavorties(Context context, List<unitModel> dataList){
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
        View v = View.inflate(context, R.layout.favorties_itom_for_listview, null);
        TextView categoryTextView = (TextView) v.findViewById(R.id.category);
        TextView hideDataTextView = (TextView) v.findViewById(R.id.hidedata);
        ImageView uniImage = (ImageView) v.findViewById(R.id.unit_image);

        String hideString = dataList.get(position).getItemOne() +":"+ dataList.get(position).getItemTow()+":"+ dataList.get(position).getCategory_id()+":"+ dataList.get(position).getId()+":" +dataList.get(position).getCategory_array_id();
        hideDataTextView.setText(hideString);
        String category =    dataList.get(position).getCategory();
        String upperStringCategory = category.substring(0,1).toUpperCase() + category.substring(1);
        int categoryArrayId =    dataList.get(position).getCategory_array_id();
        String[] arr = context.getResources().getStringArray(categoryArrayId);
        TextView itomOneTextView = (TextView) v.findViewById(R.id.itemone_fav);
        int itemOne  = dataList.get(position).getItemOne();
        String itemOneString =  arr[itemOne];
        int itemTow  = dataList.get(position).getItemTow();
        String itomTowString = arr[itemTow];
        TextView itomTowTextView = (TextView) v.findViewById(R.id.itomtow_fav);

        Resources res = context.getResources();
        int resID = res.getIdentifier(dataList.get(position).getCategory() , "drawable", context.getPackageName());
        if(resID != 0) {
            Drawable drawable = res.getDrawable(resID);
            uniImage.setImageDrawable(drawable);
        }
        categoryTextView.setText(upperStringCategory);
        itomOneTextView.setText(itemOneString);
        itomTowTextView.setText(itomTowString);
        return v;
    }
   /* public class filter_here extends Filter {
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
                    }
                }
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
    }*/
}
