/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.specifics;

import com.nuckrieg.degredon.panels.GamePanel;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
                // System.out.println(dataReceived[2].getClass().getName());
                showFight(player1, player2, background);
                //closeObject(oos);
                // System.out.println("R3");
            }
            while (socket.isConnected()) {
                Object received = ois.readObject();
//                if (received instanceof String) {
//                    System.out.println("ON STRING!");
                System.out.println((String)received);
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

    private void showFight(Player player1, Player player2, String background) throws IOException {
        JFrame frame = new JFrame("FIGHT!");
        frame.add(new GamePanel(player1, player2, background));
        frame.setSize(1440,900);
        frame.setVisible(true);
        
    }

}
