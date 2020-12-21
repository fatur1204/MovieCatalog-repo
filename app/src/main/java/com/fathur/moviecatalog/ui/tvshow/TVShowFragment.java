package com.fathur.moviecatalog.ui.tvshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ShareCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.fathur.moviecatalog.R;
import com.fathur.moviecatalog.data.source.local.entity.TvShowEntity;
import com.fathur.moviecatalog.databinding.FragmentTVShowBinding;
import com.fathur.moviecatalog.ui.movies.viewmodel.ViewModelFactory;

public class TVShowFragment extends Fragment implements TVShowFragmentCallback {
    private static final String TAG = TVShowFragment.class.getSimpleName();
    public boolean bData = false;
    int iData = 0;
    private FragmentTVShowBinding fragmentTVShowBinding;

    public TVShowFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_t_v_show, container, false);

        try {
            iData = getArguments().getInt("message");
        } catch (Exception e) {
            iData = 1;
        }

        if (iData > 0) {
            bData = true;
        } else {
            bData = false;
        }

        fragmentTVShowBinding = FragmentTVShowBinding.inflate(inflater, container, false);
        return fragmentTVShowBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getActivity() != null) {

            ViewModelFactory factory = ViewModelFactory.getInstance(getActivity());
            TVShowViewModel viewModel = new ViewModelProvider(this, factory).get(TVShowViewModel.class);
            TVShowAdapter adapter = new TVShowAdapter(this);

            fragmentTVShowBinding.progressBar.setVisibility(View.VISIBLE);


            viewModel.getTVShow(bData).observe(this, tvshow -> {
                if (tvshow != null) {
                    switch (tvshow.status) {
                        case LOADING:
                            fragmentTVShowBinding.progressBar.setVisibility(View.VISIBLE);
                            break;
                        case SUCCESS:
                            fragmentTVShowBinding.progressBar.setVisibility(View.GONE);
                            adapter.submitList(tvshow.data);
                            adapter.notifyDataSetChanged();
                            break;
                        case ERROR:
                            fragmentTVShowBinding.progressBar.setVisibility(View.GONE);
                            Toast.makeText(getContext(), "Terjadi kesalahan", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            });

            fragmentTVShowBinding.rvTvshow.setLayoutManager(new LinearLayoutManager(getContext()));
            fragmentTVShowBinding.rvTvshow.setHasFixedSize(true);
            fragmentTVShowBinding.rvTvshow.setAdapter(adapter);
        }
    }


    public void onShareClick(TvShowEntity tvShowEntity) {
        if (getActivity() != null) {
            String mimeType = "text/plain";
            ShareCompat.IntentBuilder
                    .from(getActivity())
                    .setType(mimeType)
                    .setChooserTitle("Bagikan aplikasi ini sekarang.")
                    .setText(getResources().getString(R.string.share_text, tvShowEntity.getTitle()))
                    .startChooser();
        }
    }
}