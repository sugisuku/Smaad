package jp.oneofthem.gotchawarriors;

import jp.gmotech.smaad.AdvSmaadInstallReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class GMOBroadcastReceiver extends BroadcastReceiver {
	@Override
	public void onReceive(Context context, Intent intent) {
		(new AdvSmaadInstallReceiver()).onReceive(context, intent);
		Log.d("TAG", "GMOBroadcastReceiver plugin called");
	}
}
