package matheus.moreira.uno.conceitosclassesabstratas;

import static androidx.core.content.MimeTypeFilter.matches;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

import android.service.autofill.FieldClassification;

import androidx.test.core.app.ActivityScenario;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.regex.Matcher;

@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityTest {
    public ActivityScenario<MainActivity> activityScenario;
    //<> indica generics;



    @Test
    public void deveriaMainActivityEstarVisivel(){

        activityScenario = ActivityScenario.launch(MainActivity.class);

        onView(withId(R.id.mainactivity)).
            check(matches(isDisplayed()) );





    }





































}