package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "Lukas";
    private String[] mountainNames = {"Matterhorn","Mont Blanc","Denali"};
    private String[] mountainLocations = {"Alps","Alps","Alaska"};
    private int[] mountainHeights ={4478,4808,6190};
    // Create ArrayLists from the raw data above and use these lists when populating your ListView.
    private ArrayList<Mountain> lukasBerg=new ArrayList<>();

    //public static final String Extra_MESSAGE = "hi";
    //private EditText mMessageEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Lägger till berg 3st
        lukasBerg.add(new Mountain("Matterhorn", "Alps",4478));
        lukasBerg.add(new Mountain("Mont Blanc", "Alps", 4808));
        lukasBerg.add(new Mountain("Denali", "Alaska", 6190));

        //Log för att kolla så det funka
        Log.d("a18luktoBerg",lukasBerg.get(0).getName());

        ArrayAdapter<Mountain> adapter=new ArrayAdapter<Mountain>(this,R.layout.list_item_textview,R.id.my_item_textview, lukasBerg);

        ListView my_listView=(ListView) findViewById(R.id.my_listview);

        my_listView.setAdapter(adapter);




        //Gör så att Toasten visar rätt information
        my_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                Intent intent = new Intent(getApplicationContext(), detaljer.class);
                String mountainText = lukasBerg.get(position).info();
                intent.putExtra(EXTRA_MESSAGE, mountainText);
                startActivity(intent);

            }
        });

        // 1. Create a ListView as in previous assignment
        // 2. Create a new activity named "MountainDetailsActivity
        // 3. Create a new Layout file for the MountainDetailsActivity called
        //    "activity_mountaindetails". MountainDetailsActivity must have MainActivity as its
        //    ´parent activity.
        // 4. The layout file created in step 3 must have a LinearLayout
        // 5. The layout file created in step 3 must be able to display
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 6. When tapping on a list item: create an Intent that includes
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 7. Display the MountainDetailsActivity with the data from the Intent created in step
        //    6
        // 8. From the MountainDetailsActivity you should have an option to "go back" using an
        //    left arro button. This is done by letting the MainActivity be the parent activity to
        //    MountainDetailsActivity.
    }
}
