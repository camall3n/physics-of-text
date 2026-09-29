package org.ucb.generative_ie.util;
import org.junit.Test;
//import java.util.logging.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.slf4j.Marker;
//import org.slf4j.MarkerFactory;


/**
 *
 *
 */
public class LoggerTest {
    public LoggerTest(){
        
    }
    
    @Test
    public void test() {

        Logger logger = LoggerFactory.getLogger(LoggerTest.class);
        Logger mhlogger = LoggerFactory.getLogger("MHpropopsam.splitmerge.mentions");
        //LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        //StatusPrinter.print(lc);
        //lc.start();
        logger.trace("trace");
        logger.debug("debuging");
        mhlogger.debug("mh debug");
        mhlogger.trace("mh trace");
        //lc.stop();
        //Marker fatal = MarkerFactory.getMarker("FATA");
        //Logger logger = LoggerFactory.getLogger("alogger");
//
        //logger.info("ok");
        int k=2; 
        logger.debug("new {} {}", k, k); 

        //logger.info("{} {} {}", k, k, k);
        //logger.info("OOO {}", fatal);
        //logger.trace("trace");
        //logger.info("{}", logger.isTraceEnabled());
        //logger.info("{}", logger.isDebugEnabled());

        
    }
    
    public static void main() {
        //Logger logger = LoggerFactory.getLogger(LoggerTest.class);
        //int k=2; 
        //logger.info("OK");
        //logger.debug("new {} {}", k, k); 
    }
}
