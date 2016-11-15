    package epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

    public class ShowStoryActivity extends AppCompatActivity {
    @Bind(R.id.textStory) TextView mTextStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_story);
        ButterKnife.bind(this);

//        Intent intent = getIntent();
        Bundle data = getIntent().getExtras();
        Story story = (Story) data.getParcelable("story");

        String madlib = "Today a " + story.Occupation + " named " + story.Noun4 + " came to our school to talk to us about her job. She said the most important skill you need to know to do her job is to be able to " + story.Verb2 + " around (a) " + story.Adjective1 + " " + story.Noun3 + ". She said it was easy for her to learn her job because she loved to " + story.Verb1 + " when she was my age--and that helps a lot! If you're considering her profession, I hope you can be near (a) " + story.Adjective2 + " " + story.Noun1 + ". That's very important! If you get too distracted in that situation you won't be able to " + story.Verb3 + " next to (a) " + story.Noun2 + "!";
        mTextStory.setText(madlib);

    }
}
