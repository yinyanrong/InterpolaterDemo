package demo.interpolater.com.interpolaterdemo;

import android.support.v4.app.Fragment;
import android.view.animation.Animation;

/**
 * Created by My on 2017/1/5.
 */

public abstract class BaseFragment extends Fragment {

    public abstract  void  startAcceleraterDeceleraterAnim();
    public abstract  void  startAcceleraterAnim();
    public abstract  void  startDecelerateAnim();
    public abstract  void  startAntipateAnim();
    public abstract  void  startAntipateovershotAnim();
    public abstract  void  startBounceAnim();
    public abstract  void  startCycleAnim();
    public abstract  void  startLinearAnim();
    public abstract  void  startOvershotAnim();


}
