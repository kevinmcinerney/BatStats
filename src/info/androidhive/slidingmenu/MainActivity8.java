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

public class MainActivity8 extends Activity {
 Button mOption1;
	private Button mOption2;
	private Button mOption3;
	private TextView mResultTextView;
	private ImageView mImage;
	private ImageView mQuestion;
	private ImageView mHelp;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main8);
		mResultTextView = (TextView)findViewById(R.id.result_text_view);
		mImage = (ImageView)findViewById(R.id.image);
		mImage.setVisibility(View.GONE);
		mQuestion = (ImageView)findViewById(R.id.q4);
		mHelp = (ImageView)findViewById(R.id.help);
		
		mOption1 = (Button)findViewById(R.id.option1);
		mOption1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				mResultTextView.setText("Use a Logistic Regression and Gotham will be safe.");
				mOption1.setVisibility(View.GONE);
				mOption2.setVisibility(View.GONE);
				mOption3.setVisibility(View.GONE);
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
				mResultTextView.setText("Use a Loglinear Analyis and Gotham will be safe.");
				mOption1.setVisibility(View.GONE);
				mOption2.setVisibility(View.GONE);
				mOption3.setVisibility(View.GONE);
				mImage.setVisibility(View.VISIBLE);
				mQuestion.setVisibility(View.GONE);
				mHelp.setVisibility(View.GONE);
				MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.sound);
		        mp.start();
			}
		});
		mOption3 = (Button)findViewById(R.id.option3);
		mOption3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View x) {
				mResultTextView.setText("Use a Logistic Regression and Gotham will be safe.");
				mOption1.setVisibility(View.GONE);
				mOption2.setVisibility(View.GONE);
				mOption3.setVisibility(View.GONE);
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
				Intent i = new Intent(MainActivity8.this, HelpActivityQ4.class);
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
