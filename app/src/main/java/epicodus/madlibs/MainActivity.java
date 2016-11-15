package epicodus.madlibs;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.playButton) Button mPlayButton;
    @Bind(R.id.playSelectGroup) RadioGroup mRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mPlayButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        if(v == mPlayButton) {
            int selectedId = mRadioGroup.getCheckedRadioButtonId();
            RadioButton selectedRadioButton = (RadioButton) findViewById(selectedId);
            switch (selectedRadioButton.getId()) {
                case R.id.funRadioButton:
                    intent = new Intent(MainActivity.this, AddWordsActivity.class);
                    startActivity(intent);
                    break;
                case R.id.holidayRadioButton:
                    intent = new Intent(MainActivity.this, HolidayMabLibsActivity.class);
                    startActivity(intent);
                    break;
            }
        }
    }
}
