package com.example.testapp;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class ActivityTwoTest {

    @Rule
    public ActivityTestRule<ActivityTwo> activityActivityTestRule = new ActivityTestRule<>(ActivityTwo.class);
    private ActivityTwo ActivityTwo = null;
    @Before
    public void setUp() throws Exception {
        ActivityTwo = activityActivityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void onCreate() {
    }

    @Test
    public void btnClick() {
        Espresso.onView(withId(R.id.editText)).perform(replaceText("Robbie!!!!!!!!!"));
        Espresso.onView(withId(R.id.button2)).perform(click());
    }

}