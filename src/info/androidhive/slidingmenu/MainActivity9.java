package info.androidhive.slidingmenu;

import info.androidhive.BatStat.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity9 extends Activity {
	
	private Button mOption1;
	private Button mOption2;
	private ImageView mQuestion;
	private ImageView mHelp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main9);
		mQuestion = (ImageView)findViewById(R.id.q4b);
		mHelp = (ImageView)findViewById(R.id.help);
		
		mOption1 = (Button)findViewById(R.id.option1);
		mOption1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				Intent i = new Intent(MainActivity9.this, MainActivity10.class);
				startActivity(i);
				
			}
		});
		
		mOption2 = (Button)findViewById(R.id.option2);
		mOption2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View x) {
				Intent i = new Intent(MainActivity9.this, MainActivity11.class);
				startActivity(i);
				
			}
		});
		mHelp = (ImageView)findViewById(R.id.help);
		mHelp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View x) {
				Intent i = new Intent(MainActivity9.this, HelpActivityQ4b.class);
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
