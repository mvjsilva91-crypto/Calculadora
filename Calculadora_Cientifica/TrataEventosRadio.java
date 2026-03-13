import java.awt.event.*;
import javax.swing.*;

public class TrataEventosRadio implements ItemListener {
    ProjetoCalculadora calc;

    public TrataEventosRadio(ProjetoCalculadora calc) {
        this.calc = calc;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JRadioButton src = (JRadioButton) e.getSource();
        if (src.isSelected()) {
            switch (src.getText()) {
                case "2": calc.casasDecimais = 2; break;
                case "4": calc.casasDecimais = 4; break;
                case "6": calc.casasDecimais = 6; break;
            }
        }
    }
}