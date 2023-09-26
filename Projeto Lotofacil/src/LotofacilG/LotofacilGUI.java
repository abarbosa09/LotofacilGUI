package LotofacilG;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class LotofacilGUI extends JFrame {
    // Atributos
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou ímpar");
    private JLabel jLabelMensagem = new JLabel("Exemplo de Simples Janela");

    // Construtor
    public LotofacilGUI() {
        this.setTitle("Lotofácil - Interface Gráfica");
        this.setSize(400, 200);
        this.add(painel);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255, 255, 255));

        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aposta = JOptionPane.showInputDialog(null, "Digite um numero de 0 a 100.");
                Random random = new Random();
                int numeroSorteado = random.nextInt(101);
                int numeroApostado = Integer.parseInt(aposta);

                if (numeroApostado < 0 || numeroApostado > 100) {
                    //System.out.println("Aposta inválida.");
                    JOptionPane.showMessageDialog(null, "Aposta inválida.");
                } else if (numeroApostado == numeroSorteado) {
                    // System.out.println("Você ganhou R$ 1.000,00 reais.");
                    JOptionPane.showMessageDialog(null, "Você ganhou R$ 1.000,00 reais.");
                } else {
                    // System.out.println("Que pena! O número sorteado foi: " + numeroSorteado + ".");
                    JOptionPane.showMessageDialog(null, "Que pena! O número sorteado foi: " + numeroSorteado + ".");
                }
            }
        });


        jButtonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aposta = JOptionPane.showInputDialog(null, "Digite uma letra de A a Z: ");
                Random random = new Random();
                char letraPremiada  = (char) ('A' + random.nextInt(26));

                if (aposta != null && aposta.length() == 1 && Character.isLetter(aposta.charAt(0))) {
                    char letraApostada = aposta.toUpperCase().charAt(0);
                    if (letraApostada == letraPremiada) {
                        JOptionPane.showMessageDialog(null, "Você ganhou R$ 500,00 reais.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Que pena! A letra sorteada foi: " + letraPremiada + ".");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Aposta inválida.");
                }
            }
        });

        jButtonAposta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String aposta = JOptionPane.showInputDialog(null, "Digite um número inteiro: ");
                Random random = new Random();
                int numeroParImpar = random.nextInt();

                if (numeroParImpar % 2 == 0) {
                    JOptionPane.showMessageDialog(null,"Você ganhou R$ 100,00 reais.");
                } else {
                    JOptionPane.showMessageDialog(null,"Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                }
            }
        });

        painel.add(jButtonAposta1);
        painel.add(jButtonAposta2);
        painel.add(jButtonAposta3);
        painel.add(jLabelMensagem);


    }

    public static void main(String[] args) {new LotofacilGUI();}


    }

