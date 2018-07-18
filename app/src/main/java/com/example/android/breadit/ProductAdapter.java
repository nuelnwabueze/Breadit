package com.example.android.breadit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by emmanuel on 7/5/18.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewholder> {

private Context mContext;
private List <Product> productList;



    public ProductAdapter(Context mContext, List<Product> productList) {
        this.mContext = mContext;
        this.productList = productList;
    }


    @Override
    public ProductViewholder onCreateViewHolder( ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.bread_list, null);
        return new ProductViewholder(view);
    }

    @Override
    public void onBindViewHolder( ProductViewholder viewholder, int position) {
        Product product = productList.get(position);
        Glide.with(mContext)
                .load(R.drawable.bread)
                .into(viewholder.imageView);

        viewholder.mTextview.setText(product.getNameOfBakery());
        viewholder.imageView.setImageDrawable(mContext.getResources().getDrawable(product.getImage()));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

     class ProductViewholder extends RecyclerView.ViewHolder{
        ImageView imageView;
        ImageView mImageview;
        TextView mTextview;

        public ProductViewholder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.book_bread);
            mImageview = itemView.findViewById(R.id.location);
            mTextview = itemView.findViewById(R.id.name_of_bread);
        }
    }
}
