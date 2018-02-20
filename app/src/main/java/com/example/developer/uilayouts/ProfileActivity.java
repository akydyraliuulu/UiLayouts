package com.example.developer.uilayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class ProfileActivity extends AppCompatActivity {

    private LinearLayout edit_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

//        edit_profile = (LinearLayout) findViewById(R.id.edit_profile_layout);
//        edit_profile.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.press_button);
//                edit_profile.startAnimation(startAnimation);
//                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
