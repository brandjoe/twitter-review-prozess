package ch.zhaw.gpi.twitterreview.delegates;

import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 * Implementation des Service Task 'Tweet senden'
 * @author Joël Brandes
 */
@Named("sendTweetAdapter")
public class SendTweetDelegate implements JavaDelegate {

    /**
     * 1. Prozessvariable tweetContent auslesen
     * 2. Text wird in Console ausgegeben
     * 
     * @param de            Objekt, welches die Verknüpfung zur Process Engine und aktuellen Execution enthält
     * @throws Exception
     */
    @Override
    public void execute(DelegateExecution de) throws Exception {
        String tweetContent = (String) de.getVariable("tweetContent");
        System.out.println("!!!!!!!!FOLGENDER TWEET WIRD VERÖFFENTLICHT: " + tweetContent);
    }
    
}
