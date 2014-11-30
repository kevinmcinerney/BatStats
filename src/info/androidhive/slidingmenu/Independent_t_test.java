package info.androidhive.slidingmenu;

import info.androidhive.BatStat.R;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Independent_t_test extends Activity{
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_list_item_view);
           
        TextView problem = (TextView) findViewById(R.id.problem);
        problem.setText(R.string.As5);
        
        TextView solution = (TextView) findViewById(R.id.solution);
        solution.setText(R.string.As6);
	}
}
