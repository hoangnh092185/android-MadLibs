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

        Intent intent = getIntent();
        Story story = (Story) intent.getParcelableExtra("story");
        String storyType = intent.getStringExtra("storyType");

        String madlib = "";
        switch (storyType) {
            case "normal":
                madlib = "Today a " + story.Occupations.get(0) + " named " + story.Nouns.get(3) + " came to our school to talk to us about her job. She said the most important skill you need to know to do her job is to be able to " + story.Verbs.get(1) + " around (a) " + story.Adjectives.get(0) + " " + story.Nouns.get(2) + ". She said it was easy for her to learn her job because she loved to " + story.Verbs.get(0) + " when she was my age--and that helps a lot! If you're considering her profession, I hope you can be near (a) " + story.Adjectives.get(1) + " " + story.Nouns.get(0) + ". That's very important! If you get too distracted in that situation you won't be able to " + story.Verbs.get(2) + " next to (a) " + story.Nouns.get(1) + "!";
                break;
            case "holiday":
                madlib = "THIS IS A NEW HOLIDAY MAB LIBS " + story.Occupations.get(0) + " <--NEW named came to our school to talk to us about her job. She said the most important skill you need to know to do her job is to be able to " + story.Verbs.get(1) + " <--NEW around (a) " + story.Adjectives.get(0) + " " + story.Nouns.get(2) + ". She said it was easy for her to learn her job because she loved to " + story.Verbs.get(0) + " when she was my age--and that helps a lot! If you're considering her profession, I hope you can be near (a)" + story.Nouns.get(0) + ". <--NEW That's very important! If you get too distracted in that situation you won't be able to " + story.Verbs.get(2) + "  <--NEW next to (a) " + story.Nouns.get(1) + " <--NEW !";
                break;
        }

        mTextStory.setText(madlib);

    }
}
