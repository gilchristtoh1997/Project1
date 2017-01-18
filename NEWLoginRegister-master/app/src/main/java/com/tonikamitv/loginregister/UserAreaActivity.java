package com.tonikamitv.loginregister;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import com.android.volley.Response;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserAreaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final TabHost host = (TabHost) findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tab One");
        spec.setContent(R.id.home);
        spec.setIndicator("home");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("sms");
        spec.setContent(R.id.sms);
        spec.setIndicator("sms");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("stats");
        spec.setContent(R.id.stats);
        spec.setIndicator("stats");
        host.addTab(spec);

        //Tab 4
        spec = host.newTabSpec("me");
        spec.setContent(R.id.me);
        spec.setIndicator("me");
        host.addTab(spec);

        host.setOnTabChangedListener(new TabHost.OnTabChangeListener() {

            @Override
            public void onTabChanged(String tabId) {

                switch (host.getCurrentTab()) {
                    case 0:

                        break;
                    case 1:
                        //do what you want when tab 1 is selected
                        break;
                    case 2:
                        //do what you want when tab 2 is selected
                        break;

                    default:
                        setContentView(R.layout.activity_profile);
                        TextView tvWelcomeMsg = (TextView) findViewById(R.id.tvWelcomeMsg);
                        EditText etUsername = (EditText) findViewById(R.id.etUsername);
                        EditText etAge = (EditText) findViewById(R.id.etAge);


                        final Intent intent = getIntent();
                        String name = intent.getStringExtra("name");
                        String username = intent.getStringExtra("username");
                        int age = intent.getIntExtra("age", -1);
                        int phoneNum = intent.getIntExtra("number",-1);
                        String email = intent.getStringExtra("email");

                        String message = name + " welcome to your user area";
                        tvWelcomeMsg.setText(message);
                        etUsername.setText(username);
                        etAge.setText(age + "");

                        Intent intent2 = new Intent(UserAreaActivity.this,UserAreaActivity.class);
                        UserAreaActivity.this.startActivity(intent2);
                        break;
                }
            }
        });

    }



}





