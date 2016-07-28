package com.acadgild.s3A1HideShow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class ImageDisplay extends AppCompatActivity {

    ToggleButton hideShowButton;
    ImageView hideShowImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_display);
        hideShowImage = (ImageView) findViewById(R.id.hide_show_image);
        hideShowImage.setVisibility(View.VISIBLE);

        hideShowButton = (ToggleButton) findViewById(R.id.hide_show_button);
        hideShowButton.setText(R.string.text_off);
    }

    public void clickHideShowButton(View view){
        if (hideShowImage.getVisibility() == View.VISIBLE){
            hideShowImage.setVisibility(View.INVISIBLE);
            hideShowButton.setText(R.string.text_on);
        }
        else{
            hideShowImage.setVisibility(View.VISIBLE);
            hideShowButton.setText(R.string.text_off);
        }
    }
}
