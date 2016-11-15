package epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class AddWordsActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.submitButton) Button mSubmitButton;
    @Bind(R.id.editOccupation) EditText mEditOccupation;
    @Bind(R.id.editNoun1) EditText mEditNoun1;
    @Bind(R.id.editNoun2) EditText mEditNoun2;
    @Bind(R.id.editNoun3) EditText mEditNoun3;
    @Bind(R.id.editNoun4) EditText mEditNoun4;
    @Bind(R.id.editAdjective1) EditText mEditAdjective1;
    @Bind(R.id.editAdjective2) EditText mEditAdjective2;
    @Bind(R.id.editVerb1) EditText mEditVerb1;
    @Bind(R.id.editVerb2) EditText mEditVerb2;
    @Bind(R.id.editVerb3) EditText mEditVerb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_words);
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
            } else if (mEditNoun4.getText().toString().trim().equals("")) {
                mEditNoun4.setError("Field Required!");
            } else if (mEditAdjective1.getText().toString().trim().equals("")) {
                mEditAdjective1.setError("Field Required!");
            } else if (mEditAdjective2.getText().toString().trim().equals("")) {
                mEditAdjective2.setError("Field Required!");
            } else if (mEditVerb1.getText().toString().trim().equals("")) {
                mEditVerb1.setError("Field Required!");
            } else if (mEditVerb2.getText().toString().trim().equals("")) {
                mEditVerb2.setError("Field Required!");
            } else if (mEditVerb3.getText().toString().trim().equals("")) {
                mEditVerb3.setError("Field Required!");
            } else {
                Intent intent = new Intent(AddWordsActivity.this, ShowStoryActivity.class);
                Story story = new Story(mEditOccupation.getText().toString(),
                        mEditNoun1.getText().toString(),
                        mEditNoun2.getText().toString(),
                        mEditNoun3.getText().toString(),
                        mEditNoun4.getText().toString(),
                        mEditAdjective1.getText().toString(),
                        mEditAdjective2.getText().toString(),
                        mEditVerb1.getText().toString(),
                        mEditVerb2.getText().toString(),
                        mEditVerb3.getText().toString());
                intent.putExtra("story", story);
                startActivity(intent);

            }
        }
    }

}
