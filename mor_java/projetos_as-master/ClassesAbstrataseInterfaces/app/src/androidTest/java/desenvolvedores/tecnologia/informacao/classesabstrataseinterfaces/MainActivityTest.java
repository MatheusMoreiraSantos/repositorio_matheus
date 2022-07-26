package desenvolvedores.tecnologia.informacao.classesabstrataseinterfaces;

import androidx.test.core.app.ActivityScenario;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4ClassRunner.class)
public class MainActivityTest {

    //Para usar o gerador automático de código pressione alt+insert (Test Method)
    @Test
    public void deveriaMainActivityEstarVisivel() {
        ActivityScenario<MainActivity> activityScenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.mainActivity)).check(matches(isDisplayed()));
    }

    @Test
    public void deveriaOTituloDoAppEstarVisible() {
        ActivityScenario<MainActivity> activityScenario = ActivityScenario.launch(MainActivity.class);
        onView(withId(R.id.tvTitulo)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)));
    }
}