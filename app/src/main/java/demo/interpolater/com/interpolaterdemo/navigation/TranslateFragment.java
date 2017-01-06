package demo.interpolater.com.interpolaterdemo.navigation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import demo.interpolater.com.interpolaterdemo.BaseFragment;
import demo.interpolater.com.interpolaterdemo.R;

/**
 * Created by My on 2017/1/4.
 */

public class TranslateFragment extends BaseFragment {
    TextView textView;
    Animation acceleraterDeceleraterAnim,acceleraterAnim,antipateAnim,antipateovershotAnim;
    Animation bounceAnim,cycleAnim,decelerateAnim,linearAnim,overshotAnim;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View  view  =  inflater.inflate(R.layout.translate_fragment,container,false);
        textView=(TextView) view.findViewById(R.id.textView4);
        initAnim();
        return  view;
    }

    private void initAnim(){
        acceleraterDeceleraterAnim = AnimationUtils.loadAnimation(getContext(), R.anim.translate_anim_accelerater_decelerate);
        acceleraterAnim = AnimationUtils.loadAnimation(getContext(), R.anim.translate_anim_accelerater);
        decelerateAnim = AnimationUtils.loadAnimation(getContext(), R.anim.translate_anim_decelerate);
        antipateAnim = AnimationUtils.loadAnimation(getContext(), R.anim.translate_anim_anticipate);
        antipateovershotAnim = AnimationUtils.loadAnimation(getContext(), R.anim.translate_anim_anticipate_overshot);
        bounceAnim = AnimationUtils.loadAnimation(getContext(), R.anim.translate_anim_bounce);
        cycleAnim = AnimationUtils.loadAnimation(getContext(), R.anim.translate_anim_cycle);
        linearAnim = AnimationUtils.loadAnimation(getContext(), R.anim.translate_anim_linear);
        overshotAnim = AnimationUtils.loadAnimation(getContext(), R.anim.translate_anim_overshot);
    }
    @Override
    public void startAcceleraterDeceleraterAnim() {
        textView.setText("在动画开始与介绍的地方速率改变比较慢，在中间的时候加速");
        textView.startAnimation(acceleraterDeceleraterAnim);
    }

    @Override
    public void startAcceleraterAnim() {
        textView.setText("在动画开始的地方速率改变比较慢，然后开始加速");
        textView.startAnimation(acceleraterAnim);
    }

    @Override
    public void startDecelerateAnim() {
        textView.setText("在动画开始的地方快然后慢");
        textView.startAnimation(decelerateAnim);

    }

    @Override
    public void startAntipateAnim() {
        textView.setText(" 开始的时候向后然后向前加速");

        textView.startAnimation(antipateAnim);

    }

    @Override
    public void startAntipateovershotAnim() {
        textView.setText("开始的时候向后然后向前甩一定值后返回最后的值");

        textView.startAnimation(antipateovershotAnim);

    }

    @Override
    public void startBounceAnim() {
        textView.setText(" 动画结束的时候弹起");

        textView.startAnimation(bounceAnim);

    }

    @Override
    public void startCycleAnim() {
        textView.setText("动画循环播放特定的次数，速率改变沿着正弦曲线");

        textView.startAnimation(cycleAnim);

    }

    @Override
    public void startLinearAnim() {
        textView.setText("以常量速率改变");

        textView.startAnimation(linearAnim);

    }

    @Override
    public void startOvershotAnim() {
        textView.setText(" 向前甩一定值后再回到原来位置");

        textView.startAnimation(overshotAnim);

    }
}