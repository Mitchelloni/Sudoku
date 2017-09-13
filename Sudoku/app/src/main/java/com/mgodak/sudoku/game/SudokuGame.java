package com.mgodak.sudoku.game;

/**
 * @author Mitchell Godak
 */
public class SudokuGame {
    private int mTime;
    private SudokuCell[][] mCells;
    private int[][] mSolution;

    /**
     * Constructor for a SudokuGame object that with all cells set to 0 ie. empty
     */
    public SudokuGame() {
    }

    /**
     * Constructor for a SudokuGame object that generates a SudokuGame object with the
     *
     * @param cells the cells array to be copied into the SudoGame object
     * @exception ArrayIndexOutOfBoundsException if the input 2d array is smaller than 9x9
     */
    public SudokuGame(SudokuCell[][] cells) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                mCells[i][j] = cells[i][j];
            }
        }

        mTime = 0;
        findSolution();
    }

    /**
     * Getter method for mTime.
     *
     * @return the value of mTime
     */
    public int getTime() {
        return mTime;
    }

    /**
     * Finds the solution to the current sudoku board and stores the answer in mSolution.
     *
     * @return true if the solution was found, false if no solution was found
     */
    public boolean findSolution() {
        //
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                mSolution[i][j] = mCells[i][j].getValue();
            }
        }


        return true;
    }
}
