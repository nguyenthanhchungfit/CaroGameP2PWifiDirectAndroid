package com.nguyenthanhchung.carop2p;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class KhoiDongGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_khoi_dong_game);
    }
}