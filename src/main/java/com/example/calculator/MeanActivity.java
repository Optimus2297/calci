package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.List;
import java.util.ArrayList;

public class MeanActivity extends AppCompatActivity {

    private EditText text;
    private Button calc,clear;
    private String numbers,meanString,modeString,medianString;
    private float  sum=0,cnt=0;
    private float mean;
    private TextView show_mean,show_median,show_mode;
    private Integer i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mean);
        calc = findViewById(R.id.submit);
        text = findViewById(R.id.numbers);
        show_mean = findViewById(R.id.mean_show);
        show_median = findViewById(R.id.median_show);
        show_mode = findViewById(R.id.mode_show);
        clear = findViewById(R.id.clear);
        final List<Integer> vec = new ArrayList<>();
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numbers = text.getText().toString().trim();
                StringTokenizer st1 =
                        new StringTokenizer(numbers, ",");
                while (st1.hasMoreTokens()) {
                    int a = Integer.parseInt(st1.nextToken());
                    sum+=a;
                    vec.add(a);
                    cnt++;
                }
                mean = sum/cnt;
                meanString = mean+"";
                show_mean.setText(meanString);
                int mid;
                Collections.sort(vec);
                if(vec.size()%2==0)
                {
                    mid=(vec.size()/2)-1;
                    float z = (vec.get(mid)+vec.get(mid+1))/2;
                    medianString = z+"";
                    show_median.setText(medianString);
                }
                else
                {
                    mid=(vec.size())/2;
                    medianString = vec.get(mid)+"";
                    show_median.setText(medianString);
                }
                modeString = mode(vec)+"";
                show_mode.setText(modeString);
                clear.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        text.setText("");
                        show_mode.setText("");
                        show_median.setText("");
                        show_mean.setText("");
                    }
                });
            }
        });
    }

    public static int mode(List array)
    {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int max  = 1;
        int temp = 0;

        for(int i = 0; i < array.size(); i++) {

            if (hm.get(array.get(i)) != null) {

                int count = hm.get(array.get(i));
                count++;
                hm.put((int)array.get(i), count);

                if(count > max) {
                    max  = count;
                    temp = (int) array.get(i);
                }
            }

            else
                hm.put((int)array.get(i),1);
        }
        return temp;
    }
}
