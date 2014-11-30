package info.androidhive.slidingmenu;

import info.androidhive.BatStat.R;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
 
public class AndroidListViewActivity extends ListActivity {
    private static final String[] test_list = null;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         
        // storing string resources into Array
        String[] test_list = getResources().getStringArray(R.array.test_list);
         
        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, test_list));
         
        ListView lv = getListView();
 
        // listening to single list item on click
        lv.setOnItemClickListener(new OnItemClickListener() {
          public void onItemClick(AdapterView<?> parent, View view,
              int position, long id) {
               
              // selected item 
              String test = ((TextView) view).getText().toString();
              
              Intent i = null;
              switch(test){
              case "Pearson Correlation":  i = new Intent(getApplicationContext(), PearsonCorrelation.class);break;
              case "Multiple Regression":  i = new Intent(getApplicationContext(), Multiple_Regression.class);break;
              case "Dependent t-test":  i = new Intent(getApplicationContext(), Dependent_t_test.class);break;
              case "Independent t-test":  i = new Intent(getApplicationContext(), Independent_t_test.class);break;
              case "One Way Repeated Measures ANOVA":  i = new Intent(getApplicationContext(), One_Way_Repeated_ANOVA.class);break;
              case "One Way Independent ANOVA":  i = new Intent(getApplicationContext(), One_Way_Independent_ANOVA.class);break;
              case "Factorial Repeated Measures ANOVA":  i = new Intent(getApplicationContext(), Factorial_RM_ANOVA.class);break;
              case "Independent Factorial ANOVA":  i = new Intent(getApplicationContext(), Independent_Factorial_ANOVA.class);break;
              case "Factorial Mixed ANOVA":  i = new Intent(getApplicationContext(), Factorial_Mixed_ANOVA.class);break;
              case "ANCOVA":  i = new Intent(getApplicationContext(), ANCOVA.class);break;
              }
              startActivity(i);
          }
        });
    }
}