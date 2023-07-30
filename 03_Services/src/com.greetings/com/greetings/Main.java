package com.greetings;

import java.io.IOException;

import com.socket.NetworkSocket;

public class Main {
    public static void main(String[] args) {
        try {
            NetworkSocket socket = NetworkSocket.open();
            System.out.println(socket.getClass());
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
