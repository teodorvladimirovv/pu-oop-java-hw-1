package Game;

import Piece.GreenGuard;
import Piece.GreenLeader;
import Piece.YellowGuard;
import Piece.YellowLeader;

import javax.swing.*;
import java.awt.*;


public class GameBoard extends JFrame {


    public GameBoard() {


        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);

        for (int col = 0; col < 5; col++) {
            for (int row = 0; row < 5; row++) {

                GameTile tile = new GameTile(row * 100, col * 100);
                tile.render(g);

                // Yellow Guards
                for(int r = 0; r < 4; r++){
                    YellowGuard yellowGuard = new YellowGuard(30,(r * 100) + 130);
                    yellowGuard.render(g);
                }
                // Yellow Leader
                YellowLeader yellowLeader = new YellowLeader(25,25);
                yellowLeader.render(g);

                // Green Guards
                for(int c = -1; c < 3 ; c++){
                    GreenGuard greenGuard = new GreenGuard(430,(c*100) + 130);
                    greenGuard.render(g);
                }
                //Green Leader
                GreenLeader greenLeader = new GreenLeader(425,425);
                greenLeader.render(g);


            }

            g.drawOval(230, 230, 41, 41);
            g.setColor(Color.GRAY);
            g.fillOval(230, 230, 42, 42);

        }
    }
}
