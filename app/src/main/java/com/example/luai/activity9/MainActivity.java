package com.example.luai.activity9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.tv_info);

        Intent i = getIntent();

        // TODO (10): Get the intent and make use of extra int with key "id". If it's 1, set the text view's text to user1. If it's 2, set to user2, and the same for 3
        if (i != null)
            switch (i.getIntExtra("id", 1)) {


            }


    }


    final String user1 = "Id: 1\nName: Leanne Graham\nUsername: Bret\nEmail: Sincere@april.biz";
    final String user2 = "Id: 2\nName: Ervin Howell\nUsername: Antonette\nEmail: Shanna@melissa.tv";
    final String user3 = "Id: 3\nName: Clementine Bauch\nUsername: Samanthat\nEmail: Nathan@yesenia.net";

}
