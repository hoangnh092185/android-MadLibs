package epicodus.madlibs;

import android.os.Build;
import android.widget.TextView;

import org.apache.tools.ant.Main;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import dalvik.annotation.TestTargetClass;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Guest on 11/15/16.
 */

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {
    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void validateTextViewContent(){
        TextView appNameTextView = (TextView) activity.findViewById(R.id.appNameTextView);
        assertTrue("Mad Libs".equals(appNameTextView.getText().toString()));
    }

}
