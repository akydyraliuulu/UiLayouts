package com.example.developer.uilayouts;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView gender_text_view;
    private TextView goal_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gender_text_view = (TextView) findViewById(R.id.gender);
        goal_text_view = (TextView) findViewById(R.id.goal);

        RadioGroup radio_group_gender = (RadioGroup) findViewById(R.id.radio_group);
        radio_group_gender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                switch (checkedId) {
                    case R.id.female:
                        gender_text_view.setText(R.string.gender_female);
                        break;
                    case R.id.male:
                        gender_text_view.setText(R.string.gender_male);
                        break;
                    default:
                        break;
                }

            }
        });
        RadioGroup radio_group_goal = (RadioGroup) findViewById(R.id.radio_group_goal);
        radio_group_goal.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {

                switch (checkedId) {
                    case R.id.flirt:
                        goal_text_view.setText(R.string.flirt);
                        break;
                    case R.id.relations:
                        goal_text_view.setText(R.string.relations);
                        break;
                    case R.id.bored:
                        goal_text_view.setText(R.string.bored);
                    default:
                        break;
                }
            }
        });

        final Button save_btn = (Button) findViewById(R.id.save);
        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation startAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.press_button);
                save_btn.startAnimation(startAnimation);
                Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }

}



