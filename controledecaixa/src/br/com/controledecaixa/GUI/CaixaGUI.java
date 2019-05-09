package br.com.controledecaixa.GUI;

import br.com.controledecaixa.Business.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CaixaGUI extends JFrame implements ActionListener, WindowListener {

    protected Dimension dLabel, dFrame, dTextField, dTextArea, dButton;
    protected Label lblValor;
    protected Label lblSaldo;
    protected TextField txtValor;
    protected TextField txtSaldo;
    protected Button btnEntrada;
    protected Button btnRetirada;
    protected Button btnConsulta;
    protected Button btnSair;
    protected TextArea txtMsg;
    protected Caixa caixa;

    public CaixaGUI() {
        //instanciar uma caixa
        caixa = new Caixa();
        //Definir aparencia da janela
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        dFrame = new Dimension(350, 400);
        setSize(dFrame);
        setTitle("Controle de Caixa");
        setLayout(null);
        setResizable(false);

        //Definir os atributos
        //Labels
        dLabel = new Dimension(40, 20);

        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        add(lblSaldo);

        //TextFields
        dTextField = new Dimension(150, 20);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75, 50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        add(txtSaldo);

        //Botoes
        dButton = new Dimension(95, 20);

        btnEntrada = new Button("Depositar");
        btnEntrada.setSize(dButton);
        btnEntrada.setLocation(25, 150);
        add(btnEntrada);

        btnConsulta = new Button("Consultar");
        btnConsulta.setSize(dButton);
        btnConsulta.setLocation(25, 185);
        add(btnConsulta);

        btnRetirada = new Button("Sacar");
        btnRetirada.setSize(dButton);
        btnRetirada.setLocation(180, 150);
        add(btnRetirada);

        btnSair = new Button("Sair");
        btnSair.setSize(dButton);
        btnSair.setLocation(180, 185);
        btnSair.addActionListener(this);
        add(btnSair);

        //TextArea
        dTextArea = new Dimension(300, 140);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25, 220);
        add(txtMsg);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSair){
            String msg = "Finalizando caixa";
            JOptionPane.showMessageDialog(null, msg, "FIM", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }

        if(e.getSource() == btnEntrada){
            double valor = Double.parseDouble(txtValor.getText());
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}