package com.lemondev.weather.ui.adapters.ViewHolder;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.google.android.material.card.MaterialCardView;
import com.lemondev.weather.R;
import com.lemondev.weather.models.WeatherModel;

/**
 * 2022/2/23
 * Created by vibrantBobo
 */

public class AbstractCardViewHolder extends AbstractViewHolder {
    /**
     * 在子类里面调用该构造函数，传入各自的视图布局View对象
     * 相当于重写onCreateViewHolder return 的ViewHolder
     *
     * @param itemView
     */
    public AbstractCardViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    /***
     * 几何天气对viewholder处理方法
     * 除了第一张卡片item，其余卡片都应该加个cardView
     * 对第一张做特殊处理。
     *
     * dp to int
     * itemView.getContext().getResources().getDimensionPixelSize(R.dimen.mainCardDimen)
     *
     * @param weatherModel
     */
    @Override
    public void onBindView(@NonNull WeatherModel weatherModel) {
        super.onBindView(weatherModel);
        if (itemView instanceof MaterialCardView) {
            MaterialCardView cardView = (MaterialCardView) itemView;
            cardView.setRadius(100f);

            ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) cardView.getLayoutParams();
            params.setMargins(
                    itemView.getContext().getResources().getDimensionPixelSize(R.dimen.mainCardDimen),
                    0,
                    itemView.getContext().getResources().getDimensionPixelSize(R.dimen.mainCardDimen),
                    itemView.getContext().getResources().getDimensionPixelSize(R.dimen.mainCardDimen)
            );
            itemView.getBackground().setAlpha(180);
        }
    }
}
