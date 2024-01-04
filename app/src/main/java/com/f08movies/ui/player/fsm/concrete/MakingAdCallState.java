package com.f08movies.ui.player.fsm.concrete;

import androidx.annotation.NonNull;

import com.f08movies.ui.player.fsm.BaseState;
import com.f08movies.ui.player.fsm.Input;
import com.f08movies.ui.player.fsm.State;
import com.f08movies.ui.player.fsm.callback.AdInterface;
import com.f08movies.ui.player.fsm.callback.RetrieveAdCallback;
import com.f08movies.ui.player.fsm.concrete.factory.StateFactory;
import com.f08movies.ui.player.fsm.state_machine.FsmPlayer;
import com.f08movies.data.model.ads.AdRetriever;
import com.f08movies.ui.player.utilities.ExoPlayerLogger;


/**
 * Created by allensun on 7/31/17.
 */
public class MakingAdCallState extends BaseState {

    @Override
    public State transformToState(@NonNull Input input, @NonNull StateFactory factory) {
        if (input == Input.AD_RECEIVED) {
            return factory.createState(ReceiveAdState.class);
        } else if (input == Input.EMPTY_AD) {
            return null;
        } else if (input == Input.MAKE_AD_CALL) {
            return factory.createState(MakingAdCallState.class);
        } else if (input == Input.PRE_ROLL_AD_RECEIVED) {
            return factory.createState(AdPlayingState.class);
        }

        return null;
    }

    @Override
    public void performWorkAndUpdatePlayerUI(@NonNull FsmPlayer fsmPlayer) {
        super.performWorkAndUpdatePlayerUI(fsmPlayer);

        if (isNull(fsmPlayer)) {
            return;
        }

        fetchAd(fsmPlayer.getAdServerInterface(), fsmPlayer.getAdRetriever(), fsmPlayer);

        //in the MadingAdCallState, no UI need to be updated.

    }

    private void fetchAd(AdInterface adInterface, AdRetriever retriever, RetrieveAdCallback callback) {
        if (adInterface != null && retriever != null && callback != null) {
            adInterface.fetchAd(retriever, callback);
        } else {
            ExoPlayerLogger.e("TAG", "fetchAd fail, adInterface or AdRetriever is empty");
        }
    }
}