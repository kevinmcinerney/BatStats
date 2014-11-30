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

public class MainActivity5 extends Activity {
	
	private Button mOption1;
	private Button mOption2;
	private TextView mResultTextView;
	private ImageView mImage;
	private ImageView mQuestion;
	private ImageView mHelp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main5);
		mResultTextView = (TextView)findViewById(R.id.result_text_view);
		mQuestion = (ImageView)findViewById(R.id.q4);
		mHelp = (ImageView)findViewById(R.id.help);
		mImage = (ImageView)findViewById(R.id.image);
		mImage.setVisibility(View.GONE);
		
		
		mOption1 = (Button)findViewById(R.id.option1);
		mOption1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				mResultTextView.setText("Use a Pearson Correlation or Regression and Gotham will be safe.");
				mOption1.setVisibility(View.GONE);
				mOption2.setVisibility(View.GONE);
				mHelp.setVisibility(View.GONE);
				mQuestion.setVisibility(View.GONE);
				mImage.setVisibility(View.VISIBLE);
				
				MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.sound);
		        mp.start();
			}
		});
		mOption2 = (Button)findViewById(R.id.option2);
		mOption2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View x) {
				Intent i = new Intent(MainActivity5.this, MainActivity9.class);
				startActivity(i);
			}
		});
		mHelp = (ImageView)findViewById(R.id.help);
		mHelp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View x) {
				Intent i = new Intent(MainActivity5.this, HelpActivityQ4.class);
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
