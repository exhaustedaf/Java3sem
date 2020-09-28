import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame {
    private int milanScore = 0;
    private int realScore = 0;
    private String lastScorer = "N/A";
    private String win = "DRAW";
    JButton milan = new JButton("AC Milan");
    JButton real = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: " + milanScore + " X " + realScore);
    JLabel scorer = new JLabel("Last scorer: " + lastScorer);
    JLabel winner = new JLabel("Winner: " + win);
    Font fnt = new Font("Times new roman", Font.BOLD, 20);
    public Application() {
        super("AC Milan vs Real Madrid");
        setLayout(new BorderLayout());
        result.setHorizontalAlignment(JLabel.CENTER);
        scorer.setHorizontalAlignment(JLabel.CENTER);
        winner.setHorizontalAlignment(JLabel.CENTER);
        result.setFont(fnt);
        scorer.setFont(fnt);
        winner.setFont(fnt);
        milan.setFont(fnt);
        real.setFont(fnt);
        add(milan, BorderLayout.WEST);
        add(real, BorderLayout.EAST);
        add(result, BorderLayout.CENTER);
        add(scorer, BorderLayout.NORTH);
        add(winner, BorderLayout.SOUTH);
        setSize(500,500);
        getContentPane().setBackground(new Color(100, 150, 100));
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                lastScorer = "Milan";
                checkWinner();
                changeText();
            }
        });
        real.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                realScore++;
                lastScorer = "Real Madrid";
                checkWinner();
                changeText();
            }
        });
        setVisible(true);
    }

    public void changeText() {
        result.setText("Result: " + milanScore + " X " + realScore);
        scorer.setText("Last scorer: " + lastScorer);
        winner.setText("Winner: " + win);
    }

    public void checkWinner() {
        if (milanScore > realScore)
            win = "MILAN";
        else if (milanScore == realScore)
            win = "DRAW";
        else
            win = "REAL MADRID";
    }
    public static void main(String[] args) {
        new Application();
    }
}