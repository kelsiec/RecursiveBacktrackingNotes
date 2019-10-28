import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Maze {
    public static void solveMaze(
            char[][] maze, int row, int col) {

        while (maze[row][col] != '*') {
            if (maze[row + 1][col] == ' ' || maze[row + 1][col] == '*') { // Go up
                row++;
            } else if (maze[row][col + 1] == ' ' || maze[row][col + 1] == '*') { // Go right
                col++;
            } else if (maze[row - 1][col] == ' ' || maze[row - 1][col] == '*') { // Go down
                row--;
            } else if (maze[row][col - 1] == ' ' || maze[row][col - 1] == '*') { // Go down
                col--;
            }

            if (maze[row][col] == ' ') {
                maze[row][col] = '.';
            }
        }
    }

    public static void solveMazeRecursive(char[][] maze, int row, int col) {
        if (maze[row][col] != '*') {
            if (maze[row + 1][col] == ' ' || maze[row + 1][col] == '*') { // Go up
                row++;
            } else if (maze[row][col + 1] == ' ' || maze[row][col + 1] == '*') { // Go right
                col++;
            } else if (maze[row - 1][col] == ' ' || maze[row - 1][col] == '*') { // Go down
                row--;
            } else if (maze[row][col - 1] == ' ' || maze[row][col - 1] == '*') { // Go down
                col--;
            }

            if (maze[row][col] == ' ') {
                maze[row][col] = '.';
            }

            solveMazeRecursive(maze, row, col);
        }
    }

    public static void solveMazeBranching(
            char[][] maze, int row, int col) {

        while (maze[row][col] != '*') {
            if (maze[row + 1][col] == ' ' || maze[row + 1][col] == '*') { // Go up
                row++;
            } else if (maze[row][col + 1] == ' ' || maze[row][col + 1] == '*') { // Go right
                col++;
            } else if (maze[row - 1][col] == ' ' || maze[row - 1][col] == '*') { // Go down
                row--;
            } else if (maze[row][col - 1] == ' ' || maze[row][col - 1] == '*') { // Go down
                col--;
            }

            if (maze[row][col] == ' ') {
                maze[row][col] = '.';
            }
        }
    }


    public static void main(String[] args) {
//        char[][] maze = {
//                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
//                {'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
//                {'X', ' ', 'X', 'X', 'X', 'x', 'X', 'X', ' ', 'X'},
//                {'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', ' ', '*'},
//                {'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
//                {'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
//                {'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
//                {'X', ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
//                {'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
//                {'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
//                {' ', ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
//                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
//        };
//        solveMazeRecursive(maze, 10, 0);
//        for (int i = 0; i < maze.length; i++) {
//            System.out.println(Arrays.toString(maze[i]));
//        }

        char[][] branchingMaze = {
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'X'},
                {'X', ' ', 'X', 'X', 'X', 'x', 'X', 'X', ' ', 'X'},
                {'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', ' ', '*'},
                {'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', ' ', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', ' ', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', ' ', ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', ' ', 'X', 'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', ' ', ' ', 'X', 'X', 'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X'},
        };

        solveMazeBranching(branchingMaze, 10, 0);
        for (int i = 0; i < branchingMaze.length; i++) {
            System.out.println(Arrays.toString(branchingMaze[i]));
        }
    }
}
