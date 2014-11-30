package info.androidhive.slidingmenu;

import info.androidhive.BatStat.R;
import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity10 extends Activity {

	private Button mOption1;
	private Button mOption2;
	private TextView mResultTextView;
	private ImageView mImage;
	private ImageView mQuestion;
	private ImageView mHelp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main10);
		mResultTextView = (TextView)findViewById(R.id.result_text_view);
		mImage = (ImageView)findViewById(R.id.image);
		mImage.setVisibility(View.GONE);
		mQuestion = (ImageView)findViewById(R.id.q4c);
		mHelp = (ImageView)findViewById(R.id.help);
		
		mOption1 = (Button)findViewById(R.id.option1);
		mOption1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				mResultTextView.setText("Use a Dependtent t-test and Gotham will be safe.");
				mOption1.setVisibility(View.GONE);
				mOption2.setVisibility(View.GONE);
				mImage.setVisibility(View.VISIBLE);
				mQuestion.setVisibility(View.GONE);
				mHelp.setVisibility(View.GONE);
				MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.sound);
		        mp.start();
				
			}
		});
		mOption2 = (Button)findViewById(R.id.option2);
		mOption2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View x) {
				mResultTextView.setText("Use a Independent t-test or Point-Biserial Correlation and Gotham will be safe.");
				mOption1.setVisibility(View.GONE);
				mOption2.setVisibility(View.GONE);
				mImage.setVisibility(View.VISIBLE);
				mQuestion.setVisibility(View.GONE);
				mHelp.setVisibility(View.GONE);
				MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.sound);
		        mp.start();
			}
		});
		mHelp = (ImageView)findViewById(R.id.help);
		mHelp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View x) {
				Intent i = new Intent(MainActivity10.this, HelpActivityQ4c.class);
				startActivity(i);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
