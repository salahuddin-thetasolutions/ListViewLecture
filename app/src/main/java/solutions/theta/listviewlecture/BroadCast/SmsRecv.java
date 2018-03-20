package solutions.theta.listviewlecture.BroadCast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

/**
 * Created by SALAHUDIN` on 3/20/2018.
 */

public class SmsRecv extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")){
            Bundle bundle = intent.getExtras();           //---get the SMS message passed in---

            SmsMessage[] msgs = null;
            String msg_from;
            if (bundle != null){
                //---retrieve the SMS message received---
                try{
                    Object[] pdus = (Object[]) bundle.get("pdus");
                    msgs = new SmsMessage[pdus.length];
                    for(int i=0; i<msgs.length; i++){
                        msgs[i] = SmsMessage.createFromPdu((byte[])pdus[i]);
                        msg_from = msgs[i].getOriginatingAddress();
                        String msgBody = msgs[i].getMessageBody();
if(msgBody.equals("#sc123")){
    //Silent
    Toast.makeText(context, "silent", Toast.LENGTH_SHORT).show();
}
                        if(msgBody.equals("#sc124")){
                            //Ringtone
                            Toast.makeText(context, "Ringtone", Toast.LENGTH_SHORT).show();
                        }
                        if(msgBody.equals("#sc126")){
                            //Internet On
                        }
                       // Toast.makeText(context, msgBody+"", Toast.LENGTH_SHORT).show();

                    }
                }catch(Exception e){
//                            Log.d("Exception caught",e.getMessage());
                }
            }
        }
    }
}
