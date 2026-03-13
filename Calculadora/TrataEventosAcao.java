import java.awt.event.*;
import javax.swing.*;

public class TrataEventosAcao implements ActionListener {
    ProjetoCalculadora calc;

    public TrataEventosAcao(ProjetoCalculadora calc) {
        this.calc = calc;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton src = (JButton) e.getSource();
        String texto = src.getText();

        if ("0123456789".contains(texto)) {
            // números
            calc.teclouNumeros(texto);
        } else {
            switch (texto) {
                case "C":
                    calc.teclouC();
                    break;
                case "CE":
                    calc.teclouCE();
                    break;
                case "<":
                    calc.teclouBackspace();
                    break;
                case "T":
                    calc.teclouEnter();
                    break;
                case "%":
                    calc.teclouP();
                    break;
                case "+":
                    calc.teclouMais();
                    break;
                case "-":
                    calc.teclouMenos();
                    break;
                case "*":
                    calc.teclouMultip();
                    break;
                case "/":
                    calc.teclouDiv();
                    break;
                case ",":
                    calc.teclouVirgula();
                    break;
                case ".":
                    calc.teclouVirgula();
                    break;
            }
        }
    }
}