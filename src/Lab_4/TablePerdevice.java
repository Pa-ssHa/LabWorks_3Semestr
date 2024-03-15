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
public class TablePerdevice {
    private List<Perdevice> devices;
    private DefaultTableModel tableModel;
    private JTable table;
    class DiagonalRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof Double) {
                value = value + " дюймов";
            }
            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        }
    }

    class GuaranteeRenderer extends DefaultTableCellRenderer {
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            if (value.equals("0.0") || value.equals("-")) {
                component.setBackground(Color.RED);
            } else {
                component.setBackground(Color.GREEN);
            }
            return component;
        }
    }
    public TablePerdevice() {
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


        JButton SortButton = new JButton("Sort name ABC");
        SortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SortName();
            }
        });
        JTextField modelField = new JTextField(20);
        JTextField priceField = new JTextField(10);
        JTextField diagonalField = new JTextField(10);
        JTextField guaranteeField = new JTextField(10);
        JCheckBox wirelessCheckBox = new JCheckBox("Беспроводное устройство");
        JButton addButton = new JButton("Добавить объект");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String model = modelField.getText();
                double price = Double.parseDouble(priceField.getText());
                double diagonal = Double.parseDouble(diagonalField.getText());
                double guaranteeYear = Double.parseDouble(guaranteeField.getText());
                boolean wireless = wirelessCheckBox.isSelected();

                Perdevice newDevice = new Perdevice(model, price, diagonal, guaranteeYear, wireless);
                devices.add(newDevice);
                tableModel.addRow(new Object[]{newDevice.getModel(), newDevice.getPrice(), newDevice.getDiagonal(), newDevice.getGuaranteeYear(), newDevice.isWireless()});
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(SortButton);
        buttonPanel.add(addButton);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);



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
        int diagonalColumn = 2;
        table.getColumnModel().getColumn(diagonalColumn).setCellRenderer(new DiagonalRenderer());
        int column2 = 3;
        table.getColumnModel().getColumn(column2).setCellRenderer(new GuaranteeRenderer());
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