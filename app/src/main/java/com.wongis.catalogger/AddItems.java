package com.wongis.catalogger;

import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class AddItems extends AppCompatActivity {

    // Initialize DatabaseHelper in order to save everything
    DatabaseHelper db = new DatabaseHelper(this);

    // Initialize buttons and spinners and EditText's
    Button addAnotherButton;
    Button completeButton;
    EditText itemName;
    Spinner categoryOne;
    Spinner categoryTwo;
    Spinner categoryThree;
    Spinner categoryFour;
    EditText attributeOne;
    EditText attributeTwo;
    EditText attributeThree;
    EditText attributeFour;

    // Initialize itemInfo
    TextView itemInfo;

    // Initialize inventory name information
    String inventoryName;

    // Initialize the same string variables as in CreateInventory in order to access their information later
    String[] categoryOneNames;
    String[] categoryTwoNames;
    String[] categoryThreeNames;
    String[] categoryFourNames;
    String[] attributeNames;

    // Initialize strings for the selected categories
    String categoryOneSelected;
    String categoryTwoSelected;
    String categoryThreeSelected;
    String categoryFourSelected;

    // Initialize int to get the selectedInventory in # form
    int selectedInventory;

    // Initialize timer class to check the number of categories created
    private Handler handler = new Handler();
    private Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_items);

        // Get the selected inventory in int form
        Intent getIntent = getIntent();
        selectedInventory = getIntent.getIntExtra("SELECTED_INVENTORY", selectedInventory);

        // Set title bar text with specific inventory name
        Cursor cursor = db.getInventoryName();
        if (cursor.moveToPosition(selectedInventory)) {
            inventoryName = cursor.getString(0);
        }
        getSupportActionBar().setTitle("Add Item to " + inventoryName + " Inventory");

        // Caste buttons, spinners, EditText's
        addAnotherButton = (Button) findViewById(R.id.addAnotherButton);
        completeButton = (Button) findViewById(R.id.completeButton);
        itemName = (EditText) findViewById(R.id.itemName);
        categoryOne = (Spinner) findViewById(R.id.categoryOne);
        categoryTwo = (Spinner) findViewById(R.id.categoryTwo);
        categoryThree = (Spinner) findViewById(R.id.categoryThree);
        categoryFour = (Spinner) findViewById(R.id.categoryFour);
        attributeOne = (EditText) findViewById(R.id.attributeOne);
        attributeTwo = (EditText) findViewById(R.id.attributeTwo);
        attributeThree = (EditText) findViewById(R.id.attributeThree);
        attributeFour = (EditText) findViewById(R.id.attributeFour);

        // Cast itemInfo
        itemInfo = (TextView) findViewById(R.id.itemInfo);

        // Fill arrays in this activity with the correct names, depending to
        // which class sent the user here
        if (selectedInventory == 0) {
            categoryOneNames = categoryNameGetter("inv_one_cat_one_name", "inv_one_cat_one");
            categoryTwoNames = categoryNameGetter("inv_one_cat_two_name", "inv_one_cat_two");
            categoryThreeNames = categoryNameGetter("inv_one_cat_three_name", "inv_one_cat_three");
            categoryFourNames = categoryNameGetter("inv_one_cat_four_name", "inv_one_cat_four");
            attributeNames = attributeNameGetter("inv_one_att_name", "inv_att_one");
        } else if (selectedInventory == 1) {
            categoryOneNames = categoryNameGetter("inv_two_cat_one_name", "inv_two_cat_one");
            categoryTwoNames = categoryNameGetter("inv_two_cat_two_name", "inv_two_cat_two");
            categoryThreeNames = categoryNameGetter("inv_two_cat_three_name", "inv_two_cat_three");
            categoryFourNames = categoryNameGetter("inv_two_cat_four_name", "inv_two_cat_four");
            attributeNames = attributeNameGetter("inv_two_att_name", "inv_att_two");
        } else if (selectedInventory == 2) {
            categoryOneNames = categoryNameGetter("inv_three_cat_one_name", "inv_three_cat_one");
            categoryTwoNames = categoryNameGetter("inv_three_cat_two_name", "inv_three_cat_two");
            categoryThreeNames = categoryNameGetter("inv_three_cat_three_name", "inv_three_cat_three");
            categoryFourNames = categoryNameGetter("inv_three_cat_four_name", "inv_three_cat_four");
            attributeNames = attributeNameGetter("inv_three_att_name", "inv_att_three");
        } else if (selectedInventory == 3) {
            categoryOneNames = categoryNameGetter("inv_four_cat_one_name", "inv_four_cat_one");
            categoryTwoNames = categoryNameGetter("inv_four_cat_two_name", "inv_four_cat_two");
            categoryThreeNames = categoryNameGetter("inv_four_cat_three_name", "inv_four_cat_three");
            categoryFourNames = categoryNameGetter("inv_four_cat_four_name", "inv_four_cat_four");
            attributeNames = attributeNameGetter("inv_four_att_name", "inv_att_four");
        } else if (selectedInventory == 4) {
            categoryOneNames = categoryNameGetter("inv_five_cat_one_name", "inv_five_cat_one");
            categoryTwoNames = categoryNameGetter("inv_five_cat_two_name", "inv_five_cat_two");
            categoryThreeNames = categoryNameGetter("inv_five_cat_three_name", "inv_five_cat_three");
            categoryFourNames = categoryNameGetter("inv_five_cat_four_name", "inv_five_cat_four");
            attributeNames = attributeNameGetter("inv_five_att_name", "inv_att_five");
        } else if (selectedInventory == 5) {
            categoryOneNames = categoryNameGetter("inv_six_cat_one_name", "inv_six_cat_one");
            categoryTwoNames = categoryNameGetter("inv_six_cat_two_name", "inv_six_cat_two");
            categoryThreeNames = categoryNameGetter("inv_six_cat_three_name", "inv_six_cat_three");
            categoryFourNames = categoryNameGetter("inv_six_cat_four_name", "inv_six_cat_four");
            attributeNames = attributeNameGetter("inv_six_att_name", "inv_att_six");
        } else if (selectedInventory == 6) {
            categoryOneNames = categoryNameGetter("inv_seven_cat_one_name", "inv_seven_cat_one");
            categoryTwoNames = categoryNameGetter("inv_seven_cat_two_name", "inv_seven_cat_two");
            categoryThreeNames = categoryNameGetter("inv_seven_cat_three_name", "inv_seven_cat_three");
            categoryFourNames = categoryNameGetter("inv_seven_cat_four_name", "inv_seven_cat_four");
            attributeNames = attributeNameGetter("inv_seven_att_name", "inv_att_seven");
        } else if (selectedInventory == 7) {
            categoryOneNames = categoryNameGetter("inv_eight_cat_one_name", "inv_eight_cat_one");
            categoryTwoNames = categoryNameGetter("inv_eight_cat_two_name", "inv_eight_cat_two");
            categoryThreeNames = categoryNameGetter("inv_eight_cat_three_name", "inv_eight_cat_three");
            categoryFourNames = categoryNameGetter("inv_eight_cat_four_name", "inv_eight_cat_four");
            attributeNames = attributeNameGetter("inv_eight_att_name", "inv_att_eight");
        } else if (selectedInventory == 8) {
            categoryOneNames = categoryNameGetter("inv_nine_cat_one_name", "inv_nine_cat_one");
            categoryTwoNames = categoryNameGetter("inv_nine_cat_one_name", "inv_nine_cat_two");
            categoryThreeNames = categoryNameGetter("inv_nine_cat_one_name", "inv_nine_cat_three");
            categoryFourNames = categoryNameGetter("inv_nine_cat_one_name", "inv_nine_cat_four");
            attributeNames = attributeNameGetter("inv_nine_att_name", "inv_att_nine");
        } else if (selectedInventory == 9) {
            categoryOneNames = categoryNameGetter("inv_ten_cat_one_name", "inv_ten_cat_one");
            categoryTwoNames = categoryNameGetter("inv_ten_cat_two_name", "inv_ten_cat_two");
            categoryThreeNames = categoryNameGetter("inv_ten_cat_three_name", "inv_ten_cat_three");
            categoryFourNames = categoryNameGetter("inv_ten_cat_four_name", "inv_ten_cat_four");
            attributeNames = attributeNameGetter("inv_ten_att_name", "inv_att_ten");
        } else {
            Toast.makeText(AddItems.this, "ERROR: Cannot find selected inventory", Toast.LENGTH_LONG).show();
        }

        // Give dropdown spinners their correct category names to select if there even are categories
        if (categoryOneNames.length == 0) {
            categoryOne.setVisibility(View.INVISIBLE);
            categoryTwo.setVisibility(View.INVISIBLE);
            categoryThree.setVisibility(View.INVISIBLE);
            categoryFour.setVisibility(View.INVISIBLE);
        } else if (categoryTwoNames.length == 0) {
            categoryOne.setVisibility(View.VISIBLE);
            ArrayAdapter<String> categoryOneNamesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categoryOneNames);
            categoryOne.setAdapter(categoryOneNamesAdapter);
            categoryTwo.setVisibility(View.INVISIBLE);
            categoryThree.setVisibility(View.INVISIBLE);
            categoryFour.setVisibility(View.INVISIBLE);
        } else if (categoryThreeNames.length == 0) {
            categoryOne.setVisibility(View.VISIBLE);
            ArrayAdapter<String> categoryOneNamesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categoryOneNames);
            categoryOne.setAdapter(categoryOneNamesAdapter);
            categoryTwo.setVisibility(View.VISIBLE);
            ArrayAdapter<String> categoryTwoNamesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categoryTwoNames);
            categoryTwo.setAdapter(categoryTwoNamesAdapter);
            categoryThree.setVisibility(View.INVISIBLE);
            categoryFour.setVisibility(View.INVISIBLE);
        } else if (categoryFourNames.length == 0) {
            categoryOne.setVisibility(View.VISIBLE);
            ArrayAdapter<String> categoryOneNamesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categoryOneNames);
            categoryOne.setAdapter(categoryOneNamesAdapter);
            categoryTwo.setVisibility(View.VISIBLE);
            ArrayAdapter<String> categoryTwoNamesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categoryTwoNames);
            categoryTwo.setAdapter(categoryTwoNamesAdapter);
            categoryThree.setVisibility(View.VISIBLE);
            ArrayAdapter<String> categoryThreeNamesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categoryThreeNames);
            categoryThree.setAdapter(categoryThreeNamesAdapter);
            categoryFour.setVisibility(View.INVISIBLE);
        } else {
            categoryOne.setVisibility(View.VISIBLE);
            ArrayAdapter<String> categoryOneNamesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categoryOneNames);
            categoryOne.setAdapter(categoryOneNamesAdapter);
            categoryTwo.setVisibility(View.VISIBLE);
            ArrayAdapter<String> categoryTwoNamesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categoryTwoNames);
            categoryTwo.setAdapter(categoryTwoNamesAdapter);
            categoryThree.setVisibility(View.VISIBLE);
            ArrayAdapter<String> categoryThreeNamesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categoryThreeNames);
            categoryThree.setAdapter(categoryThreeNamesAdapter);
            categoryFour.setVisibility(View.VISIBLE);
            ArrayAdapter<String> categoryFourNamesAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, categoryFourNames);
            categoryFour.setAdapter(categoryFourNamesAdapter);
        }

        // Only make attributeNames EditText's visible if there are enough attributes created
        // to need them, and set the hint text in the EditText to the corresponding created attribute name
        if (attributeNames.length == 0) {
            attributeOne.setVisibility(View.INVISIBLE);
            attributeTwo.setVisibility(View.INVISIBLE);
            attributeThree.setVisibility(View.INVISIBLE);
            attributeFour.setVisibility(View.INVISIBLE);
        } else if (attributeNames.length == 1) {
            attributeOne.setHint(" " + attributeNames[0]);
            attributeOne.setVisibility(View.VISIBLE);
            attributeTwo.setVisibility(View.INVISIBLE);
            attributeThree.setVisibility(View.INVISIBLE);
            attributeFour.setVisibility(View.INVISIBLE);
        } else if (attributeNames.length == 2) {
            attributeOne.setHint(" " + attributeNames[0]);
            attributeOne.setVisibility(View.VISIBLE);
            attributeTwo.setHint(" " + attributeNames[1]);
            attributeTwo.setVisibility(View.VISIBLE);
            attributeThree.setVisibility(View.INVISIBLE);
            attributeFour.setVisibility(View.INVISIBLE);
        } else if (attributeNames.length == 3) {
            attributeOne.setHint(" " + attributeNames[0]);
            attributeOne.setVisibility(View.VISIBLE);
            attributeTwo.setHint(" " + attributeNames[1]);
            attributeTwo.setVisibility(View.VISIBLE);
            attributeThree.setHint(" " + attributeNames[2]);
            attributeThree.setVisibility(View.VISIBLE);
            attributeFour.setVisibility(View.INVISIBLE);
        } else {
            attributeOne.setHint(" " + attributeNames[0]);
            attributeOne.setVisibility(View.VISIBLE);
            attributeTwo.setHint(" " + attributeNames[1]);
            attributeTwo.setVisibility(View.VISIBLE);
            attributeThree.setHint(" " + attributeNames[2]);
            attributeThree.setVisibility(View.VISIBLE);
            attributeFour.setHint(" " + attributeNames[3]);
            attributeFour.setVisibility(View.VISIBLE);
        }

        // ****** Log the info being received ******
        for (int i = 0; i < categoryOneNames.length; i++) {
            Log.d("DB_RECEIVEINFO", "Category One Names: " + categoryOneNames[i]);
        }
        for (int i = 0; i < categoryTwoNames.length; i++) {
            Log.d("DB_RECEIVEINFO", "Category Two Names: " + categoryTwoNames[i]);
        }
        for (int i = 0; i < categoryThreeNames.length; i++) {
            Log.d("DB_RECEIVEINFO", "Category Three Names: " + categoryThreeNames[i]);
        }
        for (int i = 0; i < categoryFourNames.length; i++) {
            Log.d("DB_RECEIVEINFO", "Category Four Names: " + categoryFourNames[i]);
        }
        for (int i = 0; i < attributeNames.length; i++) {
            Log.d("DB_RECEIVEINFO", "Attribute Names: " + attributeNames[i]);
        }

        // Save and Add Another Item Button
        addAnotherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAgain = new Intent(AddItems.this, AddItems.class);
                //
                // ADD ITEM INFO TO INVENTORY
                if (selectedInventory == 0) {
                    db.addTableOneItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 1) {
                    db.addTableTwoItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 2) {
                    db.addTableThreeItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 3) {
                    db.addTableFourItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 4) {
                    db.addTableFiveItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 5) {
                    db.addTableSixItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 6) {
                    db.addTableSevenItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 7) {
                    db.addTableEightItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 8) {
                    db.addTableNineItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 9) {
                    db.addTableTenItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                }
                //
                //
                intentAgain.putExtra("SELECTED_INVENTORY", selectedInventory);
                startActivity(intentAgain);
            }
        });

        // Save and View Inventory (Complete) Button
        completeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddItems.this, InventoryViewer.class);
                //
                // ADD ITEM INFO TO INVENTORY
                if (selectedInventory == 0) {
                    db.addTableOneItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 1) {
                    db.addTableTwoItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 2) {
                    db.addTableThreeItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 3) {
                    db.addTableFourItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 4) {
                    db.addTableFiveItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 5) {
                    db.addTableSixItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 6) {
                    db.addTableSevenItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 7) {
                    db.addTableEightItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 8) {
                    db.addTableNineItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                } else if (selectedInventory == 9) {
                    db.addTableTenItem(itemName.getText() + "", categoryOneSelected, categoryTwoSelected, categoryThreeSelected, categoryFourSelected, attributeOne.getText() + "", attributeTwo.getText() + "", attributeThree.getText() + "", attributeFour.getText() + "");
                }
                //
                //
                intent.putExtra("SELECTED_INVENTORY", selectedInventory);
                startActivity(intent);
            }
        });

        // Timer to run updateItemInfo() continuously
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        updateItemInfo();
                    }
                });
            }
        }, 0, 50);
    }

    // Class to constantly update the information presented in the itemInfo TextView
    public void updateItemInfo() {
        // Set the categorySelected variables to the corresponding category selections
        categoryOneSelected = "" + categoryOne.getSelectedItem();
        categoryTwoSelected = "" + categoryTwo.getSelectedItem();
        categoryThreeSelected = "" + categoryThree.getSelectedItem();
        categoryFourSelected = "" + categoryFour.getSelectedItem();

        // If any of the categories = null, set that text to " ")
        if (categoryOneSelected == null) categoryOneSelected = " ";

        // Set Text
        itemInfo.setText(itemName.getText() + "\r\n" + categoryOneSelected + "\r\n" + categoryTwoSelected + "\r\n" + categoryThreeSelected + "\r\n" + categoryFourSelected + "\r\n" + attributeOne.getText() + "\r\n" + attributeTwo.getText() + "\r\n" + attributeThree.getText() + "\r\n" + attributeFour.getText());
    }

    public String[] attributeNameGetter(String table, String column) {
        Cursor cursor = db.getInfo(table, column);
        ArrayList<String> temp = new ArrayList<>();
        cursor.moveToFirst();
        temp.add(cursor.getString(0));
        while (cursor.moveToNext()) {
            temp.add(cursor.getString(0));
        }
        String[] array = temp.toArray(new String[temp.size()]);
        return array;
    }

    public String[] categoryNameGetter(String table, String column) {
        Cursor cursor = db.getInfo(table, column);
        ArrayList<String> temp = new ArrayList<>();
        cursor.moveToFirst();
        temp.add(cursor.getString(0));
        while (cursor.moveToNext()) {
            temp.add(cursor.getString(0));
        }
        String[] array = temp.toArray(new String[temp.size()]);
        return array;
    }
}
