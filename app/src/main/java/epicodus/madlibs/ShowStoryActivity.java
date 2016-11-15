    package epicodus.madlibs;

import android.content.Intent;
import android.content.res.Resources;
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
        Resources res = getResources();

        String madlib = "";
        switch (storyType) {
            case "normal":
                madlib = res.getString(R.string.normal, story.Occupations.get(0), story.Nouns.get(3), story.Verbs.get(1), story.Adjectives.get(0), story.Nouns.get(2), story.Verbs.get(0), story.Adjectives.get(1), story.Nouns.get(0), story.Verbs.get(2), story.Nouns.get(1));
                break;
            case "holiday":
                madlib = res.getString(R.string.holiday, story.Occupations.get(0), story.Verbs.get(1), story.Adjectives.get(0), story.Nouns.get(2), story.Verbs.get(0), story.Nouns.get(0), story.Verbs.get(2), story.Nouns.get(1));
                break;
        }

        mTextStory.setText(madlib);

    }
}
