import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourierUI {
    private JFrame frame;
    private JTextField idField;
    private JTextField nameField;
    private JTextField phoneField;
    private JLabel resultLabel;
    private Courier courier;

    public CourierUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Courier Management");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(5, 2, 10, 10));

        JLabel lblId = new JLabel("Courier ID:");
        frame.getContentPane().add(lblId);

        idField = new JTextField();
        frame.getContentPane().add(idField);
        idField.setColumns(10);

        JLabel lblName = new JLabel("Courier Name:");
        frame.getContentPane().add(lblName);

        nameField = new JTextField();
        frame.getContentPane().add(nameField);
        nameField.setColumns(10);

        JLabel lblPhone = new JLabel("Courier Phone:");
        frame.getContentPane().add(lblPhone);

        phoneField = new JTextField();
        frame.getContentPane().add(phoneField);
        phoneField.setColumns(10);

        JButton btnSubmit = new JButton("Submit");
        frame.getContentPane().add(btnSubmit);

        resultLabel = new JLabel("");
        frame.getContentPane().add(resultLabel);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = idField.getText();
                String name = nameField.getText();
                String phone = phoneField.getText();

                courier = new Courier(id, name, phone);
                resultLabel.setText("Courier created: " + courier.getId() + ", " + courier.getName() + ", " + courier.getPhone());
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CourierUI window = new CourierUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
