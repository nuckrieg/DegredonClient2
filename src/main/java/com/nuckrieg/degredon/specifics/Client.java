/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.specifics;

import com.nuckrieg.degredon.functions.Calculator;
import com.nuckrieg.degredon.panels.GamePanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author FabioAbreu
 */
public class Client {

    Object[] dataReceived = new Object[3];
    Socket socket = null;
    ObjectOutputStream oos = null;
    public static int clientPort = 12345;
    public static String clientIp = "localhost";
    public static final String CLIENTVERSION1 = "0.0.1-ALPHA";
    public static String CLIENTVERSION2 = System.getProperty("CLIENTVERSION", CLIENTVERSION1);
    private ObjectInputStream ois;
    String gameResult;

    public Client() {

    }

    public static void main(String args[]) {
        Client client = new Client();
        Player player = new Player();
        Stats stats = new Stats();
        stats.randomizeAllStats();
        player.setStats(stats);
        player.setName("Nuckrieg");
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("SENDING DATA");
                // client.sendData(player);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("RECEIVING DATA");
                client.receiveData();
            }
        }).start();

    }

    public void receiveData() {

        try {
            //System.out.println("R1");
            //openSocket(clientIp, clientPort);
            setOIS(socket);
            //System.out.println("R2");
            if (socket.isConnected()) {

                Player player1 = (Player) ois.readObject();
                // System.out.println(dataReceived[0].getClass().getName());
                Player player2 = (Player) ois.readObject();
                //   System.out.println(dataReceived[1].getClass().getName());
                String background = (String) ois.readObject();

                Calculator game = (Calculator) ois.readObject();
                // System.out.println(dataReceived[2].getClass().getName());

                showFight(player1, player2, background, game);
                //closeObject(oos);
                // System.out.println("R3");
            }
            while (socket.isConnected()) {
                Object received = ois.readObject();
//                if (received instanceof String) {
//                    System.out.println("ON STRING!");
                System.out.println((String) received);
//                }
//                if (received instanceof JFrame) {
//                    JFrame frame = (JFrame) received;
//                    System.out.println("ON FRAME!");
//                    // System.out.println("IT IS A FRAME LMFAO");
//                    new Thread(new Runnable() {
//                        @Override
//                        public void run() {
//                            
//                            frame.setSize(1440, 900);
//                            frame.setVisible(true);
//                        }
//                    }).start();
//                    
//                    
//                }
            }

        } catch (Exception exc) {
            //System.out.println("R4");
            if (exc instanceof ConnectException) {
                // System.out.println("R5");
                JOptionPane.showMessageDialog(null, "Server is not ready!", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                // System.out.println("R6");
                exc.printStackTrace();
            }
        }

    }

    public void sendData(Object obj) {

        try {
            //  System.out.println("S1");

            openSocket(clientIp, clientPort);
            //  System.out.println("S2");
            setOOS(socket);
            // System.out.println("S3");
            sendObject(oos, obj);
            //  System.out.println("S4");
            // closeObject(oos);

            // System.out.println("SENT!");
            //  socket.close();
        } catch (Exception exc) {
            // System.out.println("S5");
            if (exc instanceof ConnectException) {
                //     System.out.println("S6");
                JOptionPane.showMessageDialog(null, "Server is not ready!", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                //    System.out.println("S7");
                exc.printStackTrace();
            }
        }

    }

    public void sendObject(ObjectOutputStream oos, Object obj) {
        try {
            oos.writeObject(obj);
            // oos.writeObject(background);
        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }

    public String receiveObject(ObjectInputStream ois) {
        try {
            return (String) ois.readObject();
        } catch (Exception exc) {
            exc.printStackTrace();
            return "WTF";
        }

    }

    public void closeObject(ObjectOutputStream oos) throws IOException {
        oos.close();
    }

    public void openSocket(String host, int port) throws IOException {
        socket = new Socket(host, port);
    }

    public void closeSocket(Socket skt) throws IOException {
        skt.close();
    }

    public ObjectOutputStream setOOS(Socket skt) throws IOException {
        OutputStream os = skt.getOutputStream();
        oos = new ObjectOutputStream(os);
        return oos;

    }

    public ObjectInputStream setOIS(Socket skt) throws IOException {
        InputStream is = skt.getInputStream();
        ois = new ObjectInputStream(is);
        return ois;
    }

    private void showFight(Player player1, Player player2, String background, Calculator game) throws IOException {
        JFrame frame = new JFrame("FIGHT!");
        frame.setSize(1440, 900);
        
        GamePanel gamePanel = new GamePanel(player1, player2, background, game);
     
        
        JLabel label1 = new JLabel("TESTE DE COLOCACAO 1");
        label1.setBackground(Color.red);
        label1.setSize(450, 50);
        label1.setBounds(100, 100, 450 , 50);
        
        JLabel label2 = new JLabel("TESTE DE COLOCACAO 2");
        label2.setBackground(Color.red);
        label2.setSize(450, 50);
        label2.setBounds(gamePanel.getWidth() - 550, 100, 450 , 50);
        
        gamePanel.add(label1);
        gamePanel.add(label2);
       // gamePanel.add(dummy, BorderLayout.NORTH);
        frame.add(gamePanel);
        
        
        frame.setVisible(true);
        
        beginLogic(player1, player2, game);

    }

    private void beginLogic(Player finalPlayer1, Player finalPlayer2, Calculator game) {
        
        new Thread(new Runnable() {
            @Override
            public void run() {

                do {
                    try {
                        Thread.sleep(500);
                        //System.out.println("DELAYING " + (long) game.getAttackDelay(finalPlayer1));
                        Thread.sleep((long) game.getAttackDelay(finalPlayer1));
                        float p1DamageDealt = game.fight(finalPlayer1, finalPlayer2);

                        //sendToPlayerOne.writeObject(game);
                        game.setCurrentHp(finalPlayer2, p1DamageDealt);
                        if (game.getCurrentHp(finalPlayer1) <= 0 || game.getCurrentHp(finalPlayer2) <= 0) {
                            break;
                        }

                        System.out.println("YOU DEALT " + p1DamageDealt + "!");

                        System.out.println("YOU TOOK " + p1DamageDealt + "!");
                        System.out.println("ENEMY HAS " + game.getCurrentHp(finalPlayer2) + " HP LEFT!");
                        System.out.println("YOU HAVE " + game.getCurrentHp(finalPlayer2) + " HP LEFT!");
                        //sendToPlayerOne.writeObject(p1DamageDealt);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                } while (finalPlayer1.getCurrentHp() > 0 && finalPlayer2.getCurrentHp() > 0);
                if (finalPlayer1.getCurrentHp() <= 0 && finalPlayer2.getCurrentHp() > 0) {
                    gameResult = "YOU LOSE!";
                } else if (finalPlayer2.getCurrentHp() <= 0 && finalPlayer1.getCurrentHp() > 0) {
                    gameResult = "YOU WIN!";
                } else {
                    gameResult = "IT'S A TIE!\n"
                            + "Your HP : " + finalPlayer1.getCurrentHp() + "\n"
                            + "Enemy HP:" + finalPlayer2.getCurrentHp();

                }
                System.out.println(gameResult);
            }

        }).start();
    }

}
