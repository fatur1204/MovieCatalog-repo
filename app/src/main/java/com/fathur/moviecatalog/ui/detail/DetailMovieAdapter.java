package com.fathur.moviecatalog.ui.detail;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.fathur.moviecatalog.data.source.local.entity.MovieEntity;
import com.fathur.moviecatalog.data.source.local.entity.TvShowEntity;
import com.fathur.moviecatalog.databinding.ItemsModuleListBinding;

import java.util.ArrayList;
import java.util.List;

public class DetailMovieAdapter extends RecyclerView.Adapter<DetailMovieAdapter.DetailMovieViewHolder> {
    private final List<MovieEntity> listMovieDetail = new ArrayList<>();
    private final List<TvShowEntity> tvShowEntityList = new ArrayList<>();

    public void setMovieDetail(List<MovieEntity> moviesDetail) {
        if (moviesDetail == null) return;
        this.listMovieDetail.clear();
        this.listMovieDetail.addAll(moviesDetail);
    }

    public void setTVShowDetail(List<TvShowEntity> tvShowDetail) {
        if (tvShowDetail == null) return;
        this.tvShowEntityList.clear();
        this.tvShowEntityList.addAll(tvShowDetail);
    }

    @NonNull
    @Override
    public DetailMovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemsModuleListBinding binding = ItemsModuleListBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new DetailMovieViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailMovieViewHolder holder, int position) {
        MovieEntity movieEntity = listMovieDetail.get(position);
        TvShowEntity tvShowEntity = tvShowEntityList.get(position);
        holder.bind(movieEntity);
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class DetailMovieViewHolder extends RecyclerView.ViewHolder {
        private final ItemsModuleListBinding binding;


        DetailMovieViewHolder(ItemsModuleListBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(MovieEntity movies) {
            binding.textModuleTitle.setText(movies.getTitle());
        }
    }
}
