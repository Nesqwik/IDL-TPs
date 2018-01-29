package wator;

import core.agents.Agent;
import core.misc.Config;
import core.misc.Environment;
import core.misc.Logger;
import core.misc.SMA;

public class FishAgentAction extends FishAgent {

    public FishAgentAction(Environment env) {
        super(env);
    }


    @Override
    public void decide() {
        super.decide();

        Agent[][] moore = environment.getMoore(this);

        boolean hasReproduct = this.reproductIfCan(moore);
        if (!hasReproduct) {
            moveIfCan(moore);
        }
    }
}
