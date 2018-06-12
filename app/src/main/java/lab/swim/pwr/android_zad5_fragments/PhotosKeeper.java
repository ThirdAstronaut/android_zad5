package lab.swim.pwr.android_zad5_fragments;

public class PhotosKeeper {
    private static PhotosKeeper instance = null;
    private int[] mPhotos;

    private PhotosKeeper() {
        mPhotos = new int[7];

        mPhotos[0] = R.drawable.a1;
        mPhotos[1] = R.drawable.a2;
        mPhotos[2] = R.drawable.a3;
        mPhotos[3] = R.drawable.a4;
        mPhotos[4] = R.drawable.a5;
        mPhotos[5] = R.drawable.a6;
        mPhotos[6] = R.drawable.a7;

    }

    public int[] getPhotos() {
        return mPhotos;
    }

    public static PhotosKeeper getInstance() {
        if (instance == null) {
            instance = new PhotosKeeper();
        }
        return instance;
    }
}