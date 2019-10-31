package com.foodtracker.foodoasis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button mUserButton;
    public Button mVendorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    mUserButton = (Button)findViewById(R.id.userButton);
    mVendorButton = (Button)findViewById(R.id.vendorButton);

    mUserButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentUser = new Intent(MainActivity.this, VendorList.class);
            startActivity(intentUser);
        }
    });

    mVendorButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intentVendor = new Intent(MainActivity.this, VendorLogin.class);
            startActivity(intentVendor);
        }
    });

    }

}
