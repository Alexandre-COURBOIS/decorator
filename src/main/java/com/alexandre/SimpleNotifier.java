package com.alexandre;

import com.alexandre.interfaces.Notifier;

public class SimpleNotifier implements Notifier {


    @Override
    public void send(String message) {
        //Cas de traitement par défaut on peut le retirer, c'est juste histoire d'éxecuter une action commune si besoin.
        System.out.println("Message simple par défaut: " + message);
    }
}
