package com.akbar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrmMain {
    private JButton bSimpan;
    private JPanel panelMain;
    private JButton b1;
    private PuzzleState state;

    public PuzzleState getState() {
        return state;
    }

    public void setState(PuzzleState state) {
        this.state = state;
    }

    public FrmMain() {

        bSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, "Hello World!");
            }
        });
    }

    public static void main(String[] args) {
        // Init GUI
        JFrame frame = new JFrame("FrmMain");
//        frame.setContentPane(new FrmMain().panelMain);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6,5,5,5));

        JButton b1 = new JButton("b1");
        JButton b2 = new JButton("b2");
        JButton b3 = new JButton("b3");
        JButton b4 = new JButton("b4");
        JButton b5 = new JButton("b5");

        JButton b6 = new JButton("b6");
        JButton b7 = new JButton("b7");
        JButton b8 = new JButton("b8");
        JButton b9 = new JButton("b9");
        JButton b10 = new JButton("b10");

        JButton b11 = new JButton("b11");
        JButton b12 = new JButton("b12");
        JButton b13 = new JButton("b13");
        JButton b14 = new JButton("b14");
        JButton b15 = new JButton("b15");

        JButton b16 = new JButton("b16");
        JButton b17 = new JButton("b17");
        JButton b18 = new JButton("b18");
        JButton b19 = new JButton("b19");
        JButton b20 = new JButton("b20");

        JButton b21 = new JButton("b21");
        JButton b22 = new JButton("b22");
        JButton b23 = new JButton("b23");
        JButton b24 = new JButton("b24");
        JButton b0 = new JButton("b0");

        //Button Aksi
        JButton bShuffle = new JButton("Shuffle");
        JButton bSolve = new JButton("Solve");
        JButton bPrev = new JButton("Previous");
        JButton bNext = new JButton("Next");
        JButton bFill = new JButton("-");
        bPrev.setEnabled(false);
        bNext.setEnabled(false);
        bSolve.setEnabled(false);

        //
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);

        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b10);

        frame.add(b11);
        frame.add(b12);
        frame.add(b13);
        frame.add(b14);
        frame.add(b15);

        frame.add(b16);
        frame.add(b17);
        frame.add(b18);
        frame.add(b19);
        frame.add(b20);

        frame.add(b21);
        frame.add(b22);
        frame.add(b23);
        frame.add(b24);
        frame.add(b0);

        frame.add(bShuffle);
        frame.add(bSolve);
        frame.add(bPrev);
        frame.add(bNext);
        frame.add(bFill);

//        frame.pack();
        frame.setVisible(true);

        final PuzzleState[] myState = {randomPuzzle(15)};

        List<Action> actions1APerformed = new ArrayList<Action>();
        //Set Listener
        bShuffle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                bPrev.setEnabled(false);
                bNext.setEnabled(false);
                bSolve.setEnabled(true);

                //Clear histori aksi yg dieksekusi
                actions1APerformed.clear();

                //Inisialisasi Puzzle
                myState[0] = randomPuzzle(20);
                b1.setText(String.valueOf(myState[0].tiles[0][0]));
                b1.setBackground(myState[0].tiles[0][0] == 0 ? Color.YELLOW : null);
                b2.setText(String.valueOf(myState[0].tiles[0][1]));
                b2.setBackground(myState[0].tiles[0][1] == 0 ? Color.YELLOW : null);
                b3.setText(String.valueOf(myState[0].tiles[0][2]));
                b3.setBackground(myState[0].tiles[0][2] == 0 ? Color.YELLOW : null);
                b4.setText(String.valueOf(myState[0].tiles[0][3]));
                b4.setBackground(myState[0].tiles[0][3] == 0 ? Color.YELLOW : null);
                b5.setText(String.valueOf(myState[0].tiles[0][4]));
                b5.setBackground(myState[0].tiles[0][4] == 0 ? Color.YELLOW : null);

                b6.setText(String.valueOf(myState[0].tiles[1][0]));
                b6.setBackground(myState[0].tiles[1][0] == 0 ? Color.YELLOW : null);
                b7.setText(String.valueOf(myState[0].tiles[1][1]));
                b7.setBackground(myState[0].tiles[1][1] == 0 ? Color.YELLOW : null);
                b8.setText(String.valueOf(myState[0].tiles[1][2]));
                b8.setBackground(myState[0].tiles[1][2] == 0 ? Color.YELLOW : null);
                b9.setText(String.valueOf(myState[0].tiles[1][3]));
                b9.setBackground(myState[0].tiles[1][3] == 0 ? Color.YELLOW : null);
                b10.setText(String.valueOf(myState[0].tiles[1][4]));
                b10.setBackground(myState[0].tiles[1][4]== 0 ? Color.YELLOW : null);

                b11.setText(String.valueOf(myState[0].tiles[2][0]));
                b11.setBackground(myState[0].tiles[2][0]== 0 ? Color.YELLOW : null);
                b12.setText(String.valueOf(myState[0].tiles[2][1]));
                b12.setBackground(myState[0].tiles[2][1]== 0 ? Color.YELLOW : null);
                b13.setText(String.valueOf(myState[0].tiles[2][2]));
                b13.setBackground(myState[0].tiles[2][2]== 0 ? Color.YELLOW : null);
                b14.setText(String.valueOf(myState[0].tiles[2][3]));
                b14.setBackground(myState[0].tiles[2][3]== 0 ? Color.YELLOW : null);
                b15.setText(String.valueOf(myState[0].tiles[2][4]));
                b15.setBackground(myState[0].tiles[2][4]== 0 ? Color.YELLOW : null);

                b16.setText(String.valueOf(myState[0].tiles[3][0]));
                b16.setBackground(myState[0].tiles[3][0]== 0 ? Color.YELLOW : null);
                b17.setText(String.valueOf(myState[0].tiles[3][1]));
                b17.setBackground(myState[0].tiles[3][1]== 0 ? Color.YELLOW : null);
                b18.setText(String.valueOf(myState[0].tiles[3][2]));
                b18.setBackground(myState[0].tiles[3][2]== 0 ? Color.YELLOW : null);
                b19.setText(String.valueOf(myState[0].tiles[3][3]));
                b19.setBackground(myState[0].tiles[3][3]== 0 ? Color.YELLOW : null);
                b20.setText(String.valueOf(myState[0].tiles[3][4]));
                b20.setBackground(myState[0].tiles[3][4]== 0 ? Color.YELLOW : null);

                b21.setText(String.valueOf(myState[0].tiles[4][0]));
                b21.setBackground(myState[0].tiles[4][0]== 0 ? Color.YELLOW : null);
                b22.setText(String.valueOf(myState[0].tiles[4][1]));
                b22.setBackground(myState[0].tiles[4][1]== 0 ? Color.YELLOW : null);
                b23.setText(String.valueOf(myState[0].tiles[4][2]));
                b23.setBackground(myState[0].tiles[4][2]== 0 ? Color.YELLOW : null);
                b24.setText(String.valueOf(myState[0].tiles[4][3]));
                b24.setBackground(myState[0].tiles[4][3]== 0 ? Color.YELLOW : null);
                b0.setText(String.valueOf(myState[0].tiles[4][4]));
                b0.setBackground(myState[0].tiles[4][4] == 0 ? Color.YELLOW : null);
            }
        });

        final Action[][] actions1A = new Action[1][];
//        final Action[][] actions1APerformed = {};
        bSolve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Instant before = Instant.now();
                Node goal = Node.AStar(new PuzzleState(myState[0]));
//                Node goal=Node.breadthFirstSearch(new PuzzleState(myState), new ArrayList());

                bNext.setEnabled(true);

                actions1A[0] = goal.getActions();
                System.out.println("After solving, actions1A.length = " + actions1A[0].length);
                Instant after = Instant.now();
                long delta = Duration.between(before, after).toMillis(); // .toWhatsoever()

                // List the initial state and results of actions performed.
                System.out.println("Initial state:");
                System.out.println(myState[0]);

                System.out.println("Solution via H1 with A*:-------------");
                PuzzleState myState2 = new PuzzleState(myState[0]);
                for (int i = 0; i< actions1A[0].length; i++) {
                    Action currentAction = actions1A[0][actions1A[0].length-1-i];
                    System.out.println((i+1)+": "+currentAction);
                    PuzzleState.performAction(myState2,currentAction);
                    System.out.println(myState2.toString());
                }

                System.out.println("Total number of steps: " + actions1A[0].length);
                System.out.println("Total amount of time in search: " + (delta / 1000) + " seconds.");
                System.out.println("Total number of generated Node: " + goal.getTotalNodeGenerated());
                System.out.println("Entire Tree Depth: " + goal.getDepth());

                double b = Node.effectiveBranchingFactor(goal.getTotalNodeGenerated(), goal.getDepth());
                System.out.println("Effective Branching Factor: " + b);

                bSolve.setEnabled(false);
            }
        });

        bNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                bPrev.setEnabled(true);
//                System.out.println(actions1A[0].length);
                int currentSolutionIdx = actions1APerformed.size();
                System.out.println(currentSolutionIdx);
                Action currentAction = actions1A[0][actions1A[0].length-1-currentSolutionIdx];
                myState[0] = new PuzzleState(myState[0], currentAction);
                System.out.println("Action Performed " + currentAction.toString());

                //Apply Value Baru.
                b1.setText(String.valueOf(myState[0].tiles[0][0]));
                b1.setBackground(myState[0].tiles[0][0] == 0 ? Color.YELLOW : null);
                b2.setText(String.valueOf(myState[0].tiles[0][1]));
                b2.setBackground(myState[0].tiles[0][1] == 0 ? Color.YELLOW : null);
                b3.setText(String.valueOf(myState[0].tiles[0][2]));
                b3.setBackground(myState[0].tiles[0][2] == 0 ? Color.YELLOW : null);
                b4.setText(String.valueOf(myState[0].tiles[0][3]));
                b4.setBackground(myState[0].tiles[0][3] == 0 ? Color.YELLOW : null);
                b5.setText(String.valueOf(myState[0].tiles[0][4]));
                b5.setBackground(myState[0].tiles[0][4] == 0 ? Color.YELLOW : null);

                b6.setText(String.valueOf(myState[0].tiles[1][0]));
                b6.setBackground(myState[0].tiles[1][0] == 0 ? Color.YELLOW : null);
                b7.setText(String.valueOf(myState[0].tiles[1][1]));
                b7.setBackground(myState[0].tiles[1][1] == 0 ? Color.YELLOW : null);
                b8.setText(String.valueOf(myState[0].tiles[1][2]));
                b8.setBackground(myState[0].tiles[1][2] == 0 ? Color.YELLOW : null);
                b9.setText(String.valueOf(myState[0].tiles[1][3]));
                b9.setBackground(myState[0].tiles[1][3] == 0 ? Color.YELLOW : null);
                b10.setText(String.valueOf(myState[0].tiles[1][4]));
                b10.setBackground(myState[0].tiles[1][4]== 0 ? Color.YELLOW : null);

                b11.setText(String.valueOf(myState[0].tiles[2][0]));
                b11.setBackground(myState[0].tiles[2][0]== 0 ? Color.YELLOW : null);
                b12.setText(String.valueOf(myState[0].tiles[2][1]));
                b12.setBackground(myState[0].tiles[2][1]== 0 ? Color.YELLOW : null);
                b13.setText(String.valueOf(myState[0].tiles[2][2]));
                b13.setBackground(myState[0].tiles[2][2]== 0 ? Color.YELLOW : null);
                b14.setText(String.valueOf(myState[0].tiles[2][3]));
                b14.setBackground(myState[0].tiles[2][3]== 0 ? Color.YELLOW : null);
                b15.setText(String.valueOf(myState[0].tiles[2][4]));
                b15.setBackground(myState[0].tiles[2][4]== 0 ? Color.YELLOW : null);

                b16.setText(String.valueOf(myState[0].tiles[3][0]));
                b16.setBackground(myState[0].tiles[3][0]== 0 ? Color.YELLOW : null);
                b17.setText(String.valueOf(myState[0].tiles[3][1]));
                b17.setBackground(myState[0].tiles[3][1]== 0 ? Color.YELLOW : null);
                b18.setText(String.valueOf(myState[0].tiles[3][2]));
                b18.setBackground(myState[0].tiles[3][2]== 0 ? Color.YELLOW : null);
                b19.setText(String.valueOf(myState[0].tiles[3][3]));
                b19.setBackground(myState[0].tiles[3][3]== 0 ? Color.YELLOW : null);
                b20.setText(String.valueOf(myState[0].tiles[3][4]));
                b20.setBackground(myState[0].tiles[3][4]== 0 ? Color.YELLOW : null);

                b21.setText(String.valueOf(myState[0].tiles[4][0]));
                b21.setBackground(myState[0].tiles[4][0]== 0 ? Color.YELLOW : null);
                b22.setText(String.valueOf(myState[0].tiles[4][1]));
                b22.setBackground(myState[0].tiles[4][1]== 0 ? Color.YELLOW : null);
                b23.setText(String.valueOf(myState[0].tiles[4][2]));
                b23.setBackground(myState[0].tiles[4][2]== 0 ? Color.YELLOW : null);
                b24.setText(String.valueOf(myState[0].tiles[4][3]));
                b24.setBackground(myState[0].tiles[4][3]== 0 ? Color.YELLOW : null);
                b0.setText(String.valueOf(myState[0].tiles[4][4]));
                b0.setBackground(myState[0].tiles[4][4] == 0 ? Color.YELLOW : null);
                b1.setText(String.valueOf(myState[0].tiles[0][0]));
                b1.setBackground(myState[0].tiles[0][0] == 0 ? Color.YELLOW : null);
                b2.setText(String.valueOf(myState[0].tiles[0][1]));
                b2.setBackground(myState[0].tiles[0][1] == 0 ? Color.YELLOW : null);
                b3.setText(String.valueOf(myState[0].tiles[0][2]));
                b3.setBackground(myState[0].tiles[0][2] == 0 ? Color.YELLOW : null);
                b4.setText(String.valueOf(myState[0].tiles[0][3]));
                b4.setBackground(myState[0].tiles[0][3] == 0 ? Color.YELLOW : null);
                b5.setText(String.valueOf(myState[0].tiles[0][4]));
                b5.setBackground(myState[0].tiles[0][4] == 0 ? Color.YELLOW : null);

                b6.setText(String.valueOf(myState[0].tiles[1][0]));
                b6.setBackground(myState[0].tiles[1][0] == 0 ? Color.YELLOW : null);
                b7.setText(String.valueOf(myState[0].tiles[1][1]));
                b7.setBackground(myState[0].tiles[1][1] == 0 ? Color.YELLOW : null);
                b8.setText(String.valueOf(myState[0].tiles[1][2]));
                b8.setBackground(myState[0].tiles[1][2] == 0 ? Color.YELLOW : null);
                b9.setText(String.valueOf(myState[0].tiles[1][3]));
                b9.setBackground(myState[0].tiles[1][3] == 0 ? Color.YELLOW : null);
                b10.setText(String.valueOf(myState[0].tiles[1][4]));
                b10.setBackground(myState[0].tiles[1][4]== 0 ? Color.YELLOW : null);

                b11.setText(String.valueOf(myState[0].tiles[2][0]));
                b11.setBackground(myState[0].tiles[2][0]== 0 ? Color.YELLOW : null);
                b12.setText(String.valueOf(myState[0].tiles[2][1]));
                b12.setBackground(myState[0].tiles[2][1]== 0 ? Color.YELLOW : null);
                b13.setText(String.valueOf(myState[0].tiles[2][2]));
                b13.setBackground(myState[0].tiles[2][2]== 0 ? Color.YELLOW : null);
                b14.setText(String.valueOf(myState[0].tiles[2][3]));
                b14.setBackground(myState[0].tiles[2][3]== 0 ? Color.YELLOW : null);
                b15.setText(String.valueOf(myState[0].tiles[2][4]));
                b15.setBackground(myState[0].tiles[2][4]== 0 ? Color.YELLOW : null);

                b16.setText(String.valueOf(myState[0].tiles[3][0]));
                b16.setBackground(myState[0].tiles[3][0]== 0 ? Color.YELLOW : null);
                b17.setText(String.valueOf(myState[0].tiles[3][1]));
                b17.setBackground(myState[0].tiles[3][1]== 0 ? Color.YELLOW : null);
                b18.setText(String.valueOf(myState[0].tiles[3][2]));
                b18.setBackground(myState[0].tiles[3][2]== 0 ? Color.YELLOW : null);
                b19.setText(String.valueOf(myState[0].tiles[3][3]));
                b19.setBackground(myState[0].tiles[3][3]== 0 ? Color.YELLOW : null);
                b20.setText(String.valueOf(myState[0].tiles[3][4]));
                b20.setBackground(myState[0].tiles[3][4]== 0 ? Color.YELLOW : null);

                b21.setText(String.valueOf(myState[0].tiles[4][0]));
                b21.setBackground(myState[0].tiles[4][0]== 0 ? Color.YELLOW : null);
                b22.setText(String.valueOf(myState[0].tiles[4][1]));
                b22.setBackground(myState[0].tiles[4][1]== 0 ? Color.YELLOW : null);
                b23.setText(String.valueOf(myState[0].tiles[4][2]));
                b23.setBackground(myState[0].tiles[4][2]== 0 ? Color.YELLOW : null);
                b24.setText(String.valueOf(myState[0].tiles[4][3]));
                b24.setBackground(myState[0].tiles[4][3]== 0 ? Color.YELLOW : null);
                b0.setText(String.valueOf(myState[0].tiles[4][4]));
                b0.setBackground(myState[0].tiles[4][4] == 0 ? Color.YELLOW : null);

                //Jika sudah mentok, maka disabled btn next
                actions1APerformed.add(currentAction);
                if (actions1APerformed.size() == actions1A[0].length) {
                    //Aksi sudah dieksekusi semua, maka disable button.
                    bNext.setEnabled(false);
                }

            }
        });

        bPrev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                bNext.setEnabled(true);
                Action lastActionPerformed = actions1APerformed.get(actions1APerformed.size()-1);
                Action prevAction = null;
                if (lastActionPerformed.toString() == "UP") {
                    prevAction = PuzzleState.MOVE_DOWN;
                } else if (lastActionPerformed.toString() == "DOWN") {
                    prevAction = PuzzleState.MOVE_UP;
                } else if (lastActionPerformed.toString() == "RIGHT") {
                    prevAction = PuzzleState.MOVE_LEFT;
                } else if (lastActionPerformed.toString() == "LEFT") {
                    prevAction = PuzzleState.MOVE_RIGHT;
                }
                System.out.println("Action performed (prev): " + prevAction.toString());
                myState[0] = new PuzzleState(myState[0], prevAction);

                //Apply Value Baru.
                b1.setText(String.valueOf(myState[0].tiles[0][0]));
                b1.setBackground(myState[0].tiles[0][0] == 0 ? Color.YELLOW : null);
                b2.setText(String.valueOf(myState[0].tiles[0][1]));
                b2.setBackground(myState[0].tiles[0][1] == 0 ? Color.YELLOW : null);
                b3.setText(String.valueOf(myState[0].tiles[0][2]));
                b3.setBackground(myState[0].tiles[0][2] == 0 ? Color.YELLOW : null);
                b4.setText(String.valueOf(myState[0].tiles[0][3]));
                b4.setBackground(myState[0].tiles[0][3] == 0 ? Color.YELLOW : null);
                b5.setText(String.valueOf(myState[0].tiles[0][4]));
                b5.setBackground(myState[0].tiles[0][4] == 0 ? Color.YELLOW : null);

                b6.setText(String.valueOf(myState[0].tiles[1][0]));
                b6.setBackground(myState[0].tiles[1][0] == 0 ? Color.YELLOW : null);
                b7.setText(String.valueOf(myState[0].tiles[1][1]));
                b7.setBackground(myState[0].tiles[1][1] == 0 ? Color.YELLOW : null);
                b8.setText(String.valueOf(myState[0].tiles[1][2]));
                b8.setBackground(myState[0].tiles[1][2] == 0 ? Color.YELLOW : null);
                b9.setText(String.valueOf(myState[0].tiles[1][3]));
                b9.setBackground(myState[0].tiles[1][3] == 0 ? Color.YELLOW : null);
                b10.setText(String.valueOf(myState[0].tiles[1][4]));
                b10.setBackground(myState[0].tiles[1][4]== 0 ? Color.YELLOW : null);

                b11.setText(String.valueOf(myState[0].tiles[2][0]));
                b11.setBackground(myState[0].tiles[2][0]== 0 ? Color.YELLOW : null);
                b12.setText(String.valueOf(myState[0].tiles[2][1]));
                b12.setBackground(myState[0].tiles[2][1]== 0 ? Color.YELLOW : null);
                b13.setText(String.valueOf(myState[0].tiles[2][2]));
                b13.setBackground(myState[0].tiles[2][2]== 0 ? Color.YELLOW : null);
                b14.setText(String.valueOf(myState[0].tiles[2][3]));
                b14.setBackground(myState[0].tiles[2][3]== 0 ? Color.YELLOW : null);
                b15.setText(String.valueOf(myState[0].tiles[2][4]));
                b15.setBackground(myState[0].tiles[2][4]== 0 ? Color.YELLOW : null);

                b16.setText(String.valueOf(myState[0].tiles[3][0]));
                b16.setBackground(myState[0].tiles[3][0]== 0 ? Color.YELLOW : null);
                b17.setText(String.valueOf(myState[0].tiles[3][1]));
                b17.setBackground(myState[0].tiles[3][1]== 0 ? Color.YELLOW : null);
                b18.setText(String.valueOf(myState[0].tiles[3][2]));
                b18.setBackground(myState[0].tiles[3][2]== 0 ? Color.YELLOW : null);
                b19.setText(String.valueOf(myState[0].tiles[3][3]));
                b19.setBackground(myState[0].tiles[3][3]== 0 ? Color.YELLOW : null);
                b20.setText(String.valueOf(myState[0].tiles[3][4]));
                b20.setBackground(myState[0].tiles[3][4]== 0 ? Color.YELLOW : null);

                b21.setText(String.valueOf(myState[0].tiles[4][0]));
                b21.setBackground(myState[0].tiles[4][0]== 0 ? Color.YELLOW : null);
                b22.setText(String.valueOf(myState[0].tiles[4][1]));
                b22.setBackground(myState[0].tiles[4][1]== 0 ? Color.YELLOW : null);
                b23.setText(String.valueOf(myState[0].tiles[4][2]));
                b23.setBackground(myState[0].tiles[4][2]== 0 ? Color.YELLOW : null);
                b24.setText(String.valueOf(myState[0].tiles[4][3]));
                b24.setBackground(myState[0].tiles[4][3]== 0 ? Color.YELLOW : null);
                b0.setText(String.valueOf(myState[0].tiles[4][4]));
                b0.setBackground(myState[0].tiles[4][4] == 0 ? Color.YELLOW : null);
                b1.setText(String.valueOf(myState[0].tiles[0][0]));
                b1.setBackground(myState[0].tiles[0][0] == 0 ? Color.YELLOW : null);
                b2.setText(String.valueOf(myState[0].tiles[0][1]));
                b2.setBackground(myState[0].tiles[0][1] == 0 ? Color.YELLOW : null);
                b3.setText(String.valueOf(myState[0].tiles[0][2]));
                b3.setBackground(myState[0].tiles[0][2] == 0 ? Color.YELLOW : null);
                b4.setText(String.valueOf(myState[0].tiles[0][3]));
                b4.setBackground(myState[0].tiles[0][3] == 0 ? Color.YELLOW : null);
                b5.setText(String.valueOf(myState[0].tiles[0][4]));
                b5.setBackground(myState[0].tiles[0][4] == 0 ? Color.YELLOW : null);

                b6.setText(String.valueOf(myState[0].tiles[1][0]));
                b6.setBackground(myState[0].tiles[1][0] == 0 ? Color.YELLOW : null);
                b7.setText(String.valueOf(myState[0].tiles[1][1]));
                b7.setBackground(myState[0].tiles[1][1] == 0 ? Color.YELLOW : null);
                b8.setText(String.valueOf(myState[0].tiles[1][2]));
                b8.setBackground(myState[0].tiles[1][2] == 0 ? Color.YELLOW : null);
                b9.setText(String.valueOf(myState[0].tiles[1][3]));
                b9.setBackground(myState[0].tiles[1][3] == 0 ? Color.YELLOW : null);
                b10.setText(String.valueOf(myState[0].tiles[1][4]));
                b10.setBackground(myState[0].tiles[1][4]== 0 ? Color.YELLOW : null);

                b11.setText(String.valueOf(myState[0].tiles[2][0]));
                b11.setBackground(myState[0].tiles[2][0]== 0 ? Color.YELLOW : null);
                b12.setText(String.valueOf(myState[0].tiles[2][1]));
                b12.setBackground(myState[0].tiles[2][1]== 0 ? Color.YELLOW : null);
                b13.setText(String.valueOf(myState[0].tiles[2][2]));
                b13.setBackground(myState[0].tiles[2][2]== 0 ? Color.YELLOW : null);
                b14.setText(String.valueOf(myState[0].tiles[2][3]));
                b14.setBackground(myState[0].tiles[2][3]== 0 ? Color.YELLOW : null);
                b15.setText(String.valueOf(myState[0].tiles[2][4]));
                b15.setBackground(myState[0].tiles[2][4]== 0 ? Color.YELLOW : null);

                b16.setText(String.valueOf(myState[0].tiles[3][0]));
                b16.setBackground(myState[0].tiles[3][0]== 0 ? Color.YELLOW : null);
                b17.setText(String.valueOf(myState[0].tiles[3][1]));
                b17.setBackground(myState[0].tiles[3][1]== 0 ? Color.YELLOW : null);
                b18.setText(String.valueOf(myState[0].tiles[3][2]));
                b18.setBackground(myState[0].tiles[3][2]== 0 ? Color.YELLOW : null);
                b19.setText(String.valueOf(myState[0].tiles[3][3]));
                b19.setBackground(myState[0].tiles[3][3]== 0 ? Color.YELLOW : null);
                b20.setText(String.valueOf(myState[0].tiles[3][4]));
                b20.setBackground(myState[0].tiles[3][4]== 0 ? Color.YELLOW : null);

                b21.setText(String.valueOf(myState[0].tiles[4][0]));
                b21.setBackground(myState[0].tiles[4][0]== 0 ? Color.YELLOW : null);
                b22.setText(String.valueOf(myState[0].tiles[4][1]));
                b22.setBackground(myState[0].tiles[4][1]== 0 ? Color.YELLOW : null);
                b23.setText(String.valueOf(myState[0].tiles[4][2]));
                b23.setBackground(myState[0].tiles[4][2]== 0 ? Color.YELLOW : null);
                b24.setText(String.valueOf(myState[0].tiles[4][3]));
                b24.setBackground(myState[0].tiles[4][3]== 0 ? Color.YELLOW : null);
                b0.setText(String.valueOf(myState[0].tiles[4][4]));
                b0.setBackground(myState[0].tiles[4][4] == 0 ? Color.YELLOW : null);

                //Hilangkan actionsPerformed paling ujung
                actions1APerformed.remove(actions1APerformed.size()-1);
                //Jika sudah mentok, maka disabled btn next
                if (actions1APerformed.size() == 0) {
                    //Aksi sudah di-redo semua, maka disable button
                    bPrev.setEnabled(false);
                }
            }
        });

        //Inisialisasi Puzzle
        b1.setText(String.valueOf(myState[0].tiles[0][0]));
        b2.setText(String.valueOf(myState[0].tiles[0][1]));
        b3.setText(String.valueOf(myState[0].tiles[0][2]));
        b4.setText(String.valueOf(myState[0].tiles[0][3]));
        b5.setText(String.valueOf(myState[0].tiles[0][4]));

        b6.setText(String.valueOf(myState[0].tiles[1][0]));
        b7.setText(String.valueOf(myState[0].tiles[1][1]));
        b8.setText(String.valueOf(myState[0].tiles[1][2]));
        b9.setText(String.valueOf(myState[0].tiles[1][3]));
        b10.setText(String.valueOf(myState[0].tiles[1][4]));

        b11.setText(String.valueOf(myState[0].tiles[2][0]));
        b12.setText(String.valueOf(myState[0].tiles[2][1]));
        b13.setText(String.valueOf(myState[0].tiles[2][2]));
        b14.setText(String.valueOf(myState[0].tiles[2][3]));
        b15.setText(String.valueOf(myState[0].tiles[2][4]));

        b16.setText(String.valueOf(myState[0].tiles[3][0]));
        b17.setText(String.valueOf(myState[0].tiles[3][1]));
        b18.setText(String.valueOf(myState[0].tiles[3][2]));
        b19.setText(String.valueOf(myState[0].tiles[3][3]));
        b20.setText(String.valueOf(myState[0].tiles[3][4]));

        b21.setText(String.valueOf(myState[0].tiles[4][0]));
        b22.setText(String.valueOf(myState[0].tiles[4][1]));
        b23.setText(String.valueOf(myState[0].tiles[4][2]));
        b24.setText(String.valueOf(myState[0].tiles[4][3]));
        b0.setText(String.valueOf(myState[0].tiles[4][4]));


    }

    /**
     * Generate a solvable random puzzle.
     * @param maxShuffles the number of shuffles to be performed
     */
    public static PuzzleState randomPuzzle(int maxShuffles) {
        PuzzleState myState=new PuzzleState();
//        System.out.println(myState);
        int totalMoves = 0;
        while(totalMoves < maxShuffles){
            double r = Math.random();
            try {
                if(r < 0.25){
                    PuzzleState.performAction(myState, PuzzleState.MOVE_LEFT);
                    //System.out.println("left");
                } else if (r < 0.5) {
                    PuzzleState.performAction(myState, PuzzleState.MOVE_RIGHT);
                    //System.out.println("right");
                } else if (r < 0.75) {
                    PuzzleState.performAction(myState, PuzzleState.MOVE_UP);
                    //System.out.println("up");
                } else {
                    PuzzleState.performAction(myState, PuzzleState.MOVE_DOWN);
                    //System.out.println("down");
                }
                totalMoves++;
            }
            catch (RuntimeException e){
                ; // illegal move
            }
        }
        return myState;
    }
}
