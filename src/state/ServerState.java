package state;

import server.*;
import shared.*;

/**
 * Created by Emily on 3/8/2016.
 */
public class ServerState {

    public ExecutionState execState;
    public GameState gameState;

    public ServerState() {
        execState = ExecutionState.LOGIN;
    }

}
