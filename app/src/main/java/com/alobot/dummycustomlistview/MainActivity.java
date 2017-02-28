package com.alobot.dummycustomlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String ITEM_NUMBER_PREFIX = "Item #: ";
    private static final String DESCRIPTION_PREFIX = "Description: ";
    private static final String PRICE_PREFIX = "$";
    private static final String QUANTITY_PREFIX = "Quantity: ";

    private ArrayList<ListObject> mArrayListObject;
    private ListObject mListObject;
    private ListAdapter mListAdapter;
    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArrayListObject = new ArrayList<>();

        mListObject = new ListObject("", ITEM_NUMBER_PREFIX + "00001", DESCRIPTION_PREFIX + "[Text]", PRICE_PREFIX + "000.00", QUANTITY_PREFIX + "1", "");
        mArrayListObject.add(mListObject);
        mListObject = new ListObject("", ITEM_NUMBER_PREFIX + "00002", DESCRIPTION_PREFIX + "[Text]", PRICE_PREFIX + "000.00", QUANTITY_PREFIX + "1", "");
        mArrayListObject.add(mListObject);
        mListObject = new ListObject("", ITEM_NUMBER_PREFIX + "00003", DESCRIPTION_PREFIX + "[Text]", PRICE_PREFIX + "000.00", QUANTITY_PREFIX + "1", "");
        mArrayListObject.add(mListObject);
        mListObject = new ListObject("", ITEM_NUMBER_PREFIX + "00004", DESCRIPTION_PREFIX + "[Text]", PRICE_PREFIX + "000.00", QUANTITY_PREFIX + "1", "");
        mArrayListObject.add(mListObject);
        mListObject = new ListObject("", ITEM_NUMBER_PREFIX + "00005", DESCRIPTION_PREFIX + "[Text]", PRICE_PREFIX + "000.00", QUANTITY_PREFIX + "1", "");
        mArrayListObject.add(mListObject);
        mListObject = new ListObject("", ITEM_NUMBER_PREFIX + "00006", DESCRIPTION_PREFIX + "[Text]", PRICE_PREFIX + "000.00", QUANTITY_PREFIX + "1", "");
        mArrayListObject.add(mListObject);
        mListObject = new ListObject("", ITEM_NUMBER_PREFIX + "00007", DESCRIPTION_PREFIX + "[Text]", PRICE_PREFIX + "000.00", QUANTITY_PREFIX + "1", "");
        mArrayListObject.add(mListObject);

        mListAdapter = new ListAdapter(this, mArrayListObject);
        mListView = (ListView) findViewById(R.id.listView);

        mListView.setAdapter(mListAdapter);
    }
}
