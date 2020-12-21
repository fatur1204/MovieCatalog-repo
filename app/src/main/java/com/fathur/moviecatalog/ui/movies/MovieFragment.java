package com.fathur.moviecatalog.ui.movies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.fathur.moviecatalog.databinding.FragmentMovieBinding;
import com.fathur.moviecatalog.ui.movies.viewmodel.ViewModelFactory;

public class MovieFragment extends Fragment {
    private final String TAG = MovieFragment.class.getSimpleName();
    public boolean bData = false;
    int iData = 0;
    private FragmentMovieBinding fragmentMovieBinding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_movie, container, false);

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

        fragmentMovieBinding = FragmentMovieBinding.inflate(inflater, container, false);
        return fragmentMovieBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getActivity() != null) {
            ViewModelFactory factory = ViewModelFactory.getInstance(getActivity());
            MovieViewModel viewModel = new ViewModelProvider(this, factory).get(MovieViewModel.class);

            MovieAdapter movieAdapter = new MovieAdapter();

            fragmentMovieBinding.progressBar.setVisibility(View.VISIBLE);

            viewModel.getMovies(bData).observe(this, movies -> {
                if (movies != null) {
                    switch (movies.status) {
                        case LOADING:
                            fragmentMovieBinding.progressBar.setVisibility(View.VISIBLE);
                            break;
                        case SUCCESS:
                            fragmentMovieBinding.progressBar.setVisibility(View.GONE);
                            movieAdapter.submitList(movies.data);
                            movieAdapter.notifyDataSetChanged();
                            break;
                        case ERROR:
                            fragmentMovieBinding.progressBar.setVisibility(View.GONE);
                            Toast.makeText(getContext(), "Terjadi kesalahan", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }
            });


            fragmentMovieBinding.rvMovies.setLayoutManager(new LinearLayoutManager(getContext()));
            fragmentMovieBinding.rvMovies.setHasFixedSize(true);
            fragmentMovieBinding.rvMovies.setAdapter(movieAdapter);
        }
    }
}