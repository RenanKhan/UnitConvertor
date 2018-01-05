package eclixtech.com.unitconvertor;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import eclixtech.com.unitconvertor.Adapter.AdaptorSearchView;
import eclixtech.com.unitconvertor.Adapter.adapterListView;
import eclixtech.com.unitconvertor.Convertor.Evaluate;
import eclixtech.com.unitconvertor.Dailog.dailogSearchListView;
import eclixtech.com.unitconvertor.Modle.unitConvertorListModel;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    dailogSearchListView dailogSearchListView;
    private int[] tabIcons = {
            R.drawable.all_categeory,
            R.drawable.basic,
            R.drawable.living,
            R.drawable.science,
            R.drawable.misc
    };
    String userAskAbout = "";
    private TextView unitNameListingTextView,userInputlistingTextView;
    private SearchView searchUnitFromList,searchViewMAinScreen;
    private ListView listView1,listView2;
    private RelativeLayout allCategoryLayout,basicLayout,liviingLayout,scienceLayout,micsLayout;
    private RelativeLayout calculateLayout,mainScreenLayout;
    private RelativeLayout length;
    private TabLayout tabLayout;
    private Spinner inputSpinner,inputSpinnertow;
    private TextView inputUnitTextView,inputUnitTextViewTow;
    private TextView inputTextView, resultTextView;
    private String inputTextSring;
    private RelativeLayout simpleCalculatorLayout;
    private Evaluate evaluate;
    private adapterListView adaptor;
    private List<unitConvertorListModel> list1;
    private AdaptorSearchView adaptorSearchView;

    RelativeLayout listingLayout;
    TextView unit2SymbolTextView,unit1SymbolTextView;
    double value1;
    int arrayFRomXMLString,arrayFRomXMLSymbols;
    TextView searchtextView,searchTextViewMainScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        setTabLayout();
       // MainActivity.this.getActionBar().hide();
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
        inputSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                inputUnitTextView.setText(inputSpinner.getSelectedItem().toString());
                String[] symbolsArray = getResources().getStringArray(arrayFRomXMLSymbols);
                List<String> myResArraySymbolsList = Arrays.asList(symbolsArray);
                List<String> myResMutableSymbolsList = new ArrayList<String>(myResArraySymbolsList);
                unit1SymbolTextView.setText(myResMutableSymbolsList.get(position));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        inputSpinnertow.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                inputUnitTextViewTow.setText(inputSpinnertow.getSelectedItem().toString());
                String[] symbolsArray = getResources().getStringArray(arrayFRomXMLSymbols);
                List<String> myResArraySymbolsList = Arrays.asList(symbolsArray);
                List<String> myResMutableSymbolsList = new ArrayList<String>(myResArraySymbolsList);
                unit2SymbolTextView.setText(myResMutableSymbolsList.get(position));            }
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
        searchTextViewMainScreen.setTextColor(Color.BLACK);
        searchViewMAinScreen.setQueryHint(Html.fromHtml("<font color = #0000>" + getResources().getString(R.string.search) + "</font>"));
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
                    dailogSearchListView = new dailogSearchListView(MainActivity.this);
                    dailogSearchListView.show();
                    adaptorSearchView.getFilter().filter(s);
                    return false;
                }else
                    dailogSearchListView.cancel();
                    //   Log.e("fillter workd", s);
                    return false;
            }
        });
        }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if(simpleCalculatorLayout.getVisibility() == View.VISIBLE){
                simpleCalculatorLayout.setVisibility(View.INVISIBLE);
            }else if(calculateLayout.getVisibility() == View.VISIBLE){
                mainScreenLayout.setVisibility(View.VISIBLE);
                calculateLayout.setVisibility(View.INVISIBLE);
                getSupportActionBar().setTitle("Unit Convertor");
                Drawable d = getResources().getDrawable(R.drawable.primarycolorgradient);
                getSupportActionBar().setBackgroundDrawable(d);
            }else if(listingLayout.getVisibility() == View.VISIBLE){
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                listingLayout.setVisibility(View.INVISIBLE);
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

    @Override
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
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

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
    public void setAdaptorSearchView(AdaptorSearchView adaptorSearchVieww){
       adaptorSearchView = adaptorSearchVieww;
    }
    public void onClickListenerNumber(View view){
        int item1 = inputSpinner.getSelectedItemPosition();
        int item2 = inputSpinnertow.getSelectedItemPosition();
        inputTextSring +=  view.getTag().toString();
        inputTextView.setText(inputTextSring);
        value1 = Double.parseDouble(inputTextSring);
      //  getResults(item1,item2,value1);
        resultTextView.setText(getResults(item1,item2,value1) + "");
    }
    public void onClickListenerOfCompleteCross(View view){
        inputTextSring = "";
        inputTextView.setText("0");
        resultTextView.setText("0");
    }
    public void onClickListenerOfSingleCross(View view){
        if (inputTextSring != null && inputTextSring.length() > 0 && inputTextSring.charAt(inputTextSring.length() - 1) == 'x') {
            inputTextSring = inputTextSring.substring(0, inputTextSring.length() - 1);
        }
        // return inputTextSring;
        //inputTextSring = "";
        inputTextView.setText(inputTextSring);
        // resultTextView.setText("0");
    }
    public  void onClickListenerSimpleCalculatorLayout(View v){
        simpleCalculatorLayout.setVisibility(View.VISIBLE);
    }
    private void initialize(){
      //  dailogSearchListView = new dailogSearchListView(this,R.style.FullHeightDialog);
        dailogSearchListView = new dailogSearchListView(this);
        evaluate = new Evaluate();
        list1 = new ArrayList<>();
        unit2SymbolTextView = (TextView)findViewById(R.id.unit2symbol);
        unit1SymbolTextView = (TextView)findViewById(R.id.unit1symbol);
        unitNameListingTextView = (TextView)findViewById(R.id.unitnameelisting);
        userInputlistingTextView = (TextView)findViewById(R.id.inputuserlisting);
        listingLayout = (RelativeLayout)findViewById(R.id.listing);
        listView1 = (ListView) findViewById(R.id.listviewoflisting);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        allCategoryLayout = (RelativeLayout) findViewById(R.id.all_category);
        basicLayout = (RelativeLayout)findViewById(R.id.basic_layout);
        liviingLayout = (RelativeLayout)findViewById(R.id.living_layout);
        scienceLayout = (RelativeLayout)findViewById(R.id.science_layout);
        micsLayout = (RelativeLayout)findViewById(R.id.mics_layout);
        calculateLayout = (RelativeLayout)findViewById(R.id.calculetelayout);
        length = (RelativeLayout)findViewById(R.id.length);
        inputSpinner = (Spinner)findViewById(R.id.inputspinerner);
        inputUnitTextView = (TextView)findViewById(R.id.inputunittext);
        inputUnitTextViewTow = (TextView)findViewById(R.id.inputunittexttow);
        inputSpinnertow = (Spinner)findViewById(R.id.inputspinernertow);
        inputTextView = (TextView)findViewById(R.id.input);
        resultTextView = (TextView)findViewById(R.id.inputtow);
        simpleCalculatorLayout = (RelativeLayout)findViewById(R.id.simplecalculetelayoutt);
        inputTextSring = "";
        mainScreenLayout = (RelativeLayout)findViewById(R.id.mainscreen);
        searchUnitFromList = (SearchView)findViewById(R.id.unit_list_search);
        searchViewMAinScreen = (SearchView)findViewById(R.id.searchbar);
        int id = searchUnitFromList.getContext().getResources().getIdentifier("android:id/search_src_text", null, null);
        searchtextView = (TextView)  searchUnitFromList.findViewById(id);
        int idMianScreen = searchViewMAinScreen.getContext().getResources().getIdentifier("android:id/search_src_text", null, null);
        searchTextViewMainScreen = (TextView)findViewById(idMianScreen);
    }
    public void setSelectedUnit(int id){
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
                inputSpinner.setAdapter(adapter);
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
                inputSpinner.setAdapter(adapterArea);
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
                inputSpinner.setAdapter(adapterWeight);
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
                inputSpinner.setAdapter(adapterVolume);
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
                inputSpinner.setAdapter(adapterTemp);
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
                inputSpinner.setAdapter(adapterTime);
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
                inputSpinner.setAdapter(adapterSpeed);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
         /*   case R.id.force:
                arrayFRomXMLString = R.array.;
                getSupportActionBar().setTitle("Force");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowForce = ArrayAdapter.createFromResource(this, R.array.length, android.R.layout.simple_spinner_item);
                adapterTowForce.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowForce);
                ArrayAdapter<CharSequence> adapterForce = ArrayAdapter.createFromResource(this, R.array.length, android.R.layout.simple_spinner_item);
                adapterForce.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinner.setAdapter(adapterForce);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;*/
           /* case R.id.work:
                arrayFRomXMLString = R.array.area;
                getSupportActionBar().setTitle("Work");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowWork = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowWork.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowWork);
                ArrayAdapter<CharSequence> adapterWork = ArrayAdapter.createFromResource(this, R.array.length, android.R.layout.simple_spinner_item);
                adapterWork.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinner.setAdapter(adapterWork);
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
                inputSpinner.setAdapter(adapterPower);
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
                inputSpinner.setAdapter(adapterPressue);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.angle:
                userAskAbout = "temperature";
                arrayFRomXMLString = R.array.area;
                getSupportActionBar().setTitle("Angle");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowAngle = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowAngle.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowAngle);
                ArrayAdapter<CharSequence> adapterAngle = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterAngle.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinner.setAdapter(adapterAngle);
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
                inputSpinner.setAdapter(adapterData);
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
                inputSpinner.setAdapter(adapterFuel);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
            case R.id.cooking:
                userAskAbout = "temperature";
                arrayFRomXMLString = R.array.area;
                getSupportActionBar().setTitle("Cooking");
                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#343b4e")));
                ArrayAdapter<CharSequence> adapterTowCooking = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterTowCooking.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinnertow.setAdapter(adapterTowCooking);
                ArrayAdapter<CharSequence> adapterCooking = ArrayAdapter.createFromResource(this, arrayFRomXMLString, android.R.layout.simple_spinner_item);
                adapterCooking.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                inputSpinner.setAdapter(adapterCooking);
                mainScreenLayout.setVisibility(View.INVISIBLE);
                calculateLayout.setVisibility(View.VISIBLE);
                break;
        }
    }
    public void setSelectedUnitwithString(String idName){
        int layoutID = getResources().getIdentifier(idName, "id", getPackageName());
        setSelectedUnit(layoutID);
    }
    public void onClickListenor(View view) {
        int id = view.getId();
        setSelectedUnit(id);
    }
    public void onclicklistener(View view){
        Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String shareBody = "Here is the share content body";
        sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
        startActivity(Intent.createChooser(sharingIntent, "Share via"));
    }
    public void onClickListenerOfListing(View view){
        int item1 = inputSpinner.getSelectedItemPosition();
        userInputlistingTextView.setText(String.valueOf(value1));
        unitNameListingTextView.setText(inputSpinner.getSelectedItem().toString());
        listingLayout.setVisibility(View.VISIBLE);
        calculateLayout.setVisibility(View.INVISIBLE);
        list1 = getList(item1,value1, arrayFRomXMLString,arrayFRomXMLSymbols);
        adaptor = new adapterListView(this, list1);
        listView1.setAdapter(adaptor);
        searchtextView.setTextColor(Color.BLACK);

       searchUnitFromList.setQueryHint(Html.fromHtml("<font color = #0000>" + getResources().getString(R.string.search) + "</font>"));
        //   CharSequence completequery =  searchView.getQuery();
//Log.e("sttring", String.valueOf(completequery));
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
                    adaptor.getFilter().filter(s);
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
        }
        return result;
    }

}
