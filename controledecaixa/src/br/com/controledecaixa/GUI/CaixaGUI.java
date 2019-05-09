package br.com.controledecaixa.GUI;

import br.com.controledecaixa.Business.Caixa;
import br.com.controledecaixa.Utilities.ControleDeCaixaException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CaixaGUI extends JFrame implements ActionListener, WindowListener {

    protected Dimension dLabel, dFrame, dTextField, dTextArea, dButton;
    protected Label lblValor, lblSaldo;
    protected TextField txtValor, txtSaldo;
    protected Button btnEntrada, btnRetirada, btnConsulta, btnSair;
    protected TextArea txtMsg;
    protected Caixa caixa;

    public CaixaGUI() {
        //instanciar uma caixa
        caixa = new Caixa();
        //Definir aparencia da janela
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        dFrame = new Dimension(350,400);
        setSize(dFrame);
        setResizable(false);
        setTitle("Controle de Caixa");
        setLayout(null);
        //Definir os atributos
        dLabel = new Dimension(40,20);

        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        this.add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25,80);
        this.add(lblSaldo);

        dTextField = new Dimension(150,20);
        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        this.add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75,80);
        this.add(txtSaldo);

        dButton = new Dimension(95,20);

        btnEntrada = new Button("Depositar");
        btnEntrada.setSize(dButton);
        btnEntrada.setLocation(25,150);
        this.add(btnEntrada);
        btnEntrada.addActionListener(this);

        btnConsulta = new Button("Consultar");
        btnConsulta.setSize(dButton);
        btnConsulta.setLocation(25,185);
        this.add(btnConsulta);
        btnConsulta.addActionListener(this);

        btnRetirada = new Button("Sacar");
        btnRetirada.setSize(dButton);
        btnRetirada.setLocation(180,150);
        this.add(btnRetirada);
        btnRetirada.addActionListener(this);

        btnSair = new Button("Sair");
        btnSair.setSize(dButton);
        btnSair.setLocation(180,185);
        btnSair.addActionListener(this);
        this.add(btnSair);

        dTextArea = new Dimension(300,140);
        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        this.add(txtMsg);

        addWindowListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnSair){
            String msg = "Finalizando o caixa!";
            JOptionPane.showMessageDialog(null, msg,
                    "FIM", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(e.getSource()==btnEntrada){
            double valor =Double.parseDouble(txtValor.getText());
            String retorno = caixa.depositar(valor);
            txtMsg.append(retorno + "\n");
            txtValor.setText(null);
            txtValor.requestFocus();
        }
        if(e.getSource()==btnConsulta){
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
            txtValor.requestFocus();
        }
        if(e.getSource()==btnRetirada){
            try{
                double valor =Double.parseDouble(txtValor.getText());
                String retorno = caixa.sacar(valor);
                txtMsg.append(retorno + "\n");
                txtValor.setText(null);
                txtValor.requestFocus();
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,
                        "Tipo de dado Inválido",
                        "Aconteceu o erro",
                        JOptionPane.ERROR_MESSAGE);
            } catch (ControleDeCaixaException ex) {
                JOptionPane.showMessageDialog(null,
                        ex.getMessage(2),
                        "Aconteceu o erro",
                        JOptionPane.ERROR_MESSAGE);
            }

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