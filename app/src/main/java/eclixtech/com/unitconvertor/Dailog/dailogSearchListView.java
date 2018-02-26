package eclixtech.com.unitconvertor.Dailog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import eclixtech.com.unitconvertor.Adapter.AdaptorSearchView;
import eclixtech.com.unitconvertor.Data.data;
import eclixtech.com.unitconvertor.MainActivity;
import eclixtech.com.unitconvertor.Modle.modelSearch;
import eclixtech.com.unitconvertor.R;

/**
 * Created by rehan on 1/3/2018.
 */
public class dailogSearchListView extends Dialog {
    private ListView listView2;
    private List<modelSearch> list2;
    private AdaptorSearchView adaptorSearchView;
    Button deleteCancel;
        Context context;
//    public dailogSearchListView(Context context, int fullHeightDialog) {
//        super(context,fullHeightDialog);
    public dailogSearchListView(Context context) {
       super(context);
        this.context = context;
    }
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.dailogsearchview);
        setTitle("Item List");
        list2 = new ArrayList<>();
        data dataClass = new data(getContext());
        list2 = dataClass.getListOfUnits();
        adaptorSearchView = new AdaptorSearchView(getContext(),list2);
        ((MainActivity) context).setAdaptorForSearchView(adaptorSearchView);
        listView2 = (ListView)findViewById(R.id.searchlistview);
        listView2.setAdapter(adaptorSearchView);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView unitNameTextView = (TextView) view.findViewById(R.id.listunitname);
                ((MainActivity) context).setSelectedUnitwithString(unitNameTextView.getText().toString());
                cancel();
            }
        });
    }

}
