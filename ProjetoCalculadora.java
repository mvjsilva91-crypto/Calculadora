import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridbagConstrainer;
import java.awt.GridBaglayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.ActionListener;
import java.awt.FocusEvent;
import java.awt.FocusListener;
import java.awt.ItemEvent;
import java.awt.ItemListener;
import java.awt.KeyEvent;
import java.awt.KeyListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class ProjetoCalculadora extends JFrame implements KeyListener {
    private JButton botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8,
            botao9, botao0, botaoC, botaoCE, botaoDiv, botaoMultip, botaoMenos, botaoMais,
            botaoVirgula, botaoTotal, botaoPerc, botaoBackspace;
    private JTextArea roloPapel;
    private JLabel visor, keyCodigo;
    private JScrollPane scroll;
    private double soma = 0;
    private String valor = "", operador = "", valorAnterior = "";
    private Container container;
    private GridBagLayout layout;
    private GridBagConstraints constraints;
    private JRadioButton botao2dig, botao4dig, botao6dig;
    private ButtonGroup botaoDecimais;
    private int casasDecimais = 2;


