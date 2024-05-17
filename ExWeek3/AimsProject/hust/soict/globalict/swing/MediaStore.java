package aims.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import aims.media.*;
public class MediaStore extends JPanel {
    private Media media;

    public MediaStore(Media media) {
        this.media = media;

        this.setLayout(new BorderLayout());
        JLabel labelTitle = new JLabel(media.getTitle());
        this.add(labelTitle, BorderLayout.NORTH);

        JLabel labelCost = new JLabel("" + media.getCost() + " $");
        this.add(labelCost, BorderLayout.CENTER);

        if (media instanceof Playable) {
            JButton buttonPlay = new JButton("Play");
            this.add(buttonPlay, BorderLayout.SOUTH);
            buttonPlay.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JDialog dialog = new JDialog();
                    dialog.setTitle("Playing " + media.getTitle());
                    dialog.setSize(200, 100);
                    dialog.setVisible(true);
                }
            });
        }
    }
}