import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class ProjetoCalculadora extends JFrame implements KeyListener {

    // Componentes
    JButton botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8, botao9, botao0;
    JButton botaoC, botaoCE, botaoDiv, botaoMultip, botaoMenos, botaoMais;
    JButton botaoVirgula, botaoTotal, botaoPerc, botaoBackspace;
    JButton botaoRaiz, botaoPot, botaoSin, botaoCos, botaoTan;
    JButton botaoPotXY;
    JButton botaoPot2;
 
    JButton botaoLog, botaoLn, botaoPi;
    JTextArea roloPapel;
    JLabel visor;
    JScrollPane scroll;
    JRadioButton botao2dig, botao4dig, botao6dig;
    ButtonGroup botaoDecimais;

    // Variáveis de controle
    double soma = 0;
    String valor = "0", operador = "", valorAnterior = "";
    int casasDecimais = 2;

    GridBagLayout layout;
    GridBagConstraints constraints;
    Container container;

    public ProjetoCalculadora() {
        super("Calculadora 6.0 (Orrico)");

        container = getContentPane();
        layout = new GridBagLayout();
        container.setLayout(layout);
        constraints = new GridBagConstraints();

        // Criando componentes
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
        botaoCE = new JButton("CE");
        botaoDiv = new JButton("/");
        botaoMultip = new JButton("*");
        botaoMenos = new JButton("-");
        botaoMais = new JButton("+");
        botaoVirgula = new JButton(",");
        botaoTotal = new JButton("T");
        botaoPerc = new JButton("%");
        botaoBackspace = new JButton("<");

        botaoRaiz = new JButton("√");
        botaoPot = new JButton("x²");
        botaoSin = new JButton("sin");
        botaoCos = new JButton("cos");
        botaoTan = new JButton("tan");
        botaoLog = new JButton("log");
        botaoLn = new JButton("ln");
        botaoPi = new JButton("π");
        botaoPotXY = new JButton("xʸ");;
        botaoPot2 = new JButton("x³");

        visor = new JLabel("0.00");
        visor.setHorizontalAlignment(SwingConstants.RIGHT);
        // visor.setFont(new Font("Courier New", Font.BOLD, 16));
        // visor.setForeground(Color.RED);

        roloPapel = new JTextArea(12, 15);
        roloPapel.setEditable(false);
        // roloPapel.setFont(new Font("Courier New", Font.PLAIN, 11));
        scroll = new JScrollPane(roloPapel,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setBorder(new LineBorder(Color.PINK, 3, true));

        botao2dig = new JRadioButton("2", true);
        botao4dig = new JRadioButton("4", false);
        botao6dig = new JRadioButton("6", false);
        botaoDecimais = new ButtonGroup();
        botaoDecimais.add(botao2dig);
        botaoDecimais.add(botao4dig);
        botaoDecimais.add(botao6dig);

        // Adicionando componentes
        constraints.fill = GridBagConstraints.BOTH;
        addComponent(scroll, 0, 0, 5, 1);
        addComponent(visor, 1, 0, 5, 1);
        addComponent(botao2dig, 2, 0, 1, 1);
        addComponent(botao4dig, 2, 1, 1, 1);
        addComponent(botao6dig, 2, 2, 3, 1);
        addComponent(botaoPerc, 3, 0, 1, 1);
        addComponent(botaoCE, 3, 4, 1, 1);
        addComponent(botaoC, 4, 4, 1, 1);
        addComponent(botaoBackspace, 5, 4, 1, 1);
        addComponent(botaoDiv, 3, 1, 1, 1);
        addComponent(botaoMultip, 3, 2, 1, 1);
        addComponent(botaoMenos, 3, 3, 1, 1);
        addComponent(botao7, 4, 0, 1, 1);
        addComponent(botao8, 4, 1, 1, 1);
        addComponent(botao9, 4, 2, 1, 1);
        addComponent(botaoMais, 4, 3, 1, 1);
        addComponent(botao4, 5, 0, 1, 1);
        addComponent(botao5, 5, 1, 1, 1);
        addComponent(botao6, 5, 2, 1, 1);
        addComponent(botaoVirgula, 5, 3, 1, 1);
        addComponent(botao1, 6, 0, 1, 1);
        addComponent(botao2, 6, 1, 1, 1);
        addComponent(botao3, 6, 2, 1, 1);
        addComponent(botao0, 6, 3, 1, 1);
        addComponent(botaoTotal, 6, 4, 1, 1);

        addComponent(botaoSin, 7, 0, 1, 1);
        addComponent(botaoCos, 7, 1, 1, 1);
        addComponent(botaoTan, 7, 2, 1, 1);
        addComponent(botaoLog, 7, 3, 1, 1);
        addComponent(botaoLn, 7, 4, 1, 1);

        addComponent(botaoRaiz, 8, 0, 1, 1);
        addComponent(botaoPot, 8, 1, 1, 1);
        addComponent(botaoPotXY, 8, 2, 1, 1);
        addComponent(botaoPi, 8, 3, 1, 1);
        addComponent(botaoPot2, 8, 4, 1, 1);

   

        // Tratamento de eventos
        TrataEventosAcao handletAcao = new TrataEventosAcao(this);
        botaoC.addActionListener(handletAcao);
        botaoCE.addActionListener(handletAcao);
        botaoPerc.addActionListener(handletAcao);
        botaoDiv.addActionListener(handletAcao);
        botaoMultip.addActionListener(handletAcao);
        botaoMenos.addActionListener(handletAcao);
        botaoMais.addActionListener(handletAcao);
        botaoTotal.addActionListener(handletAcao);
        botaoVirgula.addActionListener(handletAcao);
        botao1.addActionListener(handletAcao);
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

        botaoRaiz.addActionListener(handletAcao);
        botaoPot.addActionListener(handletAcao);
        botaoSin.addActionListener(handletAcao);
        botaoCos.addActionListener(handletAcao);
        botaoTan.addActionListener(handletAcao);
        botaoPot2.addActionListener(handletAcao);

        // Eventos das casas decimais
        TrataEventosRadio handletRadio = new TrataEventosRadio(this);
        botao2dig.addItemListener(handletRadio);
        botao4dig.addItemListener(handletRadio);
        botao6dig.addItemListener(handletRadio);

        visor.addKeyListener(this);

        // --- chamamondo a classe de estilo separada ---
        EstiloCalculadora.aplicaEstilo(this);
        setSize(350, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // visor.addKeyListener(this);

        // setSize(285, 480);
        // setResizable(false);
        // setLocationRelativeTo(null);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setVisible(true);
    }

    
    public void calcula() {
    if (valor.isEmpty()) return;

    double num = Double.parseDouble(valor);

    switch (operador) {
        case "+":
            soma += num;
            break;
        case "-":
            soma -= num;
            break;
        case "*":
            soma *= num;
            break;
        case "/":
            if (num != 0)
                soma /= num;
            else
                JOptionPane.showMessageDialog(this, "Divisão por zero!");
            break;
        case "%":
            soma = num / 100.0;
            break;
        default:
            soma = num;
    }

    visor.setText(String.valueOf(soma));
    valorAnterior = String.valueOf(soma);
    valor = "";
}

   // Tornado os metodos Publicos

public void teclouNumeros(String s) {
    if (valor.length() <= 14) {
        valor = valor.equals("0") ? s : valor + s;
        visor.setText(valor);
    }
}

public void teclouC() {
    valor = "0";
    visor.setText(valor);
}

public void teclouCE() {
    valor = "0";
    soma = 0;
    visor.setText(valor);
}

public void teclouBackspace() {
    if (valor.length() > 1)
        valor = valor.substring(0, valor.length() - 1);
    else
        valor = "0";
    visor.setText(valor);
}

public void teclouEnter() {
    calcula();
    operador = "";
}

public void teclouP() {
    operador = "%";
    calcula();
}

public void teclouMais() {
    calcula();
    operador = "+";
}

public void teclouMenos() {
    calcula();
    operador = "-";
}

public void teclouMultip() {
    calcula();
    operador = "*";
}

public void teclouDiv() {
    calcula();
    operador = "/";
}

public void teclouVirgula() {
    if (!valor.contains(".")) {
        valor += ".";
        visor.setText(valor);
    }
}

// Cientifica 

public void teclouRaiz() {
    double num = Double.parseDouble(valor);
    soma = Math.sqrt(num);
    visor.setText(String.valueOf(soma));
    valor = "";
}

public void teclouPot() {
    double num = Double.parseDouble(valor);
    soma = Math.pow(num, 2);
    visor.setText(String.valueOf(soma));
    valor = "";
}

public void teclouPot2() {
    double num = Double.parseDouble(valor);
    soma = Math.pow(num, 3);
    visor.setText(String.valueOf(soma));
    valor = "";
}

public void teclouSin() {
    double num = Double.parseDouble(valor);
    soma = Math.sin(Math.toRadians(num));
    visor.setText(String.valueOf(soma));
    valor = "";
}

public void teclouCos() {
    double num = Double.parseDouble(valor);
    soma = Math.cos(Math.toRadians(num));
    visor.setText(String.valueOf(soma));
    valor = "";
}

public void teclouTan() {
    double num = Double.parseDouble(valor);
    soma = Math.tan(Math.toRadians(num));
    visor.setText(String.valueOf(soma));
    valor = "";
}


public void teclouLog() {
    double num = Double.parseDouble(valor);
    soma = Math.log10(num);
    visor.setText(String.valueOf(soma));
}

public void teclouLn() {
    double num = Double.parseDouble(valor);
    soma = Math.log(num);
    visor.setText(String.valueOf(soma));
}

public void teclouPi() {
    valor = String.valueOf(Math.PI);
    visor.setText(valor);
}

    private void addComponent(Component c, int row, int col, int width, int height) {
        constraints.gridx = col;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints(c, constraints);
        container.add(c);
    }

    // Métodos auxiliares de visor e rolo de papel
    public String alinhaStringDir(String s) {
        String alinhador = "";
        for (int i = 0; i < 36 - s.length(); i++) {
            alinhador += " ";
        }
        return alinhador + s;
    }

    public static void main(String[] args) {
        new ProjetoCalculadora();
    }

   @Override
public void keyPressed(KeyEvent e) {
    int key = e.getKeyCode();

    if (key == KeyEvent.VK_ESCAPE) System.exit(0);

    else if (key >= KeyEvent.VK_0 && key <= KeyEvent.VK_9 ||
             key >= KeyEvent.VK_NUMPAD0 && key <= KeyEvent.VK_NUMPAD9) {
        valor = valor.equals("0") ? String.valueOf(e.getKeyChar()) : valor + e.getKeyChar();
        visor.setText(valor);
    } else {
        switch (key) {
            case KeyEvent.VK_ADD, KeyEvent.VK_PLUS -> { calcula(); operador = "+"; }
            case KeyEvent.VK_SUBTRACT, KeyEvent.VK_MINUS -> { calcula(); operador = "-"; }
            case KeyEvent.VK_MULTIPLY -> { calcula(); operador = "*"; }
            case KeyEvent.VK_DIVIDE -> { calcula(); operador = "/"; }
            case KeyEvent.VK_P -> { operador = "%"; calcula(); }
            case KeyEvent.VK_ENTER -> { calcula(); operador = ""; }
            case KeyEvent.VK_BACK_SPACE -> { 
                valor = valor.length() > 1 ? valor.substring(0, valor.length() - 1) : "0"; 
                visor.setText(valor);
            }
            case KeyEvent.VK_COMMA, KeyEvent.VK_PERIOD -> { 
                if (!valor.contains(".")) valor += "."; 
                visor.setText(valor);
            }
        }
    }
}

@Override
public void keyReleased(KeyEvent e) {
    // Método obrigatório, pode deixar vazio
}

@Override
public void keyTyped(KeyEvent e) {
    // Método obrigatório, pode deixar vazio
}
}