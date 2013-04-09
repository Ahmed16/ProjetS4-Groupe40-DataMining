package projets4.cas1.generator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

import projets4.cas1.basic.InputEvent;
import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;

/**
 * Spout for test.
 * 1. Read the data from the data file and generate a list.
 * 2. Generator randomly an output from the list.
 * 
 * @author Botu
 *
 */
public class RandomSpout extends BaseRichSpout{

	private ArrayList<InputEvent> events;
	private int eventsSize;
	
	private static final long serialVersionUID = 4924280212738346735L;

	public RandomSpout(String dataFileName) {
		this.events = new ArrayList<InputEvent>();
		this.readFile(dataFileName);
		this.eventsSize = this.events.size();
	}
	
	public void readFile(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
            	events.add(new InputEvent(line.split(" ")));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }

	public void printRandomEvent() {
		Random random = new Random();
		InputEvent temp = events.get(random.nextInt(eventsSize));
		System.out.println(temp.videoId);
	}
	
	
	@Override
	public void open(Map conf, TopologyContext context,
			SpoutOutputCollector collector) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nextTuple() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		// TODO Auto-generated method stub
		
	}
}
