package com.zixsma.androidplayground.androidplayground;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class ResourceActivityInstrumentTest {


    @Rule
    public ActivityTestRule<ResourceActivity> resourceActivityActivityTestRule
            =new ActivityTestRule<>(ResourceActivity.class);

    @Test
    public void setAwesomeTextView() throws Exception {
        String actual = resourceActivityActivityTestRule.getActivity().getResources().getString(R.string.text_awesome, "somkiat");
        assertEquals("Awesome somkiat", actual);
    }

}