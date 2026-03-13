import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class EstiloCalculadora {

    public static void aplicaEstilo(ProjetoCalculadora calc) {
        // Estilo do visor
        calc.visor.setFont(new Font("Courier New", Font.BOLD, 30));
        calc.visor.setForeground(Color.RED);

        // Estilo do rolo de papel
        calc.roloPapel.setFont(new Font("Courier New", Font.PLAIN, 11));
        calc.scroll.setBorder(new LineBorder(Color.PINK, 3, true));

        // Estilo dos botões
        JButton[] botoes = {
            calc.botao0, calc.botao1, calc.botao2, calc.botao3,
            calc.botao4, calc.botao5, calc.botao6, calc.botao7,
            calc.botao8, calc.botao9, calc.botaoC, calc.botaoCE,
            calc.botaoDiv, calc.botaoMultip, calc.botaoMenos,
            calc.botaoMais, calc.botaoVirgula, calc.botaoTotal,
            calc.botaoPerc, calc.botaoBackspace,calc.botaoC,calc.botaoCE,

    

            // botões científicos
            calc.botaoRaiz,
            calc.botaoPot,
            calc.botaoPot2,
            calc.botaoPotXY,
            calc.botaoSin,
            calc.botaoCos,
            calc.botaoTan,
            calc.botaoLog,
            calc.botaoLn,
            calc.botaoPi

        };

        for (JButton b : botoes) {
            b.setFont(new Font("Arial", Font.BOLD, 22));
            b.setBackground(new Color(220,220,220));
            b.setForeground(Color.BLACK);
            b.setFocusPainted(false);
            b.setPreferredSize(new Dimension(260, 100));   // aumenta o tamanho do botão
          
            b.setOpaque(true);
            b.setBorderPainted(false);

        
        }
          calc.botaoMais.setBackground(new Color(255,140,0));
          calc.botaoMenos.setBackground(new Color(255,140,0));
          calc.botaoMultip.setBackground(new Color(255,140,0));
          calc.botaoDiv.setBackground(new Color(255,140,0));
          calc.botaoPerc.setBackground(new Color(255,140,0));
          calc.botaoCE.setBackground( new Color(255, 127, 127));
          calc.botaoC.setBackground( new Color(255, 127, 127));
        

        // Estilo dos radio buttons
        JRadioButton[] radios = { calc.botao2dig, calc.botao4dig, calc.botao6dig };
        for (JRadioButton r : radios) {
            r.setFont(new Font("Arial", Font.PLAIN, 15));
            r.setBackground(Color.WHITE);
        }

        // Fundo da calculadora
        calc.getContentPane().setBackground(Color.BLACK);
    }
}