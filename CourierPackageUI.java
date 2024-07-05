import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourierPackageUI {
    private JFrame frame;
    private JTextField courierIdField;
    private JTextField courierNameField;
    private JTextField courierPhoneField;
    private JLabel courierResultLabel;
    private Courier courier;

    private JTextField trackingNumberField;
    private JTextField senderIdField;
    private JTextField receiverIdField;
    private JTextField statusField;
    private JLabel packageResultLabel;
    private Package pkg;

    public CourierPackageUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Courier and Package Management");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(12, 2, 10, 10));

        // Courier Section
        JLabel lblCourierSection = new JLabel("Courier Management", SwingConstants.CENTER);
        lblCourierSection.setFont(new Font("Arial", Font.BOLD, 16));
        frame.getContentPane().add(lblCourierSection);
        frame.getContentPane().add(new JLabel("")); // Empty label for spacing

        JLabel lblCourierId = new JLabel("Courier ID:");
        frame.getContentPane().add(lblCourierId);

        courierIdField = new JTextField();
        frame.getContentPane().add(courierIdField);
        courierIdField.setColumns(10);

        JLabel lblCourierName = new JLabel("Courier Name:");
        frame.getContentPane().add(lblCourierName);

        courierNameField = new JTextField();
        frame.getContentPane().add(courierNameField);
        courierNameField.setColumns(10);

        JLabel lblCourierPhone = new JLabel("Courier Phone:");
        frame.getContentPane().add(lblCourierPhone);

        courierPhoneField = new JTextField();
        frame.getContentPane().add(courierPhoneField);
        courierPhoneField.setColumns(10);

        JButton btnCourierSubmit = new JButton("Submit Courier");
        frame.getContentPane().add(btnCourierSubmit);

        courierResultLabel = new JLabel("");
        frame.getContentPane().add(courierResultLabel);

        btnCourierSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = courierIdField.getText();
                String name = courierNameField.getText();
                String phone = courierPhoneField.getText();

                courier = new Courier(id, name, phone);
                courierResultLabel.setText("Courier created: " + courier.getId() + ", " + courier.getName() + ", " + courier.getPhone());
            }
        });

        // Package Section
        JLabel lblPackageSection = new JLabel("Package Management", SwingConstants.CENTER);
        lblPackageSection.setFont(new Font("Arial", Font.BOLD, 16));
        frame.getContentPane().add(lblPackageSection);
        frame.getContentPane().add(new JLabel("")); // Empty label for spacing

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

        JButton btnPackageSubmit = new JButton("Submit Package");
        frame.getContentPane().add(btnPackageSubmit);

        packageResultLabel = new JLabel("");
        frame.getContentPane().add(packageResultLabel);

        btnPackageSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String trackingNumber = trackingNumberField.getText();
                String senderId = senderIdField.getText();
                String receiverId = receiverIdField.getText();
                String status = statusField.getText();

                pkg = new Package(trackingNumber, senderId, receiverId, status);
                packageResultLabel.setText("Package created: " + pkg.getTrackingNumber() + ", " + pkg.getSenderId() + ", " + pkg.getReceiverId() + ", " + pkg.getStatus());
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CourierPackageUI window = new CourierPackageUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
