import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PackageUI {
    private JFrame frame;
    private JTextField trackingNumberField;
    private JTextField senderIdField;
    private JTextField receiverIdField;
    private JTextField statusField;
    private JLabel resultLabel;
    private Package pkg;

    public PackageUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Package Management");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(6, 2, 10, 10));

        JLabel lblTrackingNumber = new JLabel("Tracking Number:");
        frame.getContentPane().add(lblTrackingNumber);

        trackingNumberField = new JTextField();
        frame.getContentPane().add(trackingNumberField);
        trackingNumberField.setColumns(10);

        JLabel lblSenderId = new JLabel("Sender ID:");
        frame.getContentPane().add(lblSenderId);

        senderIdField = new JTextField();
        frame.getContentPane().add(senderIdField);
        senderIdField.setColumns(10);

        JLabel lblReceiverId = new JLabel("Receiver ID:");
        frame.getContentPane().add(lblReceiverId);

        receiverIdField = new JTextField();
        frame.getContentPane().add(receiverIdField);
        receiverIdField.setColumns(10);

        JLabel lblStatus = new JLabel("Status:");
        frame.getContentPane().add(lblStatus);

        statusField = new JTextField();
        frame.getContentPane().add(statusField);
        statusField.setColumns(10);

        JButton btnSubmit = new JButton("Submit");
        frame.getContentPane().add(btnSubmit);

        resultLabel = new JLabel("");
        frame.getContentPane().add(resultLabel);

        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String trackingNumber = trackingNumberField.getText();
                String senderId = senderIdField.getText();
                String receiverId = receiverIdField.getText();
                String status = statusField.getText();

                pkg = new Package(trackingNumber, senderId, receiverId, status);
                resultLabel.setText("Package created: " + pkg.getTrackingNumber() + ", " + pkg.getSenderId() + ", " + pkg.getReceiverId() + ", " + pkg.getStatus());
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PackageUI window = new PackageUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
