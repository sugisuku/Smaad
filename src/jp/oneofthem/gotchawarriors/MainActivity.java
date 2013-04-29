package jp.oneofthem.gotchawarriors;
import jp.gmotech.smaad.AdvSmaad;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends UnityPlayerActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("TAG", "Smaad onCreate called");
        //setContentView(R.layout.activity_main);
    }

    //public void fireGMO(boolean isFirstCheck, boolean isCheckMobileIdentity) {
    public static void fireGMO(boolean isFirstCheck, boolean isCheckMobileIdentity) {
    	Log.d("TAG", "fireGMO called");
    	Log.d("TAG", "isFirstCheck: " + isFirstCheck);
    	Log.d("TAG", "isCheckMobileIdentity: " + isCheckMobileIdentity);
        // AdvSmaadクラスのインスタンスを作る
    	Activity currentActivity = UnityPlayer.currentActivity;
        AdvSmaad advSmaad = new AdvSmaad(currentActivity);
        // 初回起動判定をライブラリで行う場合　true
        advSmaad.setCheck(isFirstCheck);
        advSmaad.checkMobileIdentity = isCheckMobileIdentity;
        // 弊社サーバへ通知
        advSmaad.doConvNetwork();
    }
}
