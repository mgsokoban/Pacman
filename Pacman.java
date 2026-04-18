public class Pacman {

    private int row;
    private int col;
    private int score = 0;

    public int getScore() {
        return score;
    }

    public Pacman(int r, int c) {
        row = r;
        col = c;
    }

    public void move(char dir, GameBoard board) {
        int newR = row;
        int newC = col;

        if (dir == 'w') newR--;
        else if (dir == 's') newR++;
        else if (dir == 'a') newC--;
        else if (dir == 'd') newC++;

        // bounds check
        if (newR >= 0 && newR < board.getRows() &&
                newC >= 0 && newC < board.getCols() &&
                !board.isWall(newR, newC)) {

            if (board.isFood(newR, newC)) {
                score++;
                board.eatFood(newR, newC);
            }

            row = newR;
            col = newC;
        }
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
}
