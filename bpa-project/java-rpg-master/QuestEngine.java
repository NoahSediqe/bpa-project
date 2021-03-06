
import java.awt.Point;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ahmad El-baba 2/7/2017
 */
public class QuestEngine implements Serializable {

    private static final Logger LOGGER = Logger.getLogger(MainPanel.class.getName());

    public QuestEngine() {

    }

    //this method below essentaly discards any uneed data depending on the type
    public void chooseType(Quest quest, QuestEvent questEvent) {
        switch (quest.getQuestType()) {
            case "OBJECTIVE":
                quest.setDXY(questEvent.getDXY());
                quest.setTarget(-1);
                break;
            case "ELIMINATION":
                quest.setTarget(questEvent.getTarget());
                quest.setDXY(new Point(0,0));
                break;
            default:
                break;
        }

    }

}
