package com.mypackage;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Tasks {

    // Step 4.3.1
    private static void configureLogging() {
        Logger logA = Logger.getLogger("org.stepic.java.logging.ClassA");
        Logger logB = Logger.getLogger("org.stepic.java.logging.ClassB");
        Logger log = Logger.getLogger("org.stepic.java");

        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(new XMLFormatter());

        logA.setLevel(Level.ALL);
        logB.setLevel(Level.WARNING);

        log.setUseParentHandlers(false);

        handler.setLevel(Level.ALL);
        log.addHandler(handler);
    }
}
