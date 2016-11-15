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
        String occupation = intent.getStringExtra("editOccupation");
        String noun1 = intent.getStringExtra("editNoun1");
        String noun2 = intent.getStringExtra("editNoun2");
        String noun3 = intent.getStringExtra("editNoun3");
        String noun4 = intent.getStringExtra("editNoun4");
        String adjective1 = intent.getStringExtra("editAdjective1");
        String adjective2 = intent.getStringExtra("editAdjective2");
        String verb1 = intent.getStringExtra("editVerb1");
        String verb2 = intent.getStringExtra("editVerb2");
        String verb3 = intent.getStringExtra("editVerb3");

        String story = "Today a " + occupation + " named " + noun4 + " came to our school to talk to us about her job. She said the most important skill you need to know to do her job is to be able to " + verb2 + " around (a) " + adjective1 + " " + noun3 + ". She said it was easy for her to learn her job because she loved to " + verb1 + " when she was my age--and that helps a lot! If you're considering her profession, I hope you can be near (a) " + adjective2 + " " + noun1 + ". That's very important! If you get too distracted in that situation you won't be able to " + verb3 + " next to (a) " + noun2 + "!";
        mTextStory.setText(story);

    }
}
