package Lab_4;
import javax.swing.table.DefaultTableModel;

public class CustomTableModel extends DefaultTableModel {
    public CustomTableModel(Object[][] data, Object[] columnNames) {
        super(data, columnNames);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 1) { // Индекс столбца "Price"
            return Double.class;
        }
        return super.getColumnClass(columnIndex);
    }
}
//    private void SortPrice() {
//
////        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
////        table.setRowSorter(sorter);
////        List<RowSorter.SortKey> sortKeys = new ArrayList<>(2);
////        sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING)); // Сортировка по второму столбцу
////        sorter.setSortKeys(sortKeys);
//
//        //TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
//        //table.setRowSorter(sorter);
//        //int column2 = 1;
//        //sorter.setSortable(column2, true);
//        //sorter.toggleSortOrder(column2);
//        String[] columnNames = {"Model", "Price", "Diagonal for screen", "Guarantee year for mouse", "Wireless for mouse"};
//        Object[][] data = {
//                {"huawei", 10000.0, 15.0, null, null},
//                {"asus", 12000.0, 24.0, null, null},
//                {"samsung", 15000.0, 25.0, null, null},
//                {"hp", 17000.0, 23.0, null, null},
//                {"LG", 25000.0, 50.0, null, null},
//                {"samsung", 3500.0, null, 0.5, true},
//                {"asus", 3700.0, null, 1.5, false},
//                {"huawei", 500.0, null, 0.0, true},
//                {"acer", 5700.0, null, 5.0, true},
//                {"hp", 7000.0, null, 2.0, true}
//        };
//        TableModel model = new DefaultTableModel(data, columnNames) {
//            @Override
//            public Class<?> getColumnClass(int columnIndex) {
//                if (columnIndex == 1) return Double.class;
//                return super.getColumnClass(columnIndex);
//            }
//        };
//        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tableModel);
//        table.setRowSorter(sorter);
//        int column2 = 1;
//        sorter.setSortable(column2, true);
//        sorter.toggleSortOrder(column2);
//    }
//    private void SortPrice() {
//        String[] columnNames = {"Model", "Price", "Diagonal for screen", "Guarantee year for mouse", "Wireless for mouse"};
//        Object[][] data = {
//                {"huawei", 10000.0, 15.0, null, null},
//                {"asus", 12000.0, 24.0, null, null},
//                {"samsung", 15000.0, 25.0, null, null},
//                {"hp", 17000.0, 23.0, null, null},
//                {"LG", 25000.0, 50.0, null, null},
//                {"samsung", 3500.0, null, 0.5, true},
//                {"asus", 3700.0, null, 1.5, false},
//                {"huawei", 500.0, null, 0.0, true},
//                {"acer", 5700.0, null, 5.0, true},
//                {"hp", 7000.0, null, 2.0, true}
//        };
//
//        TableModel model = new DefaultTableModel(data, columnNames) {
//            @Override
//            public Class<?> getColumnClass(int columnIndex) {
//                if (columnIndex == 1) return Double.class;
//                return super.getColumnClass(columnIndex);
//            }
//        };
//
//        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
//        table.setRowSorter(sorter);
//
//        int column2 = 1;
//        sorter.setSortable(column2, true);
//        sorter.toggleSortOrder(column2);
//    }
//    private void SortPrice() {
//        Object[][] data = {
//                {"huawei", 10000.0, 15.0, null, null},
//                {"asus", 12000.0, 24.0, null, null},
//                {"samsung", 15000.0, 25.0, null, null},
//                {"hp", 17000.0, 23.0, null, null},
//                {"LG", 25000.0, 50.0, null, null},
//                {"samsung", 3500.0, null, 0.5, true},
//                {"asus", 3700.0, null, 1.5, false},
//                {"huawei", 500.0, null, 0.0, true},
//                {"acer", 5700.0, null, 5.0, true},
//                {"hp", 7000.0, null, 2.0, true}
//        };
//
//        String[] columnNames = {"Model", "Price", "Diagonal for screen", "Guarantee year for mouse", "Wireless for mouse"};
//
//        CustomTableModel model = new CustomTableModel(data, columnNames);
//        table.setModel(model);
//
//        TableRowSorter<TableModel> sorter = new TableRowSorter<>(model);
//        table.setRowSorter(sorter);
//
//        int column2 = 1; // Индекс столбца "Price"
//        sorter.setSortable(column2, true);
//        sorter.toggleSortOrder(column2);
//
//        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
//        for (int row = 0; row < table.getRowCount(); row++) {
//            double price = (double) table.getValueAt(row, column2);
//            table.setValueAt(currencyFormat.format(price), row, column2);
//        }
//    }

//            if (value != null && !value.equals("-")) {
//                Double doubleValue = Double.parseDouble(value.toString());
//                if (doubleValue == 0.0) {
//                    component.setBackground(Color.RED);
//                } else {
//                    component.setBackground(Color.GREEN);
//                }
//            }



