package com.andres;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    private final static Logger log = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        log.info("Hello info");
        log.debug("Hello debug");
        log.warn("Hello warn");
    }
}
