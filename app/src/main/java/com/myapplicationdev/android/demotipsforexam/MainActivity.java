package com.myapplicationdev.android.demotipsforexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String [] examArrayTips;
    ListView lvExamTips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvExamTips = findViewById(R.id.lvExamTips);
        examArrayTips = new String[5];
        examArrayTips[0] = "Don't just read the code, code it as much as possible during each practical session";
        examArrayTips[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        examArrayTips[2] = "Prepare your template source code for each topic";
        examArrayTips[3] = "Create a few empty Android projects to speed up your coding during the exam";
        examArrayTips[4] = "Ensure that your Android Studio is up and running before the exam";

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,examArrayTips
        );
        lvExamTips.setAdapter(adapter);


    }
}
