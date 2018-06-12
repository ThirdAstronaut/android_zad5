package lab.swim.pwr.android_zad5_fragments;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

class CustomAdapter extends PagerAdapter {

    private Context mCtx;
    private int[] mPhotos;

    public CustomAdapter(Context ctx, int[] photos) {
        this.mCtx = ctx;
        this.mPhotos = photos;

    }

    @Override
    public int getCount() {
        return mPhotos.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mCtx);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(mPhotos[position]);
        container.addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView) object);
    }
}
