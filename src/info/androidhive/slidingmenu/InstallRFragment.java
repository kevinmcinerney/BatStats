package info.androidhive.slidingmenu;

import info.androidhive.BatStat.R;
import android.app.Fragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InstallRFragment extends Fragment {
	
	private Button mPrevButton;
	private Button mNextButton;
	private TextView mQuestionTextView;
	private int mCurrentIndex= 0;
	private ImageView mImageView;
	public InstallRFragment(){}
	
	private int[] mStepsBank = {
			R.string.step1,
			R.string.step2,
			R.string.step3,
			R.string.step4,
			R.string.step5,
			R.string.step6,
			R.string.step7,
			R.string.step8,
			R.string.step9,
			R.string.step10,
			R.string.step11,
			R.string.step12,
			R.string.step13,
			R.string.step14,
			R.string.step15,
	};
	
	private int[] mStepsImageBank = {
			R.drawable.r1,
			R.drawable.r2,
			R.drawable.r3,
			R.drawable.r4,
			R.drawable.r5,
			R.drawable.r6,
			R.drawable.r7,
			R.drawable.r8,
			R.drawable.r9,
			R.drawable.r10,
			R.drawable.r11,
			R.drawable.r12,
			R.drawable.r13,
			R.drawable.r14,
			R.drawable.r15
	};
	
	public void updateQuestion(){
		int question = mStepsBank[mCurrentIndex];
		int image = mStepsImageBank[mCurrentIndex];
		//Log.d(TAG,"Uploading question text for question #" + mCurrentIndex,new Exception());
		mQuestionTextView.setText(question);
		mImageView.setImageResource(image);
	}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.activity_install, container, false);
      
        Options options = new BitmapFactory.Options();
        options.inScaled = false;
        Bitmap source = BitmapFactory.decodeResource(getResources(), R.id.r1, options);
		
		mQuestionTextView = (TextView)rootView.findViewById(R.id.question_text_view);
		mQuestionTextView.setText(mStepsBank[0]);
		mImageView = (ImageView)rootView.findViewById(R.id.r1);
		
		
		mPrevButton = (Button)rootView.findViewById(R.id.prev_button);
		mPrevButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if (mCurrentIndex > 0){
				mCurrentIndex = (mCurrentIndex - 1) % mStepsBank.length;
				}
				updateQuestion();
			}
		});
		
		mNextButton = (Button)rootView.findViewById(R.id.next_button);
		mNextButton.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View y){
				mCurrentIndex = (mCurrentIndex + 1) % mStepsBank.length;
				updateQuestion();
			}
		});     
        return rootView;
    }
}
