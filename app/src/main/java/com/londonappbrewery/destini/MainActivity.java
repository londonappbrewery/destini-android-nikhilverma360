package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mTextView;
    Button mButton1;
    Button mButton2;
    int mStoryIndex=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView=(TextView)findViewById(R.id.storyTextView);
        mButton1=(Button)findViewById(R.id.buttonTop);
        mButton2=(Button)findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex==1){
                    mTextView.setText(R.string.T3_Story);
                    mButton1.setText(R.string.T3_Ans1);
                    mButton2.setText(R.string.T3_Ans2);
                    mStoryIndex=3;
                }
                else
                if(mStoryIndex==2){
                    mTextView.setText(R.string.T3_Story);
                    mButton1.setText(R.string.T3_Ans1);
                    mButton2.setText(R.string.T3_Ans2);
                    mStoryIndex=3;
                }
                else
                if (mStoryIndex==3) {
                    mTextView.setText(R.string.T6_End);
                    mButton1.setVisibility(View.GONE);
                    mButton2.setVisibility(View.GONE);
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex==1){
                    mTextView.setText(R.string.T2_Story);
                    mButton1.setText(R.string.T2_Ans1);
                    mButton2.setText(R.string.T2_Ans2);
                    mStoryIndex=2;
                }
                else
                if (mStoryIndex==2) {
                    mTextView.setText(R.string.T4_End);
                    mButton1.setVisibility(View.GONE);
                    mButton2.setVisibility(View.GONE);
                }
                else
                if (mStoryIndex==3){
                    mTextView.setText(R.string.T5_End);
                    mButton1.setVisibility(View.GONE);
                    mButton2.setVisibility(View.GONE);
                }
            }
        });

    }
}
