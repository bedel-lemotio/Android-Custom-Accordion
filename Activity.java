package com.example.elmir.customaccordion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parent = (LinearLayout) findViewById(R.id.parent);
    }

    public void toggleAccordion(View v) {
        LinearLayout accordionElement = (LinearLayout) v;
        int clicked_index = parent.indexOfChild(accordionElement);
        TextView accordionText = (TextView) parent.getChildAt(clicked_index+1);
        ImageView arrow = (ImageView) accordionElement.getChildAt(1);
        if (accordionText.getVisibility() == View.GONE) {
            accordionText.setVisibility(View.VISIBLE);
            arrow.setBackgroundResource(R.drawable.icon_up);
        } else {
            accordionText.setVisibility(View.GONE);
            arrow.setBackgroundResource(R.drawable.icon_down);
        }
    }

}
