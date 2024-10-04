package BackTracking;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class mazePathcount {
    public static void main(String[] args) {
        // System.out.println(path(3, 3));
    //    System.out.println(path("",3,3));
        // System.out.println(pathDiagonal("", 2, 3));
        boolean[][] matrix = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        System.out.println(mazeRestrictions("", matrix, 0, 0));
    }

    static int pathCount(int row , int col){
        if(row == 1 || col == 1){
            return 1;
        }

        int left = pathCount(row-1,col);
        int right = pathCount(row,col - 1);

        return left + right;
    }

    static ArrayList<String> path(String p, int row, int col){
        if(row == 1 && col == 1){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(row > 1){
            ans.addAll(path(p + 'D', row -1, col));
        }
        if(col > 1){
            ans.addAll(path(p + 'R', row, col -1));
        }
        return ans;


    }

    static ArrayList<String> pathDiagonal(String p, int row, int col){
        if(row == 1 && col == 1){
           ArrayList<String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(row > 1 && col > 1){
            ans.addAll(pathDiagonal(p + 'D', row -1, col - 1));
        }

        if(row > 1){
            ans.addAll(pathDiagonal(p + 'V', row -1, col));
        }
        if(col > 1){
            ans.addAll(pathDiagonal(p + 'H', row, col -1));
        }
        return ans;
    }

    // static ArrayList<String> mazeRestrictions(String p, boolean[][] maze, int row, int col){
    //     if(row == maze.length - 1 && col == maze[0].length -1){
    //        ArrayList<String> list = new ArrayList<>();
    //        list.add(p);
    //        return list;
    //     }

    //     ArrayList<String> ans = new ArrayList<>();
    //     if(maze[row][col] == false){
    //         return new ArrayList<>();
    //     }

    //     if(row < maze.length - 1){
    //         ans.addAll(mazeRestrictions(p + 'V',maze, row  + 1, col));
    //     }
    //     if(col < maze[0].length - 1){
    //         ans.addAll(mazeRestrictions(p + 'H',maze,row, col + 1));
    //     }
    //     return ans;
    // }
}
