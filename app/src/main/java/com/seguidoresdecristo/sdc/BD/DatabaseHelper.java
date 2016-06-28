package com.seguidoresdecristo.sdc.BD;

import android.content.Context;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;
/**
 * Created by josueChaqui on 28/06/2016.
 */
public class DatabaseHelper extends SQLiteAssetHelper {

    private static final int DATABASE_VERSION = 4;
    private static final String DATABASE_NAME = "base_de_datos.db";


    public DatabaseHelper(Context contex ){
        super(contex, DATABASE_NAME, null, DATABASE_VERSION);

    }


}
