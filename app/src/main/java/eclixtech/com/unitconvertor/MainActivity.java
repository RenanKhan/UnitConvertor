package eclixtech.com.unitconvertor;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SearchView;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import eclixtech.com.unitconvertor.Adapter.AdaptorSearchView;
import eclixtech.com.unitconvertor.Adapter.adapterListView;
import eclixtech.com.unitconvertor.Convertor.Evaluate;
import eclixtech.com.unitconvertor.Dailog.dailogSearchListView;
import eclixtech.com.unitconvertor.Data.data;
import eclixtech.com.unitconvertor.Modle.modelSearch;
import eclixtech.com.unitconvertor.Modle.unitConvertorListModel;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    dailogSearchListView dailogSearchListView;

    private List<modelSearch> unitListFav;
    data dataClass;

    private int[] tabIcons = {
            R.drawable.all_categeory,
            R.drawable.basic,
            R.drawable.living,
            R.drawable.science,
            R.drawable.misc
    };
    TextView listingUnitTextView ;
    String operatorString = "";
    String userAskAbout = "";
    private TextView unitNameListingTextView;
    private EditText userInputlistingEditText;
    private SearchView searchUnitFromList,searchViewMAinScreen;
    private ListView listViewForListingScreeen,listView2;
    private ListView listViewFavorities;
    private RelativeLayout allCategoryLayout,basicLayout,liviingLayout,scienceLayout,micsLayout;
    private RelativeLayout calculateLayout,mainScreenLayout;
    private RelativeLayout length;
    private TabLayout tabLayout;
    private Spinner inputSpinnerOne,inputSpinnertow;
    private TextView inputUnitTextView,inputUnitTextViewTow;
    private TextView inputTextView, resultTextView;
    private String inputTextSring;
    private RelativeLayout simpleCalculatorLayout;
    private Evaluate evaluate;
    private adapterListView adaptorForListingScreen;
    private List<unitConvertorListModel> convertListingScreenList;
    private TextView inputSimpleCalculate;
    private TextView resultSimpleCalculateTextView;
    private Integer id ,idMianScreen = null;
    RelativeLayout listingLayout;
    TextView unit2SymbolTextView,unit1SymbolTextView;
    double value1 = 0.0;
    int arrayFRomXMLString,arrayFRomXMLSymbols,arrayFromXMLValue;
    TextView searchtextView,searchTextViewMainScreen;
    Set<String> inputSpinnnersSaveDataForPrefrenceArray, inputSpinnerSaveDataForFavortiesArray;
    String[] valuesArrayFromXML;
    RelativeLayout favoritesLayout,tabScreenLayout;
    String saveFavortiesData;


    private AdaptorSearchView adaptorForSearchView,adaptorSearchViewForFavorities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        setTabLayout();
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
              /*  int selectedTabPosition = tabLayout.getSelectedTabPosition();
                Log.e("selectedTab", String.valueOf(selectedTabPosition));*/
                Log.e("selectedTab", String.valueOf(tab.getPosition()));
               switch(tab.getPosition()) {
                    case 0:
                        allCategoryLayout.setVisibility(View.VISIBLE);
                     /*   basicLayout.setVisibility(View.INVISIBLE);
                        liviingLayout.setVisibility(View.INVISIBLE);
                        scienceLayout.setVisibility(View.INVISIBLE);
                        micsLayout.setVisibility(View.INVISIBLE);*/
                        break;
                   case 1:
                      // allCategoryLayout.setVisibility(View.INVISIBLE);
                       basicLayout.setVisibility(View.VISIBLE);
                       /*liviingLayout.setVisibility(View.INVISIBLE);
                       scienceLayout.setVisibility(View.INVISIBLE);
                       micsLayout.setVisibility(View.INVISIBLE);*/
                       break;
                   case 2:
                 /*      allCategoryLayout.setVisibility(View.INVISIBLE);
                       basicLayout.setVisibility(View.INVISIBLE);*/
                       liviingLayout.setVisibility(View.VISIBLE);
               /*        scienceLayout.setVisibility(View.INVISIBLE);
                       micsLayout.setVisibility(View.INVISIBLE);*/
                       break;
                   case 3:
                    /*   allCategoryLayout.setVisibility(View.INVISIBLE);
                       basicLayout.setVisibility(View.INVISIBLE);
                       liviingLayout.setVisibility(View.INVISIBLE);*/
                       scienceLayout.setVisibility(View.VISIBLE);
//                       micsLayout.setVisibility(View.INVISIBLE);
                       break;
                   case 4:
                      /* allCategoryLayout.setVisibility(View.INVISIBLE);
                       basicLayout.setVisibility(View.INVISIBLE);
                       liviingLayout.setVisibility(View.INVISIBLE);
                       scienceLayout.setVisibility(View.INVISIBLE);*/
                       micsLayout.setVisibility(View.VISIBLE);
                       break;
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                switch(tab.getPosition()) {
                    case 0:
                        allCategoryLayout.setVisibility(View.INVISIBLE);
                        break;
                    case 1:
                        basicLayout.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        liviingLayout.setVisibility(View.INVISIBLE);
                        break;
                    case 3:
                        scienceLayout.setVisibility(View.INVISIBLE);
                        break;
                    case 4:
                        micsLayout.setVisibility(View.INVISIBLE);
                        break;
                }
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        inputSpinnerOne.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            //    inputUnitTextView.setText(inputSpinnerOne.getSelectedItem().toString());
                String[] symbolsArray = getResources().getStringArray(arrayFRomXMLSymbols);
                List<String> myResArraySymbolsList = Arrays.asList(symbolsArray);
                List<String> myResMutableSymbolsList = new ArrayList<String>(myResArraySymbolsList);

                unit1SymbolTextView.setText(myResMutableSymbolsList.get(position));
                resultforCalculate();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        inputSpinnertow.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             //   inputUnitTextViewTow.setText(inputSpinnertow.getSelectedItem().toString());
                String[] symbolsArray = getResources().getStringArray(arrayFRomXMLSymbols);
                List<String> myResArraySymbolsList = Arrays.asList(symbolsArray);
                List<String> myResMutableSymbolsList = new ArrayList<String>(myResArraySymbolsList);
                unit2SymbolTextView.setText(myResMutableSymbolsList.get(position));
               // getResults();
                resultforCalculate();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Drawable d = getResources().getDrawable(R.drawable.primarycolorgradient);
        getSupportActionBar().setBackgroundDrawable(d);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        //search listener
        searchTextViewMainScreen.setTextColor(Color.BLACK);
        searchViewMAinScreen.setQueryHint(Html.fromHtml("<font color = #dcdada>" + getResources().getString(R.string.search) + "</font>"));
        searchViewMAinScreen.onActionViewExpanded();
        //   CharSequence completequery =  searchView.getQuery();
//Log.e("sttring", String.valueOf(completequery));
        searchViewMAinScreen.setOnQueryTextListener(new android.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String s) {
                if (s.length() > 34) {
                    searchViewMAinScreen.setQuery(s.substring(0, 34), false);
                }
                else
                if(s.length() > 0) {
                    if(s.length() == 1) {
                        dailogSearchListView = new dailogSearchListView(MainActivity.this);
                        dailogSearchListView.show();
                        adaptorForSearchView.getFilter().filter(s);
                        return false;
                    }else {}
                }else
                    dailogSearchListView.cancel();
                    //   Log.e("fillter workd", s);
                    return false;
            }
        });
        //search listerner end
        //edittext listener for listing
        userInputlistingEditText.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {

                    setListForListingLayout();

            }
        });
        //edittext listener for lasting end
        }
    @Override
    protected void onStop(){
        super.onStop();
        savePrefrenceForSpinnerValues(inputSpinnnersSaveDataForPrefrenceArray,"cashe");
        savePrefrenceForSpinnerValues(inputSpinnerSaveDataForFavortiesArray,"fav");
    }
   public void savePrefrenceForSpinnerValues(Set<String> arrayOFSpinnersValue, String check){

        SharedPreferences spinnerPrefs;
       if (android.os.Build.VERSION.SDK_INT > Build.VERSION_CODES.M){
           // Do something for M above versions
           spinnerPrefs = this.getSharedPreferences("spinnerPrefs",
                   MODE_PRIVATE);
           if(check.equals("cashe")) {
               saveDataForCashePrefrenceArray(spinnerPrefs, arrayOFSpinnersValue);
           }else if(check.equals("fav")){
               saveDataForFavortiesPrefrenceArray(spinnerPrefs,arrayOFSpinnersValue);
           }
       } else{
           spinnerPrefs = this.getSharedPreferences("spinnerPrefs",
                   MODE_WORLD_READABLE);
           if(check.equals("cashe")) {
               saveDataForCashePrefrenceArray(spinnerPrefs, arrayOFSpinnersValue);
           }else if(check.equals("fav")){
               saveDataForFavortiesPrefrenceArray(spinnerPrefs,arrayOFSpinnersValue);
           }
           // do something for phones running an SDK before lollipop
       }


    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            inputTextSring = "";
            if(simpleCalculatorLayout.getVisibility() == View.VISIBLE){
                simpleCalculatorLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
            }else if(calculateLayout.getVisibility() == View.VISIBLE){
                saveDataInArrayForcashePrefrance();
                mainScreenLayout.setVisibility(View.VISIBLE);
                calculateLayout.setVisibility(View.INVISIBLE);
                getSupportActionBar().setTitle("Unit Convertor");
                Drawable d = getResources().getDrawable(R.drawable.primarycolorgradient);
                getSupportActionBar().setBackgroundDrawable(d);
            }else if(listingLayout.getVisibility() == View.VISIBLE){
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                listingLayout.setVisibility(View.INVISIBLE);

            }else if(favoritesLayout.getVisibility() == View.VISIBLE ){
                favoritesLayout.setVisibility(View.INVISIBLE);
                tabScreenLayout.setVisibility(View.VISIBLE);
            }else
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

/*    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

  /*      if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else */

        if (id == R.id.nav_share) {
            favortiesMethed();
        } else if (id == R.id.nav_send) {
            https://play.google.com/store/apps/details?navId=com.adeebhat.rabbitsvilla/
            try {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://play.google.com/store/apps/details?id=com.eclix.unit.converter.calculator"));
                startActivity(viewIntent);

            } catch(Exception e) {
                Toast.makeText(getApplicationContext(),"Unable to Connect Try Again...",
                        Toast.LENGTH_LONG).show();
                e.printStackTrace();
            }
        }else if(id == R.id.nav_fav){
            tabScreenLayout.setVisibility(View.INVISIBLE);
            favoritesLayout.setVisibility(View.VISIBLE);
            dataClass = new data(this);
            unitListFav = dataClass.getListOfUnitsForFav();
            if(unitListFav != null) {
                adaptorSearchViewForFavorities = new AdaptorSearchView(this, unitListFav);
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void setTabLayout(){
        tabLayout.addTab(tabLayout.newTab().setIcon(tabIcons[0]));
        tabLayout.addTab(tabLayout.newTab().setIcon(tabIcons[1]));
        tabLayout.addTab(tabLayout.newTab().setIcon(tabIcons[2]));
        tabLayout.addTab(tabLayout.newTab().setIcon(tabIcons[3]));
        tabLayout.addTab(tabLayout.newTab().setIcon(tabIcons[4]));
    }
    public void setAdaptorForSearchView(AdaptorSearchView adaptorSearchVieww){
       adaptorForSearchView = adaptorSearchVieww;
    }

    private void initialize(){

        // favorites start
        favoritesLayout = (RelativeLayout)findViewById(R.id.favrioties_layout);
        listViewFavorities = (ListView) findViewById(R.id.fav_listview);
        unitListFav = new ArrayList<>();
        tabScreenLayout = (RelativeLayout)findViewById(R.id.tab_plus_category_screen);
        // favorites End
        inputSpinnnersSaveDataForPrefrenceArray =  new HashSet<String>();
        inputSpinnerSaveDataForFavortiesArray = new HashSet<String>();
        listingUnitTextView = (TextView)findViewById(R.id.unitsymbollisting);
        inputSimpleCalculate = (TextView)findViewById(R.id.simplecalculateinput);
        resultSimpleCalculateTextView = (TextView)findViewById(R.id.simplecalculateresult);
        dailogSearchListView = new dailogSearchListView(this);
        evaluate = new Evaluate();
        convertListingScreenList = new ArrayList<>();
        unit2SymbolTextView = (TextView)findViewById(R.id.unit2symbol);
        unit1SymbolTextView = (TextView)findViewById(R.id.unit1symbol);
        unitNameListingTextView = (TextView)findViewById(R.id.unitnameelisting);
        userInputlistingEditText = (EditText) findViewById(R.id.inputuserlisting);
        listingLayout = (RelativeLayout)findViewById(R.id.listing);
        listViewForListingScreeen = (ListView) findViewById(R.id.listviewoflisting);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        allCategoryLayout = (RelativeLayout) findViewById(R.id.all_category);
        basicLayout = (RelativeLayout)findViewById(R.id.basic_layout);
        liviingLayout = (RelativeLayout)findViewById(R.id.living_layout);
        scienceLayout = (RelativeLayout)findViewById(R.id.science_layout);
        micsLayout = (RelativeLayout)findViewById(R.id.mics_layout);
        calculateLayout = (RelativeLayout)findViewById(R.id.calculetelayout);
        length = (RelativeLayout)findViewById(R.id.length);
        inputSpinnerOne = (Spinner)findViewById(R.id.inputspinerner);
        inputSpinnertow = (Spinner)findViewById(R.id.inputspinernertow);
        inputTextView = (TextView)findViewById(R.id.input);
        resultTextView = (TextView)findViewById(R.id.inputtow);
        simpleCalculatorLayout = (RelativeLayout)findViewById(R.id.simplecalculetelayoutt);
        inputTextSring = "";
        mainScreenLayout = (RelativeLayout)findViewById(R.id.mainscreen);
        searchUnitFromList = (SearchView)findViewById(R.id.unit_list_search);
        searchViewMAinScreen = (SearchView)findViewById(R.id.searchbar);
        id = new Integer(searchUnitFromList.getContext().getResources().getIdentifier("android:id/search_src_text", null, null));
        idMianScreen = new Integer(searchViewMAinScreen.getContext().getResources().getIdentifier("android:id/search_src_text", null, null));
        searchtextView = (TextView)  searchUnitFromList.findViewById(id);
        searchTextViewMainScreen = (TextView)findViewById(idMianScreen);

    }

    public void onClickListenerNumber(View view){
        inputTextSring +=  view.getTag().toString();
        inputTextView.setText(inputTextSring);
        resultforCalculate();
    }
        public void resultforCalculate(){
            int item1 = inputSpinnerOne.getSelectedItemPosition();
            int item2 = inputSpinnertow.getSelectedItemPosition();
            if(inputTextSring.equals("")||inputTextSring.equals("-")){
            }else
            value1 = Double.parseDouble(inputTextSring);
            //  getResults(item1,item2,value1);
            resultTextView.setText(getResults(item1,item2,value1) + "");
        }

    public void onClickListenerOfCompleteCross(View view){
        inputTextSring = "";
        inputTextView.setText("0");
        resultTextView.setText("0");
        inputSimpleCalculate.setText(inputTextSring);
        resultSimpleCalculateTextView.setText("");
    }

    public void onClickListenerBackSpace(View view){

        if(simpleCalculatorLayout.getVisibility()==View.VISIBLE){
            if(inputTextSring.length()!= 0 ) {
                StringBuilder string = new StringBuilder(inputTextSring);
                inputTextSring =  string.deleteCharAt(inputTextSring.length()-1).toString();
                inputSimpleCalculate.setText(inputTextSring);
                calculationForSimpleCalculator(inputTextSring);
                if(inputTextSring.length()== 0){resultSimpleCalculateTextView.setText("");}
            }
            else
                resultSimpleCalculateTextView.setText("");
        }else
        if(inputTextSring.length()!= 0 ) {
            StringBuilder string = new StringBuilder(inputTextSring);
            inputTextSring =  string.deleteCharAt(inputTextSring.length()-1).toString();
            inputTextView.setText(inputTextSring);
            resultforCalculate();
            if(inputTextSring.length()== 0){resultTextView.setText("");}
        }
        else
            resultTextView.setText("");
    }

    public  void onClickListenerSimpleCalculatorLayout(View v){
        inputTextSring = "";
        simpleCalculatorLayout.setVisibility(View.VISIBLE);
        calculateLayout.setVisibility(View.INVISIBLE);
        mainScreenLayout.setVisibility(View.INVISIBLE);
    }

    public void setSelectedUnit(int id){
       // userInputlistingEditText.setText("", TextView.BufferType.EDITABLE);
        inputTextView.setText("1");
        value1 = 1;
        switch (id){
            case R.id.length:
                arrayFRomXMLString = R.array.length;
                arrayFRomXMLSymbols = R.array.length_symbol;
                userAskAbout = "length";
                getSupportActionBar().setTitle("Length");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTow = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTow.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTow);
                ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapter);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.area:
                arrayFRomXMLString = R.array.area;
                arrayFRomXMLSymbols = R.array.area_symbols;
                userAskAbout = "area";
                getSupportActionBar().setTitle("Area");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowArea = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowArea.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowArea);
                ArrayAdapter<CharSequence> adapterArea = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterArea.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterArea);
          //  adapterArea.getItem(inputSpinnerOne.getSelectedItemPosition());
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.weight:
                arrayFRomXMLString = R.array.weight;
                arrayFRomXMLSymbols = R.array.weight_symbol;
                userAskAbout = "weight";
                getSupportActionBar().setTitle("Weight");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowWeight = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowWeight.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowWeight);
                ArrayAdapter<CharSequence> adapterWeight = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterWeight.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterWeight);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.volume:
                arrayFRomXMLString = R.array.volume;
                arrayFRomXMLSymbols = R.array.volume_symbol;
                userAskAbout = "volume";
                getSupportActionBar().setTitle("Volume");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowVolume = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowVolume.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowVolume);
                ArrayAdapter<CharSequence> adapterVolume = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterVolume.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterVolume);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.temperature:
                userAskAbout = "temperature";
                arrayFRomXMLString = R.array.temperature;
                arrayFRomXMLSymbols = R.array.temperature_symbol;
                getSupportActionBar().setTitle("Temperture");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowTemp = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowTemp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowTemp);
                ArrayAdapter<CharSequence> adapterTemp = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTemp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterTemp);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.time://time
                arrayFRomXMLString = R.array.time;
                arrayFRomXMLSymbols = R.array.time_symbol;
                userAskAbout = "time";
                getSupportActionBar().setTitle("Time");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowTime = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowTime.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowTime);
                ArrayAdapter<CharSequence> adapterTime = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTime.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterTime);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.speed:
                userAskAbout = "speed";
                arrayFRomXMLString = R.array.speed;
                arrayFRomXMLSymbols = R.array.speed_symbol;
                getSupportActionBar().setTitle("Speed");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowSpeed = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowSpeed.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowSpeed);
                ArrayAdapter<CharSequence> adapterSpeed = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterSpeed.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterSpeed);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.force:
                userAskAbout = "force";
                arrayFRomXMLString = R.array.force;
                arrayFRomXMLSymbols = R.array.force_symbol;
                getSupportActionBar().setTitle("Force");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowForce = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowForce.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowForce);
                ArrayAdapter<CharSequence> adapterForce = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterForce.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterForce);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
           /* case R.id.work:
                arrayFRomXMLString = R.array.area;
                getSupportActionBar().setTitle("Work");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowWork = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowWork.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowWork);
                ArrayAdapter<CharSequence> adapterWork = ArrayAdapter.createFromResource(this, R.array.length, android.R.layout.simple_spinner_item);
                adapterWork.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterWork);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;*/
            case R.id.power:
                userAskAbout = "power";
                arrayFRomXMLString = R.array.power;
                arrayFRomXMLSymbols = R.array.power_symbol;
                getSupportActionBar().setTitle("Power");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowPower = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowPower.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowPower);
                ArrayAdapter<CharSequence> adapterPower = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterPower.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterPower);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.pressure:
                userAskAbout = "pressure";
                arrayFRomXMLString = R.array.pressure;
                arrayFRomXMLSymbols = R.array.pressure_symbol;
                getSupportActionBar().setTitle("Pressure");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowPressue = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowPressue.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowPressue);
                ArrayAdapter<CharSequence> adapterPressue = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterPressue.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterPressue);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.energy:
                userAskAbout = "energy";
                arrayFRomXMLString = R.array.energy;
                arrayFRomXMLSymbols = R.array.energy_symbol;
                getSupportActionBar().setTitle("Energy");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowAngle = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowAngle.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowAngle);
                ArrayAdapter<CharSequence> adapterAngle = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterAngle.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterAngle);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.data:
                userAskAbout = "data";
                arrayFRomXMLString = R.array.data;
                arrayFRomXMLSymbols = R.array.data_symbol;
                getSupportActionBar().setTitle("Data");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowData = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowData.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowData);
                ArrayAdapter<CharSequence> adapterData = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterData.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterData);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.fuel:
                userAskAbout = "fuel";
                arrayFRomXMLString = R.array.fuel;
                arrayFRomXMLSymbols = R.array.fuel_symbol;
                getSupportActionBar().setTitle("Fuel");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowFuel = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowFuel.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowFuel);
                ArrayAdapter<CharSequence> adapterFuel = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterFuel.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterFuel);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.cooking:
                userAskAbout = "cooking";
                arrayFRomXMLString = R.array.volume;
                arrayFRomXMLSymbols = R.array.volume_symbol;
                getSupportActionBar().setTitle("Cooking");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowCooking = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowCooking.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowCooking);
                ArrayAdapter<CharSequence> adapterCooking = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterCooking.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterCooking);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.datatransfer:
                userAskAbout = "datatrancfer";
                arrayFRomXMLString = R.array.data_transfer;
                arrayFRomXMLSymbols = R.array.data_transfer_symbol;
                getSupportActionBar().setTitle("Data Trancfer");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowDataTrancfer = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowDataTrancfer.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowDataTrancfer);
                ArrayAdapter<CharSequence> adapterDataTrancfer = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterDataTrancfer.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterDataTrancfer);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.current:
                arrayFRomXMLString = R.array.current;
                arrayFRomXMLSymbols = R.array.current_symbol;
                userAskAbout = "current";
                getSupportActionBar().setTitle("Current");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowCurrent = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowCurrent.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowCurrent);
                ArrayAdapter<CharSequence> adapterCurrent = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterCurrent.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterCurrent);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.digital_image_res:
                arrayFRomXMLString = R.array.digital_image_resolution;
                arrayFRomXMLSymbols = R.array.digital_image_resolution_symbol;
                userAskAbout = "digital_image_res";
                getSupportActionBar().setTitle("Digital Image Resolution");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowDigitalImageResolution = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowDigitalImageResolution.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowDigitalImageResolution);
                ArrayAdapter<CharSequence> adapterDigitalImageResolution = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterDigitalImageResolution.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterDigitalImageResolution);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.electricfield:
                arrayFRomXMLString = R.array.electricfield;
                arrayFRomXMLSymbols = R.array.electricfieldsymbol;
                userAskAbout = "electricfield";
                getSupportActionBar().setTitle("Electric Field");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowElectricfield = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowElectricfield.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowElectricfield);
                ArrayAdapter<CharSequence> adapterElectricfield = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterElectricfield.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterElectricfield);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;

            case R.id.resistivity:
                arrayFRomXMLString = R.array.resistivity;
                arrayFRomXMLSymbols = R.array.resistivitysymbol;
                userAskAbout = "resistivity";
                getSupportActionBar().setTitle("Resistivity");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowResistivity = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowResistivity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowResistivity);
                ArrayAdapter<CharSequence> adapterResistivity = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterResistivity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterResistivity);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.chemical:
                arrayFRomXMLString = R.array.chemical;
                arrayFRomXMLSymbols = R.array.chemical_symbol;
                userAskAbout = "chemical";
                getSupportActionBar().setTitle("Chemical - Henry's Law");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowChemical = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowChemical.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowChemical);
                ArrayAdapter<CharSequence> adapterChemical = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterChemical.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterChemical);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.sound:
                arrayFRomXMLString = R.array.sound;
                arrayFRomXMLSymbols = R.array.sound_symbol;
                userAskAbout = "sound";
                getSupportActionBar().setTitle("Sound");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowSound = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowSound.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowSound);
                ArrayAdapter<CharSequence> adapterSound = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterSound.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterSound);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.velocity:
                arrayFRomXMLString = R.array.velocity;
                arrayFRomXMLSymbols = R.array.velocity_symbol;
                userAskAbout = "velocity";
                getSupportActionBar().setTitle("Velocity");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowVelocity = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowVelocity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowVelocity);
                ArrayAdapter<CharSequence> adapterVelocity = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterVelocity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterVelocity);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;

            case R.id.conductence:
                arrayFRomXMLString = R.array.conductence;
                arrayFRomXMLSymbols = R.array.conductence_symbol;
                userAskAbout = "conductence";
                getSupportActionBar().setTitle("Conductence");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowConductence = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowConductence.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowConductence);
                ArrayAdapter<CharSequence> adapterConductence = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterConductence.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterConductence);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.radiation:
                arrayFRomXMLString = R.array.radiation;
                arrayFRomXMLSymbols = R.array.radiation_symbol;
                userAskAbout = "radiation";
                getSupportActionBar().setTitle("Radiation");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowRadiation = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowRadiation.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowRadiation);
                ArrayAdapter<CharSequence> adapterRadiation = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterRadiation.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterRadiation);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.radiation_dose_equivalent:
                arrayFRomXMLString = R.array.radiation_dose_equivalent;
                arrayFRomXMLSymbols = R.array.radiation_dose_equivalent_symbol;
                userAskAbout = "radiation_dose_equivalent";
                getSupportActionBar().setTitle("Radiation Dose Equivalent");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowRadiationDoseEquivalent = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowRadiationDoseEquivalent.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowRadiationDoseEquivalent);
                ArrayAdapter<CharSequence> adapterRadiationDoseEquivalent = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterRadiationDoseEquivalent.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterRadiationDoseEquivalent);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.radiation_exposure:
                arrayFRomXMLString = R.array.radiation_exposure;
                arrayFRomXMLSymbols = R.array.radiation_exposure_symbol;
                userAskAbout = "radiation_exposure";
                getSupportActionBar().setTitle("Radiation Exposure");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowRadiationExposure = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowRadiationExposure.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowRadiationExposure);
                ArrayAdapter<CharSequence> adapterRadiationExposure = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterRadiationExposure.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterRadiationExposure);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.torque://its done by 3rd model (input Number/Base Value)* requirment Unit
                arrayFRomXMLString = R.array.torque;
                arrayFRomXMLSymbols = R.array.torque_symbol;
              //  arrayFromXMLValue = R.array.torque_values;
                userAskAbout = "torque";
                getSupportActionBar().setTitle("Torque");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowTorque = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowTorque.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowTorque);
                ArrayAdapter<CharSequence> adapterTorque = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTorque.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnerOne.setAdapter(adapterTorque);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
        }
        ///save state of input spainer
        getPrefrenceforSpinner();
        ///save state of input spainner
    }



    public void setSelectedUnitwithString(String idName){
        int layoutID = getResources().getIdentifier(idName, "id", getPackageName());
        setSelectedUnit(layoutID);
    }

    public void onClickListenor(View view) {
        int layoutId = view.getId();
        setSelectedUnit(layoutId);
    }

    public void onClicklistenerForFavorites(View view){
       favortiesMethed();
    }

    public void onClickListenerOfListing(View view){
        setListForListingLayout();
        searchtextView.setTextColor(Color.BLACK);
       searchUnitFromList.setQueryHint(Html.fromHtml("<font color =  #dcdada>" + getResources().getString(R.string.search) + "</font>"));
        searchUnitFromList.setOnQueryTextListener(new android.widget.SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String s) {
                if (s.length() > 34)
                    searchUnitFromList.setQuery(s.substring(0, 34), false);
                else
                    adaptorForListingScreen.getFilter().filter(s);
                //   Log.e("fillter workd", s);
                return false;
            }
        });
    }

    private List<unitConvertorListModel> getList(int item1, double value1,int arrayStrings,int arraySymbols){
        List<unitConvertorListModel> dataArrylist = null;
        String[] stringArray = getResources().getStringArray(arrayStrings);
        List<String> myResArrayStringsList = Arrays.asList(stringArray);
        List<String> myResMutableStringList = new ArrayList<String>(myResArrayStringsList);
        ///
        String[] symbolsArray = getResources().getStringArray(arraySymbols);
        List<String> myResArraySymbolsList = Arrays.asList(symbolsArray);
        List<String> myResMutableSymbolsList = new ArrayList<String>(myResArraySymbolsList);
            int i = 0;
      //  DecimalFormat df = new DecimalFormat("#.##########");
        if (i <= myResMutableStringList.size() ) {
            dataArrylist = new ArrayList<>();
            do {
                unitConvertorListModel data = new unitConvertorListModel();
                data.setUnitName(myResMutableStringList.get(i));
                data.setUnitSymbol(myResMutableSymbolsList.get(i));
            //    df.format(evaluate.evaluateLength(item1, i, value1))
                data.setUnitResult(String.valueOf(getResults(item1, i, value1)));
                dataArrylist.add(data);
                i++;
            } while (i != myResMutableStringList.size());
        } else {
            return null;
        }
        return dataArrylist;
    }

    public double getResults(int item1, int item2, double value1){
        double result = 0;
        switch (userAskAbout) {
            case "length":
                result = evaluate.evaluateLength(item1, item2, value1);
                break;
            case "area":
                result = evaluate.evaluateArea(item1, item2, value1);
                break;
            case "weight":
                result = evaluate.evaluateWeight(item1, item2, value1);
                break;
            case "volume":
                result = evaluate.evaluateVolume(item1, item2, value1);
                break;
            case "temperature":
                result = evaluate.evaluateTemp(item1, item2, value1);
                break;
            case "time":
                result = evaluate.evaluateTime(item1, item2, value1);
                break;
            case "speed":
                result = evaluate.evaluateSpeed(item1, item2, value1);
                break;
            case "power":
                result = evaluate.evaluatePower(item1, item2, value1);
                break;
            case "pressure":
                result = evaluate.evaluatePressure(item1, item2, value1);
                break;
            case "fuel":
                result = evaluate.evaluateFuel(item1, item2, value1);
                break;
            case "data":
                result = evaluate.evaluateDigitalStorage(item1, item2, value1);
                break;
            case "cooking":
               // result = evaluate.evaluateVolume(item1, item2, value1);
                break;
            case "energy":
                result = evaluate.evaluateEnergy(item1, item2, value1);
                break;
            case "force":
                result = evaluate.evaluateForce(item1, item2, value1);
                break;
            case "datatrancfer":
                result = evaluate.evaluateDataTransfer(item1, item2, value1);
                break;
            case "current":
                result = evaluate.evaluateCurret(item1, item2, value1);
                break;
            case "digital_image_res":
                result = evaluate.evaluateDigitalImageResolution(item1, item2, value1);
                break;
            case "electricfield":
                result = evaluate.evaluateElectricField(item1, item2, value1);
                break;
            case "resistivity":
                result = evaluate.evaluateResistivity(item1, item2, value1);
                break;
            case "chemical":
                result = evaluate.evaluateChemical(item1, item2, value1);
                break;
            case "sound":
                result = evaluate.evaluateSound(item1, item2, value1);
                break;
            case "velocity":
                result = evaluate.evaluateVelocity(item1, item2, value1);
                break;
            case "conductence":
                result = evaluate.evaluateConductance(item1, item2, value1);
                break;
            case "radiation":
                result = evaluate.evaluateRadiation(item1, item2, value1);
                break;
            case "radiation_dose_equivalent":
                result = evaluate.evaluateRadiationDoesEquivalent(item1, item2, value1);
                break;
            case "radiation_exposure":
                result = evaluate.evaluateRadiationExposure(item1, item2, value1);
                break;
            case "torque":
                result = evaluate.evaluateTorque(item1, item2, value1);
                break;
        }


        return result;
    }

    private void setListForListingLayout(){

        int item2 = inputSpinnertow.getSelectedItemPosition();

      // userInputlistingEditText.setText(String.valueOf(value1));
     //   userInputlistingEditText.setText((String.valueOf(value1)), TextView.BufferType.EDITABLE);
  //      userInputlistingEditText.
        if(!userInputlistingEditText.getText().toString().equals("")|| value1 !=0) {
            if(userInputlistingEditText.getText().toString().equals("")) {
                if (listingLayout.getVisibility() == View.INVISIBLE)
                    userInputlistingEditText.setText((String.valueOf(value1)), TextView.BufferType.EDITABLE);
            }
            else {
                value1 = Double.parseDouble(userInputlistingEditText.getText().toString());
            }
            unitNameListingTextView.setText(inputSpinnertow.getSelectedItem().toString());
            listingUnitTextView.setText(unit2SymbolTextView.getText().toString());
            listingLayout.setVisibility(View.VISIBLE);
            calculateLayout.setVisibility(View.INVISIBLE);
            convertListingScreenList = getList(item2, value1, arrayFRomXMLString, arrayFRomXMLSymbols);
            adaptorForListingScreen = new adapterListView(this, convertListingScreenList);
            listViewForListingScreeen.setAdapter(adaptorForListingScreen);
        }
    }

    public void onClickLisenerForNumberOfSimpleCalculator(View view) {
        inputTextSring +=  view.getTag().toString();
        calculationForSimpleCalculator(inputTextSring);
    }

    public void calculationForSimpleCalculator( String inputTextSringForSimpleCalculation){
        inputSimpleCalculate.setText(inputTextSringForSimpleCalculation);
        if(inputTextSringForSimpleCalculation.contains("+") || inputTextSringForSimpleCalculation.contains("-") || inputTextSringForSimpleCalculation.contains("*") || inputTextSringForSimpleCalculation.contains("/")) {
            String afterOpratorString = inputTextSringForSimpleCalculation.substring(inputTextSringForSimpleCalculation.indexOf(operatorString) + 1, inputTextSringForSimpleCalculation.length());
            if (afterOpratorString.equals("")) {
                resultSimpleCalculateTextView.setText("");
            } else {
                double after =  Double.parseDouble(afterOpratorString);
                Log.e("halfend", String.valueOf(after));
                String beforeString = inputTextSringForSimpleCalculation.substring(0, inputTextSringForSimpleCalculation.indexOf(operatorString));
                double before =  Double.parseDouble(beforeString);
                Log.e("halfstart", String.valueOf(before));
                String resultofSimpleCalculate = "";
                switch (operatorString) {
                    case "+":
                        resultofSimpleCalculate = String.valueOf(before + after);
                        break;
                    case "-":
                        resultofSimpleCalculate = String.valueOf(before - after);
                        break;
                    case "*":
                        resultofSimpleCalculate = String.valueOf(before * after);
                        break;
                    case "/":
                        resultofSimpleCalculate = String.valueOf(before / after);
                        break;
                }
                resultSimpleCalculateTextView.setText(resultofSimpleCalculate);
            }
        }
    }
    public void onClickLisenerForOprationOfSimpleCalculator(View view) {
        if( inputTextSring.equals("")) {}
        else {
            if (inputTextSring.contains("+") || inputTextSring.contains("-") || inputTextSring.contains("*") || inputTextSring.contains("/")) {
            } else
                switch (view.getId()) {
                    case R.id.plus:
                        inputTextSring += "+";
                        operatorString = "+";
                        break;
                    case R.id.mines:
                        inputTextSring += "-";
                        operatorString = "-";
                        break;
                   /* case R.id.dote:
                        inputTextSring += ".";
                       // operatorString = "+";
                        break;*/
                    case R.id.divide:
                        inputTextSring += "/";
                        operatorString = "/";
                        break;
                    case R.id.multiply:
                        inputTextSring += "*";
                        operatorString = "*";
                        break;
                }

            inputSimpleCalculate.setText(inputTextSring);
        }
    }

    public void onClickListenerToggle(View view) {
        int item1 = inputSpinnerOne.getSelectedItemPosition();
        int item2 = inputSpinnertow.getSelectedItemPosition();
       // inputSpinnerOne.getFirstVisiblePosition() = item2
        inputSpinnerOne.setSelection(item2);
        inputSpinnertow.setSelection(item1);
        String[] symbolsArray = getResources().getStringArray(arrayFRomXMLSymbols);
        List<String> myResArraySymbolsList = Arrays.asList(symbolsArray);
        List<String> myResMutableSymbolsList = new ArrayList<String>(myResArraySymbolsList);
        unit2SymbolTextView.setText(myResMutableSymbolsList.get(item1));
       // String[] symbolsArray = getResources().getStringArray(arrayFRomXMLSymbols);
       // List<String> myResArraySymbolsList = Arrays.asList(symbolsArray);
      //  List<String> myResMutableSymbolsList = new ArrayList<String>(myResArraySymbolsList);

        unit1SymbolTextView.setText(myResMutableSymbolsList.get(item2));
        if(inputTextSring.equals("")){

        }else
            value1 = Double.parseDouble(inputTextSring);
        //  getResults(item1,item2,value1);
        resultTextView.setText(getResults(item2,item1,value1) + "");
    }

    public void onClickListenerCopy(View view) {
        ClipboardManager clipboard = (ClipboardManager)
                getSystemService(Context.CLIPBOARD_SERVICE);
      String inputUserDataFrom =  inputTextView.getText().toString();
      String inputUserUnitFrom =  inputSpinnerOne.getSelectedItem().toString();
        String inputUserDataResultTo =  resultTextView.getText().toString();
        String inputUserUnitTo =  inputSpinnertow.getSelectedItem().toString();
        ClipData clip = ClipData.newPlainText("simple text", inputUserDataFrom+"   "+inputUserUnitFrom+"  = "+inputUserDataResultTo +"   "+inputUserUnitTo);
        clipboard.setPrimaryClip(clip);
        Toast.makeText(getApplicationContext(),"Your Data has Copied. ",
                Toast.LENGTH_LONG).show();
    }

    public void onClickListenerMinesPlus(View view) {
        if(inputTextSring.equals("")) {
        }else {
        if (inputTextSring.length() != 1) {
            if (inputTextSring.contains("-")) {
                StringBuilder sb = new StringBuilder(inputTextSring);
                inputTextSring = sb.deleteCharAt(0).toString();
                resultforCalculate();
            } else
                inputTextSring = "-" + inputTextSring;
                inputTextView.setText(inputTextSring);
                resultforCalculate();
        }
    }
    }

    public void onClickListenerDot(View view) {
        if(inputTextSring.contains(".")){
        //   Toast.makeText(getBaseContext(),"Your Value already have dot .",Toast.LENGTH_LONG).show();
        }else if(inputTextSring.equals("")) {

        }else {
            inputTextSring += ".";
            inputTextView.setText(inputTextSring);
            resultforCalculate();
        }
    }

    //preferrance area
    //save user cashe data for prefrence
    public  void saveDataForCashePrefrenceArray(SharedPreferences spinnerPrefs, Set<String> arrayOFSpinnersValue){//for new version
        SharedPreferences.Editor prefsEditor = spinnerPrefs.edit();
        prefsEditor.putStringSet("inputspinner_prefrance_set_for_cashe",arrayOFSpinnersValue);
        prefsEditor.commit();
    }
    public  void saveDataForFavortiesPrefrenceArray(SharedPreferences spinnerPrefs, Set<String> arrayOFSpinnersValue){//for new version
        SharedPreferences.Editor prefsEditor = spinnerPrefs.edit();
        prefsEditor.putStringSet("inputspinner_prefrance_set_for_favorties",arrayOFSpinnersValue);
        prefsEditor.commit();
    }
    public  Set<String> saveDataInArrayForcashePrefrance(){
        String saveData = userAskAbout+":"+inputSpinnerOne.getSelectedItemPosition()+":"+inputSpinnertow.getSelectedItemPosition();
        //herer
        removeAlreadyInsertedDataForCache();
        inputSpinnnersSaveDataForPrefrenceArray.add(saveData);
        return inputSpinnnersSaveDataForPrefrenceArray;
    }
    //favorties  data for prefrence array
    public  Set<String> insertDataInArrayForFavortiesPrefrance(String favString){
        if(removeAlreadyInsertedDataForFavorites()) {//if string already sotrd
            inputSpinnerSaveDataForFavortiesArray.add(favString);
        }
        return inputSpinnerSaveDataForFavortiesArray;
    }
    public void favortiesMethed(){
        SharedPreferences spinnerPrefs;
        if (android.os.Build.VERSION.SDK_INT > Build.VERSION_CODES.M){
            // Do something for M above versions
            spinnerPrefs = this.getSharedPreferences("spinnerPrefs",
                    MODE_PRIVATE);
            addFevortiesInPrefrance(spinnerPrefs);
        } else{
            spinnerPrefs = this.getSharedPreferences("spinnerPrefs",
                    MODE_WORLD_READABLE);
            addFevortiesInPrefrance(spinnerPrefs);
            // do something for phones running an SDK before lollipop

        }
    }

    public void addFevortiesInPrefrance(SharedPreferences spinnerPrefs){
        saveFavortiesData = userAskAbout+":"+inputSpinnerOne.getSelectedItemPosition()+":"+inputSpinnertow.getSelectedItemPosition();
        insertDataInArrayForFavortiesPrefrance(saveFavortiesData);

        

    }
    public  void setInputSpinner() {
        Boolean hasUnitInPrefrence = false;
        if (inputSpinnnersSaveDataForPrefrenceArray != null) {
            int i = 0;
            String opration;

            for (String s : inputSpinnnersSaveDataForPrefrenceArray) {
                opration = s.toString();
                String[] arr = opration.split(":");
                if (arr[0].equals(userAskAbout)) {
                    inputSpinnerOne.setSelection(Integer.parseInt(arr[1]));
                    inputSpinnertow.setSelection(Integer.parseInt(arr[2]));
                    hasUnitInPrefrence = true;
                    break;
                }
            }//loop end
        }
        if (hasUnitInPrefrence == false) {
            inputSpinnertow.setSelection(1);
        }
    }
    public void   getPrefrenceforSpinner() {
        SharedPreferences spinnerPrefs;
        if (android.os.Build.VERSION.SDK_INT > Build.VERSION_CODES.M){
            // Do something for M above versions
            spinnerPrefs = this.getSharedPreferences("spinnerPrefs",
                    MODE_PRIVATE);
            getPreRefranceForSaveData(spinnerPrefs);

        } else{
            spinnerPrefs = this.getSharedPreferences("spinnerPrefs",
                    MODE_WORLD_READABLE);
            getPreRefranceForSaveData(spinnerPrefs);
            // do something for phones running an SDK before lollipop

        }

    }

    public void getPreRefranceForSaveData(SharedPreferences spinnerPrefs){

        if (spinnerPrefs.getStringSet("inputspinner_prefrance_set_for_cashe", null) != null) {
            inputSpinnnersSaveDataForPrefrenceArray = spinnerPrefs.getStringSet("inputspinner_prefrance_set_for_cashe", null);
            setInputSpinner();
        }else {
            setInputSpinner();
        }
    }

    public void removeAlreadyInsertedDataForCache() {
        if (inputSpinnnersSaveDataForPrefrenceArray != null) {
            int i = 0;
            String opration;
            for (String s : inputSpinnnersSaveDataForPrefrenceArray) {
                i++;
                opration = s.toString();
                String[] arr = opration.split(":");
                if (arr[0].equals(userAskAbout)) {
                    inputSpinnnersSaveDataForPrefrenceArray.remove(i--);
                    break;
                }
            }//loop end
        }
    }

    public boolean removeAlreadyInsertedDataForFavorites() {
        if(saveFavortiesData.equals("")){
            return false;
        }else if(inputSpinnerSaveDataForFavortiesArray.contains(saveFavortiesData)){
            Toast.makeText(getApplicationContext(),"you already saved data",Toast.LENGTH_LONG).show();
            return false;
        }else
            return true;
    }

    // prefreance area
}
