import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

public class GUIStyle {
    // Colors
    public static final Color BACKGROUND_COLOR = new Color(240, 240, 240);
    public static final Color TEXT_COLOR = new Color(60, 60, 60);
    public static final Color BUTTON_COLOR = new Color(220, 220, 220);

    // Fonts
    public static final Font DEFAULT_FONT = new Font("Arial", Font.PLAIN, 12);

    // Styling methods
    public static JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(BUTTON_COLOR);
        button.setForeground(TEXT_COLOR);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setFont(DEFAULT_FONT);
        return button;
    }
}
