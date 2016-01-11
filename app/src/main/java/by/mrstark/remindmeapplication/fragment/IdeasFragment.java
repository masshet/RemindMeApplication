package by.mrstark.remindmeapplication.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import by.mrstark.remindmeapplication.R;

/**
 * Created by mrstark on 10.1.16.
 */
public class IdeasFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_example;

    public static IdeasFragment getInstance(Context context) {
        Bundle bundle = new Bundle();
        IdeasFragment fragment = new IdeasFragment();
        fragment.setArguments(bundle);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_ideas));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
