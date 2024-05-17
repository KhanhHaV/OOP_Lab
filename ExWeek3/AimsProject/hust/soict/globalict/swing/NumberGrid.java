import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGrid extends JFrame {
    private JTextField tfDisplay;
    private JButton[] btnNumbers;
    private JButton btnDelete, btnReset;

    public NumberGrid() {
        tfDisplay = new JTextField();
        tfDisplay.setEditable(false);
        tfDisplay.setHorizontalAlignment(JTextField.RIGHT);

        JPanel panelButtons = new JPanel(new GridLayout(4, 3));
        btnNumbers = new JButton[10];

        for (int i = 1; i <= 9; ++i) {
            btnNumbers[i] = new JButton(i + "");
            panelButtons.add(btnNumbers[i]);
            btnNumbers[i].addActionListener(new ButtonListener());
        }

        btnDelete = new JButton("DEL");
        panelButtons.add(btnDelete);
        btnDelete.addActionListener(new ButtonListener());

        btnNumbers[0] = new JButton("0");
        panelButtons.add(btnNumbers[0]);
        btnNumbers[0].addActionListener(new ButtonListener());

        btnReset = new JButton("C");
        panelButtons.add(btnReset);
        btnReset.addActionListener(new ButtonListener());

        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panelButtons, BorderLayout.CENTER);

        setTitle("Number Grid");
        setSize(300, 300);
        setVisible(true);
    }

    private class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String buttonLabel = e.getActionCommand();
            if (buttonLabel.equals("DEL")) {
                String currentText = tfDisplay.getText();
                if (!currentText.isEmpty()) {
                    tfDisplay.setText(currentText.substring(0, currentText.length() - 1));
                }
            } else if (buttonLabel.equals("C")) {
                tfDisplay.setText("");
            } else {
                tfDisplay.setText(tfDisplay.getText() + buttonLabel);
            }
        }
    }

    public static void main(String[] args) {
        new NumberGrid();
    }
}
