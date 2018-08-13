package com.wongis.catalogger;

import android.content.Intent;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class InventoryList extends AppCompatActivity {

    // Initialize DatabaseHelper to load list of inventory names
    DatabaseHelper db = new DatabaseHelper(this);

    // Initialize ListView to view the inventories
    ListView inventoryViewer;

    // Initialize inventoryNames to store the names of the inventories from table eleven
    ArrayList<String> inventoryNames = new ArrayList<>();

    // Initialize an int that will tell which inventory is selected
    int selectedInventory;

    // Initialize booleans to determine whether or not inventories should be deleted or opened
    boolean delete = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView toolbarTitle = (TextView) toolbar.findViewById(R.id.toolbarTitle);
        setSupportActionBar(toolbar);

        // Caste fonts
        Typeface thicc = Typeface.createFromAsset(getAssets(),  "fonts/Tofino-Black.otf");
        Typeface reg = Typeface.createFromAsset(getAssets(),  "fonts/Tofino-Regular.otf");
        Typeface regItalics = Typeface.createFromAsset(getAssets(),  "fonts/Tofino-RegularItalic.otf");
        Typeface light = Typeface.createFromAsset(getAssets(),  "fonts/Tofino-Light.otf");
        Typeface lightItalics = Typeface.createFromAsset(getAssets(),  "fonts/Tofino-LightItalic.otf");

        // Caste inventoryViewer
        inventoryViewer = (ListView) findViewById(R.id.inventoryViewer);

        // Implement fonts
        toolbarTitle.setTypeface(thicc);

        updateViewer();

        // Listener for '+' button
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Go through each table to see if it's empty, and the first one that is empty gets an inventory created in it
                boolean check = true;
                for (int i = 0; i < 10; i++) {
                    if ((db.isTableEmpty(i) == 0) && (check == true)) {
                        selectedInventory = i;
                        check = false;
                    }
                }
                if (selectedInventory < 10) {
                    Intent intent = new Intent(InventoryList.this, CreateInventory.class);
                    Log.d("DB_REQUESTED_INVENTORY", selectedInventory + "");
                    intent.putExtra("SELECTED_INVENTORY", selectedInventory);
                    // Close the database connection
                    db.close();
                    startActivity(intent);
                } else Toast.makeText(InventoryList.this, "You cannot create any more inventories (Maximum 10)", Toast.LENGTH_LONG).show();
            }
        });

        // Listen for inventoryViewer selection
        inventoryViewer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Caste the intent and set item equal to the selected String
                Intent intent = new Intent(InventoryList.this, InventoryViewer.class);
                // Compares inventoryNames array to cursor results. If matched that's the selected inventory
                Cursor c = db.getInventoryName();
                c.moveToFirst();
                do {
                    if (c.getString(0) == inventoryViewer.getItemAtPosition(position)) {
                        selectedInventory = c.getPosition();
                        Log.d("DB_REQUESTED_INVENTORY", "" + selectedInventory);
                    }
                } while (c.moveToNext());
                if (delete == false) {
                    intent.putExtra("SELECTED_INVENTORY", selectedInventory);
                    startActivity(intent);
                } else if (delete == true) {
                    if (selectedInventory == 0) {
                        db.deleteInventory("" + selectedInventory, "inventory_one", "inv_one_cat_one_name", "inv_one_cat_two_name", "inv_one_cat_three_name", "inv_one_cat_four_name", "inv_one_att_name");
                        updateViewer();
                        delete = false;
                    } else if (selectedInventory == 1) {
                        db.deleteInventory("" + selectedInventory, "inventory_two", "inv_two_cat_one_name", "inv_two_cat_two_name", "inv_two_cat_three_name", "inv_two_cat_four_name", "inv_two_att_name");
                        updateViewer();
                        delete = false;
                    } else if (selectedInventory == 2) {
                        db.deleteInventory("" + selectedInventory, "inventory_three", "inv_three_cat_one_name", "inv_three_cat_two_name", "inv_three_cat_three_name", "inv_three_cat_four_name", "inv_three_att_name");
                        updateViewer();
                        delete = false;
                    } else if (selectedInventory == 3) {
                        db.deleteInventory("" + selectedInventory, "inventory_four", "inv_four_cat_one_name", "inv_four_cat_two_name", "inv_four_cat_three_name", "inv_four_cat_four_name", "inv_four_att_name");
                        updateViewer();
                        delete = false;
                    } else if (selectedInventory == 4) {
                        db.deleteInventory("" + selectedInventory, "inventory_five", "inv_five_cat_one_name", "inv_five_cat_two_name", "inv_five_cat_three_name", "inv_five_cat_four_name", "inv_five_att_name");
                        updateViewer();
                        delete = false;
                    } else if (selectedInventory == 5) {
                        db.deleteInventory("" + selectedInventory, "inventory_six", "inv_six_cat_one_name", "inv_six_cat_two_name", "inv_six_cat_three_name", "inv_six_cat_four_name", "inv_six_att_name");
                        updateViewer();
                        delete = false;
                    } else if (selectedInventory == 6) {
                        db.deleteInventory("" + selectedInventory, "inventory_seven", "inv_seven_cat_one_name", "inv_seven_cat_two_name", "inv_seven_cat_three_name", "inv_seven_cat_four_name", "inv_seven_att_name");
                        updateViewer();
                        delete = false;
                    } else if (selectedInventory == 7) {
                        db.deleteInventory("" + selectedInventory, "inventory_eight", "inv_eight_cat_one_name", "inv_eight_cat_two_name", "inv_eight_cat_three_name", "inv_eight_cat_four_name", "inv_eight_att_name");
                        updateViewer();
                        delete = false;
                    } else if (selectedInventory == 8) {
                        db.deleteInventory("" + selectedInventory, "inventory_nine", "inv_nine_cat_one_name", "inv_nine_cat_two_name", "inv_nine_cat_three_name", "inv_nine_cat_four_name", "inv_nine_att_name");
                        updateViewer();
                        delete = false;
                    } else if (selectedInventory == 9) {
                        db.deleteInventory("" + selectedInventory, "inventory_ten", "inv_ten_cat_one_name", "inv_ten_cat_two_name", "inv_ten_cat_three_name", "inv_ten_cat_four_name", "inv_ten_att_name");
                        updateViewer();
                        delete = false;
                    }
                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inventory_list, menu);
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
            Toast.makeText(InventoryList.this, "Select an inventory to delete", Toast.LENGTH_LONG).show();
            delete = true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void updateViewer() {
        // Give inventoryNames its data and then put that data into the inventoryViewer
        inventoryViewer.setAdapter(null);
        inventoryNames.clear();
        Cursor c = db.getInventoryName();
        if (c.getCount() == 0) {
            // If table eleven is empty, let the user know how to create a new inventory
            Toast.makeText(InventoryList.this, "Press '+' to create an inventory", Toast.LENGTH_LONG).show();
        } else {
            c.moveToFirst();
            do {
                inventoryNames.add(c.getString(0));
            } while (c.moveToNext());
            ListAdapter listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, inventoryNames);
            inventoryViewer.setAdapter(listAdapter);

        }
    }
}
