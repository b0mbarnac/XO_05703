import controller.WinnerController_Dyutin_Gayazov;
import model.Figure;
import model.Game;
import model.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestWinnerController {
    @Test
    public void testWhoseWin() {
        Player player1 = new Player(Figure.X, "Player One");
        Player player2 = new Player(Figure.O, "Player Two");
        Game game = new Game(player1, player2, 10, 10);

        Assertions.assertEquals(null, WinnerController_Dyutin_Gayazov.WhoseWin(game));
        ////////////////////////////////////////////////////////////////////////
        int[][] field = new int[][]{
                {1, 1, 1, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        game.getField().setField(field);
        Assertions.assertEquals(player1, WinnerController_Dyutin_Gayazov.WhoseWin(game));
        //////////////////////////////////////////////////////////////////////
        field = new int[][]{
                {-1, -1, -1, -1, -1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        game.getField().setField(field);
        Assertions.assertEquals(player2, WinnerController_Dyutin_Gayazov.WhoseWin(game));
        ///////////////////////////////////////////////////////////////////
        field = new int[][]{
                {-1, -1, -1, 1, 1, 1, 0, 0, 0, 0},
                {0, -1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, -1, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, -1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, -1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        game.getField().setField(field);
        Assertions.assertEquals(player2, WinnerController_Dyutin_Gayazov.WhoseWin(game));
        /////////////////////////////////////////////////////////////////////
        field = new int[][]{
                {-1, -1, -1, -1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        game.getField().setField(field);
        Assertions.assertEquals(player1, WinnerController_Dyutin_Gayazov.WhoseWin(game));
        ///////////////////////////////////////////////////////////////////
        field = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0}
        };
        game.getField().setField(field);
        Assertions.assertEquals(player1, WinnerController_Dyutin_Gayazov.WhoseWin(game));
        ///////////////////////////////////////////////////////////////////////
        field = new int[][]{
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        game.getField().setField(field);
        int[][] field1 = Arrays.copyOf(game.getField().getField(), game.getField().getField().length);
        for (int i = 0; i < field1.length; i++) {
            for (int j = 0; j < field1[0].length; j++) {
                System.out.print(field1[i][j] + " ");
            }
            System.out.println(" ");
        }
        Assertions.assertEquals(player1, WinnerController_Dyutin_Gayazov.WhoseWin(game));
    }

}

