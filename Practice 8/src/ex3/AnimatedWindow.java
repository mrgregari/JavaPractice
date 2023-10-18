package ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimatedWindow extends JPanel implements ActionListener {
    private static final int WIDTH = 1920;
    private static final int HEIGHT = 1080;
    private static final int FRAME_DELAY = 800; // Задержка между кадрами (в миллисекундах)

    private int currentFrameIndex = 0;
    private ImageIcon[] animationFrames;

    public AnimatedWindow() {
        // Загрузка изображений анимации
        animationFrames = new ImageIcon[4];
        for (int i = 0; i < 4; i++) {
            String filename = "frame" + i + ".png";
            animationFrames[i] = new ImageIcon(filename);
        }

        // Создание таймера для анимации
        Timer timer = new Timer(FRAME_DELAY, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (currentFrameIndex < animationFrames.length) {
            // Отображение текущего кадра анимации
            animationFrames[currentFrameIndex].paintIcon(this, g, 0, 0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Переход к следующему кадру анимации
        currentFrameIndex++;
        if (currentFrameIndex >= animationFrames.length) {
            currentFrameIndex = 0; // Вернуться к началу анимации
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Анимация");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);

        AnimatedWindow animationPanel = new AnimatedWindow();
        frame.add(animationPanel);

        frame.setVisible(true);
    }
}
