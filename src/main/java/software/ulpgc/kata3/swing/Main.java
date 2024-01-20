package software.ulpgc.kata3.swing;

import software.ulpgc.kata3.Histogram;

public class Main {
    public static void main(String[] args) {
        Histogram histogram = new Histogram(4, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        MainFrame frame = new MainFrame();
        frame.histogramDisplay().show(histogram);
        frame.setVisible(true);
    }
}
