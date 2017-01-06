package demo.interpolater.com.interpolaterdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.Button;

import demo.interpolater.com.interpolaterdemo.navigation.AlphaFragment;
import demo.interpolater.com.interpolaterdemo.navigation.RotateFragment;
import demo.interpolater.com.interpolaterdemo.navigation.ScaleFragment;
import demo.interpolater.com.interpolaterdemo.navigation.TranslateFragment;
import demo.interpolater.com.interpolaterdemo.utils.FragmentUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TabLayout mTabLayout;
    Fragment currentFragment;

    Button acceleraterDeceleraterBtn,acceleraterBtn,antipateBtn,antipateOvershotBtn;
    Button bounceBtn,cycleBtn,decelerateBtn,linearBtn,overshotBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabLayout =(TabLayout)findViewById(R.id.tablelay_id);
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.tabicn_selector).setText("alpha"));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.tabicn_selector).setText("rotate"));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.tabicn_selector).setText("scale"));
        mTabLayout.addTab(mTabLayout.newTab().setIcon(R.drawable.tabicn_selector).setText("translate"));
        currentFragment =FragmentUtils.replaceFragment(getSupportFragmentManager(), R.id.content_layout,AlphaFragment.class,null);
        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int  position=tab.getPosition();
                switchFragment(position);
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        initCtrls();
    }
    public  void  switchFragment(int  position){
        switch (position) {
            case 0:
                currentFragment = FragmentUtils.replaceFragment
                        (getSupportFragmentManager(), R.id.content_layout, AlphaFragment.class, null);

                break;
            case 1:
                currentFragment = FragmentUtils.replaceFragment
                        (getSupportFragmentManager(), R.id.content_layout, RotateFragment.class, null);

                break;
            case 2:
                currentFragment = FragmentUtils.replaceFragment
                        (getSupportFragmentManager(), R.id.content_layout, ScaleFragment.class, null);

                break;
            case 3:
                currentFragment = FragmentUtils.replaceFragment
                        (getSupportFragmentManager(), R.id.content_layout, TranslateFragment.class, null);
                break;
        }
    }
    private void initCtrls(){
        acceleraterDeceleraterBtn =(Button)findViewById(R.id.btn_AccelerateDecelerate);
        acceleraterBtn =(Button)findViewById(R.id.btn_Accelerate);
        decelerateBtn =(Button)findViewById(R.id.btn_Decelerate);
        antipateBtn =(Button)findViewById(R.id.btn_Anticipate);
        antipateOvershotBtn =(Button)findViewById(R.id.btn_AnticipateOvershoot);
        bounceBtn =(Button)findViewById(R.id.btn_Bounce);
        cycleBtn =(Button)findViewById(R.id.btn_Cycle);
        linearBtn =(Button)findViewById(R.id.btn_Linear);
        overshotBtn =(Button)findViewById(R.id.btn_Overshoot);

        acceleraterDeceleraterBtn.setOnClickListener(this);
        acceleraterBtn.setOnClickListener(this);
        decelerateBtn.setOnClickListener(this);
        antipateBtn.setOnClickListener(this);
        antipateOvershotBtn.setOnClickListener(this);
        bounceBtn.setOnClickListener(this);
        cycleBtn.setOnClickListener(this);
        linearBtn.setOnClickListener(this);
        overshotBtn.setOnClickListener(this);

    }



    @Override
    public void onClick(View v) {
        if (v.equals(acceleraterDeceleraterBtn)) {
            ((BaseFragment)currentFragment).startAcceleraterDeceleraterAnim();
        }else if (v.equals(acceleraterBtn)) {
            ((BaseFragment)currentFragment).startAcceleraterAnim();
        }else if (v.equals(decelerateBtn)) {
            ((BaseFragment)currentFragment).startDecelerateAnim();
        }else if (v.equals(antipateBtn)) {
            ((BaseFragment)currentFragment).startAntipateAnim();
        }else if (v.equals(antipateOvershotBtn)) {
            ((BaseFragment)currentFragment).startAntipateovershotAnim();
        }else if (v.equals(bounceBtn)) {
            ((BaseFragment)currentFragment).startBounceAnim();
        }else if (v.equals(cycleBtn)) {
            ((BaseFragment)currentFragment).startCycleAnim();
        }else if (v.equals(linearBtn)) {
            ((BaseFragment)currentFragment).startLinearAnim();
        }else if (v.equals(overshotBtn)) {
            ((BaseFragment)currentFragment).startOvershotAnim();
        }
    }
}
