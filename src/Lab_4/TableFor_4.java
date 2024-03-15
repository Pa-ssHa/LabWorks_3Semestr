package Lab_4;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Lab_1_1.Mouse;
import Lab_1_1.Perdevice;
import Lab_1_1.Screen;
public class TableFor_4 {
    private List<Perdevice> devices;
    private DefaultTableModel tableModel;
    private JTable table;
    public TableFor_4() {
        devices = new ArrayList<>();

        devices.add(new Mouse(5000, "мышка hp", 2, true));
        devices.add(new Mouse(2200, "мышка asus", 1.5, false));
        devices.add(new Mouse(3000, "мышка samsung", 0.5, true));
        devices.add(new Mouse(700, "мышка acer", 5, true));
        devices.add(new Mouse(500, "мышка huawei", 0, true));
        devices.add(new Screen(25000, "монитор LG", 50));
        devices.add(new Screen(15000, "монитор samsung", 25));
        devices.add(new Screen(17000, "монитор hp", 23));
        devices.add(new Screen(10000, "монитор huawei", 15));
        devices.add(new Screen(12000, "монитор asus", 24));

        JFrame frame = new JFrame("Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        String[] columnNames = {"Model", "Price", "Diagonal for screen", "Guarantee year for mouse", "Wireless for mouse"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);

        JLabel name = new JLabel();
        JLabel price = new JLabel();
        JLabel diagonal = new JLabel();
        JLabel garant = new JLabel();
        JCheckBox wire = new JCheckBox();

        JButton SortButton = new JButton("Sort name ABC");
        SortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SortName();
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(SortButton);
        //buttonPanel.add(AppendButton);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);

        JPanel enter = new JPanel();
        enter.add(name);
        enter.add(price);
        enter.add(diagonal);
        enter.add(garant);
        enter.add(wire);

        frame.add(enter,BorderLayout.CENTER);
        addDataToTable();
    }
    private void addDataToTable() {
        for (Perdevice device : devices) {
            if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                String garantYearValue = (mouse.getGarantYear() == 0) ? "-" : String.valueOf(mouse.getGarantYear());
                tableModel.addRow(new Object[]{mouse.getModel(), mouse.getPrice(), "-", garantYearValue, mouse.getWire()});
            } else if (device instanceof Screen) {
                Screen screen = (Screen) device;
                tableModel.addRow(new Object[]{screen.getModel(), screen.getPrice(), screen.getDiagonal(), "-", "true"});
            }
        }
    }
    private void SortName(){
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
        table.setRowSorter(sorter);
        int column1 = 0;
        sorter.setSortable(column1, true);
        sorter.toggleSortOrder(column1);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TablePerdevice();
            }
        });
    }
}
