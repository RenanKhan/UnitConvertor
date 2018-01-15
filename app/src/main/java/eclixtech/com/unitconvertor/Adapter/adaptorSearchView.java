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

import eclixtech.com.unitconvertor.Modle.modelSearch;
import eclixtech.com.unitconvertor.R;

/**
 * Created by rehan on 1/2/2018.
 */
public class AdaptorSearchView extends BaseAdapter {
        public Context context;
        private List<modelSearch> dataList,filterList,fulldata;;
        public AdaptorSearchView(Context context, List<modelSearch> dataList){
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
            View v = View.inflate(context, R.layout.dailogsearchitomlistview, null);
            TextView unitNameTextView = (TextView) v.findViewById(R.id.listunitname);
            ImageView imageView = (ImageView) v.findViewById(R.id.listimageview);
            String unitNameString = dataList.get(position).getUnitName();
            String imageName = dataList.get(position).getImage();
            Resources res = context.getResources();
         //   String mDrawableName = "logo_default";
            int resID = res.getIdentifier(imageName , "drawable", context.getPackageName());
            if(resID != 0) {
                Drawable drawable = res.getDrawable(resID);
                imageView.setImageDrawable(drawable);
            }
           /* TextView unitSysbolTextView= (TextView) v.findViewById(R.id.unitsymbol);
            String unitSysbolString =    dataList.get(position).getUnitSymbol();*/
           /* TextView unitResutTextView= (TextView) v.findViewById(R.id.unitresult);
            String unitResultString =    dataList.get(position).getUnitResult();*/
            unitNameTextView.setText(unitNameString);
         //   unitSysbolTextView.setText(unitSysbolString);
           // unitResutTextView.setText(unitResultString);
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
        }
    }


