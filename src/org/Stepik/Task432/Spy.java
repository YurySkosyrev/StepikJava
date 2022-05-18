package org.Stepik.Task432;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Spy implements MailService{
    public static final String AUSTIN_POWERS = "Austin Powers";
    Logger lg;
    public Spy(Logger lg) {
        this.lg = lg;
    }

    public Sendable processMail(Sendable mail) throws RuntimeException{

        String message;
        String to;
        String from;

        if (mail instanceof MailMessage){
            to = mail.getTo();
            from = mail.getFrom();
            message = ((MailMessage) mail).getMessage();
            if (AUSTIN_POWERS.equals(to) || AUSTIN_POWERS.equals(from)){
                lg.log(Level.WARNING,
                        "Detected target mail correspondence: from {0} to {1} \"{2}\"", new Object[]{from,to, message});

            }else lg.log(Level.INFO,"Usual correspondence: from {0} to {1}",new Object[]{from,to});
        }
        return mail;
    }

}
