package com.aispeech.mycomponentdemo;

import android.os.Bundle;

import com.aispeech.lib_basecomponent.service.ServiceFactory;

import androidx.appcompat.app.AppCompatActivity;


public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        ServiceFactory.getInstance().getILoginServic().newUserFragment(this, R.id.layout_fragment, getSupportFragmentManager(), null, "");
    }
}
