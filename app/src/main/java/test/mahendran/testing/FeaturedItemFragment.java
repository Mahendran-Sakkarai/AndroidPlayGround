package test.mahendran.testing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by "Mahendran Sakkarai" on 4/16/2017.
 */

public class FeaturedItemFragment extends Fragment {
    private int featured;

    public FeaturedItemFragment() {

    }

    public static FeaturedItemFragment newInstance() {
        return new FeaturedItemFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.featured, container, false);

        ((TextView) v.findViewById(R.id.tv)).setText(""+featured);

        return v;
    }

    public void setFeatured(int featured) {
        this.featured = featured;
    }
}
