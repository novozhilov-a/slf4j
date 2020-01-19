package com.novozhilov;
import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

public class MainClass {
    static Logger logger = Logger.getLogger(MainClass.class);
    public static void main(String[] args) {

        logger.trace("trace");
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
        logger.fatal("fatal");

        Logger.getRootLogger().trace(new MainClass());
        org.slf4j.Logger slf4jlogger = LoggerFactory.getLogger(MainClass.class);
        slf4jlogger.info("slf4j");
        slf4jlogger.trace("trace");
        slf4jlogger.debug("debug");
        slf4jlogger.info("info");
        slf4jlogger.warn("warn");
        slf4jlogger.error("error");
        //slf4jlogger.fatal("fatal");

    }

    @Override
    public String toString() {
        return "it's me";
    }
}
