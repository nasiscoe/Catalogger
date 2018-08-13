package com.wongis.catalogger;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class CreateInventory extends AppCompatActivity {

    /*

    deleting is completely broken
    doesn't even delete the correct
    one from the listview itself
    sometimes

     */

    // Initialize DatabaseHelper in order to save the new inventory name
    DatabaseHelper db = new DatabaseHelper(this);

    // Initialize button and EditText's
    Button continueButton;
    EditText inventoryName;
    EditText categories;
    EditText categoryNames1;
    EditText categoryNames2;
    EditText categoryNames3;
    EditText categoryNames4;
    EditText attributes;

    // Initialize arrays to send categories, category names, and attributes to AddItems.java
    String[] categoryNames;
    String[] categoryOneNames;
    String[] categoryTwoNames;
    String[] categoryThreeNames;
    String[] categoryFourNames;
    String[] attributeNames;

    // Initialize int to get the selectedInventory # from InventoryList.java and then send
    // that same int value to AddItems.java
    int selectedInventory;

    // Initialize timer class to check the number of categories created
    private Handler handler = new Handler();
    private Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_inventory);
        getSupportActionBar().setTitle("Create New Inventory");

        // Caste button and EditText's
        continueButton = (Button) findViewById(R.id.continueButton);
        inventoryName = (EditText) findViewById(R.id.inventoryName);
        categories = (EditText) findViewById(R.id.categories);
        categoryNames1 = (EditText) findViewById(R.id.categoryNames1);
        categoryNames2 = (EditText) findViewById(R.id.categoryNames2);
        categoryNames3 = (EditText) findViewById(R.id.categoryNames3);
        categoryNames4 = (EditText) findViewById(R.id.categoryNames4);
        attributes = (EditText) findViewById(R.id.attributes);

        // Get the selected inventory in int form
        Intent getIntent = getIntent();
        selectedInventory = getIntent.getIntExtra("SELECTED_INVENTORY", selectedInventory);
        Log.d("DB_CREATED_INV_NUM", selectedInventory + "");

        // Listen for a press on the "Continue" button
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Initialize the intent
                Intent intent = new Intent(CreateInventory.this, AddItems.class);

                // Get attributes from its EditText and put them into an array
                attributeNames = attributes.getText().toString().split(", ");

                // Make sure there are max 4 categories and 4 attributes before sending them to AddItems.java
                if (categoryNames.length > 4 || attributeNames.length > 4) {
                    Toast.makeText(CreateInventory.this, "Maximum 4 Categories and 4 Attributes", Toast.LENGTH_LONG).show();
                } else {

                    // Add all the categories to the corresponding tables
                    if (selectedInventory == 0) {
                        for (int i = 0; i < categoryOneNames.length; i++) {
                            db.addInvOneCatOne("" + categoryOneNames[i]);
                            Log.d("DB_SENTCOUNTINFO", "Category One Count: " + categoryOneNames.length);
                            Log.d("DB_SENTINFO", "Category One Name: " + categoryOneNames[i]);
                        }
                        for (int i = 0; i < categoryTwoNames.length; i++) {
                            db.addInvOneCatTwo("" + categoryTwoNames[i]);
                            Log.d("DB_SENTINFO", "Category Two Name: " + categoryTwoNames[i]);
                        }
                        for (int i = 0; i < categoryThreeNames.length; i++) {
                            db.addInvOneCatThree("" + categoryThreeNames[i]);
                            Log.d("DB_SENTINFO", "Category Three Name: " + categoryThreeNames[i]);
                        }
                        for (int i = 0; i < categoryFourNames.length; i++) {
                            db.addInvOneCatFour("" + categoryFourNames[i]);
                            Log.d("DB_SENTINFO", "Category Four Name: " + categoryFourNames[i]);
                        }
                    } else if (selectedInventory == 1) {
                        for (int i = 0; i < categoryOneNames.length; i++) {
                            db.addInvTwoCatOne("" + categoryOneNames[i]);
                            Log.d("DB_SENTINFO", "Category One Name: " + categoryOneNames[i]);
                        }
                        for (int i = 0; i < categoryTwoNames.length; i++) {
                            db.addInvTwoCatTwo("" + categoryTwoNames[i]);
                            Log.d("DB_SENTINFO", "Category Two Name: " + categoryTwoNames[i]);
                        }
                        for (int i = 0; i < categoryThreeNames.length; i++) {
                            db.addInvTwoCatThree("" + categoryThreeNames[i]);
                            Log.d("DB_SENTINFO", "Category Three Name: " + categoryThreeNames[i]);
                        }
                        for (int i = 0; i < categoryFourNames.length; i++) {
                            db.addInvTwoCatFour("" + categoryFourNames[i]);
                            Log.d("DB_SENTINFO", "Category Four Name: " + categoryFourNames[i]);
                        }
                    } else if (selectedInventory == 2) {
                        for (int i = 0; i < categoryOneNames.length; i++) {
                            db.addInvThreeCatOne("" + categoryOneNames[i]);
                            Log.d("DB_SENTINFO", "Category One Name: " + categoryOneNames[i]);
                        }
                        for (int i = 0; i < categoryTwoNames.length; i++) {
                            db.addInvThreeCatTwo("" + categoryTwoNames[i]);
                            Log.d("DB_SENTINFO", "Category Two Name: " + categoryTwoNames[i]);
                        }
                        for (int i = 0; i < categoryThreeNames.length; i++) {
                            db.addInvThreeCatThree("" + categoryThreeNames[i]);
                            Log.d("DB_SENTINFO", "Category Three Name: " + categoryThreeNames[i]);
                        }
                        for (int i = 0; i < categoryFourNames.length; i++) {
                            db.addInvThreeCatFour("" + categoryFourNames[i]);
                            Log.d("DB_SENTINFO", "Category Four Name: " + categoryFourNames[i]);
                        }
                    } else if (selectedInventory == 3) {
                        for (int i = 0; i < categoryOneNames.length; i++) {
                            db.addInvFourCatOne("" + categoryOneNames[i]);
                            Log.d("DB_SENTINFO", "Category One Name: " + categoryOneNames[i]);
                        }
                        for (int i = 0; i < categoryTwoNames.length; i++) {
                            db.addInvFourCatTwo("" + categoryTwoNames[i]);
                            Log.d("DB_SENTINFO", "Category Two Name: " + categoryTwoNames[i]);
                        }
                        for (int i = 0; i < categoryThreeNames.length; i++) {
                            db.addInvFourCatThree("" + categoryThreeNames[i]);
                            Log.d("DB_SENTINFO", "Category Three Name: " + categoryThreeNames[i]);
                        }
                        for (int i = 0; i < categoryFourNames.length; i++) {
                            db.addInvFourCatFour("" + categoryFourNames[i]);
                            Log.d("DB_SENTINFO", "Category Four Name: " + categoryFourNames[i]);
                        }
                    } else if (selectedInventory == 4) {
                        for (int i = 0; i < categoryOneNames.length; i++) {
                            db.addInvFiveCatOne("" + categoryOneNames[i]);
                            Log.d("DB_SENTINFO", "Category One Name: " + categoryOneNames[i]);
                        }
                        for (int i = 0; i < categoryTwoNames.length; i++) {
                            db.addInvFiveCatTwo("" + categoryTwoNames[i]);
                            Log.d("DB_SENTINFO", "Category Two Name: " + categoryTwoNames[i]);
                        }
                        for (int i = 0; i < categoryThreeNames.length; i++) {
                            db.addInvFiveCatThree("" + categoryThreeNames[i]);
                            Log.d("DB_SENTINFO", "Category Three Name: " + categoryThreeNames[i]);
                        }
                        for (int i = 0; i < categoryFourNames.length; i++) {
                            db.addInvFiveCatFour("" + categoryFourNames[i]);
                            Log.d("DB_SENTINFO", "Category Four Name: " + categoryFourNames[i]);
                        }
                    } else if (selectedInventory == 5) {
                        for (int i = 0; i < categoryOneNames.length; i++) {
                            db.addInvSixCatOne("" + categoryOneNames[i]);
                            Log.d("DB_SENTINFO", "Category One Name: " + categoryOneNames[i]);
                        }
                        for (int i = 0; i < categoryTwoNames.length; i++) {
                            db.addInvSixCatTwo("" + categoryTwoNames[i]);
                            Log.d("DB_SENTINFO", "Category Two Name: " + categoryTwoNames[i]);
                        }
                        for (int i = 0; i < categoryThreeNames.length; i++) {
                            db.addInvSixCatThree("" + categoryThreeNames[i]);
                            Log.d("DB_SENTINFO", "Category Three Name: " + categoryThreeNames[i]);
                        }
                        for (int i = 0; i < categoryFourNames.length; i++) {
                            db.addInvSixCatFour("" + categoryFourNames[i]);
                            Log.d("DB_SENTINFO", "Category Four Name: " + categoryFourNames[i]);
                        }
                    } else if (selectedInventory == 6) {
                        for (int i = 0; i < categoryOneNames.length; i++) {
                            db.addInvSevenCatOne("" + categoryOneNames[i]);
                            Log.d("DB_SENTINFO", "Category One Name: " + categoryOneNames[i]);
                        }
                        for (int i = 0; i < categoryTwoNames.length; i++) {
                            db.addInvSevenCatTwo("" + categoryTwoNames[i]);
                            Log.d("DB_SENTINFO", "Category Two Name: " + categoryTwoNames[i]);
                        }
                        for (int i = 0; i < categoryThreeNames.length; i++) {
                            db.addInvSevenCatThree("" + categoryThreeNames[i]);
                            Log.d("DB_SENTINFO", "Category Three Name: " + categoryThreeNames[i]);
                        }
                        for (int i = 0; i < categoryFourNames.length; i++) {
                            db.addInvSevenCatFour("" + categoryFourNames[i]);
                            Log.d("DB_SENTINFO", "Category Four Name: " + categoryFourNames[i]);
                        }
                    } else if (selectedInventory == 7) {
                        for (int i = 0; i < categoryOneNames.length; i++) {
                            db.addInvEightCatOne("" + categoryOneNames[i]);
                            Log.d("DB_SENTINFO", "Category One Name: " + categoryOneNames[i]);
                        }
                        for (int i = 0; i < categoryTwoNames.length; i++) {
                            db.addInvEightCatTwo("" + categoryTwoNames[i]);
                            Log.d("DB_SENTINFO", "Category Two Name: " + categoryTwoNames[i]);
                        }
                        for (int i = 0; i < categoryThreeNames.length; i++) {
                            db.addInvEightCatThree("" + categoryThreeNames[i]);
                            Log.d("DB_SENTINFO", "Category Three Name: " + categoryThreeNames[i]);
                        }
                        for (int i = 0; i < categoryFourNames.length; i++) {
                            db.addInvEightCatFour("" + categoryFourNames[i]);
                            Log.d("DB_SENTINFO", "Category Four Name: " + categoryFourNames[i]);
                        }
                    } else if (selectedInventory == 8) {
                        for (int i = 0; i < categoryOneNames.length; i++) {
                            db.addInvNineCatOne("" + categoryOneNames[i]);
                            Log.d("DB_SENTINFO", "Category One Name: " + categoryOneNames[i]);
                        }
                        for (int i = 0; i < categoryTwoNames.length; i++) {
                            db.addInvNineCatTwo("" + categoryTwoNames[i]);
                            Log.d("DB_SENTINFO", "Category Two Name: " + categoryTwoNames[i]);
                        }
                        for (int i = 0; i < categoryThreeNames.length; i++) {
                            db.addInvNineCatThree("" + categoryThreeNames[i]);
                            Log.d("DB_SENTINFO", "Category Three Name: " + categoryThreeNames[i]);
                        }
                        for (int i = 0; i < categoryFourNames.length; i++) {
                            db.addInvNineCatFour("" + categoryFourNames[i]);
                            Log.d("DB_SENTINFO", "Category Four Name: " + categoryFourNames[i]);
                        }
                    } else if (selectedInventory == 9) {
                        for (int i = 0; i < categoryOneNames.length; i++) {
                            db.addInvTenCatOne("" + categoryOneNames[i]);
                            Log.d("DB_SENTINFO", "Category One Name: " + categoryOneNames[i]);
                        }
                        for (int i = 0; i < categoryTwoNames.length; i++) {
                            db.addInvTenCatTwo("" + categoryTwoNames[i]);
                            Log.d("DB_SENTINFO", "Category Two Name: " + categoryTwoNames[i]);
                        }
                        for (int i = 0; i < categoryThreeNames.length; i++) {
                            db.addInvTenCatThree("" + categoryThreeNames[i]);
                            Log.d("DB_SENTINFO", "Category Three Name: " + categoryThreeNames[i]);
                        }
                        for (int i = 0; i < categoryFourNames.length; i++) {
                            db.addInvTenCatFour("" + categoryFourNames[i]);
                            Log.d("DB_SENTINFO", "Category Four Name: " + categoryFourNames[i]);
                        }
                    }

                    // Add all the attribute names to the corresponding tables
                    if (selectedInventory == 0) {
                        for (int i = 0; i < attributeNames.length; i++) {
                            db.addAttribute("inv_one_att_name", "inv_att_one", "" + attributeNames[i]);
                            Log.d("DB_SENTINFO", "Attribute Name: " + attributeNames[i]);
                        }
                    } else if (selectedInventory == 1) {
                        for (int i = 0; i < attributeNames.length; i++) {
                            db.addAttribute("inv_two_att_name", "inv_att_two", "" + attributeNames[i]);
                            Log.d("DB_SENTINFO", "Attribute Name: " + attributeNames[i]);
                        }
                    } else if (selectedInventory == 2) {
                        for (int i = 0; i < attributeNames.length; i++) {
                            db.addAttribute("inv_three_att_name", "inv_att_three", "" + attributeNames[i]);
                            Log.d("DB_SENTINFO", "Attribute Name: " + attributeNames[i]);
                        }
                    } else if (selectedInventory == 3) {
                        for (int i = 0; i < attributeNames.length; i++) {
                            db.addAttribute("inv_four_att_name", "inv_att_four", "" + attributeNames[i]);
                            Log.d("DB_SENTINFO", "Attribute Name: " + attributeNames[i]);
                        }
                    } else if (selectedInventory == 4) {
                        for (int i = 0; i < attributeNames.length; i++) {
                            db.addAttribute("inv_five_att_name", "inv_att_five", "" + attributeNames[i]);
                            Log.d("DB_SENTINFO", "Attribute Name: " + attributeNames[i]);
                        }
                    } else if (selectedInventory == 5) {
                        for (int i = 0; i < attributeNames.length; i++) {
                            db.addAttribute("inv_six_att_name", "inv_att_six", "" + attributeNames[i]);
                            Log.d("DB_SENTINFO", "Attribute Name: " + attributeNames[i]);
                        }
                    } else if (selectedInventory == 6) {
                        for (int i = 0; i < attributeNames.length; i++) {
                            db.addAttribute("inv_seven_att_name", "inv_att_seven", "" + attributeNames[i]);
                            Log.d("DB_SENTINFO", "Attribute Name: " + attributeNames[i]);
                        }
                    } else if (selectedInventory == 7) {
                        for (int i = 0; i < attributeNames.length; i++) {
                            db.addAttribute("inv_eight_att_name", "inv_att_eight", "" + attributeNames[i]);
                            Log.d("DB_SENTINFO", "Attribute Name: " + attributeNames[i]);
                        }
                    } else if (selectedInventory == 8) {
                        for (int i = 0; i < attributeNames.length; i++) {
                            db.addAttribute("inv_nine_att_name", "inv_att_nine", "" + attributeNames[i]);
                            Log.d("DB_SENTINFO", "Attribute Name: " + attributeNames[i]);
                        }
                    } else if (selectedInventory == 9) {
                        for (int i = 0; i < attributeNames.length; i++) {
                            db.addAttribute("inv_ten_att_name", "inv_att_ten", "" + attributeNames[i]);
                            Log.d("DB_SENTINFO", "Attribute Name: " + attributeNames[i]);
                        }
                    }

                    /* Use this if you want to test that the cat/att tables are set up correctly
                    if (db.doesTableExist("inv_cat_name") == true) Log.d("DB_RECORDEDINFO", "Category Table Exists");
                    else Log.d("DB_RECORDEDINFO", "Category Table DOES NOT Exist");
                    if (db.doesTableExist("inv_att_name") == true) Log.d("DB_RECORDEDINFO", "Attribute Table Exists");
                    else Log.d("DB_RECORDEDINFO", "Attribute Table DOES NOT Exist");
                    String[] columnNames = db.getColumns("inv_cat_name").getColumnNames();
                    for (int i = 0; i < columnNames.length; i++) Log.d("DB_RECORDEDINFO", "Category Column Name: " + columnNames[i]);
                    columnNames = db.getColumns("inv_att_name").getColumnNames();
                    for (int i = 0; i < columnNames.length; i++) Log.d("DB_RECORDEDINFO", "Attribute Column Name: " + columnNames[i]);
                    */

                    // Save inventoryNames to table eleven
                    db.addInventory(inventoryName.getText().toString());

                    // Close connection to the database and start the next activity
                    db.close();
                    intent.putExtra("SELECTED_INVENTORY", selectedInventory);
                    startActivity(intent);
                }

            }
        });
        // Timer to run checkCategories() continuously
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        updateCategories();
                    }
                });
            }
        }, 0, 50);
    }

    // Class to check how many categories have been entered and hide EditText's for categories that aren't created
    public void updateCategories() {
        // Constantly set the category variables to whatever is entered into the corresponding EditText
        categoryNames = categories.getText().toString().split(", ");
        categoryOneNames = categoryNames1.getText().toString().split(", ");
        categoryTwoNames = categoryNames2.getText().toString().split(", ");
        categoryThreeNames = categoryNames3.getText().toString().split(", ");
        categoryFourNames = categoryNames4.getText().toString().split(", ");

        // Only make categoryNames EditText's visible if there are enough categories created
        // to need them, and set the hint text in the EditText to the corresponding created category name
        if (categoryNames == null) {
            categoryNames1.setVisibility(View.INVISIBLE);
            categoryNames2.setVisibility(View.INVISIBLE);
            categoryNames3.setVisibility(View.INVISIBLE);
            categoryNames4.setVisibility(View.INVISIBLE);
        } else if (categoryNames.length == 1) {
            categoryNames1.setHint(" " + categoryNames[0] + " Names (Ex: Classical, Hip Hop)");
            categoryNames1.setVisibility(View.VISIBLE);
            categoryNames2.setVisibility(View.INVISIBLE);
            categoryNames3.setVisibility(View.INVISIBLE);
            categoryNames4.setVisibility(View.INVISIBLE);
        } else if (categoryNames.length == 2) {
            categoryNames1.setHint(" " + categoryNames[0] + " Names (Ex: Classical, Hip Hop)");
            categoryNames1.setVisibility(View.VISIBLE);
            categoryNames2.setHint(" " + categoryNames[1] + " Names (Ex: Fruit, Vegetable)");
            categoryNames2.setVisibility(View.VISIBLE);
            categoryNames3.setVisibility(View.INVISIBLE);
            categoryNames4.setVisibility(View.INVISIBLE);
        } else if (categoryNames.length == 3) {
            categoryNames1.setHint(" " + categoryNames[0] + " Names (Ex: Classical, Hip Hop)");
            categoryNames1.setVisibility(View.VISIBLE);
            categoryNames2.setHint(" " + categoryNames[1] + " Names (Ex: Fruit, Vegetable)");
            categoryNames2.setVisibility(View.VISIBLE);
            categoryNames3.setHint(" " + categoryNames[2] + " Names (Ex: 80s, 90s)");
            categoryNames3.setVisibility(View.VISIBLE);
            categoryNames4.setVisibility(View.INVISIBLE);
        } else {
            categoryNames1.setHint(" " + categoryNames[0] + " Names (Ex: Classical, Hip Hop)");
            categoryNames1.setVisibility(View.VISIBLE);
            categoryNames2.setHint(" " + categoryNames[1] + " Names (Ex: Fruit, Vegetable)");
            categoryNames2.setVisibility(View.VISIBLE);
            categoryNames3.setHint(" " + categoryNames[2] + " Names (Ex: 80s, 90s, 00s, 10s)");
            categoryNames3.setVisibility(View.VISIBLE);
            categoryNames4.setHint(" " + categoryNames[3] + " Names (Ex: Comedy, Horror)");
            categoryNames4.setVisibility(View.VISIBLE);
        }
    }
}
