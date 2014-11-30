package info.androidhive.slidingmenu;

import info.androidhive.BatStat.R;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AssumptionsCheckerFragment extends Fragment {
	
	private Button mBtn;
	public AssumptionsCheckerFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.assumptions_home, container, false);
        
        mBtn = (Button)rootView.findViewById(R.id.startAssumptions);
		mBtn.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View v){
				Intent i = new Intent(getActivity(), AndroidListViewActivity.class);
				startActivity(i);
			}
		});
         
        return rootView;
    }
}
