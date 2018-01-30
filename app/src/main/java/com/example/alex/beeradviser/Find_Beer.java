package com.example.alex.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class Find_Beer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    private Beer_Expert expert = new Beer_Expert();

    public void onClickFindBeer(View view) {

        //Get Reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);

        //Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);

        //Get the selected item in the Spinner
        String beerType = String.valueOf(color.getSelectedItem());

        //Disply the selected item
        brands.setText(beerType);


        //Get recommendations from Beer Expert class
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList){
            brandsFormatted.append(brand).append('\n');
        }

        //Display the beers
        brands.setText(brandsFormatted);

    }
}
