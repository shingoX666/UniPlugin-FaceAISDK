package com.faceAI.demo.UVCCamera.search;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.faceAI.demo.R;


/**
 * 演示UVC协议外接摄像头人脸搜索，
 * 使用宽动态（人脸搜索须大于105DB）抗逆光摄像头；保持镜头干净（用纯棉布擦拭油污）
 * 怎么提高人脸搜索识别系统的准确度？https://mp.weixin.qq.com/s/G2dvFQraw-TAzDRFIgdobA
 */
public class FaceSearch_UVCCameraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uvc_camera_faceai_activity);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FaceSearch_UVCCameraFragment myUVCCameraFragment = new FaceSearch_UVCCameraFragment();
        fragmentTransaction.replace(R.id.fragment_container, myUVCCameraFragment);

        fragmentTransaction.commit();
    }


}