public class GameBoard {

    private char[][] map = {
            {'#','#','#','#','#','#','#','#','#'},
            {'#','.','.','.','#','.','.','.','#'},
            {'#','.','#','.','#','.','#','.','#'},
            {'#','.','#','.','.','.','#','.','#'},
            {'#','.','.','#',' ','#','.','.','#'},
            {'#','.','#','.','.','.','#','.','#'},
            {'#','.','#','.','#','.','#','.','#'},
            {'#','.','.','.','#','.','.','.','#'},
            {'#','#','#','#','#','#','#','#','#'}
    };

    public boolean isWall(int r, int c) {
        return map[r][c] == '#';
    }

    public boolean isFood(int r, int c) {
        return map[r][c] == '.';
    }

    public void eatFood(int r, int c) {
        map[r][c] = ' ';
    }

    public void printBoard(Pacman p, Ghost g) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {

                if (i == p.getRow() && j == p.getCol()) {
                    System.out.print('@');
                } else if (i == g.getRow() && j == g.getCol()) {
                    System.out.print('G');
                } else {
                    System.out.print(map[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("Score: " + p.getScore());
    }

    public boolean hasFood() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == '.') return true;
            }
        }
        return false;
    }

    public int getRows() {
        return map.length;
    }

    public int getCols() {
        return map[0].length;
    }
}
