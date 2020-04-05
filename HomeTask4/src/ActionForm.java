import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class ActionForm extends JFrame {
    private final JTextField textField = new JTextField();
    private final JTextArea jt = new JTextArea();

    public ActionForm() {
        setTitle("Local Chat");
        setBounds(300, 300, 500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        GridBagConstraints s = new GridBagConstraints();
        s.fill = GridBagConstraints.BOTH;
        s.gridwidth = GridBagConstraints.REMAINDER;
        s.anchor = GridBagConstraints.CENTER;
        s.weightx = 1.0;
        s.weighty = 1.0;
        s.gridx = 0;
        s.gridy = 0;
        jt.setEditable(false);
        add(jt, s);



        GridBagConstraints c = new GridBagConstraints();


        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.4;
        c.weighty = 0.4;
        c.gridx = 0;
        c.gridy = 1;
        textField.addActionListener(this::reactToAction);
        add(textField, c);


        JButton button = new JButton("Отправить");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.1;
        c.weighty = 0.1;
        c.gridx = 1;
        c.gridy = 1;
        button.addActionListener(this::reactToAction);
        add(button, c);

        setVisible(true);
    }

    private void reactToAction(ActionEvent event) {
        jt.append(textField.getText());
        jt.append("\n");
        textField.setText("");
        repaint();
        revalidate();

    }


}
