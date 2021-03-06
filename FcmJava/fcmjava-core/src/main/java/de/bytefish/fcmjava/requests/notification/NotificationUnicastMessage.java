// Copyright (c) Philipp Wagner. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package de.bytefish.fcmjava.requests.notification;

import com.fasterxml.jackson.annotation.JsonProperty;
import de.bytefish.fcmjava.model.options.FcmMessageOptions;
import de.bytefish.fcmjava.requests.FcmUnicastMessage;

public class NotificationUnicastMessage extends FcmUnicastMessage<NotificationPayload> {

    private final NotificationPayload notificationPayload;

    public NotificationUnicastMessage(FcmMessageOptions options, String to, NotificationPayload notificationPayload) {
        super(options, to);

        this.notificationPayload = notificationPayload;
    }

    @Override
    @JsonProperty("notification")
    public NotificationPayload getPayload() {
        return this.notificationPayload;
    }

}
