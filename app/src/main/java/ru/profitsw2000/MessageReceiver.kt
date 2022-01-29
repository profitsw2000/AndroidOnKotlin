package ru.profitsw2000

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.NotificationCompat
import ru.profitsw2000.androidonkotlin.R

class MessageReceiver : BroadcastReceiver() {

    private val MESSAGE_NAME = "MOVIE TITLE"
    private var messageID = 0

    override fun onReceive(context: Context, intent: Intent) {
        var message = intent.getStringExtra(MESSAGE_NAME);
        if (message == null){
            message = ""
        }

        Log.d(TAG, message)

        val builder = NotificationCompat.Builder(context, "2")
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setContentTitle("Movie title")
                    .setContentText(message)
        val notificationManager= context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.notify(messageID++, builder.build());
    }
}