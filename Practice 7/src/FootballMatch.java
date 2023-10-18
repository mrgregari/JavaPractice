import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootballMatch extends JFrame implements ActionListener {
    JButton milanButton = new JButton("AC Milan");
    JButton madridButton = new JButton("Real Madrid");
    int milanScore = 0;
    int madridScore = 0;
    JLabel resultLabel = new JLabel("Result: 0 X 0");
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    public FootballMatch() {
        setSize(400,400);
        setLayout(new GridLayout(3, 2));
        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorer);
        add(winner);

        milanButton.addActionListener(this);
        madridButton.addActionListener(this);

        setTitle("Football Match");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == milanButton) {
            milanScore++;
            resultLabel.setText("Result: " + milanScore + " X " + madridScore);
            lastScorer.setText("Last Scorer: AC Milan");
        } else if (e.getSource() == madridButton) {
            madridScore++;
            resultLabel.setText("Result: " + milanScore + " X " + madridScore);
            lastScorer.setText("Last Scorer: Real Madrid");
        }
        if (milanScore > madridScore) {
            winner.setText("Winner: AC Milan");
        }
        else if (madridScore > milanScore) {
            winner.setText("Winner: Real Madrid");
        }
        else {
            winner.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        new FootballMatch();
    }
}