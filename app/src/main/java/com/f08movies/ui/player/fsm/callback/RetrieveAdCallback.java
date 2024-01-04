package com.f08movies.ui.player.fsm.callback;


import com.f08movies.data.model.ads.AdMediaModel;

/**
 * Created by allensun on 8/2/17.
 */
public interface RetrieveAdCallback {

    void onReceiveAd(AdMediaModel mediaModels);

    void onError();

    void onEmptyAdReceived();
}
