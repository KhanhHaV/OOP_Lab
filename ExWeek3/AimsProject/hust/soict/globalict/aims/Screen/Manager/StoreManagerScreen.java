package aims.screen.manager;

import java.awt.*;
import javax.swing.*;
import aims.media.Media;
import aims.store.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import aims.screen.manager.*;;

public class StoreManagerScreen extends JFrame {
    private Store store;
    public static void main(String[] args) {
        Store store = new Store();
        store.initData();
        StoreManagerScreen mainFrame = new StoreManagerScreen(store);
    }
    public StoreManagerScreen(Store store) {
        this.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);
        setTitle("Store");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    JPanel createNorth() {
        JPanel north = new JPanel();
        // north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.setLayout(new BorderLayout() );
        north.add(createMenuBar(),BorderLayout.NORTH);
        north.add(createHeader(),BorderLayout.CENTER);
        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Option");
        JMenuItem viewStoreItem = new JMenuItem("View Store");
        JMenu smUpdateStore = new JMenu("Update Store");
        JMenuItem addBookItem = new JMenuItem("Add Book");
        JMenuItem addCDItem = new JMenuItem("Add CD");
        JMenuItem addDVDItem = new JMenuItem("Add DVD");
        menu.add(smUpdateStore);
        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);
        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));
        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));
        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,3,2,2));
        ArrayList<Media> mediaInStore = store.getItemsInStore();
        for(int i = 1 ; i< mediaInStore.size() ; i++)
        {
            MediaStore cell = new MediaStore(mediaInStore.get(i)) ;
            center.add(cell) ;
        }
        return center ;
    }
}