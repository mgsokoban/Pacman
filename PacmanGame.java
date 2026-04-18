import java.util.Scanner;

public class PacmanGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        GameBoard board = new GameBoard();
        Pacman pacman = new Pacman(4, 4);
        Ghost ghost = new Ghost(1, 1);

        while (true) {
            board.printBoard(pacman, ghost);

            System.out.print("Move (W/A/S/D): ");
            char move = Character.toLowerCase(input.next().charAt(0));

            pacman.move(move, board);

            ghost.move(board);

            // lose condition
            if (pacman.getRow() == ghost.getRow() &&
                    pacman.getCol() == ghost.getCol()) {
                System.out.println("Game Over!");
                break;
            }

            // win condition
            if (!board.hasFood()) {
                System.out.println("You Win!");
                break;
            }
        }

        input.close();
    }
}
