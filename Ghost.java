public class Ghost {

    private int row;
    private int col;

    public Ghost(int r, int c) {
        row = r;
        col = c;
    }

    public void move(GameBoard board) {
        int dir = (int)(Math.random() * 4);
        int jump = (int) (Math.random() * 6);

        int newR = row;
        int newC = col;

        if (dir == 0) newR -= jump;
        else if (dir == 1) newR += jump;
        else if (dir == 2) newC -= jump;
        else if (dir == 3) newC += jump;

        if (newR >= 0 && newR < board.getRows() &&
                newC >= 0 && newC < board.getCols() &&
                !board.isWall(newR, newC)) {

            row = newR;
            col = newC;
        }
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
}
