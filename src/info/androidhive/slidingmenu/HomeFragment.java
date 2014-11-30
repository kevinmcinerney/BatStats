package info.androidhive.slidingmenu;

import info.androidhive.BatStat.R;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

public class HomeFragment extends Fragment {
	
	private Button mOption1;
	private Button mOption2;
	private ImageView mHelp;
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.activity_main1, container, false);
         
        mOption1 = (Button)rootView.findViewById(R.id.option1);
		mOption1.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				Intent i = new Intent(getActivity(), MainActivity2.class);
				startActivity(i);
			}
		});
		mOption2 = (Button)rootView.findViewById(R.id.option2);
		mOption2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View x) {
				Intent i = new Intent(getActivity(), MainActivity13.class);
				startActivity(i);
				
			}
		});
		mHelp = (ImageView)rootView.findViewById(R.id.help);
		mHelp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View x) {
				Intent i = new Intent(getActivity(), HelpActivityQ1.class);
				startActivity(i);
				
			}
		});
        return rootView;
    }
}
