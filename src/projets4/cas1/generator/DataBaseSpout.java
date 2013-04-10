package projets4.cas1.generator;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import projets4.cas1.basic.InputEvent;
import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;

/**
 * Spout for test.
 * 1. Read the data from the database db file and get the list.
 * 2. Generate an output from the list.
 * 
 * @author Botu
 *
 */
public class DataBaseSpout extends BaseRichSpout{

	private LinkedList<InputEvent> events;
	private SpoutOutputCollector _collector;
	
	private static final long serialVersionUID = 4924280212738346735L;

	public DataBaseSpout(String dataFileName) {
		this.events = new LinkedList<InputEvent>();
	}
	
	@Override
	public void open(Map conf, TopologyContext context,
			SpoutOutputCollector collector) {
		_collector = collector;
		
	}

	@Override
	public void nextTuple() {
		List<Object> targetList = events.remove(0).getContents();
		_collector.emit(new Values(targetList));
		
	}

	@Override
	public void declareOutputFields(OutputFieldsDeclarer declarer) {
		declarer.declare(new Fields("stream_id"));
		declarer.declare(new Fields("stream_name"));
		declarer.declare(new Fields("view_count"));
	}
}
