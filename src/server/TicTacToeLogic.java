package server;

import javax.swing.*;

public class TicTacToeLogic {


    public TicTacToeLogic() {
    }

    public void checkWin(GameState state) {
        JLabel[] grid = state.getGrid();
        for (int i=2; i<grid.length; i++)
            if (grid[i-2].getIcon() != null && grid[i-1].getIcon() != null && grid[i].getIcon() != null)
                System.out.println("winner");
    }

}
