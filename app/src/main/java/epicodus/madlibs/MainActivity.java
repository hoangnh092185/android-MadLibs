package epicodus.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.playButton) Button mPlayButton;
    @Bind(R.id.holidayPlayButton) Button mHolidayPlayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mPlayButton.setOnClickListener(this);
        mHolidayPlayButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mPlayButton) {
            Intent intent = new Intent(MainActivity.this, AddWordsActivity.class);
            startActivity(intent);
        } else if(v == mHolidayPlayButton) {
            Intent intent = new Intent(MainActivity.this, HolidayMabLibsActivity.class);
            startActivity(intent);
        }
    }
}
