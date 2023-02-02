package ru.geekbrains.lesson_14.ClassWork;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
@Log4j2
public class LoggingExample {
//    public static final Logger log = LogManager.getLogger();
//    public static final Logger log = LogManager.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        int pl1 = 1453;
        String pl2 ="Some string";
        log.trace("Trace log");
        log.debug("Debug log");
        log.info("Info{} log{}",pl2,pl1);
        log.warn("Warn log");
        log.error("Error log");
        log.fatal("Fatal log");

        try {
            throw new RuntimeException("AAAAAAAAA");
        } catch (RuntimeException e){
//            log.error(e);
            log.throwing(Level.ERROR,e);
        }
    }
}
