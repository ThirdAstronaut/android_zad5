package lab.swim.pwr.android_zad5_fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewpager);
        CustomAdapter adapter = new CustomAdapter(this, PhotosKeeper.getInstance().getPhotos());
        viewPager.setAdapter(adapter);
    }
}
