package com.example.developer.uilayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private TextView welcome;
    private Button facebook;
    private Button sms;
    private Button google;
    private TextView confidentiality;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_layout);

        welcome = (TextView) findViewById(R.id.welcome);
        facebook = (Button) findViewById(R.id.facebook);
        sms = (Button) findViewById(R.id.sms);
        google = (Button) findViewById(R.id.google);
        confidentiality = (TextView) findViewById(R.id.confidentiality);


        RadioGroup radio_group_locale = (RadioGroup) findViewById(R.id.radio_group_locale);
        radio_group_locale.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                switch (checkedId) {
                    case R.id.russian:
                        welcome.setText(R.string.welcome);
                        facebook.setText(R.string.facebook_sign_in);
                        sms.setText(R.string.sms_sign_in);
                        google.setText(R.string.google_sign_in);
                        confidentiality.setText(R.string.registration_text);
                        break;
                    case R.id.kyrgyz:
                        welcome.setText(R.string.welcome_ky);
                        facebook.setText(R.string.facebook_sign_in_ky);
                        sms.setText(R.string.sms_sign_in_ky);
                        google.setText(R.string.google_sign_in_ky);
                        confidentiality.setText(R.string.registration_text_ky);
                        break;
                    case R.id.english:
                        welcome.setText(R.string.welcome_en);
                        facebook.setText(R.string.facebook_sign_in_en);
                        sms.setText(R.string.sms_sign_in_en);
                        google.setText(R.string.google_sign_in_en);
                        confidentiality.setText(R.string.registration_text_en);
                    default:
                        break;
                }
            }
        });
    }
}
