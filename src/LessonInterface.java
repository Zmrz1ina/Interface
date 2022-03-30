import javax.swing.*;
import java.awt.*;

public class LessonInterface {
    public static void main(String[] args) {

        Telegram telegramMassager = new Telegram();
        Viber viberMassager = new Viber();

        telegramMassager.call("+845858");
        viberMassager.call("+786743895");

        telegramMassager.createChat("Misha");
        viberMassager.createChat("Pupkin");

        TestSwingListener testSwingListener = new TestSwingListener();
        JFrame frame = new JFrame();
        JButton buttonOK = new JButton("OK");
        buttonOK.addMouseMotionListener(testSwingListener);
        frame.add(buttonOK);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
