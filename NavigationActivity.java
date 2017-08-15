package com.israilbony.fragmentactivity;


import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class NavigationActivity extends AppCompatActivity {
    private ViewPager viewPager;

    private TabsAdapter tabsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())

        {
                 case R.id.action_settings :
                Toast.makeText(this,"Select Detting",Toast.LENGTH_LONG).show();
                     return  true;
            case R.id.action_rateUp :
                Toast.makeText(this,"Rate up",Toast.LENGTH_LONG).show();
                return  true;
            default:
                return super.onOptionsItemSelected(item);

        }

    }
}
