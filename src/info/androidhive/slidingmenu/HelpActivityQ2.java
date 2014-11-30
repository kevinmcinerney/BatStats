package info.androidhive.slidingmenu;

import info.androidhive.BatStat.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class HelpActivityQ2 extends Activity {
	private TextView mInformation;
	private ImageView mButler;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.help_layout);
		
		mInformation = (TextView)findViewById(R.id.help_text_view);
		mInformation.setText(R.string.HelpQ2);
		mButler = (ImageView)findViewById(R.id.butler);
	}
}

