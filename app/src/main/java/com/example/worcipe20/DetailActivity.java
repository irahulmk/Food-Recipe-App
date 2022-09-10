package com.example.worcipe20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView foodDescrption,foodTitle;
    ImageView foodImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        foodDescrption=(TextView)findViewById(R.id.txtDescription);
        foodImage=(ImageView)findViewById(R.id.ivImage2);
        foodTitle=(TextView)findViewById(R.id.txtTitle);

        Bundle mBundle = getIntent().getExtras();

        if(mBundle!=null){
            foodDescrption.setText(mBundle.getString("Description"));
            foodImage.setImageResource(mBundle.getInt("Image"));
            foodTitle.setText(mBundle.getString("Title"));
        }

    }
}
