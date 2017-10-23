import java.util.*;
import java.util.regex.*;

class Matrix {
    // Privates that will be used across the class methods
    private int[][] stringMatrix;
    private Pattern lines = Pattern.compile("\\n");
    private Pattern spaces = Pattern.compile(" ");
    
    Matrix(String input) {
        // construct an array of strings of rows from the input
        // rows are split on the newline character using the pattern
        String[] rowElements = this.lines.split(input);
        
        // count the rows to loop through the array
        int rows = rowElements.length;
        
        // set the length of the class' private string-matrix 
        this.stringMatrix = new int[rows][];
        
        // loop through each row and create an arrays of column values
        for (int i = 0; i < rows; i++) {
            // columns are split on spaces
            String[] colElements = spaces.split(rowElements[i]);
            int columns = colElements.length;
            this.stringMatrix[i] = new int[columns];
            // inner-loop through the columns of each row
            for (int j = 0; j < columns; j++) {
                   int element = Integer.parseInt(colElements[j]);
                   this.stringMatrix[i][j] = element;
            }
        }
    }

    int[] getRow(int rowNumber) {
        // only return the first dimension of the array, easy
        return stringMatrix[rowNumber];
    }

    int[] getColumn(int columnNumber) {
        // build a column array (2nd dimension) by looping through
        // the class stringMatrix and then return it
        int columns = this.stringMatrix.length;
        int[] column = new int[columns];
        for(int i = 0; i < columns; i++) {
            column[i] = this.stringMatrix[i][columnNumber];
        }
        return column;
    }

    int getRowsCount() {
        // the length of the first dimension of the class' stringMatrix 
        // represents the number of rows
        return this.stringMatrix.length;
    }

    int getColumnsCount() {
        // each row has the same number of columns, so just return the length
        // of the first row
        return this.stringMatrix[0].length;
    }
}
