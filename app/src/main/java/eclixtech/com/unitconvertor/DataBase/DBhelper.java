package eclixtech.com.unitconvertor.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;

import eclixtech.com.unitconvertor.Model.unitModel;

/**
 * Created by Rehan Khan on 4/19/2016.
 */
public class DBhelper extends SQLiteOpenHelper
{
    public String[] time_table;
    public  static final String FAVORTIES_TABLE ="favorties";
    public static final String ID ="_id";
    public  static final String CATEGORY_ID = "category_id";
    public  static final String CATEGORY_ARRAY_ID = "category_array_id";
    public  static final String ITOM_ONE="itom_one";
    public  static final String ITOM_TWO ="itom_two";
    public  static final String CATEGORY ="category";


    public DBhelper(Context context)
    {
        super(context, "data",null, 2);
    }
    public void onCreate(SQLiteDatabase sqLiteDatabase){


        String query = "CREATE TABLE IF NOT EXISTS " + FAVORTIES_TABLE + " (" +
                ID + "           INTEGER PRIMARY KEY AUTOINCREMENT, " +
                CATEGORY  + "       VARCHAR(50), " +
                CATEGORY_ID + "       INTEGER, " +
                CATEGORY_ARRAY_ID + "       INTEGER, " +
                ITOM_ONE + "       INTEGER, " +
                ITOM_TWO + "        INTEGER )";
        sqLiteDatabase.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1)
    {
                //its upgraded code

        String query = "CREATE TABLE IF NOT EXISTS " + FAVORTIES_TABLE + " (" +
                ID + "           INTEGER PRIMARY KEY AUTOINCREMENT, " +
                CATEGORY  + "       VARCHAR(50), " +
                CATEGORY_ID + "       INTEGER, " +
                CATEGORY_ARRAY_ID + "       INTEGER, " +
                ITOM_ONE + "       INTEGER, " +
                ITOM_TWO + "        INTEGER )";
        sqLiteDatabase.execSQL(query);

       /* if (i < 2) {
            // create TABLE3
        }

        if (oldVersion < 3) {
            // create TABLE4
        }*/
    }
    public long insertFavorties(int category_id,int category_array_id,String category, int itemOne,int itemTow){
        long result=0 ;
        try
        {
            SQLiteDatabase db = getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put(CATEGORY, category);
            values.put(CATEGORY_ID, category_id);
            values.put(CATEGORY_ARRAY_ID, category_array_id);
            values.put(ITOM_ONE, itemOne);
            values.put(ITOM_TWO, itemTow);
            result = db.insert(FAVORTIES_TABLE, null, values);
            db.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

        return result;
    }


    public ArrayList<unitModel> getList()
    {

        ArrayList<unitModel> listArry = null;
        long result;
        String course,time,room;
        SQLiteDatabase db = getReadableDatabase();

    //   Toast.makeText(get, "Your BMI is " + result,  Toast.LENGTH_SHORT).show();
        String query = " SELECT * FROM  "+ FAVORTIES_TABLE;
        Cursor cursor = db.rawQuery(query, null);
        if(cursor.moveToNext()) {
            listArry = new ArrayList<>();
                do {
                    unitModel data = new unitModel();
///okk here 2
                    data.setId(cursor.getInt(cursor.getColumnIndex(ID )));
                    data.setCategory(cursor.getString(cursor.getColumnIndex(CATEGORY )));
                    data.setCategory_id(cursor.getInt(cursor.getColumnIndex(CATEGORY_ID)));
                    try{
                        data.setCategory_array_id(cursor.getInt(cursor.getColumnIndex(CATEGORY_ARRAY_ID)));
                        data.setItemOne(cursor.getInt(cursor.getColumnIndex(ITOM_ONE)));
                        data.setItemTow(cursor.getInt(cursor.getColumnIndex(ITOM_TWO)));
                    }catch (IllegalThreadStateException e){
                        new IllegalStateException(e.getMessage(), e);
                    }

                    listArry.add(data);
                }while (cursor.moveToNext());
        }
        else{
            return null;
        }
        cursor.close();
        db.close();
        return listArry;
    }
    public boolean deleteFavorties(int id)
    {
        SQLiteDatabase db = getReadableDatabase();
        Boolean isDeleted = db.delete(FAVORTIES_TABLE, ID + "=" + id, null) > 0;
             db.close();
        return isDeleted;
    }
    public boolean deleteFavortiesByCategoryId(String userAskAbout ,int itomOne,int itomTow)
    {String[] whereArgs = new String[] { userAskAbout };
      //  ourDatabase.delete(DATABASE_TABLE, KEYNAME + "=?", whereArgs);
        SQLiteDatabase db = getReadableDatabase();
        Boolean isDeleted = db.delete(FAVORTIES_TABLE, CATEGORY+ " = ?AND " +ITOM_ONE + " = "+itomOne+" AND " + ITOM_TWO + " = "+itomTow,whereArgs) > 0;
        db.close();
        return isDeleted;
    }
}
