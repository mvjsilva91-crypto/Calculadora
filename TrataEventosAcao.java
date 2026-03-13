private class trataEventosAcao implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == botaoC)
            teclouC();
        else if (event.getSource() == botaoCE)
            teclouCE();
        else if (event.getSource() == botaoPerc)
            teclouP();
        else if (event.getSource() == botaoVirgula)
            teclouVirgula();
        else if (event.getSource() == botaoBackspace)
            teclouBackspace();
        else if (event.getSource() == botao1)
            teclouNumeros("1");
        else if (event.getSource() == botao2)
            teclouNumeros("2");
        else if (event.getSource() == botao3)
            teclouNumeros("3");
        else if (event.getSource() == botao4)
            teclouNumeros("4");
        else if (event.getSource() == botao5)
            teclouNumeros("5");
        else if (event.getSource() == botao6)
            teclouNumeros("6");
        else if (event.getSource() == botao7)
            teclouNumeros("7");
        else if (event.getSource() == botao8)
            teclouNumeros("8");
        else if (event.getSource() == botao9)
            teclouNumeros("9");
        else if (event.getSource() == botao0)
            teclouNumeros("0");
        else if (event.getSource() == botaoMais)
            teclouMais();
        else if (event.getSource() == botao6)
            teclouMenos();
        else if (event.getSource() == botao6)
            teclouDiv();
        else if (event.getSource() == botao6)
            teclouMultip();
        else if (event.getSource() == botao6)
            teclouEnter();
    }

}