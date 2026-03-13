import java.awt.GradientPaint;
import java.awt.GridBagConstraints;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class TrataEventosfocus implements FocusListener {
    public void focusGained(FocusEvent event) {

    }

    public void focusLost(FocusEvent event) {

    }

}

private class InnerTrataEventosRadio implements ItemListener {
    public void itemStatechanged(ItemEvent event) {
        if (event.getSource) == botao2dig {
            casasDecimais = 2;
        
        }
        if (event.getSource() == botao4dig) {
             casasDecimais = 4;
            
        }
          if (event.getSource() == botao4dig) {
             casasDecimais = 6;
            
    }
    
}

public void KeyPressed(KeyEvent e) {
    if (e.getKeyCode() == e.VK_ESCAPE) {
        int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja sair cara???");

        if (selectedOption == JOptionPane.YES_NO_OPTION) {
                dispose();
                System.exit(0);
            
        }
        
    }
    if(e.getKeyCode() == 67) teclouC();
            if(e.getKeyCode() == 69) teclouCE();
            if(e.getKeyCode() == 8) teclouBackspace();
            if(e.getKeyCode() == 110) teclouVirgula();
            if(((e.getKeyCode() >= e.VK_0) && (e.getKeyCode() <= e.VK_9)) || 
getKeyCode() >= e.VK_NUMPAD0) && (e.getKeyCode() <= e.VK_NUMPAD9))) teclouNumeros(""+
getKeyChar());
            if((e.getKeyCode() == 61) || (e.getKeyCode() == 107)) teclouMais();
            if((e.getKeyCode() == 45) || (e.getKeyCode() == 109)) teclouMenos();
            if((e.getKeyCode() == 59) || (e.getKeyCode() == 111)) teclouDiv();
            if(e.getKeyCode() == 106) teclouMultip();
            if(e.getKeyCode() == 80) teclouP();
            if(e.getKeyCode() == 10) teclouEnter();
        }

    public void keyReleased(KeyEvent e) {

    }

    public void keyTyped(KeyEvent e) {

    }

    public void teclouC() {
        valor = "0";
        visor.setText(formatStrNumerica(Valor, casasdecimais));
    }

    public void teclouCE() {
        valor = "0";
        soma = 0;
        visor.setText(formatStrNumerica(valor, casasDecimais));
        roloPapel.append(alinhaStringDir("-----------------" + "\n"));
        roloPapel.append(alinhaStringDir("" + "\n"));

    }

    public void teclouP() {
        roloPapel.append(alinhaStringDir(formatStrNumerica(valor, casasDecimais) + "%" +
                "\n"));

        roloPapel.append(alinhaStringDir("----------------" + "\n"));
        if (operador == "*")
            soma = soma * (Double.parseDouble(valor) / 100);
        else if (operador == "/")
            soma = soma / (Double.parseDouble(valor) / 100);
        roloPapel.append(alinhaStringDir(formatStrNumerica("" + soma, casasDecimais) +
                " " + "\n"));
        roloPapel.append(alinhaStringDir("" + "\n"));
        visor.setText(formatStrNumerica("" + soma, casasDecimais));
        valorAnterior = "" + soma;
        soma = 0;
        valor = "";
    }

    public void teclouVirgula() {
        if (valor.lastIndexOf('.') == -1)
            valor = valor + ".";
        visor.setText(valor);
    }

    public void teclouBackspace() {
        if (valor.length() == 1)
            valor = "0";
        else
            valor = valor.substring(0, valor.length() - 1);
        visor.setText(valor);
    }

    public void teclouNumeros(String s) {
        if (valor.length() <= 14) {
            if (valor == "0")
                valor = "";
            valor = valor + s;
            visor.setText(valor);
        }
    }

    public void teclouMais() {
        if (valor == "")
            valor = valorAnterior;
        roloPapel.append(alinhaStringDir(formatStrNumerica(valor, casasDecimais) + "+" +
                "\n"));

        soma = soma + Double.parseDouble(valor);
        visor.setText(formatStrNumerica("" + soma, casasDecimais));
        valorAnterior = valor;
        valor = "";
        operador = "+";
    }

    public void teclouMenos() {
        if (valor == "")
            valor = valorAnterior;
        roloPapel.append(alinhaStringDir(formatStrNumerica(valor, casasDecimais) + "-" +
                "\n"));

        soma = soma - Double.parseDouble(valor);
        visor.setText(formatStrNumerica("" + soma, casasDecimais));
        valorAnterior = valor;
        valor = "";
        operador = "-";
    }

    public void teclouDiv() {
        if (valor == "")
            valor = valorAnterior;
        roloPapel.append(alinhaStringDir("----------------" + "\n"));
        roloPapel.append(alinhaStringDir("" + "\n"));
        roloPapel.append(alinhaStringDir(formatStrNumerica(valor, casasDecimais) + "/" + "\n"));
        soma = Double.parseDouble(valor);
        visor.setText(formatStrNumerica("" + soma, casasDecimais));
        valor = "";
        operador = "/";
    }

    public void teclouMultip() {
        if (valor == "")
            valor = valorAnterior;
        roloPapel.append(alinhaStringDir("----------------" + "\n"));
        roloPapel.append(alinhaStringDir("" + "\n"));
        roloPapel.append(alinhaStringDir(formatStrNumerica(valor, casasDecimais) + "*"
                + "\n"));

        soma = Double.parseDouble(valor);
        visor.setText(formatStrNumerica("" + soma, casasDecimais));
        valor = "";
        operador = "*";
    }

    public void teclouEnter() {
        if ((operador == "+") || (operador == "-")) {
            roloPapel.append(alinhaStringDir("----------------" + "\n"));
            roloPapel.append(alinhaStringDir(formatStrNumerica("" +
                    soma, casasDecimais) + "T" + "\n"));
        }
        if ((operador == "/") && (soma != 0)) {
            roloPapel.append(alinhaStringDir(formatStrNumerica(valor, casasDecimais)
                    + "" + "\n"));
            roloPapel.append(alinhaStringDir("----------------" + "\n"));
            soma = soma / Double.parseDouble(valor);
            roloPapel.append(alinhaStringDir(formatStrNumerica("" +
                    soma, casasDecimais) + "=" + "\n"));
        }
        if (operador == "*") {
            roloPapel.append(alinhaStringDir(formatStrNumerica(valor, casasDecimais)
                    + "*" + "\n"));
            roloPapel.append(alinhaStringDir("----------------" + "\n"));
            soma = soma * Double.parseDouble(valor);
            roloPapel.append(alinhaStringDir(formatStrNumerica("" +
                    soma, casasDecimais) + "=" + "\n"));
        }
        roloPapel.append(alinhaStringDir("" + "\n"));
        visor.setText(formatStrNumerica("" + soma, casasDecimais));
        valorAnterior = "" + soma;
        soma = 0;
        valor = "";
    }

    public String alinhaStringDir(String s) {
        String alinhador = "";
        int i;
        for (i = 0; i < (36 - s.length()); i++) {
            alinhador = alinhador + " ";
        }
        return alinhador + s;
    }

    public String formatStrNumerica(String s, int dig) {
        DecimalFormat decimal = new DecimalFormatSymbols();
        decimal.setMinimumFractionDigits(dig);
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setGroupingSeparator(' ,');
        simbolos.setDecimalSeparator(',');
        decimal.setDecimalFormatSymbols(simbolos);
        return decimal.format(new java.math.BigDecimal(s));

    }

    public void addComponent(Component Component, int row, int column, int width, int heigth) {
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheigth = heigth;
        layout.setConstraints(component, constraints);
        container.add(component);
    }

public class ProjetoCalculadora(){
        super ("Calculadora 6.0 (Orrico");
        container = getContentpane();
        layout = new GridBagLayout();
        container.setLayout(layuot);
        constraints = new GridBagConstraints();

       botao1 = new JButton("1");
        botao2 = new JButton("2");
        botao3 = new JButton("3");
        botao4 = new JButton("4");
        botao5 = new JButton("5");
        botao6 = new JButton("6");
        botao7 = new JButton("7");
        botao8 = new JButton("8");
        botao9 = new JButton("9");
        botao0 = new JButton("0");
        botaoC = new JButton("C");
        botaoC.setToolTipText("Tecle C");
        botaoCE = new JButton("CE");
        botaoCE.setToolTipText("Tecle E");
        botaoDiv = new JButton("/");
        botaoMultip = new JButton("*");
        botaoMenos = new JButton("-");
        botaoMais = new JButton("+");
        botaoVirgula = new JButton(",");
        botaoVirgula.setToolTipText("Tecle , (Virgula)");
        botaoTotal = new JButton("T");
        botaoTotal.setToolTipText("Tecle ENTER");
        botaoPerc = new JButton("%");
        botaoPerc.setToolTipText("Tecle P");
        botaoBackspace = new JButton("<");
        botaoBackspace.setToolTipText("Tecle BackSpace");
        keyCodigo = new JLabel("0");
        visor = new JLabel("0.00");
        visor.setHorizontalAlignment(SwingConstants.RIGHT);
        visor.setFont(new Font("Courier New", Font.BOLD, 16));
        visor.setForeground(Color.RED);
        visor.setToolTipText("Valores até 14 digitos");
        roloPapel = new JTextArea(12,15);
        roloPapel.setEditable(false);
        roloPapel.setFont(new Font("Courier New", Font.PLAIN, 11));
        scroll = new JScrollPane(roloPapel,
        ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
        ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBorder(new LineBorder(Color.pink, 3, true));
        botao2dig = new JRadioButton("2", true);
        botao4dig = new JRadioButton("4", false);
        botao6dig = new JRadioButton("6 : Digitos Decimais", false);
        botaoDecimais = new ButtonGroup();
        botaoDecimais.add(botao2dig);
       botaoDecimais.add(botao4dig);
        botaoDecimais.add(botao6dig);
        visor.setFocusable(true);
        botaol.setFocusable(false);
        botao2.setFocusable(false);
        botao3.setFocusable(false);
        botao4.setFocusable(false);
        botao5.setFocusable(false);
        botao6.setFocusable(false);
        botao7.setFocusable(false);
        botao8.setFocusable(false);
        botao9.setFocusable(false);
        botao0.setFocusable(false);
        botaoC.setFocusable(false);
        botaoCE.setFocusable(false);
        botaoMais.setFocusable(false);
        botaoMenos.setFocusable(false);
        botaoDiv.setFocusable(false);
        botaoPerc.setFocusable(false);
        botaoMultip.setFocusable(false);
        roloPapel.setFocusable(false);
        botaoVirgula.setFocusable(false);
        botaoTotal.setFocusable(false);
        botaoBackspace.setFocusable(false);
        botao2dig.setFocusable(false);
        botao4dig.setFocusable(false);
        botao6dig.setFocusable(false);

        constraints.anchor = GridBagConstraints.WEST;
        constraints.weightx = 0;
        constraints.weightx = 1;
        constraints.fill = GridBagConstraints.BOTH;
        addComponent(scroll, 0,0,5,1);
        addComponent(visor, 1,0,5,1);
        addComponent(botao2dig, 2,0,1,1);
        addComponent(botao4dig, 2,1,1,1);
        addComponent(botao6dig, 2,2,3,1);
        constraints.weightx = 0;
        constraints.weightx = 5;
        addComponent(botaoPerc, 3,0,1,1);
        addComponent(botaoCE, 3,4,1,1);
        addComponent(botaoC, 4,4,1,1);
        addComponent(botaoBackspace, 5,4,1,1);
        addComponent(botaoDiv, 3,1,1,1);
        addComponent(botaoMultip, 3,2,1,1);
        addComponent(botaoMenos, 3,3,1,1);
        addComponent(botao7, 4,0,1,1);
        addComponent(botao8, 4,1,1,1);
        addComponent(botao9, 4,2,1,1);
        addComponent(botaoMais, 4,3,1,1);
        addComponent(botao4, 5,0,1,1);
        addComponent(botao5, 5,1,1,1);
        addComponent(botao6, 5,2,1,1);
        addComponent(botaoVirgula, 5,3,1,1);
        addComponent(botaol, 6,0,1,1);
        addComponent(botao2, 6,1,1,1);
        addComponent(botao3, 6,2,1,1);
        addComponent(botao0, 6,3,1,1);
        addComponent(botaoTotal, 6,4,1,1);

        trataEventosAcao handletAcao = new trataEventosAcao();
        botaoC.addActionListener(handletAcao);
        botaoCE.addActionListener(handletAcao);
        botaoPerc.addActionListener(handletAcao);

        botaoDiv.addActionListener(handletAcao);
        botaoMultip.addActionListener(handletAcao);
        botaoMenos.addActionListener(handletAcao);
        botaoMais.addActionListener(handletAcao);
        botaoTotal.addActionListener(handletAcao);
        botaoVirgula.addActionListener(handletAcao);
        botaol.addActionListener(handletAcao);
        botao2.addActionListener(handletAcao);
        botao3.addActionListener(handletAcao);
        botao4.addActionListener(handletAcao);
        botao5.addActionListener(handletAcao);
        botao6.addActionListener(handletAcao);
        botao7.addActionListener(handletAcao);
        botao8.addActionListener(handletAcao);
        botao9.addActionListener(handletAcao);
        botao0.addActionListener(handletAcao);
        botaoBackspace.addActionListener(handletAcao);

        trataEventosFocus handlerFocus = new trataEventosFocus();
        trataEventosRadio handletRadio = new trataEventosRadio();
        botao2dig.addItemListener(handletRadio);
        botao4dig.addItemListener(handletRadio);
        botao6dig.addItemListener(handletRadio);
        visor.addKeyListener(this);
        setSize(285,480);
        Dimension resVideo = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension tamForm = getSize();
        setLocation((resVideo.width - tamForm.width)/2, (resVideo.height - 
tamForm.height)/2);
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        ProjetoCalculadora app = new ProjetoCalculadora();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
