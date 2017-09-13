package com.mgodak.sudoku.game;

/**
 * @author Mitchell Godak
 */

public class SudokuCell {
    //represents the value contained in the cell. 0 Represents an empty cell.
    private int mValue;
    //
    private boolean mEditable;
    private boolean mValid;

    /**
     * Default constructor for SudokuCell, which sets the cell to empty and editable.
     */
    public SudokuCell() {
        mValue = 0;
        mEditable = true;
        mValid = false;
    }

    /**
     * Constructor for a SudokuCell with the value set
     *
     * @param value
     * @param editable
     * @exception IllegalArgumentException thrown if value is less than 0 or greater than 9.
     */
    public SudokuCell(int value, boolean editable) {
        if (value < 0 || value > 9)
            throw new IllegalArgumentException("Parameter value must be between 0 and 9.");

        mValue = value;
        mEditable = editable;
        mValid = (value != 0);
    }

    /**
     * Getter method for mValue.
     *
     * @return the value contained in the cell
     */
    public int getValue() {
        return mValue;
    }

    /**
     * Changes the value stored in the cell to the input value, but only if the cell is editable.
     *
     * @param value the value to be set for mValue
     * @return true if the value was successfully changed, false if it was not
     */
    public boolean setValue(int value) {
        if (!mEditable)
            return false;

        mValue = value;
        return true;
    }

}
