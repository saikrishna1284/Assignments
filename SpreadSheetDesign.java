import java.util.*;

class SpreadSheet {
    private int[][] grid; 

    
    public SpreadSheet(int rows) {
        grid = new int[rows][26]; 
    }

    
    private int[] parseCell(String cell) {
        char colChar = cell.charAt(0); 
        int col = colChar - 'A'; 
        int row = Integer.parseInt(cell.substring(1)) - 1; 
        return new int[]{row, col};
    }

    
    public void setCell(String cell, int value) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = value;
    }

   
    public void resetCell(String cell) {
        int[] pos = parseCell(cell);
        grid[pos[0]][pos[1]] = 0;
    }

    
    public int getValue(String formula) {
        formula = formula.substring(1); 
        String[] parts = formula.split("\\+");
        int sum = 0;

        for (String part : parts) {
            if (Character.isLetter(part.charAt(0))) {
                
                int[] pos = parseCell(part);
                sum += grid[pos[0]][pos[1]];
            } else {
                
                sum += Integer.parseInt(part);
            }
        }
        return sum;
    }
}

public class SpreadSheetDesign {
    public static void main(String[] args) {
        
        SpreadSheet sheet = new SpreadSheet(3);

        System.out.println(sheet.getValue("=5+7")); 

        sheet.setCell("A1", 10);
        System.out.println(sheet.getValue("=A1+6")); 

        sheet.setCell("B2", 15);
        System.out.println(sheet.getValue("=A1+B2")); 

        sheet.resetCell("A1");
        System.out.println(sheet.getValue("=A1+B2")); 
    }
}
