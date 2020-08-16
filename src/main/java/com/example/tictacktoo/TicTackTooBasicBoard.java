package com.example.tictacktoo;

public class TicTackTooBasicBoard implements TicTackTooBoard {

    private Cell[][] cells;

    private int[] matchTracker;

    int boardDimention;

    public TicTackTooBasicBoard(int boardDimention){
        this.cells = new Cell[boardDimention][boardDimention];
        this.matchTracker = new int[2 * boardDimention + 2];
        this.boardDimention = boardDimention;
    }

    @Override
    public boolean isAlreadyStriked(int row, int column) {
        if (this.cells[row][column] == null)
            return false;
        else return this.cells[row][column].containsAnyPlayer();
    }

    private boolean isPlayerWon(Player player, int row, int column){

        return false;
    }

    private MOVE_STATUS updateMatchTrackerAndReturnStatus(int playerIndex, int row, int column){
        this.matchTracker[row] += playerIndex;
        if (this.matchTracker[row] == this.boardDimention * playerIndex)
            return MOVE_STATUS.WON;

        this.matchTracker[this.boardDimention + column] += playerIndex;
        if (this.matchTracker[this.boardDimention * (playerIndex -1) + column] == this.boardDimention * playerIndex)
            return MOVE_STATUS.WON;

        if ( row == column) {
            this.matchTracker[this.boardDimention * 2] += playerIndex;
            if (this.matchTracker[this.boardDimention * 2] == this.boardDimention * playerIndex)
                return MOVE_STATUS.WON;
        }

        if ( row + column == this.boardDimention) {
            this.matchTracker[this.boardDimention * 2 + 1] += playerIndex;
            if (this.matchTracker[this.boardDimention * 2 + 1] == this.boardDimention * playerIndex)
                return MOVE_STATUS.WON;
        }

        return MOVE_STATUS.VALID;
    }

    @Override
    public MOVE_STATUS strikeAt(int row, int column, Player player) {
        if (isAlreadyStriked(row, column))
            return MOVE_STATUS.INVALID;

        this.cells[row][column] = new Cell(player);

        return updateMatchTrackerAndReturnStatus(player.getPlayerId(), row, column);
    }
}
