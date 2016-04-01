import java.time.LocalDateTime;


import org.apache.log4j.Logger;

/**
 * Created by wmeijer on 1-4-2016.
 */
public class SimpleLogger {

    final static Logger LOGGER = Logger.getLogger(SimpleLogger.class) ;

    public static void main(String[] args) {
        SimpleLogger logGenerator = new SimpleLogger();
        logGenerator.start();
    }

    private void start() {
        LocalDateTime endTime = LocalDateTime.now().plusMinutes(3); //.plusHours(1);
        do {
            LOGGER.info("Well does this work?");
            try {
                Thread.sleep(60000);
            }catch (Exception e){
                LOGGER.info(e);
            }
        }while (LocalDateTime.now().isBefore(endTime));
    }

}
