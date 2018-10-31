package utilities;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private Context context;
    private String DATABASE_NAME="IOCL_Dealers";
    private String COLUMN_STATE_OFFICE = "state_office";
    private String COLUMN_SALES_OFFICE = "sales_office";
    private String COLUMN_SALES_AREA_NAME = "state_office";
    private String COLUMN_CUSTOMER_CODE = "state_office";
    private String COLUMN_CUSTOMER_NAME = "state_office";
    private String COLUMN_ADDRESS = "state_office";
    private String COLUMN_EMAIL = "state_office";
    private String COLUMN_CONTACT_NO = "state_office";
    private String COLUMN_SALES_OFFICE_CODE = "state_office";
    private String COLUMN_SALES_AREA_CODE = "state_office";
    private String COLUMN_SALES_ORGANIZATION_CODE = "state_office";
    private String COLUMN_DISTRICT_CODE = "state_office";
    private String COLUMN_CUSTOMER_GROUP = "state_office";
    private String COLUMN_PRICE_GROUP_DESCRIPTION = "state_office";
    private String COLUMN_HILL_DESCRIPTION = "state_office";
    private String COLUMN_STATION_TYPE = "state_office";
    private String COLUMN_TERMS_OF_PAYMENT = "state_office";
    private String COLUMN_CLASS_OF_MARKET = "state_office";
    private String COLUMN_LIQUID_FUEL = "state_office";
    private String COLUMN_GAS_FUEL = "state_office";
    private String COLUMN_POSTAL_CODE = "state_office";
    private String COLUMN_CUSTOMER_REGION = "state_office";
    private String COLUMN_LAND_TYPE = "state_office";
    private String COLUMN_AUTOMATION_TYPE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
//    private String COLUMN_STATE_OFFICE = "state_office";
    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
