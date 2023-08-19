package numbergame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGuessingGame {
    private JButton guessTheNumberButton;
    private JTextField UserNumber;
    private JTextField Info;
    private JTextField ComputerNumber;
    private JPanel UserPannel;

    public NumberGuessingGame() {
        guessTheNumberButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userno = Integer.parseInt(UserNumber.getText());
                int no2 = (int) (Math.random() * 100);
                if (userno==no2) {
                    Info.setText("correct");
                } else if (userno>=100 || userno<=0) {
                    Info.setText("Your Guess Is Invalid");

                }
                else if (userno>no2) {
                    Info.setText("Your Guess Is Too High");

                }
                else if (userno<no2) {
                    Info.setText("Your Guess Is Too Low");

                }
                else  {
                    Info.setText("Your Guess Is wrong");
                }

                ComputerNumber.setText(Integer.toString(no2));
                }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Number game");
        frame.setContentPane(new NumberGuessingGame().UserPannel);
        frame.setSize(650,550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
