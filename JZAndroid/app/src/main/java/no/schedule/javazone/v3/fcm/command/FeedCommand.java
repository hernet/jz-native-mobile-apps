/*
 * Copyright 2017 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package no.schedule.javazone.v3.fcm.command;

import android.content.Context;

import no.schedule.javazone.v3.fcm.FcmCommand;

import static no.schedule.javazone.v3.util.LogUtils.LOGI;
import static no.schedule.javazone.v3.util.LogUtils.makeLogTag;

/**
 * Received when remote Feed is updated.
 */
public class FeedCommand extends FcmCommand {
    private static final String TAG = makeLogTag(FeedCommand.class);

    @Override
    public void execute(Context context, String type, String extraData) {
        LOGI(TAG, "New Feed message received");
        // FeedState.getInstance().updateNewFeedItem(context, true);
    }
}
