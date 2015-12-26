package com.leetinsider.arrayexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare a new integer array
        int[] myArray = new int[5];

        //Populate the array and accessing the elements
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;
        //Another way to declare a new array and populate the elements in one line:
        //int[] myAArray = {10, 20, 30, 40, 50};

        //Log the output of our elements
        for(int i = 0; i < myArray.length; i++){
            Log.v("LogExample", String.valueOf(myArray[i]));
        }
        //Simplified for loop:
        //for(int i : myArray){}
            Log.v("SimplifiedLogExample", Arrays.toString(myArray));
    }
}
