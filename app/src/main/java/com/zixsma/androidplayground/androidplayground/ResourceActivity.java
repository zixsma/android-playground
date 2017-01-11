package com.zixsma.androidplayground.androidplayground;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ResourceActivity extends AppCompatActivity {
    TextView textView;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);
        textView = (TextView) findViewById(R.id.text_view);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
    }

    @Override
    protected void onStart() {
        super.onStart();
        setAwesomeTextView("World!");
        viewPager.setAdapter(new ViewPagerAdapter());
    }

    public void setAwesomeTextView(String text) {
        String awesomeText = getResources().getString(R.string.text_awesome, text);
        textView.setText(awesomeText);
    }

    private class ViewPagerAdapter extends PagerAdapter {

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            TextView textView = new TextView(container.getContext());
            textView.setText("hi there " + position);
            container.addView(textView);
            return textView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View)object);
        }

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }
    }
}
