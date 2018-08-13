package com.wongis.catalogger;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "inventories";
    public static final String TABLE_ONE_NAME = "inventory_one";
    public static final String TABLE_TWO_NAME = "inventory_two";
    public static final String TABLE_THREE_NAME = "inventory_three";
    public static final String TABLE_FOUR_NAME = "inventory_four";
    public static final String TABLE_FIVE_NAME = "inventory_five";
    public static final String TABLE_SIX_NAME = "inventory_six";
    public static final String TABLE_SEVEN_NAME = "inventory_seven";
    public static final String TABLE_EIGHT_NAME = "inventory_eight";
    public static final String TABLE_NINE_NAME = "inventory_nine";
    public static final String TABLE_TEN_NAME = "inventory_ten";
    public static final String TABLE_ELEVEN_NAME = "inventory_names";
    public static final String INV_ONE_CAT_ONE_NAME = "inv_one_cat_one_name";
    public static final String INV_ONE_CAT_TWO_NAME = "inv_one_cat_two_name";
    public static final String INV_ONE_CAT_THREE_NAME = "inv_one_cat_three_name";
    public static final String INV_ONE_CAT_FOUR_NAME = "inv_one_cat_four_name";
    public static final String INV_TWO_CAT_ONE_NAME = "inv_two_cat_one_name";
    public static final String INV_TWO_CAT_TWO_NAME = "inv_two_cat_two_name";
    public static final String INV_TWO_CAT_THREE_NAME = "inv_two_cat_three_name";
    public static final String INV_TWO_CAT_FOUR_NAME = "inv_two_cat_four_name";
    public static final String INV_THREE_CAT_ONE_NAME = "inv_three_cat_one_name";
    public static final String INV_THREE_CAT_TWO_NAME = "inv_three_cat_two_name";
    public static final String INV_THREE_CAT_THREE_NAME = "inv_three_cat_three_name";
    public static final String INV_THREE_CAT_FOUR_NAME = "inv_three_cat_four_name";
    public static final String INV_FOUR_CAT_ONE_NAME = "inv_four_cat_one_name";
    public static final String INV_FOUR_CAT_TWO_NAME = "inv_four_cat_two_name";
    public static final String INV_FOUR_CAT_THREE_NAME = "inv_four_cat_three_name";
    public static final String INV_FOUR_CAT_FOUR_NAME = "inv_four_cat_four_name";
    public static final String INV_FIVE_CAT_ONE_NAME = "inv_five_cat_one_name";
    public static final String INV_FIVE_CAT_TWO_NAME = "inv_five_cat_two_name";
    public static final String INV_FIVE_CAT_THREE_NAME = "inv_five_cat_three_name";
    public static final String INV_FIVE_CAT_FOUR_NAME = "inv_five_cat_four_name";
    public static final String INV_SIX_CAT_ONE_NAME = "inv_six_cat_one_name";
    public static final String INV_SIX_CAT_TWO_NAME = "inv_six_cat_two_name";
    public static final String INV_SIX_CAT_THREE_NAME = "inv_six_cat_three_name";
    public static final String INV_SIX_CAT_FOUR_NAME = "inv_six_cat_four_name";
    public static final String INV_SEVEN_CAT_ONE_NAME = "inv_seven_cat_one_name";
    public static final String INV_SEVEN_CAT_TWO_NAME = "inv_seven_cat_two_name";
    public static final String INV_SEVEN_CAT_THREE_NAME = "inv_seven_cat_three_name";
    public static final String INV_SEVEN_CAT_FOUR_NAME = "inv_seven_cat_four_name";
    public static final String INV_EIGHT_CAT_ONE_NAME = "inv_eight_cat_one_name";
    public static final String INV_EIGHT_CAT_TWO_NAME = "inv_eight_cat_two_name";
    public static final String INV_EIGHT_CAT_THREE_NAME = "inv_eight_cat_three_name";
    public static final String INV_EIGHT_CAT_FOUR_NAME = "inv_eight_cat_four_name";
    public static final String INV_NINE_CAT_ONE_NAME = "inv_nine_cat_one_name";
    public static final String INV_NINE_CAT_TWO_NAME = "inv_nine_cat_two_name";
    public static final String INV_NINE_CAT_THREE_NAME = "inv_nine_cat_three_name";
    public static final String INV_NINE_CAT_FOUR_NAME = "inv_nine_cat_four_name";
    public static final String INV_TEN_CAT_ONE_NAME = "inv_ten_cat_one_name";
    public static final String INV_TEN_CAT_TWO_NAME = "inv_ten_cat_two_name";
    public static final String INV_TEN_CAT_THREE_NAME = "inv_ten_cat_three_name";
    public static final String INV_TEN_CAT_FOUR_NAME = "inv_ten_cat_four_name";
    public static final String INV_ONE_ATT_NAME = "inv_one_att_name";
    public static final String INV_TWO_ATT_NAME = "inv_two_att_name";
    public static final String INV_THREE_ATT_NAME = "inv_three_att_name";
    public static final String INV_FOUR_ATT_NAME = "inv_four_att_name";
    public static final String INV_FIVE_ATT_NAME = "inv_five_att_name";
    public static final String INV_SIX_ATT_NAME = "inv_six_att_name";
    public static final String INV_SEVEN_ATT_NAME = "inv_seven_att_name";
    public static final String INV_EIGHT_ATT_NAME = "inv_eight_att_name";
    public static final String INV_NINE_ATT_NAME = "inv_nine_att_name";
    public static final String INV_TEN_ATT_NAME = "inv_ten_att_name";

    // Table 1 Columns
    public static final String TABLE_ONE_ID = "table_one_id";
    public static final String TABLE_ONE_ITEM_NAME = "table_one_name";
    public static final String TABLE_ONE_CATEGORY_ONE = "table_one_category_one";
    public static final String TABLE_ONE_CATEGORY_TWO = "table_one_category_two";
    public static final String TABLE_ONE_CATEGORY_THREE = "table_one_category_three";
    public static final String TABLE_ONE_CATEGORY_FOUR = "table_one_category_four";
    public static final String TABLE_ONE_ATTRIBUTE_ONE = "table_one_attribute_one";
    public static final String TABLE_ONE_ATTRIBUTE_TWO = "table_one_attribute_two";
    public static final String TABLE_ONE_ATTRIBUTE_THREE = "table_one_attribute_three";
    public static final String TABLE_ONE_ATTRIBUTE_FOUR = "table_one_attribute_four";

    // Table 2 Columns
    public static final String TABLE_TWO_ID = "table_two_id";
    public static final String TABLE_TWO_ITEM_NAME = "table_two_name";
    public static final String TABLE_TWO_CATEGORY_ONE = "table_two_category_one";
    public static final String TABLE_TWO_CATEGORY_TWO = "table_two_category_two";
    public static final String TABLE_TWO_CATEGORY_THREE = "table_two_category_three";
    public static final String TABLE_TWO_CATEGORY_FOUR = "table_two_category_four";
    public static final String TABLE_TWO_ATTRIBUTE_ONE = "table_two_attribute_one";
    public static final String TABLE_TWO_ATTRIBUTE_TWO = "table_two_attribute_two";
    public static final String TABLE_TWO_ATTRIBUTE_THREE = "table_two_attribute_three";
    public static final String TABLE_TWO_ATTRIBUTE_FOUR = "table_two_attribute_four";

    // Table 3 Columns
    public static final String TABLE_THREE_ID = "table_three_id";
    public static final String TABLE_THREE_ITEM_NAME = "table_three_name";
    public static final String TABLE_THREE_CATEGORY_ONE = "table_three_category_one";
    public static final String TABLE_THREE_CATEGORY_TWO = "table_three_category_two";
    public static final String TABLE_THREE_CATEGORY_THREE = "table_three_category_three";
    public static final String TABLE_THREE_CATEGORY_FOUR = "table_three_category_four";
    public static final String TABLE_THREE_ATTRIBUTE_ONE = "table_three_attribute_one";
    public static final String TABLE_THREE_ATTRIBUTE_TWO = "table_three_attribute_two";
    public static final String TABLE_THREE_ATTRIBUTE_THREE = "table_three_attribute_three";
    public static final String TABLE_THREE_ATTRIBUTE_FOUR = "table_three_attribute_four";

    // Table 4 Columns
    public static final String TABLE_FOUR_ID = "table_four_id";
    public static final String TABLE_FOUR_ITEM_NAME = "table_four_name";
    public static final String TABLE_FOUR_CATEGORY_ONE = "table_four_category_one";
    public static final String TABLE_FOUR_CATEGORY_TWO = "table_four_category_two";
    public static final String TABLE_FOUR_CATEGORY_THREE = "table_four_category_three";
    public static final String TABLE_FOUR_CATEGORY_FOUR = "table_four_category_four";
    public static final String TABLE_FOUR_ATTRIBUTE_ONE = "table_four_attribute_one";
    public static final String TABLE_FOUR_ATTRIBUTE_TWO = "table_four_attribute_two";
    public static final String TABLE_FOUR_ATTRIBUTE_THREE = "table_four_attribute_three";
    public static final String TABLE_FOUR_ATTRIBUTE_FOUR = "table_four_attribute_four";

    // Table 5 Columns
    public static final String TABLE_FIVE_ID = "table_five_id";
    public static final String TABLE_FIVE_ITEM_NAME = "table_five_name";
    public static final String TABLE_FIVE_CATEGORY_ONE = "table_five_category_one";
    public static final String TABLE_FIVE_CATEGORY_TWO = "table_five_category_two";
    public static final String TABLE_FIVE_CATEGORY_THREE = "table_five_category_three";
    public static final String TABLE_FIVE_CATEGORY_FOUR = "table_five_category_four";
    public static final String TABLE_FIVE_ATTRIBUTE_ONE = "table_five_attribute_one";
    public static final String TABLE_FIVE_ATTRIBUTE_TWO = "table_five_attribute_two";
    public static final String TABLE_FIVE_ATTRIBUTE_THREE = "table_five_attribute_three";
    public static final String TABLE_FIVE_ATTRIBUTE_FOUR = "table_five_attribute_four";

    // Table 6 Columns
    public static final String TABLE_SIX_ID = "table_six_id";
    public static final String TABLE_SIX_ITEM_NAME = "table_six_name";
    public static final String TABLE_SIX_CATEGORY_ONE = "table_six_category_one";
    public static final String TABLE_SIX_CATEGORY_TWO = "table_six_category_two";
    public static final String TABLE_SIX_CATEGORY_THREE = "table_six_category_three";
    public static final String TABLE_SIX_CATEGORY_FOUR = "table_six_category_four";
    public static final String TABLE_SIX_ATTRIBUTE_ONE = "table_six_attribute_one";
    public static final String TABLE_SIX_ATTRIBUTE_TWO = "table_six_attribute_two";
    public static final String TABLE_SIX_ATTRIBUTE_THREE = "table_six_attribute_three";
    public static final String TABLE_SIX_ATTRIBUTE_FOUR = "table_six_attribute_four";

    // Table 7 Columns
    public static final String TABLE_SEVEN_ID = "table_seven_id";
    public static final String TABLE_SEVEN_ITEM_NAME = "table_seven_name";
    public static final String TABLE_SEVEN_CATEGORY_ONE = "table_seven_category_one";
    public static final String TABLE_SEVEN_CATEGORY_TWO = "table_seven_category_two";
    public static final String TABLE_SEVEN_CATEGORY_THREE = "table_seven_category_three";
    public static final String TABLE_SEVEN_CATEGORY_FOUR = "table_seven_category_four";
    public static final String TABLE_SEVEN_ATTRIBUTE_ONE = "table_seven_attribute_one";
    public static final String TABLE_SEVEN_ATTRIBUTE_TWO = "table_seven_attribute_two";
    public static final String TABLE_SEVEN_ATTRIBUTE_THREE = "table_seven_attribute_three";
    public static final String TABLE_SEVEN_ATTRIBUTE_FOUR = "table_seven_attribute_four";
    
    // Table 8 Columns
    public static final String TABLE_EIGHT_ID = "table_eight_id";
    public static final String TABLE_EIGHT_ITEM_NAME = "table_eight_name";
    public static final String TABLE_EIGHT_CATEGORY_ONE = "table_eight_category_one";
    public static final String TABLE_EIGHT_CATEGORY_TWO = "table_eight_category_two";
    public static final String TABLE_EIGHT_CATEGORY_THREE = "table_eight_category_three";
    public static final String TABLE_EIGHT_CATEGORY_FOUR = "table_eight_category_four";
    public static final String TABLE_EIGHT_ATTRIBUTE_ONE = "table_eight_attribute_one";
    public static final String TABLE_EIGHT_ATTRIBUTE_TWO = "table_eight_attribute_two";
    public static final String TABLE_EIGHT_ATTRIBUTE_THREE = "table_eight_attribute_three";
    public static final String TABLE_EIGHT_ATTRIBUTE_FOUR = "table_eight_attribute_four";

    // Table 9 Columns
    public static final String TABLE_NINE_ID = "table_nine_id";
    public static final String TABLE_NINE_ITEM_NAME = "table_nine_name";
    public static final String TABLE_NINE_CATEGORY_ONE = "table_nine_category_one";
    public static final String TABLE_NINE_CATEGORY_TWO = "table_nine_category_two";
    public static final String TABLE_NINE_CATEGORY_THREE = "table_nine_category_three";
    public static final String TABLE_NINE_CATEGORY_FOUR = "table_nine_category_four";
    public static final String TABLE_NINE_ATTRIBUTE_ONE = "table_nine_attribute_one";
    public static final String TABLE_NINE_ATTRIBUTE_TWO = "table_nine_attribute_two";
    public static final String TABLE_NINE_ATTRIBUTE_THREE = "table_nine_attribute_three";
    public static final String TABLE_NINE_ATTRIBUTE_FOUR = "table_nine_attribute_four";

    // Table 10 Columns
    public static final String TABLE_TEN_ID = "table_ten_id";
    public static final String TABLE_TEN_ITEM_NAME = "table_ten_name";
    public static final String TABLE_TEN_CATEGORY_ONE = "table_ten_category_one";
    public static final String TABLE_TEN_CATEGORY_TWO = "table_ten_category_two";
    public static final String TABLE_TEN_CATEGORY_THREE = "table_ten_category_three";
    public static final String TABLE_TEN_CATEGORY_FOUR = "table_ten_category_four";
    public static final String TABLE_TEN_ATTRIBUTE_ONE = "table_ten_attribute_one";
    public static final String TABLE_TEN_ATTRIBUTE_TWO = "table_ten_attribute_two";
    public static final String TABLE_TEN_ATTRIBUTE_THREE = "table_ten_attribute_three";
    public static final String TABLE_TEN_ATTRIBUTE_FOUR = "table_ten_attribute_four";

    // Table 11 Columns
    public static final String TABLE_ELEVEN_ID = "table_eleven_id";
    public static final String TABLE_ELEVEN_INVENTORY_NAME = "table_eleven_inventory_name";
    
    // All Inventory Categories Columns...
    public static final String INV_ONE_CAT_ONE = "inv_one_cat_one";
    public static final String INV_ONE_CAT_TWO = "inv_one_cat_two";
    public static final String INV_ONE_CAT_THREE = "inv_one_cat_three";
    public static final String INV_ONE_CAT_FOUR = "inv_one_cat_four";
    public static final String INV_TWO_CAT_ONE = "inv_two_cat_one";
    public static final String INV_TWO_CAT_TWO = "inv_two_cat_two";
    public static final String INV_TWO_CAT_THREE = "inv_two_cat_three";
    public static final String INV_TWO_CAT_FOUR = "inv_two_cat_four";
    public static final String INV_THREE_CAT_ONE = "inv_three_cat_one";
    public static final String INV_THREE_CAT_TWO = "inv_three_cat_two";
    public static final String INV_THREE_CAT_THREE = "inv_three_cat_three";
    public static final String INV_THREE_CAT_FOUR = "inv_three_cat_four";
    public static final String INV_FOUR_CAT_ONE = "inv_four_cat_one";
    public static final String INV_FOUR_CAT_TWO = "inv_four_cat_two";
    public static final String INV_FOUR_CAT_THREE = "inv_four_cat_three";
    public static final String INV_FOUR_CAT_FOUR = "inv_four_cat_four";
    public static final String INV_FIVE_CAT_ONE = "inv_five_cat_one";
    public static final String INV_FIVE_CAT_TWO = "inv_five_cat_two";
    public static final String INV_FIVE_CAT_THREE = "inv_five_cat_three";
    public static final String INV_FIVE_CAT_FOUR = "inv_five_cat_four";
    public static final String INV_SIX_CAT_ONE = "inv_six_cat_one";
    public static final String INV_SIX_CAT_TWO = "inv_six_cat_two";
    public static final String INV_SIX_CAT_THREE = "inv_six_cat_three";
    public static final String INV_SIX_CAT_FOUR = "inv_six_cat_four";
    public static final String INV_SEVEN_CAT_ONE = "inv_seven_cat_one";
    public static final String INV_SEVEN_CAT_TWO = "inv_seven_cat_two";
    public static final String INV_SEVEN_CAT_THREE = "inv_seven_cat_three";
    public static final String INV_SEVEN_CAT_FOUR = "inv_seven_cat_four";
    public static final String INV_EIGHT_CAT_ONE = "inv_eight_cat_one";
    public static final String INV_EIGHT_CAT_TWO = "inv_eight_cat_two";
    public static final String INV_EIGHT_CAT_THREE = "inv_eight_cat_three";
    public static final String INV_EIGHT_CAT_FOUR = "inv_eight_cat_four";
    public static final String INV_NINE_CAT_ONE = "inv_nine_cat_one";
    public static final String INV_NINE_CAT_TWO = "inv_nine_cat_two";
    public static final String INV_NINE_CAT_THREE = "inv_nine_cat_three";
    public static final String INV_NINE_CAT_FOUR = "inv_nine_cat_four";
    public static final String INV_TEN_CAT_ONE = "inv_ten_cat_one";
    public static final String INV_TEN_CAT_TWO = "inv_ten_cat_two";
    public static final String INV_TEN_CAT_THREE = "inv_ten_cat_three";
    public static final String INV_TEN_CAT_FOUR = "inv_ten_cat_four";
    // All Inventory Attribute Columns...
    public static final String INV_ATT_ONE = "inv_att_one";
    public static final String INV_ATT_TWO = "inv_att_two";
    public static final String INV_ATT_THREE = "inv_att_three";
    public static final String INV_ATT_FOUR = "inv_att_four";
    public static final String INV_ATT_FIVE = "inv_att_five";
    public static final String INV_ATT_SIX = "inv_att_six";
    public static final String INV_ATT_SEVEN = "inv_att_seven";
    public static final String INV_ATT_EIGHT = "inv_att_eight";
    public static final String INV_ATT_NINE = "inv_att_nine";
    public static final String INV_ATT_TEN = "inv_att_ten";
    

    public DatabaseHelper(Context context) {super(context,DATABASE_NAME,null,1);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableOne = "CREATE TABLE IF NOT EXISTS " + TABLE_ONE_NAME + "(" + TABLE_ONE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TABLE_ONE_ITEM_NAME + " TEXT, " + TABLE_ONE_CATEGORY_ONE + " TEXT, " + TABLE_ONE_CATEGORY_TWO + " TEXT, " + TABLE_ONE_CATEGORY_THREE + " TEXT, " + TABLE_ONE_CATEGORY_FOUR + " TEXT, " + TABLE_ONE_ATTRIBUTE_ONE + " TEXT, " + TABLE_ONE_ATTRIBUTE_TWO + " TEXT, " + TABLE_ONE_ATTRIBUTE_THREE + " TEXT, " + TABLE_ONE_ATTRIBUTE_FOUR + " TEXT)";
        String createTableTwo = "CREATE TABLE IF NOT EXISTS " + TABLE_TWO_NAME + "(" + TABLE_TWO_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TABLE_TWO_ITEM_NAME + " TEXT, " + TABLE_TWO_CATEGORY_ONE + " TEXT, " + TABLE_TWO_CATEGORY_TWO + " TEXT, " + TABLE_TWO_CATEGORY_THREE + " TEXT, " + TABLE_TWO_CATEGORY_FOUR + " TEXT, " + TABLE_TWO_ATTRIBUTE_ONE + " TEXT, " + TABLE_TWO_ATTRIBUTE_TWO + " TEXT, " + TABLE_TWO_ATTRIBUTE_THREE + " TEXT, " + TABLE_TWO_ATTRIBUTE_FOUR + " TEXT)";
        String createTableThree = "CREATE TABLE IF NOT EXISTS " + TABLE_THREE_NAME + "(" + TABLE_THREE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TABLE_THREE_ITEM_NAME + " TEXT, " + TABLE_THREE_CATEGORY_ONE + " TEXT, " + TABLE_THREE_CATEGORY_TWO + " TEXT, " + TABLE_THREE_CATEGORY_THREE + " TEXT, " + TABLE_THREE_CATEGORY_FOUR + " TEXT, " + TABLE_THREE_ATTRIBUTE_ONE + " TEXT, " + TABLE_THREE_ATTRIBUTE_TWO + " TEXT, " + TABLE_THREE_ATTRIBUTE_THREE + " TEXT, " + TABLE_THREE_ATTRIBUTE_FOUR + " TEXT)";
        String createTableFour = "CREATE TABLE IF NOT EXISTS " + TABLE_FOUR_NAME + "(" + TABLE_FOUR_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TABLE_FOUR_ITEM_NAME + " TEXT, " + TABLE_FOUR_CATEGORY_ONE + " TEXT, " + TABLE_FOUR_CATEGORY_TWO + " TEXT, " + TABLE_FOUR_CATEGORY_THREE + " TEXT, " + TABLE_FOUR_CATEGORY_FOUR + " TEXT, " + TABLE_FOUR_ATTRIBUTE_ONE + " TEXT, " + TABLE_FOUR_ATTRIBUTE_TWO + " TEXT, " + TABLE_FOUR_ATTRIBUTE_THREE + " TEXT, " + TABLE_FOUR_ATTRIBUTE_FOUR + " TEXT)";
        String createTableFive = "CREATE TABLE IF NOT EXISTS " + TABLE_FIVE_NAME + "(" + TABLE_FIVE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TABLE_FIVE_ITEM_NAME + " TEXT, " + TABLE_FIVE_CATEGORY_ONE + " TEXT, " + TABLE_FIVE_CATEGORY_TWO + " TEXT, " + TABLE_FIVE_CATEGORY_THREE + " TEXT, " + TABLE_FIVE_CATEGORY_FOUR + " TEXT, " + TABLE_FIVE_ATTRIBUTE_ONE + " TEXT, " + TABLE_FIVE_ATTRIBUTE_TWO + " TEXT, " + TABLE_FIVE_ATTRIBUTE_THREE + " TEXT, " + TABLE_FIVE_ATTRIBUTE_FOUR + " TEXT)";
        String createTableSix = "CREATE TABLE IF NOT EXISTS " + TABLE_SIX_NAME + "(" + TABLE_SIX_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TABLE_SIX_ITEM_NAME + " TEXT, " + TABLE_SIX_CATEGORY_ONE + " TEXT, " + TABLE_SIX_CATEGORY_TWO + " TEXT, " + TABLE_SIX_CATEGORY_THREE + " TEXT, " + TABLE_SIX_CATEGORY_FOUR + " TEXT, " + TABLE_SIX_ATTRIBUTE_ONE + " TEXT, " + TABLE_SIX_ATTRIBUTE_TWO + " TEXT, " + TABLE_SIX_ATTRIBUTE_THREE + " TEXT, " + TABLE_SIX_ATTRIBUTE_FOUR + " TEXT)";
        String createTableSeven = "CREATE TABLE IF NOT EXISTS " + TABLE_SEVEN_NAME + "(" + TABLE_SEVEN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TABLE_SEVEN_ITEM_NAME + " TEXT, " + TABLE_SEVEN_CATEGORY_ONE + " TEXT, " + TABLE_SEVEN_CATEGORY_TWO + " TEXT, " + TABLE_SEVEN_CATEGORY_THREE + " TEXT, " + TABLE_SEVEN_CATEGORY_FOUR + " TEXT, " + TABLE_SEVEN_ATTRIBUTE_ONE + " TEXT, " + TABLE_SEVEN_ATTRIBUTE_TWO + " TEXT, " + TABLE_SEVEN_ATTRIBUTE_THREE + " TEXT, " + TABLE_SEVEN_ATTRIBUTE_FOUR + " TEXT)";
        String createTableEight = "CREATE TABLE IF NOT EXISTS " + TABLE_EIGHT_NAME + "(" + TABLE_EIGHT_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TABLE_EIGHT_ITEM_NAME + " TEXT, " + TABLE_EIGHT_CATEGORY_ONE + " TEXT, " + TABLE_EIGHT_CATEGORY_TWO + " TEXT, " + TABLE_EIGHT_CATEGORY_THREE + " TEXT, " + TABLE_EIGHT_CATEGORY_FOUR + " TEXT, " + TABLE_EIGHT_ATTRIBUTE_ONE + " TEXT, " + TABLE_EIGHT_ATTRIBUTE_TWO + " TEXT, " + TABLE_EIGHT_ATTRIBUTE_THREE + " TEXT, " + TABLE_EIGHT_ATTRIBUTE_FOUR + " TEXT)";
        String createTableNine = "CREATE TABLE IF NOT EXISTS " + TABLE_NINE_NAME + "(" + TABLE_NINE_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TABLE_NINE_ITEM_NAME + " TEXT, " + TABLE_NINE_CATEGORY_ONE + " TEXT, " + TABLE_NINE_CATEGORY_TWO + " TEXT, " + TABLE_NINE_CATEGORY_THREE + " TEXT, " + TABLE_NINE_CATEGORY_FOUR + " TEXT, " + TABLE_NINE_ATTRIBUTE_ONE + " TEXT, " + TABLE_NINE_ATTRIBUTE_TWO + " TEXT, " + TABLE_NINE_ATTRIBUTE_THREE + " TEXT, " + TABLE_NINE_ATTRIBUTE_FOUR + " TEXT)";
        String createTableTen = "CREATE TABLE IF NOT EXISTS " + TABLE_TEN_NAME + "(" + TABLE_TEN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TABLE_TEN_ITEM_NAME + " TEXT, " + TABLE_TEN_CATEGORY_ONE + " TEXT, " + TABLE_TEN_CATEGORY_TWO + " TEXT, " + TABLE_TEN_CATEGORY_THREE + " TEXT, " + TABLE_TEN_CATEGORY_FOUR + " TEXT, " + TABLE_TEN_ATTRIBUTE_ONE + " TEXT, " + TABLE_TEN_ATTRIBUTE_TWO + " TEXT, " + TABLE_TEN_ATTRIBUTE_THREE + " TEXT, " + TABLE_TEN_ATTRIBUTE_FOUR + " TEXT)";
        String createTableEleven = "CREATE TABLE " + TABLE_ELEVEN_NAME + "(" + TABLE_ELEVEN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + TABLE_ELEVEN_INVENTORY_NAME + " TEXT)";
        String createTableInvOneCatOne = "CREATE TABLE IF NOT EXISTS " + INV_ONE_CAT_ONE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_ONE_CAT_ONE + " TEXT)";
        String createTableInvOneCatTwo = "CREATE TABLE IF NOT EXISTS " + INV_ONE_CAT_TWO_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_ONE_CAT_TWO + " TEXT)";
        String createTableInvOneCatThree = "CREATE TABLE IF NOT EXISTS " + INV_ONE_CAT_THREE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_ONE_CAT_THREE + " TEXT)";
        String createTableInvOneCatFour = "CREATE TABLE IF NOT EXISTS " + INV_ONE_CAT_FOUR_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_ONE_CAT_FOUR + " TEXT)";
        String createTableInvTwoCatOne = "CREATE TABLE IF NOT EXISTS " + INV_TWO_CAT_ONE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_TWO_CAT_ONE + " TEXT)";
        String createTableInvTwoCatTwo = "CREATE TABLE IF NOT EXISTS " + INV_TWO_CAT_TWO_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_TWO_CAT_TWO + " TEXT)";
        String createTableInvTwoCatThree = "CREATE TABLE IF NOT EXISTS " + INV_TWO_CAT_THREE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_TWO_CAT_THREE + " TEXT)";
        String createTableInvTwoCatFour = "CREATE TABLE IF NOT EXISTS " + INV_TWO_CAT_FOUR_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_TWO_CAT_FOUR + " TEXT)";
        String createTableInvThreeCatOne = "CREATE TABLE IF NOT EXISTS " + INV_THREE_CAT_ONE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_THREE_CAT_ONE + " TEXT)";
        String createTableInvThreeCatTwo = "CREATE TABLE IF NOT EXISTS " + INV_THREE_CAT_TWO_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_THREE_CAT_TWO + " TEXT)";
        String createTableInvThreeCatThree = "CREATE TABLE IF NOT EXISTS " + INV_THREE_CAT_THREE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_THREE_CAT_THREE + " TEXT)";
        String createTableInvThreeCatFour = "CREATE TABLE IF NOT EXISTS " + INV_THREE_CAT_FOUR_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_THREE_CAT_FOUR + " TEXT)";
        String createTableInvFourCatOne = "CREATE TABLE IF NOT EXISTS " + INV_FOUR_CAT_ONE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_FOUR_CAT_ONE + " TEXT)";
        String createTableInvFourCatTwo = "CREATE TABLE IF NOT EXISTS " + INV_FOUR_CAT_TWO_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_FOUR_CAT_TWO + " TEXT)";
        String createTableInvFourCatThree = "CREATE TABLE IF NOT EXISTS " + INV_FOUR_CAT_THREE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_FOUR_CAT_THREE + " TEXT)";
        String createTableInvFourCatFour = "CREATE TABLE IF NOT EXISTS " + INV_FOUR_CAT_FOUR_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_FOUR_CAT_FOUR + " TEXT)";
        String createTableInvFiveCatOne = "CREATE TABLE IF NOT EXISTS " + INV_FIVE_CAT_ONE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_FIVE_CAT_ONE + " TEXT)";
        String createTableInvFiveCatTwo = "CREATE TABLE IF NOT EXISTS " + INV_FIVE_CAT_TWO_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_FIVE_CAT_TWO + " TEXT)";
        String createTableInvFiveCatThree = "CREATE TABLE IF NOT EXISTS " + INV_FIVE_CAT_THREE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_FIVE_CAT_THREE + " TEXT)";
        String createTableInvFiveCatFour = "CREATE TABLE IF NOT EXISTS " + INV_FIVE_CAT_FOUR_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_FIVE_CAT_FOUR + " TEXT)";
        String createTableInvSixCatOne = "CREATE TABLE IF NOT EXISTS " + INV_SIX_CAT_ONE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_SIX_CAT_ONE + " TEXT)";
        String createTableInvSixCatTwo = "CREATE TABLE IF NOT EXISTS " + INV_SIX_CAT_TWO_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_SIX_CAT_TWO + " TEXT)";
        String createTableInvSixCatThree = "CREATE TABLE IF NOT EXISTS " + INV_SIX_CAT_THREE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_SIX_CAT_THREE + " TEXT)";
        String createTableInvSixCatFour = "CREATE TABLE IF NOT EXISTS " + INV_SIX_CAT_FOUR_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_SIX_CAT_FOUR + " TEXT)";
        String createTableInvSevenCatOne = "CREATE TABLE IF NOT EXISTS " + INV_SEVEN_CAT_ONE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_SEVEN_CAT_ONE + " TEXT)";
        String createTableInvSevenCatTwo = "CREATE TABLE IF NOT EXISTS " + INV_SEVEN_CAT_TWO_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_SEVEN_CAT_TWO + " TEXT)";
        String createTableInvSevenCatThree = "CREATE TABLE IF NOT EXISTS " + INV_SEVEN_CAT_THREE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_SEVEN_CAT_THREE + " TEXT)";
        String createTableInvSevenCatFour = "CREATE TABLE IF NOT EXISTS " + INV_SEVEN_CAT_FOUR_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_SEVEN_CAT_FOUR + " TEXT)";
        String createTableInvEightCatOne = "CREATE TABLE IF NOT EXISTS " + INV_EIGHT_CAT_ONE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_EIGHT_CAT_ONE + " TEXT)";
        String createTableInvEightCatTwo = "CREATE TABLE IF NOT EXISTS " + INV_EIGHT_CAT_TWO_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_EIGHT_CAT_TWO + " TEXT)";
        String createTableInvEightCatThree = "CREATE TABLE IF NOT EXISTS " + INV_EIGHT_CAT_THREE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_EIGHT_CAT_THREE + " TEXT)";
        String createTableInvEightCatFour = "CREATE TABLE IF NOT EXISTS " + INV_EIGHT_CAT_FOUR_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_EIGHT_CAT_FOUR + " TEXT)";
        String createTableInvNineCatOne = "CREATE TABLE IF NOT EXISTS " + INV_NINE_CAT_ONE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_NINE_CAT_ONE + " TEXT)";
        String createTableInvNineCatTwo = "CREATE TABLE IF NOT EXISTS " + INV_NINE_CAT_TWO_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_NINE_CAT_TWO + " TEXT)";
        String createTableInvNineCatThree = "CREATE TABLE IF NOT EXISTS " + INV_NINE_CAT_THREE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_NINE_CAT_THREE + " TEXT)";
        String createTableInvNineCatFour = "CREATE TABLE IF NOT EXISTS " + INV_NINE_CAT_FOUR_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_NINE_CAT_FOUR + " TEXT)";
        String createTableInvTenCatOne = "CREATE TABLE IF NOT EXISTS " + INV_TEN_CAT_ONE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_TEN_CAT_ONE + " TEXT)";
        String createTableInvTenCatTwo = "CREATE TABLE IF NOT EXISTS " + INV_TEN_CAT_TWO_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_TEN_CAT_TWO + " TEXT)";
        String createTableInvTenCatThree = "CREATE TABLE IF NOT EXISTS " + INV_TEN_CAT_THREE_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_TEN_CAT_THREE + " TEXT)";
        String createTableInvTenCatFour = "CREATE TABLE IF NOT EXISTS " + INV_TEN_CAT_FOUR_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_TEN_CAT_FOUR + " TEXT)";
        String createTableInvOneAtt = "CREATE TABLE IF NOT EXISTS " + INV_ONE_ATT_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_ATT_ONE + " TEXT)";
        String createTableInvTwoAtt = "CREATE TABLE IF NOT EXISTS " + INV_TWO_ATT_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_ATT_TWO + " TEXT)";
        String createTableInvThreeAtt = "CREATE TABLE IF NOT EXISTS " + INV_THREE_ATT_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_ATT_THREE + " TEXT)";
        String createTableInvFourAtt = "CREATE TABLE IF NOT EXISTS " + INV_FOUR_ATT_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_ATT_FOUR + " TEXT)";
        String createTableInvFiveAtt = "CREATE TABLE IF NOT EXISTS " + INV_FIVE_ATT_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_ATT_FIVE + " TEXT)";
        String createTableInvSixAtt = "CREATE TABLE IF NOT EXISTS " + INV_SIX_ATT_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_ATT_SIX + " TEXT)";
        String createTableInvSevenAtt = "CREATE TABLE IF NOT EXISTS " + INV_SEVEN_ATT_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_ATT_SEVEN + " TEXT)";
        String createTableInvEightAtt = "CREATE TABLE IF NOT EXISTS " + INV_EIGHT_ATT_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_ATT_EIGHT + " TEXT)";
        String createTableInvNineAtt = "CREATE TABLE IF NOT EXISTS " + INV_NINE_ATT_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_ATT_NINE + " TEXT)";
        String createTableInvTenAtt = "CREATE TABLE IF NOT EXISTS " + INV_TEN_ATT_NAME + "(table_id INTEGER PRIMARY KEY AUTOINCREMENT, " + INV_ATT_TEN + " TEXT)";
        db.execSQL(createTableOne);
        db.execSQL(createTableTwo);
        db.execSQL(createTableThree);
        db.execSQL(createTableFour);
        db.execSQL(createTableFive);
        db.execSQL(createTableSix);
        db.execSQL(createTableSeven);
        db.execSQL(createTableEight);
        db.execSQL(createTableNine);
        db.execSQL(createTableTen);
        db.execSQL(createTableEleven);
        db.execSQL(createTableInvOneCatOne);
        db.execSQL(createTableInvOneCatTwo);
        db.execSQL(createTableInvOneCatThree);
        db.execSQL(createTableInvOneCatFour);
        db.execSQL(createTableInvTwoCatOne);
        db.execSQL(createTableInvTwoCatTwo);
        db.execSQL(createTableInvTwoCatThree);
        db.execSQL(createTableInvTwoCatFour);
        db.execSQL(createTableInvThreeCatOne);
        db.execSQL(createTableInvThreeCatTwo);
        db.execSQL(createTableInvThreeCatThree);
        db.execSQL(createTableInvThreeCatFour);
        db.execSQL(createTableInvFourCatOne);
        db.execSQL(createTableInvFourCatTwo);
        db.execSQL(createTableInvFourCatThree);
        db.execSQL(createTableInvFourCatFour);
        db.execSQL(createTableInvFiveCatOne);
        db.execSQL(createTableInvFiveCatTwo);
        db.execSQL(createTableInvFiveCatThree);
        db.execSQL(createTableInvFiveCatFour);
        db.execSQL(createTableInvSixCatOne);
        db.execSQL(createTableInvSixCatTwo);
        db.execSQL(createTableInvSixCatThree);
        db.execSQL(createTableInvSixCatFour);
        db.execSQL(createTableInvSevenCatOne);
        db.execSQL(createTableInvSevenCatTwo);
        db.execSQL(createTableInvSevenCatThree);
        db.execSQL(createTableInvSevenCatFour);
        db.execSQL(createTableInvEightCatOne);
        db.execSQL(createTableInvEightCatTwo);
        db.execSQL(createTableInvEightCatThree);
        db.execSQL(createTableInvEightCatFour);
        db.execSQL(createTableInvNineCatOne);
        db.execSQL(createTableInvNineCatTwo);
        db.execSQL(createTableInvNineCatThree);
        db.execSQL(createTableInvNineCatFour);
        db.execSQL(createTableInvTenCatOne);
        db.execSQL(createTableInvTenCatTwo);
        db.execSQL(createTableInvTenCatThree);
        db.execSQL(createTableInvTenCatFour);
        db.execSQL(createTableInvOneAtt);
        db.execSQL(createTableInvTwoAtt);
        db.execSQL(createTableInvThreeAtt);
        db.execSQL(createTableInvFourAtt);
        db.execSQL(createTableInvFiveAtt);
        db.execSQL(createTableInvSixAtt);
        db.execSQL(createTableInvSevenAtt);
        db.execSQL(createTableInvEightAtt);
        db.execSQL(createTableInvNineAtt);
        db.execSQL(createTableInvTenAtt);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_ONE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_TWO_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_THREE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_FOUR_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_FIVE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_SIX_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_SEVEN_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_EIGHT_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_NINE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_TEN_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + TABLE_ELEVEN_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_ONE_CAT_ONE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_ONE_CAT_TWO_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_ONE_CAT_THREE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_ONE_CAT_FOUR_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_TWO_CAT_ONE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_TWO_CAT_TWO_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_TWO_CAT_THREE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_TWO_CAT_FOUR_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_THREE_CAT_ONE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_THREE_CAT_TWO_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_THREE_CAT_THREE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_THREE_CAT_FOUR_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_FOUR_CAT_ONE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_FOUR_CAT_TWO_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_FOUR_CAT_THREE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_FOUR_CAT_FOUR_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_FIVE_CAT_ONE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_FIVE_CAT_TWO_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_FIVE_CAT_THREE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_FIVE_CAT_FOUR_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_SIX_CAT_ONE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_SIX_CAT_TWO_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_SIX_CAT_THREE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_SIX_CAT_FOUR_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_SEVEN_CAT_ONE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_SEVEN_CAT_TWO_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_SEVEN_CAT_THREE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_SEVEN_CAT_FOUR_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_EIGHT_CAT_ONE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_EIGHT_CAT_TWO_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_EIGHT_CAT_THREE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_EIGHT_CAT_FOUR_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_NINE_CAT_ONE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_NINE_CAT_TWO_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_NINE_CAT_THREE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_NINE_CAT_FOUR_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_TEN_CAT_ONE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_TEN_CAT_TWO_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_TEN_CAT_THREE_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_TEN_CAT_FOUR_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_ONE_ATT_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_TWO_ATT_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_THREE_ATT_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_FOUR_ATT_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_FIVE_ATT_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_SIX_ATT_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_SEVEN_ATT_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_EIGHT_ATT_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_NINE_ATT_NAME);
        db.execSQL("DROP IF TABLE EXISTS " + INV_TEN_ATT_NAME);
    }

    public long addTableOneItem(String name, String categoryOne, String categoryTwo, String categoryThree, String categoryFour, String attributeOne, String attributeTwo, String attributeThree, String attributeFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TABLE_ONE_ITEM_NAME, name);
        contentValues.put(TABLE_ONE_CATEGORY_ONE, categoryOne);
        contentValues.put(TABLE_ONE_CATEGORY_TWO, categoryTwo);
        contentValues.put(TABLE_ONE_CATEGORY_THREE, categoryThree);
        contentValues.put(TABLE_ONE_CATEGORY_FOUR, categoryFour);
        contentValues.put(TABLE_ONE_ATTRIBUTE_ONE, attributeOne);
        contentValues.put(TABLE_ONE_ATTRIBUTE_TWO, attributeTwo);
        contentValues.put(TABLE_ONE_ATTRIBUTE_THREE, attributeThree);
        contentValues.put(TABLE_ONE_ATTRIBUTE_FOUR, attributeFour);
        long result = db.insert(TABLE_ONE_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addTableTwoItem(String name, String categoryOne, String categoryTwo, String categoryThree, String categoryFour, String attributeOne, String attributeTwo, String attributeThree, String attributeFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TABLE_TWO_ITEM_NAME, name);
        contentValues.put(TABLE_TWO_CATEGORY_ONE, categoryOne);
        contentValues.put(TABLE_TWO_CATEGORY_TWO, categoryTwo);
        contentValues.put(TABLE_TWO_CATEGORY_THREE, categoryThree);
        contentValues.put(TABLE_TWO_CATEGORY_FOUR, categoryFour);
        contentValues.put(TABLE_TWO_ATTRIBUTE_ONE, attributeOne);
        contentValues.put(TABLE_TWO_ATTRIBUTE_TWO, attributeTwo);
        contentValues.put(TABLE_TWO_ATTRIBUTE_THREE, attributeThree);
        contentValues.put(TABLE_TWO_ATTRIBUTE_FOUR, attributeFour);
        long result = db.insert(TABLE_TWO_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addTableThreeItem(String name, String categoryOne, String categoryTwo, String categoryThree, String categoryFour, String attributeOne, String attributeTwo, String attributeThree, String attributeFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TABLE_THREE_ITEM_NAME, name);
        contentValues.put(TABLE_THREE_CATEGORY_ONE, categoryOne);
        contentValues.put(TABLE_THREE_CATEGORY_TWO, categoryTwo);
        contentValues.put(TABLE_THREE_CATEGORY_THREE, categoryThree);
        contentValues.put(TABLE_THREE_CATEGORY_FOUR, categoryFour);
        contentValues.put(TABLE_THREE_ATTRIBUTE_ONE, attributeOne);
        contentValues.put(TABLE_THREE_ATTRIBUTE_TWO, attributeTwo);
        contentValues.put(TABLE_THREE_ATTRIBUTE_THREE, attributeThree);
        contentValues.put(TABLE_THREE_ATTRIBUTE_FOUR, attributeFour);
        long result = db.insert(TABLE_THREE_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addTableFourItem(String name, String categoryOne, String categoryTwo, String categoryThree, String categoryFour, String attributeOne, String attributeTwo, String attributeThree, String attributeFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TABLE_FOUR_ITEM_NAME, name);
        contentValues.put(TABLE_FOUR_CATEGORY_ONE, categoryOne);
        contentValues.put(TABLE_FOUR_CATEGORY_TWO, categoryTwo);
        contentValues.put(TABLE_FOUR_CATEGORY_THREE, categoryThree);
        contentValues.put(TABLE_FOUR_CATEGORY_FOUR, categoryFour);
        contentValues.put(TABLE_FOUR_ATTRIBUTE_ONE, attributeOne);
        contentValues.put(TABLE_FOUR_ATTRIBUTE_TWO, attributeTwo);
        contentValues.put(TABLE_FOUR_ATTRIBUTE_THREE, attributeThree);
        contentValues.put(TABLE_FOUR_ATTRIBUTE_FOUR, attributeFour);
        long result = db.insert(TABLE_FOUR_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addTableFiveItem(String name, String categoryOne, String categoryTwo, String categoryThree, String categoryFour, String attributeOne, String attributeTwo, String attributeThree, String attributeFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TABLE_FIVE_ITEM_NAME, name);
        contentValues.put(TABLE_FIVE_CATEGORY_ONE, categoryOne);
        contentValues.put(TABLE_FIVE_CATEGORY_TWO, categoryTwo);
        contentValues.put(TABLE_FIVE_CATEGORY_THREE, categoryThree);
        contentValues.put(TABLE_FIVE_CATEGORY_FOUR, categoryFour);
        contentValues.put(TABLE_FIVE_ATTRIBUTE_ONE, attributeOne);
        contentValues.put(TABLE_FIVE_ATTRIBUTE_TWO, attributeTwo);
        contentValues.put(TABLE_FIVE_ATTRIBUTE_THREE, attributeThree);
        contentValues.put(TABLE_FIVE_ATTRIBUTE_FOUR, attributeFour);
        long result = db.insert(TABLE_FIVE_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addTableSixItem(String name, String categoryOne, String categoryTwo, String categoryThree, String categoryFour, String attributeOne, String attributeTwo, String attributeThree, String attributeFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TABLE_SIX_ITEM_NAME, name);
        contentValues.put(TABLE_SIX_CATEGORY_ONE, categoryOne);
        contentValues.put(TABLE_SIX_CATEGORY_TWO, categoryTwo);
        contentValues.put(TABLE_SIX_CATEGORY_THREE, categoryThree);
        contentValues.put(TABLE_SIX_CATEGORY_FOUR, categoryFour);
        contentValues.put(TABLE_SIX_ATTRIBUTE_ONE, attributeOne);
        contentValues.put(TABLE_SIX_ATTRIBUTE_TWO, attributeTwo);
        contentValues.put(TABLE_SIX_ATTRIBUTE_THREE, attributeThree);
        contentValues.put(TABLE_SIX_ATTRIBUTE_FOUR, attributeFour);
        long result = db.insert(TABLE_SIX_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addTableSevenItem(String name, String categoryOne, String categoryTwo, String categoryThree, String categoryFour, String attributeOne, String attributeTwo, String attributeThree, String attributeFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TABLE_SEVEN_ITEM_NAME, name);
        contentValues.put(TABLE_SEVEN_CATEGORY_ONE, categoryOne);
        contentValues.put(TABLE_SEVEN_CATEGORY_TWO, categoryTwo);
        contentValues.put(TABLE_SEVEN_CATEGORY_THREE, categoryThree);
        contentValues.put(TABLE_SEVEN_CATEGORY_FOUR, categoryFour);
        contentValues.put(TABLE_SEVEN_ATTRIBUTE_ONE, attributeOne);
        contentValues.put(TABLE_SEVEN_ATTRIBUTE_TWO, attributeTwo);
        contentValues.put(TABLE_SEVEN_ATTRIBUTE_THREE, attributeThree);
        contentValues.put(TABLE_SEVEN_ATTRIBUTE_FOUR, attributeFour);
        long result = db.insert(TABLE_SEVEN_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addTableEightItem(String name, String categoryOne, String categoryTwo, String categoryThree, String categoryFour, String attributeOne, String attributeTwo, String attributeThree, String attributeFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TABLE_EIGHT_ITEM_NAME, name);
        contentValues.put(TABLE_EIGHT_CATEGORY_ONE, categoryOne);
        contentValues.put(TABLE_EIGHT_CATEGORY_TWO, categoryTwo);
        contentValues.put(TABLE_EIGHT_CATEGORY_THREE, categoryThree);
        contentValues.put(TABLE_EIGHT_CATEGORY_FOUR, categoryFour);
        contentValues.put(TABLE_EIGHT_ATTRIBUTE_ONE, attributeOne);
        contentValues.put(TABLE_EIGHT_ATTRIBUTE_TWO, attributeTwo);
        contentValues.put(TABLE_EIGHT_ATTRIBUTE_THREE, attributeThree);
        contentValues.put(TABLE_EIGHT_ATTRIBUTE_FOUR, attributeFour);
        long result = db.insert(TABLE_EIGHT_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addTableNineItem(String name, String categoryOne, String categoryTwo, String categoryThree, String categoryFour, String attributeOne, String attributeTwo, String attributeThree, String attributeFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TABLE_NINE_ITEM_NAME, name);
        contentValues.put(TABLE_NINE_CATEGORY_ONE, categoryOne);
        contentValues.put(TABLE_NINE_CATEGORY_TWO, categoryTwo);
        contentValues.put(TABLE_NINE_CATEGORY_THREE, categoryThree);
        contentValues.put(TABLE_NINE_CATEGORY_FOUR, categoryFour);
        contentValues.put(TABLE_NINE_ATTRIBUTE_ONE, attributeOne);
        contentValues.put(TABLE_NINE_ATTRIBUTE_TWO, attributeTwo);
        contentValues.put(TABLE_NINE_ATTRIBUTE_THREE, attributeThree);
        contentValues.put(TABLE_NINE_ATTRIBUTE_FOUR, attributeFour);
        long result = db.insert(TABLE_NINE_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addTableTenItem(String name, String categoryOne, String categoryTwo, String categoryThree, String categoryFour, String attributeOne, String attributeTwo, String attributeThree, String attributeFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TABLE_TEN_ITEM_NAME, name);
        contentValues.put(TABLE_TEN_CATEGORY_ONE, categoryOne);
        contentValues.put(TABLE_TEN_CATEGORY_TWO, categoryTwo);
        contentValues.put(TABLE_TEN_CATEGORY_THREE, categoryThree);
        contentValues.put(TABLE_TEN_CATEGORY_FOUR, categoryFour);
        contentValues.put(TABLE_TEN_ATTRIBUTE_ONE, attributeOne);
        contentValues.put(TABLE_TEN_ATTRIBUTE_TWO, attributeTwo);
        contentValues.put(TABLE_TEN_ATTRIBUTE_THREE, attributeThree);
        contentValues.put(TABLE_TEN_ATTRIBUTE_FOUR, attributeFour);
        long result = db.insert(TABLE_TEN_NAME, null, contentValues);
        db.close();
        return result;
    }

    // Cat/Att Stuff!
    public long addInvOneCatOne(String invOneCategoryOne) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_ONE_CAT_ONE, invOneCategoryOne);

        long result = db.insert(INV_ONE_CAT_ONE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvOneCatTwo(String invOneCategoryTwo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_ONE_CAT_TWO, invOneCategoryTwo);

        long result = db.insert(INV_ONE_CAT_TWO_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvOneCatThree(String invOneCategoryThree) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_ONE_CAT_THREE, invOneCategoryThree);

        long result = db.insert(INV_ONE_CAT_THREE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvOneCatFour(String invOneCategoryFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_ONE_CAT_FOUR, invOneCategoryFour);

        long result = db.insert(INV_ONE_CAT_FOUR_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addInvTwoCatOne(String invTwoCategoryOne) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_TWO_CAT_ONE, invTwoCategoryOne);

        long result = db.insert(INV_TWO_CAT_ONE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvTwoCatTwo(String invTwoCategoryTwo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_TWO_CAT_TWO, invTwoCategoryTwo);

        long result = db.insert(INV_TWO_CAT_TWO_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvTwoCatThree(String invTwoCategoryThree) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_TWO_CAT_THREE, invTwoCategoryThree);

        long result = db.insert(INV_TWO_CAT_THREE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvTwoCatFour(String invTwoCategoryFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_TWO_CAT_FOUR, invTwoCategoryFour);

        long result = db.insert(INV_TWO_CAT_FOUR_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addInvThreeCatOne(String invThreeCategoryOne) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_THREE_CAT_ONE, invThreeCategoryOne);

        long result = db.insert(INV_THREE_CAT_ONE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvThreeCatTwo(String invThreeCategoryTwo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_THREE_CAT_TWO, invThreeCategoryTwo);

        long result = db.insert(INV_THREE_CAT_TWO_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvThreeCatThree(String invThreeCategoryThree) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_THREE_CAT_THREE, invThreeCategoryThree);

        long result = db.insert(INV_THREE_CAT_THREE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvThreeCatFour(String invThreeCategoryFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_THREE_CAT_FOUR, invThreeCategoryFour);

        long result = db.insert(INV_THREE_CAT_FOUR_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addInvFourCatOne(String invFourCategoryOne) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_FOUR_CAT_ONE, invFourCategoryOne);

        long result = db.insert(INV_FOUR_CAT_ONE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvFourCatTwo(String invFourCategoryTwo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_FOUR_CAT_TWO, invFourCategoryTwo);

        long result = db.insert(INV_FOUR_CAT_TWO_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvFourCatThree(String invFourCategoryThree) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_FOUR_CAT_THREE, invFourCategoryThree);

        long result = db.insert(INV_FOUR_CAT_THREE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvFourCatFour(String invFourCategoryFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_FOUR_CAT_FOUR, invFourCategoryFour);

        long result = db.insert(INV_FOUR_CAT_FOUR_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addInvFiveCatOne(String invFiveCategoryOne) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_FIVE_CAT_ONE, invFiveCategoryOne);

        long result = db.insert(INV_FIVE_CAT_ONE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvFiveCatTwo(String invFiveCategoryTwo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_FIVE_CAT_TWO, invFiveCategoryTwo);

        long result = db.insert(INV_FIVE_CAT_TWO_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvFiveCatThree(String invFiveCategoryThree) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_FIVE_CAT_THREE, invFiveCategoryThree);

        long result = db.insert(INV_FIVE_CAT_THREE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvFiveCatFour(String invFiveCategoryFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_FIVE_CAT_FOUR, invFiveCategoryFour);

        long result = db.insert(INV_FIVE_CAT_FOUR_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addInvSixCatOne(String invSixCategoryOne) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_SIX_CAT_ONE, invSixCategoryOne);

        long result = db.insert(INV_SIX_CAT_ONE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvSixCatTwo(String invSixCategoryTwo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_SIX_CAT_TWO, invSixCategoryTwo);

        long result = db.insert(INV_SIX_CAT_TWO_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvSixCatThree(String invSixCategoryThree) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_SIX_CAT_THREE, invSixCategoryThree);

        long result = db.insert(INV_SIX_CAT_THREE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvSixCatFour(String invSixCategoryFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_SIX_CAT_FOUR, invSixCategoryFour);

        long result = db.insert(INV_SIX_CAT_FOUR_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addInvSevenCatOne(String invSevenCategoryOne) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_SEVEN_CAT_ONE, invSevenCategoryOne);

        long result = db.insert(INV_SEVEN_CAT_ONE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvSevenCatTwo(String invSevenCategoryTwo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_SEVEN_CAT_TWO, invSevenCategoryTwo);

        long result = db.insert(INV_SEVEN_CAT_TWO_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvSevenCatThree(String invSevenCategoryThree) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_SEVEN_CAT_THREE, invSevenCategoryThree);

        long result = db.insert(INV_SEVEN_CAT_THREE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvSevenCatFour(String invSevenCategoryFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_SEVEN_CAT_FOUR, invSevenCategoryFour);

        long result = db.insert(INV_SEVEN_CAT_FOUR_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addInvEightCatOne(String invEightCategoryOne) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_EIGHT_CAT_ONE, invEightCategoryOne);

        long result = db.insert(INV_EIGHT_CAT_ONE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvEightCatTwo(String invEightCategoryTwo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_EIGHT_CAT_TWO, invEightCategoryTwo);

        long result = db.insert(INV_EIGHT_CAT_TWO_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvEightCatThree(String invEightCategoryThree) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_EIGHT_CAT_THREE, invEightCategoryThree);

        long result = db.insert(INV_EIGHT_CAT_THREE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvEightCatFour(String invEightCategoryFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_EIGHT_CAT_FOUR, invEightCategoryFour);

        long result = db.insert(INV_EIGHT_CAT_FOUR_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addInvNineCatOne(String invNineCategoryOne) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_NINE_CAT_ONE, invNineCategoryOne);

        long result = db.insert(INV_NINE_CAT_ONE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvNineCatTwo(String invNineCategoryTwo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_NINE_CAT_TWO, invNineCategoryTwo);

        long result = db.insert(INV_NINE_CAT_TWO_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvNineCatThree(String invNineCategoryThree) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_NINE_CAT_THREE, invNineCategoryThree);

        long result = db.insert(INV_NINE_CAT_THREE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvNineCatFour(String invNineCategoryFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_NINE_CAT_FOUR, invNineCategoryFour);

        long result = db.insert(INV_NINE_CAT_FOUR_NAME, null, contentValues);
        db.close();
        return result;
    }

    public long addInvTenCatOne(String invTenCategoryOne) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_TEN_CAT_ONE, invTenCategoryOne);

        long result = db.insert(INV_TEN_CAT_ONE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvTenCatTwo(String invTenCategoryTwo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_TEN_CAT_TWO, invTenCategoryTwo);

        long result = db.insert(INV_TEN_CAT_TWO_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvTenCatThree(String invTenCategoryThree) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_TEN_CAT_THREE, invTenCategoryThree);

        long result = db.insert(INV_TEN_CAT_THREE_NAME, null, contentValues);
        db.close();
        return result;
    }
    public long addInvTenCatFour(String invTenCategoryFour) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(INV_TEN_CAT_FOUR, invTenCategoryFour);

        long result = db.insert(INV_TEN_CAT_FOUR_NAME, null, contentValues);
        db.close();
        return result;
    }
    
    public long addAttribute(String table, String column, String attribute) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(column, attribute);

        long result = db.insert(table, null, contentValues);
        db.close();
        return result;
    }

    // Inventory Stuff!
    public long addInventory(String name) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(TABLE_ELEVEN_INVENTORY_NAME, name);

        long result = db.insert(TABLE_ELEVEN_NAME, null, contentValues);
        db.close();
        return result;
    }

    public Cursor getInfo(String table, String column) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("SELECT " + column + " FROM " + table, null);
        return c;
    }

    public Cursor searchOne(String query) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(true, TABLE_ONE_NAME, new String[] { TABLE_ONE_ID, TABLE_ONE_ITEM_NAME, TABLE_ONE_CATEGORY_ONE, TABLE_ONE_CATEGORY_TWO,
                        TABLE_ONE_CATEGORY_THREE, TABLE_ONE_CATEGORY_FOUR, TABLE_ONE_ATTRIBUTE_ONE, TABLE_ONE_ATTRIBUTE_TWO,
                        TABLE_ONE_ATTRIBUTE_THREE, TABLE_ONE_ATTRIBUTE_FOUR }, TABLE_ONE_ID + " LIKE" + " '%" + query + "%' OR " + TABLE_ONE_ITEM_NAME + " LIKE " + "'%" + query + "%' OR " + TABLE_ONE_CATEGORY_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_ONE_CATEGORY_TWO + " LIKE" + " '%" + query + "%' OR " + TABLE_ONE_CATEGORY_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_ONE_CATEGORY_FOUR +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_ONE_ATTRIBUTE_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_ONE_ATTRIBUTE_TWO +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_ONE_ATTRIBUTE_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_ONE_ATTRIBUTE_FOUR +
                        " LIKE" + " '%" + query + "%'",
                null, null, null, null, null);
    }
    public Cursor searchTwo(String query) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(true, TABLE_TWO_NAME, new String[] { TABLE_TWO_ID, TABLE_TWO_ITEM_NAME, TABLE_TWO_CATEGORY_ONE, TABLE_TWO_CATEGORY_TWO,
                        TABLE_TWO_CATEGORY_THREE, TABLE_TWO_CATEGORY_FOUR, TABLE_TWO_ATTRIBUTE_ONE, TABLE_TWO_ATTRIBUTE_TWO,
                        TABLE_TWO_ATTRIBUTE_THREE, TABLE_TWO_ATTRIBUTE_FOUR }, TABLE_TWO_ID + " LIKE" + " '%" + query + "%' OR " + TABLE_TWO_ITEM_NAME + " LIKE " + "'%" + query + "%' OR " + TABLE_TWO_CATEGORY_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_TWO_CATEGORY_TWO + " LIKE" + " '%" + query + "%' OR " + TABLE_TWO_CATEGORY_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_TWO_CATEGORY_FOUR +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_TWO_ATTRIBUTE_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_TWO_ATTRIBUTE_TWO +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_TWO_ATTRIBUTE_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_TWO_ATTRIBUTE_FOUR +
                        " LIKE" + " '%" + query + "%'",
                null, null, null, null, null);
    }
    public Cursor searchThree(String query) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(true, TABLE_THREE_NAME, new String[] { TABLE_THREE_ID, TABLE_THREE_ITEM_NAME, TABLE_THREE_CATEGORY_ONE, TABLE_THREE_CATEGORY_TWO,
                        TABLE_THREE_CATEGORY_THREE, TABLE_THREE_CATEGORY_FOUR, TABLE_THREE_ATTRIBUTE_ONE, TABLE_THREE_ATTRIBUTE_TWO,
                        TABLE_THREE_ATTRIBUTE_THREE, TABLE_THREE_ATTRIBUTE_FOUR }, TABLE_THREE_ID + " LIKE" + " '%" + query + "%' OR " + TABLE_THREE_ITEM_NAME + " LIKE " + "'%" + query + "%' OR " + TABLE_THREE_CATEGORY_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_THREE_CATEGORY_TWO + " LIKE" + " '%" + query + "%' OR " + TABLE_THREE_CATEGORY_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_THREE_CATEGORY_FOUR +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_THREE_ATTRIBUTE_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_THREE_ATTRIBUTE_TWO +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_THREE_ATTRIBUTE_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_THREE_ATTRIBUTE_FOUR +
                        " LIKE" + " '%" + query + "%'",
                null, null, null, null, null);
    }
    public Cursor searchFour(String query) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(true, TABLE_FOUR_NAME, new String[] { TABLE_FOUR_ID, TABLE_FOUR_ITEM_NAME, TABLE_FOUR_CATEGORY_ONE, TABLE_FOUR_CATEGORY_TWO,
                        TABLE_FOUR_CATEGORY_THREE, TABLE_FOUR_CATEGORY_FOUR, TABLE_FOUR_ATTRIBUTE_ONE, TABLE_FOUR_ATTRIBUTE_TWO,
                        TABLE_FOUR_ATTRIBUTE_THREE, TABLE_FOUR_ATTRIBUTE_FOUR }, TABLE_FOUR_ID + " LIKE" + " '%" + query + "%' OR " + TABLE_FOUR_ITEM_NAME + " LIKE " + "'%" + query + "%' OR " + TABLE_FOUR_CATEGORY_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_FOUR_CATEGORY_TWO + " LIKE" + " '%" + query + "%' OR " + TABLE_FOUR_CATEGORY_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_FOUR_CATEGORY_FOUR +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_FOUR_ATTRIBUTE_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_FOUR_ATTRIBUTE_TWO +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_FOUR_ATTRIBUTE_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_FOUR_ATTRIBUTE_FOUR +
                        " LIKE" + " '%" + query + "%'",
                null, null, null, null, null);
    }
    public Cursor searchFive(String query) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(true, TABLE_FIVE_NAME, new String[] { TABLE_FIVE_ID, TABLE_FIVE_ITEM_NAME, TABLE_FIVE_CATEGORY_ONE, TABLE_FIVE_CATEGORY_TWO,
                        TABLE_FIVE_CATEGORY_THREE, TABLE_FIVE_CATEGORY_FOUR, TABLE_FIVE_ATTRIBUTE_ONE, TABLE_FIVE_ATTRIBUTE_TWO,
                        TABLE_FIVE_ATTRIBUTE_THREE, TABLE_FIVE_ATTRIBUTE_FOUR }, TABLE_FIVE_ID + " LIKE" + " '%" + query + "%' OR " + TABLE_FIVE_ITEM_NAME + " LIKE " + "'%" + query + "%' OR " + TABLE_FIVE_CATEGORY_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_FIVE_CATEGORY_TWO + " LIKE" + " '%" + query + "%' OR " + TABLE_FIVE_CATEGORY_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_FIVE_CATEGORY_FOUR +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_FIVE_ATTRIBUTE_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_FIVE_ATTRIBUTE_TWO +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_FIVE_ATTRIBUTE_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_FIVE_ATTRIBUTE_FOUR +
                        " LIKE" + " '%" + query + "%'",
                null, null, null, null, null);
    }
    public Cursor searchSix(String query) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(true, TABLE_SIX_NAME, new String[] { TABLE_SIX_ID, TABLE_SIX_ITEM_NAME, TABLE_SIX_CATEGORY_ONE, TABLE_SIX_CATEGORY_TWO,
                        TABLE_SIX_CATEGORY_THREE, TABLE_SIX_CATEGORY_FOUR, TABLE_SIX_ATTRIBUTE_ONE, TABLE_SIX_ATTRIBUTE_TWO,
                        TABLE_SIX_ATTRIBUTE_THREE, TABLE_SIX_ATTRIBUTE_FOUR }, TABLE_SIX_ID + " LIKE" + " '%" + query + "%' OR " + TABLE_SIX_ITEM_NAME + " LIKE " + "'%" + query + "%' OR " + TABLE_SIX_CATEGORY_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_SIX_CATEGORY_TWO + " LIKE" + " '%" + query + "%' OR " + TABLE_SIX_CATEGORY_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_SIX_CATEGORY_FOUR +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_SIX_ATTRIBUTE_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_SIX_ATTRIBUTE_TWO +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_SIX_ATTRIBUTE_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_SIX_ATTRIBUTE_FOUR +
                        " LIKE" + " '%" + query + "%'",
                null, null, null, null, null);
    }
    public Cursor searchSeven(String query) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(true, TABLE_SEVEN_NAME, new String[] { TABLE_SEVEN_ID, TABLE_SEVEN_ITEM_NAME, TABLE_SEVEN_CATEGORY_ONE, TABLE_SEVEN_CATEGORY_TWO,
                        TABLE_SEVEN_CATEGORY_THREE, TABLE_SEVEN_CATEGORY_FOUR, TABLE_SEVEN_ATTRIBUTE_ONE, TABLE_SEVEN_ATTRIBUTE_TWO,
                        TABLE_SEVEN_ATTRIBUTE_THREE, TABLE_SEVEN_ATTRIBUTE_FOUR }, TABLE_SEVEN_ID + " LIKE" + " '%" + query + "%' OR " + TABLE_SEVEN_ITEM_NAME + " LIKE " + "'%" + query + "%' OR " + TABLE_SEVEN_CATEGORY_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_SEVEN_CATEGORY_TWO + " LIKE" + " '%" + query + "%' OR " + TABLE_SEVEN_CATEGORY_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_SEVEN_CATEGORY_FOUR +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_SEVEN_ATTRIBUTE_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_SEVEN_ATTRIBUTE_TWO +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_SEVEN_ATTRIBUTE_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_SEVEN_ATTRIBUTE_FOUR +
                        " LIKE" + " '%" + query + "%'",
                null, null, null, null, null);
    }
    public Cursor searchEight(String query) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(true, TABLE_EIGHT_NAME, new String[] { TABLE_EIGHT_ID, TABLE_EIGHT_ITEM_NAME, TABLE_EIGHT_CATEGORY_ONE, TABLE_EIGHT_CATEGORY_TWO,
                        TABLE_EIGHT_CATEGORY_THREE, TABLE_EIGHT_CATEGORY_FOUR, TABLE_EIGHT_ATTRIBUTE_ONE, TABLE_EIGHT_ATTRIBUTE_TWO,
                        TABLE_EIGHT_ATTRIBUTE_THREE, TABLE_EIGHT_ATTRIBUTE_FOUR }, TABLE_EIGHT_ID + " LIKE" + " '%" + query + "%' OR " + TABLE_EIGHT_ITEM_NAME + " LIKE " + "'%" + query + "%' OR " + TABLE_EIGHT_CATEGORY_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_EIGHT_CATEGORY_TWO + " LIKE" + " '%" + query + "%' OR " + TABLE_EIGHT_CATEGORY_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_EIGHT_CATEGORY_FOUR +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_EIGHT_ATTRIBUTE_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_EIGHT_ATTRIBUTE_TWO +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_EIGHT_ATTRIBUTE_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_EIGHT_ATTRIBUTE_FOUR +
                        " LIKE" + " '%" + query + "%'",
                null, null, null, null, null);
    }
    public Cursor searchNine(String query) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(true, TABLE_NINE_NAME, new String[] { TABLE_NINE_ID, TABLE_NINE_ITEM_NAME, TABLE_NINE_CATEGORY_ONE, TABLE_NINE_CATEGORY_TWO,
                        TABLE_NINE_CATEGORY_THREE, TABLE_NINE_CATEGORY_FOUR, TABLE_NINE_ATTRIBUTE_ONE, TABLE_NINE_ATTRIBUTE_TWO,
                        TABLE_NINE_ATTRIBUTE_THREE, TABLE_NINE_ATTRIBUTE_FOUR }, TABLE_NINE_ID + " LIKE" + " '%" + query + "%' OR " + TABLE_NINE_ITEM_NAME + " LIKE " + "'%" + query + "%' OR " + TABLE_NINE_CATEGORY_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_NINE_CATEGORY_TWO + " LIKE" + " '%" + query + "%' OR " + TABLE_NINE_CATEGORY_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_NINE_CATEGORY_FOUR +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_NINE_ATTRIBUTE_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_NINE_ATTRIBUTE_TWO +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_NINE_ATTRIBUTE_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_NINE_ATTRIBUTE_FOUR +
                        " LIKE" + " '%" + query + "%'",
                null, null, null, null, null);
    }
    public Cursor searchTen(String query) {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(true, TABLE_TEN_NAME, new String[] { TABLE_TEN_ID, TABLE_TEN_ITEM_NAME, TABLE_TEN_CATEGORY_ONE, TABLE_TEN_CATEGORY_TWO,
                        TABLE_TEN_CATEGORY_THREE, TABLE_TEN_CATEGORY_FOUR, TABLE_TEN_ATTRIBUTE_ONE, TABLE_TEN_ATTRIBUTE_TWO,
                        TABLE_TEN_ATTRIBUTE_THREE, TABLE_TEN_ATTRIBUTE_FOUR }, TABLE_TEN_ID + " LIKE" + " '%" + query + "%' OR " + TABLE_TEN_ITEM_NAME + " LIKE " + "'%" + query + "%' OR " + TABLE_TEN_CATEGORY_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_TEN_CATEGORY_TWO + " LIKE" + " '%" + query + "%' OR " + TABLE_TEN_CATEGORY_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_TEN_CATEGORY_FOUR +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_TEN_ATTRIBUTE_ONE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_TEN_ATTRIBUTE_TWO +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_TEN_ATTRIBUTE_THREE +
                        " LIKE" + " '%" + query + "%' OR " + TABLE_TEN_ATTRIBUTE_FOUR +
                        " LIKE" + " '%" + query + "%'",
                null, null, null, null, null);
    }

    public Cursor getInventoryName() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("SELECT " + TABLE_ELEVEN_INVENTORY_NAME + " FROM " + TABLE_ELEVEN_NAME, null);
        return c;
    }

    public Cursor getCount(String column, String table) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursorCount = db.rawQuery("SELECT COUNT(" + column + ") FROM " + table, null);
        if(cursorCount!=null && cursorCount.getCount()!=0)
            cursorCount.moveToNext();
        return cursorCount;
    }

    public Cursor rawQuery(String command) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(command, null);
        return c;
    }

    public void deleteInventory(String inventoryName, String inventoryTableName, String invCatOneName, String invCatTwoName, String invCatThreeName, String invCatFourName, String invAttName) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("inventory_names", "table_eleven_id=?", new String[]{inventoryName});
        db.execSQL("DELETE FROM " + inventoryTableName);
        db.execSQL("DELETE FROM " + invCatOneName);
        db.execSQL("DELETE FROM " + invCatTwoName);
        db.execSQL("DELETE FROM " + invCatThreeName);
        db.execSQL("DELETE FROM " + invCatFourName);
        db.execSQL("DELETE FROM " + invAttName);
    }

    public boolean doesTableExist(String table) {
        SQLiteDatabase db = this.getReadableDatabase();
        if (table == null || db == null || !db.isOpen())
        {
            return false;
        }
        Cursor cursor = db.rawQuery("SELECT COUNT(*) FROM sqlite_master WHERE type = ? AND name = ?", new String[] {"table", table});
        if (!cursor.moveToFirst())
        {
            cursor.close();
            return false;
        }
        int count = cursor.getInt(0);
        cursor.close();
        return count > 0;
    }

    public int isTableEmpty(int selectedInventory) {
        SQLiteDatabase db = this.getWritableDatabase();
        String count = "";
        if (selectedInventory == 0) {
            count = "SELECT count(*) FROM " + TABLE_ONE_NAME;
        } else if (selectedInventory == 1) {
            count = "SELECT count(*) FROM " + TABLE_TWO_NAME;
        } else if (selectedInventory == 2) {
            count = "SELECT count(*) FROM " + TABLE_THREE_NAME;
        } else if (selectedInventory == 3) {
            count = "SELECT count(*) FROM " + TABLE_FOUR_NAME;
        } else if (selectedInventory == 4) {
            count = "SELECT count(*) FROM " + TABLE_FIVE_NAME;
        } else if (selectedInventory == 5) {
            count = "SELECT count(*) FROM " + TABLE_SIX_NAME;
        } else if (selectedInventory == 6) {
            count = "SELECT count(*) FROM " + TABLE_SEVEN_NAME;
        } else if (selectedInventory == 7) {
            count = "SELECT count(*) FROM " + TABLE_EIGHT_NAME;
        } else if (selectedInventory == 8) {
            count = "SELECT count(*) FROM " + TABLE_NINE_NAME;
        } else if (selectedInventory == 9) {
            count = "SELECT count(*) FROM " + TABLE_TEN_NAME;
        } else
            count = "0";
        Cursor mcursor = db.rawQuery(count, null);
        mcursor.moveToFirst();
        int icount = mcursor.getInt(0);
        Log.d("DB_REQUESTED_INV_COUNT", "" + icount);
        return icount;
    }

    public Cursor getColumns(String table) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.query(table, null, null, null, null, null, null);
        return c;
    }

    
}
