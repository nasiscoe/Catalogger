package com.wongis.catalogger;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventoryViewer extends AppCompatActivity {

    // Initialize DatabaseHelper in order to view the selected inventory
    DatabaseHelper db = new DatabaseHelper(this);

    // Initialize an int to get the inventory that was selected, and initialize a
    // String in order to save the correct inventory name
    int selectedInventory;
    String inventoryName;

    // Initialize Cursors so they can be changed depending on selectedInventory
    Cursor c;
    Cursor cSearch;

    // Initialize ListView to view the items
    ListView itemViewer;
    // Initialize Buttons (Back and Search)
    Button backButton;
    Button searchButton;
    // Initialize EditText for search
    EditText searchEditText;

    // Initialize inventoryNames to store the names of the items
    ArrayList<String> itemNames = new ArrayList<>();
    ArrayList<String> itemInfo = new ArrayList<>();
    // This one saves the full string of an individual items info (cat1, cat2, etc)
    ArrayList<String> itemInfoDisplay = new ArrayList<>();
    // This List will contain two strings with the same row id so that they can be added together as item and subitem
    List<Map<String, String>> data = new ArrayList<Map<String, String>>();

    // Initialize a counter to know how many itemInfo things to add
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory_viewer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Get the selected inventory in int form
        Intent intent = getIntent();
        selectedInventory = intent.getIntExtra("SELECTED_INVENTORY", selectedInventory);

        // Set title bar text with specific inventory name
        Cursor cursor = db.getInventoryName();
        if (cursor.moveToPosition(selectedInventory)) {
            inventoryName = cursor.getString(0);
        }
        getSupportActionBar().setTitle(inventoryName);

        // Caste inventoryViewer & Buttons
        itemViewer = (ListView) findViewById(R.id.itemViewer);
        backButton = (Button) findViewById(R.id.backButton);
        searchButton = (Button) findViewById(R.id.searchButton);
        searchEditText = (EditText) findViewById(R.id.searchEditText);

        // Give itemNames its data and then put that data into the inventoryViewer
        if (selectedInventory == 0) {
            c = db.getInfo("inventory_one", "*");
        } else if (selectedInventory == 1) {
            c = db.getInfo("inventory_two", "*");
        } else if (selectedInventory == 2) {
            c = db.getInfo("inventory_three", "*");
        } else if (selectedInventory == 3) {
            c = db.getInfo("inventory_four", "*");
        } else if (selectedInventory == 4) {
            c = db.getInfo("inventory_five", "*");
        } else if (selectedInventory == 5) {
            c = db.getInfo("inventory_six", "*");
        } else if (selectedInventory == 6) {
            c = db.getInfo("inventory_seven", "*");
        } else if (selectedInventory == 7) {
            c = db.getInfo("inventory_eight", "*");
        } else if (selectedInventory == 8) {
            c = db.getInfo("inventory_nine", "*");
        } else if (selectedInventory == 9) {
            c = db.getInfo("inventory_ten", "*");
        }
        updateViewer(c, 0);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InventoryViewer.this, AddItems.class);
                intent.putExtra("SELECTED_INVENTORY", selectedInventory);
                intent.putExtra("Uniqid","From_Inventory_Viewer");
                startActivity(intent);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InventoryViewer.this, InventoryList.class);
                startActivity(intent);

            }
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String query = searchEditText.getText().toString();
                if (selectedInventory == 0) {
                    cSearch = db.searchOne(query);
                } else if (selectedInventory == 1) {
                    cSearch = db.searchTwo(query);
                } else if (selectedInventory == 2) {
                    cSearch = db.searchThree(query);
                } else if (selectedInventory == 3) {
                    cSearch = db.searchFour(query);
                } else if (selectedInventory == 4) {
                    cSearch = db.searchFive(query);
                } else if (selectedInventory == 5) {
                    cSearch = db.searchSix(query);
                } else if (selectedInventory == 6) {
                    cSearch = db.searchSeven(query);
                } else if (selectedInventory == 7) {
                    cSearch = db.searchEight(query);
                } else if (selectedInventory == 8) {
                    cSearch = db.searchNine(query);
                } else if (selectedInventory == 9) {
                    cSearch = db.searchTen(query);
                }
                updateViewer(cSearch, 1);
            }
        });
    }
    public void updateViewer(Cursor c, int from) {
        if ((c.getCount() == 0) && (from == 0)) {
            // If there are no items, let the user know how to add some
            Toast.makeText(InventoryViewer.this, "Press '+' to add items to this inventory", Toast.LENGTH_LONG).show();
        } else if ((c.getCount() == 0) && (from == 1)) {
            // If there are no matching items, let the user know how to add some
            Toast.makeText(InventoryViewer.this, "Search yielded no results", Toast.LENGTH_LONG).show();
        } else {
            itemNames.clear();
            itemInfo.clear();
            itemInfoDisplay.clear();
            itemViewer.setAdapter(null);
            data.clear();
            count = 0;
            c.moveToFirst();
            do {
                itemNames.add(c.getString(1));
                Log.d("DB_DISPLAYED_ITEM", "Item displayed: " + c.getString(1));
                for (int i = 0; i < 8; i++) {
                    itemInfo.add(c.getString(i+2));
                    itemInfoDisplay.add("temp" + i);
                }
                itemInfoDisplay.set(count, "" + itemInfo.get(0) + ", " + itemInfo.get(1) + ", " +  itemInfo.get(2) + ", " + itemInfo.get(3) + ", " + itemInfo.get(4) + ", " + itemInfo.get(5) + ", " + itemInfo.get(6) + ", " + itemInfo.get(7));
                Log.d("DB_DISPLAYED_ITEM", "Item INFO displayed: " + itemInfoDisplay.get(count));
                itemInfo.clear();
                count++;
            } while (c.moveToNext());
            for (int i = 0; i < itemNames.size(); i++) {
                Map<String, String> datum = new HashMap<String, String>(2);
                datum.put("item", itemNames.get(i));
                datum.put("subitem", itemInfoDisplay.get(i));
                data.add(datum);
            }
            SimpleAdapter listAdapter = new SimpleAdapter(this, data, android.R.layout.simple_list_item_2, new String[] {"item", "subitem"}, new int[] {android.R.id.text1, android.R.id.text2});
            listAdapter.notifyDataSetChanged();
            itemViewer.setAdapter(listAdapter);
        }
    }
}
