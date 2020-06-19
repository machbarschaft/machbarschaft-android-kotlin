package jetzt.machbarschaft.android.services

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MessagingService : FirebaseMessagingService() {
    private val LOG_TAG = "MessagingService"

    override fun onMessageReceived(remoteMessage: RemoteMessage) {
        // TODO handle message
    }

    override fun onNewToken(token: String) {
        Log.d(LOG_TAG, "New token: $token")

        // TODO send new token to server
    }
}