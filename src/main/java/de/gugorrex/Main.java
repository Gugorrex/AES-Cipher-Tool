package de.gugorrex;

import de.gugorrex.logging.NoticeLogger;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = new NoticeLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("HelloWorld");
        logger.fatal(new Exception(new NullPointerException("hi")));
    }
}
