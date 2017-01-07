package com.zixsma.androidplayground.androidplayground;

import android.widget.TextView;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by zixsma on 1/7/2017 AD.
 */
public class ResourceActivityTest {

    @Test
    public void shouldSetTextViewWithAwesomeHouseText() {
        TextView textView = mock(TextView.class);
        ResourceActivity resourceActivity = new ResourceActivity();
        resourceActivity.setAwesomeTextView("House");
        verify(textView).setText("Awesome House");
    }
}