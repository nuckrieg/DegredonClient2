/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nuckrieg.degredon.client;

import com.nuckrieg.degredon.functions.Calculator;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * A server program which accepts requests from clients to capitalize strings.
 * When a client connects, a new thread is started to handle it. Receiving
 * client data, capitalizing it, and sending the response back is all done on
 * the thread, allowing much greater throughput because more clients can be
 * handled concurrently.
 */
public class Server {

    static Player player = null;
    static Enemy enemy = null;
    static Player[] allPlayers = new Player[2];
    

    /**
     * Runs the server. When a client connects, the server spawns a new thread
     * to do the servicing and immediately returns to listening. The application
     * limits the number of threads via a thread pool (otherwise millions of
     * clients could cause the server to run out of resources by allocating too
     * many threads).
     */
    public static void main(String[] args) throws Exception {

        ServerSocket listener = new ServerSocket(12345);
        System.out.println("Servidor ouvindo a porta 12345");
        while (true) {

            Socket socket = listener.accept();

            System.out.println("Connected: " + socket);
            InputStream is = socket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);
            Object objectFromClient = ois.readObject();
            // System.out.println("closing ois");
            // ois.close();
            // socket.close();
            
            
            if (allPlayers[0] == null) {
                allPlayers[0] = (Player) objectFromClient;
            } else {
                allPlayers[1] = (Player) objectFromClient;
            }
            if (allPlayers[0] != null && allPlayers[1] != null) {

                final Player finalPlayer1 = allPlayers[0];
                final Player finalPlayer2 = allPlayers[1];
                finalPlayer1.setName("Nuckrieg");
                finalPlayer2.setName("O Mega Bot!");
                System.out.println("TEMOS JOGO BOYS!");
                Calculator game = new Calculator();
                game.fight(finalPlayer1, finalPlayer2);
                allPlayers = null;
            }

        }

    }

    private static class Capitalizer implements Runnable {

        private Socket socket;

        Capitalizer(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {

        }
    }
}
