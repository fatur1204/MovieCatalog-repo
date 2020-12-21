package com.fathur.moviecatalog.ui.tvshow;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.fathur.moviecatalog.R;
import com.fathur.moviecatalog.data.source.local.entity.TvShowEntity;
import com.fathur.moviecatalog.databinding.ItemsTvshowBinding;
import com.fathur.moviecatalog.ui.detail.DetailMovieActivity;

import java.util.ArrayList;
import java.util.List;

public class TVShowAdapter extends PagedListAdapter<TvShowEntity, TVShowAdapter.TVShowViewHolder> {
    private static final String TAG = TVShowAdapter.class.getSimpleName();
    private static DiffUtil.ItemCallback<TvShowEntity> DIFF_CALLBACK =
            new DiffUtil.ItemCallback<TvShowEntity>() {
                @Override
                public boolean areItemsTheSame(@NonNull TvShowEntity oldItem, @NonNull TvShowEntity newItem) {
                    return oldItem.getTvid().equals(newItem.getTvid());
                }

                @SuppressLint("DiffUtilEquals")
                @Override
                public boolean areContentsTheSame(@NonNull TvShowEntity oldItem, @NonNull TvShowEntity newItem) {
                    return oldItem.equals(newItem);
                }
            };
    private final List<TvShowEntity> listtvshow = new ArrayList<>();
    private final TVShowFragmentCallback callback;


    public TVShowAdapter(TVShowFragmentCallback callback) {
        super(DIFF_CALLBACK);
        this.callback = callback;
    }

    @NonNull
    @Override
    public TVShowAdapter.TVShowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemsTvshowBinding binding = ItemsTvshowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new TVShowViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull TVShowAdapter.TVShowViewHolder holder, int position) {
        TvShowEntity tvShowEntity = getItem(position);
        if (tvShowEntity != null) {
            holder.bind(tvShowEntity);
        }

    }

    public class TVShowViewHolder extends RecyclerView.ViewHolder {
        private ItemsTvshowBinding binding;

        public TVShowViewHolder(ItemsTvshowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        void bind(TvShowEntity tvShowEntity) {
            binding.tvItemTitle.setText(tvShowEntity.getTitle());
            binding.tvItemDate.setText(tvShowEntity.getWriteFilm());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(itemView.getContext(), DetailMovieActivity.class);
                    intent.putExtra(DetailMovieActivity.EXTRA_VAL, "1");
                    intent.putExtra(DetailMovieActivity.EXTRA_MOVIES, tvShowEntity.getTvid());
                    itemView.getContext().startActivity(intent);
                }
            });
            binding.imgShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    callback.onShareClick(tvShowEntity);
                }
            });
            Glide.with(itemView.getContext())
                    .load(tvShowEntity.getImagePath())
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading).error(R.drawable.ic_error))
                    .into(binding.imgPoster);
        }
    }
}
