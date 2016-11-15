package epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class HolidayMabLibsActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.holidaySubmitButton) Button mSubmitButton;
    @Bind(R.id.editOccupation) EditText mEditOccupation;
    @Bind(R.id.editNoun1) EditText mEditNoun1;
    @Bind(R.id.editNoun2) EditText mEditNoun2;
    @Bind(R.id.editNoun3) EditText mEditNoun3;
    @Bind(R.id.editAdjective1) EditText mEditAdjective1;
    @Bind(R.id.editVerb1) EditText mEditVerb1;
    @Bind(R.id.editVerb2) EditText mEditVerb2;
    @Bind(R.id.editVerb3) EditText mEditVerb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holiday_mab_libs);
        ButterKnife.bind(this);
        mSubmitButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mSubmitButton) {
            if (mEditOccupation.getText().toString().trim().equals("")) {
                mEditOccupation.setError("Field Required!");
            } else if (mEditNoun1.getText().toString().trim().equals("")) {
                mEditNoun1.setError("Field Required!");
            } else if (mEditNoun2.getText().toString().trim().equals("")) {
                mEditNoun2.setError("Field Required!");
            } else if (mEditNoun3.getText().toString().trim().equals("")) {
                mEditNoun3.setError("Field Required!");
            }  else if (mEditAdjective1.getText().toString().trim().equals("")) {
                mEditAdjective1.setError("Field Required!");
            } else if (mEditVerb1.getText().toString().trim().equals("")) {
                mEditVerb1.setError("Field Required!");
            } else if (mEditVerb2.getText().toString().trim().equals("")) {
                mEditVerb2.setError("Field Required!");
            } else if (mEditVerb3.getText().toString().trim().equals("")) {
                mEditVerb3.setError("Field Required!");
            } else {
                ArrayList<String> Occupations = new ArrayList<String>();
                Occupations.add(mEditOccupation.getText().toString());

                ArrayList<String> Nouns = new ArrayList<String>();
                Nouns.add(mEditNoun1.getText().toString());
                Nouns.add(mEditNoun2.getText().toString());
                Nouns.add(mEditNoun3.getText().toString());

                ArrayList<String> Adjectives = new ArrayList<String>();
                Adjectives.add(mEditAdjective1.getText().toString());

                ArrayList<String> Verbs = new ArrayList<String>();
                Verbs.add(mEditVerb1.getText().toString());
                Verbs.add(mEditVerb2.getText().toString());
                Verbs.add(mEditVerb3.getText().toString());

                Story story = new Story(Occupations, Nouns, Adjectives, Verbs);

                Intent intent = new Intent(HolidayMabLibsActivity.this, ShowStoryActivity.class);
                intent.putExtra("story", story);
                intent.putExtra("storyType", "holiday");
                startActivity(intent);
            }
        }
    }

}