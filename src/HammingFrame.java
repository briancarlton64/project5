import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeSet;

public class HammingFrame extends JFrame {

    private static int FONT_SIZE = 32;

    /**
     * Class that will contain the creative section of the project.
     */
    private class HammingPanel extends JPanel {

    }

    //DEFAULT UI COMPONENTS;
    private Font f32 = new Font("f18", -1, FONT_SIZE);
    private JPanel panel1;
    private TreeSet<String> stations = new TreeSet<>(HammingDist.getMeso());
    private void setUpContainer() {
        panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        JLabel enterHammingDIst = new JLabel();
        Font enterHammingDIstFont = new Font("f18", -1, 18);
        enterHammingDIst.setFont(enterHammingDIstFont);
        enterHammingDIst.setText("Enter Hamming Dist");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel1.add(enterHammingDIst, gbc);
        JTextField enterHammingDistTextField = new JTextField();
        enterHammingDistTextField.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(enterHammingDistTextField, gbc);
        JButton showStationButton = new JButton();
        Font showStationButtonFont = new Font("f18", -1, 18);
        showStationButton.setFont(showStationButtonFont);
        showStationButton.setText("Show Station");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(showStationButton, gbc);
        JLabel label1 = new JLabel();
        Font label1Font = f32;
        label1.setFont(label1Font);
        label1.setText("Compare with:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel1.add(label1, gbc);
        JComboBox compareWithComboBox = new JComboBox(stations.toArray());
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(compareWithComboBox, gbc);
        JButton calculateHDButton = new JButton();
        Font calculateHDButtonFont = f32;
        calculateHDButton.setFont(calculateHDButtonFont);
        calculateHDButton.setText("Calculate HD");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(calculateHDButton, gbc);
        JLabel label2 = new JLabel();
        Font label2Font = f32;
        label2.setFont(label2Font);
        label2.setText("Distance 1");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel1.add(label2, gbc);
        JLabel label3 = new JLabel();
        Font label3Font = f32;
        label3.setFont(label3Font);
        label3.setText("Distance 2");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel1.add(label3, gbc);
        JLabel label4 = new JLabel();
        Font label4Font = f32;
        label4.setFont(label4Font);
        label4.setText("Distance 3");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel1.add(label4, gbc);
        JLabel label5 = new JLabel();
        Font label5Font = f32;
        label5.setFont(label5Font);
        label5.setText("Distance 4");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel1.add(label5, gbc);
        JButton addStationButton = new JButton();
        Font addStationButtonFont = f32;
        addStationButton.setFont(addStationButtonFont);
        addStationButton.setText("Add Station");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(addStationButton, gbc);
        //addStationField
        JTextField textField2 = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 12;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(textField2, gbc);
        JTextField distance4TextField = new JTextField();
        distance4TextField.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 11;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(distance4TextField, gbc);
        JTextField distance2TextField = new JTextField();
        distance2TextField.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(distance2TextField, gbc);
        JTextField distance3TextField = new JTextField();
        distance3TextField.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(distance3TextField, gbc);
        JTextField distance1TextField = new JTextField();
        distance1TextField.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(distance1TextField, gbc);
        JTextField distance0TextField = new JTextField();
        distance0TextField.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(distance0TextField, gbc);
        JSlider slider1 = new JSlider();
        slider1.setMajorTickSpacing(1);
        slider1.setMaximum(4);
        slider1.setMinimum(1);
        slider1.setPaintLabels(true);
        slider1.setPaintTicks(true);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(slider1, gbc);
        JLabel label6 = new JLabel();
        Font label6Font = f32;
        label6.setFont(label6Font);
        label6.setText("Distance 0");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        panel1.add(label6, gbc);
        //stations
        JTextArea stationTextArea = new JTextArea();
        JScrollPane stationsScrollPane = new JScrollPane();
        stationsScrollPane.setViewportView(stationTextArea);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.ipady=200;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(stationsScrollPane, gbc);
        enterHammingDIst.setLabelFor(enterHammingDistTextField);
        label1.setLabelFor(compareWithComboBox);
        label2.setLabelFor(distance1TextField);
        label3.setLabelFor(distance2TextField);
        label4.setLabelFor(distance3TextField);
        label5.setLabelFor(distance4TextField);
        label6.setLabelFor(distance0TextField);
        enterHammingDistTextField.setText(Integer.toString(slider1.getValue()));
        addStationButton.addActionListener(e -> {
            stations.add(textField2.getText());
            compareWithComboBox.removeAllItems();
            for (String s : stations) {
                compareWithComboBox.addItem(s);

            }
            revalidate();
            repaint();
        });
        showStationButton.addActionListener(e -> {
            ArrayList<String> toShow = new ArrayList<>();
            for (String s : stations) {
                if (HammingDist.calcLetters(s, Objects.requireNonNull(compareWithComboBox.getSelectedItem()).toString()) == slider1.getValue()) {
                    toShow.add(s);
                }
            }
            StringBuilder s = new StringBuilder();
            for (String y : toShow) {
                s.append(y).append("\n");
            }
            stationTextArea.setText(s.toString());

        });
        slider1.addChangeListener(e -> enterHammingDistTextField.setText(Integer.toString(slider1.getValue())));
        calculateHDButton.addActionListener(e -> {
            int[] sums = HammingDist.calcMesoDist(Objects.requireNonNull(compareWithComboBox.getSelectedItem()).toString());
            for(int i=0;i<sums.length;i++){
                switch(i){
                    case 0:
                        distance0TextField.setText(Integer.toString(sums[i]));
                        break;
                    case 1:
                        distance1TextField.setText(Integer.toString(sums[i]));
                        break;
                    case 2:
                        distance2TextField.setText(Integer.toString(sums[i]));
                        break;
                    case 3:
                        distance3TextField.setText(Integer.toString(sums[i]));
                        break;
                    case 4:
                        distance4TextField.setText(Integer.toString(sums[i]));
                        break;
                }
            }
        });
    }

    private HammingFrame() {
        setLayout(new GridLayout());
        setUpContainer();
        add(panel1);
        add(new HammingPanel());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 200);
        setLocationRelativeTo(null);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        HammingFrame a = new HammingFrame();
        System.out.println(HammingDist.calcDist("ABCD", "ABCF"));
    }
}