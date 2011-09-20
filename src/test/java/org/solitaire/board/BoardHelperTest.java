package org.solitaire.board;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Tobias
 * Date: 17.09.2011
 */
public class BoardHelperTest {

    private Board board;

    @Before
    public void createBoard() {
        this.board = BoardFactory.createBoard("english");
    }

    @Test
    public void testPositionToString() {
        String positionString =
                "    O O O     \n" +
                "    O O O     \n" +
                "O O O O O O O \n" +
                "O O O * O O O \n" +
                "O O O O O O O \n" +
                "    O O O     \n" +
                "    O O O     \n";
        assertEquals(positionString, BoardHelper.toString(board, board.getStartPosition()));
    }

    @Test
    public void testNumberOfPins() {
        assertEquals(32,BoardHelper.getNumberOfPins(this.board.getStartPosition()));
        assertEquals(0,BoardHelper.getNumberOfPins(0L));

    }
}
