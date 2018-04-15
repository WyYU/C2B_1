package com.example.dell.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dell on 2018/3/30 0030.
 */

public class SquareAdapter extends RecyclerView.Adapter<SquareAdapter.ViewHolder> implements View.OnClickListener {
    private List<Square> mSquareList;
    private OnItemClickListener mOnItemClickListener = null;
    public interface OnItemClickListener{
        void onItemClick(View v, int position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView squareImage;
        TextView squareName;
        TextView squareaddress;
        TextView squareprice;
        View fruitView;
        public  ViewHolder(View view){
            super(view);
            fruitView=view;
            squareImage=(ImageView)view.findViewById(R.id.fruit_image);
            squareName=(TextView)view.findViewById(R.id.fruit_name);
            squareaddress=(TextView)view.findViewById(R.id.address);
            squareprice=(TextView)view.findViewById(R.id.price);
        }
    }
    public SquareAdapter(List<Square> squareList){
        mSquareList = squareList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup,  int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fruit_item, viewGroup, false);
        ViewHolder vh = new ViewHolder(view);
        //将创建的View注册点击事件
        view.setOnClickListener(this);
        return vh;
    }

    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            //注意这里使用getTag方法获取position
            mOnItemClickListener.onItemClick(v,(int)v.getTag());
        }
    }

//    @Override
//    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
//        final ViewHolder holder=new ViewHolder(view);
//       private OnItemClickListener mItemClickListener;
//        holder.fruitView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int pos=holder.getAdapterPosition();
//                Square square = mSquareList.get(pos);
//                Toast.makeText(v.getContext(),"you click view "+ square.getName(),Toast.LENGTH_SHORT).show();
//            }
//        });
//        holder.squareImage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int pos=holder.getAdapterPosition();
//                Square square = mSquareList.get(pos);
//                Toast.makeText(v.getContext(),"you click view "+ square.getName(),Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        return holder;
//    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Square square = mSquareList.get(position);
        holder.squareImage.setImageResource(square.getImageid());
        holder.squareName.setText(" "+ square.getName());
        holder.squareaddress.setText("地址："+ square.getAddress());
        holder.squareprice.setText("预计价格:"+square.getPrice()+"元");
        //将position保存在itemView的Tag中，以便点击时进行获取
        holder.itemView.setTag(position);
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }



    @Override
    public int getItemCount() {
        return mSquareList.size();
    }

}
