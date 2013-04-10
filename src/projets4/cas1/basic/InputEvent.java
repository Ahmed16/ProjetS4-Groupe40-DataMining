package projets4.cas1.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Class used for simulate the input event
 * @author Botu
 *
 */
public class InputEvent {
	
	public long streamId;
	
	public String streamName;
	
	public long channelId;
	
	public String channelName;

	public long categoryId;
	
	public String categoryName;
	
	public long uploaderId;
	
	public String uploaderName;
	
	public ArrayList<String> tags;
	
	private List<Object> contents;
	
	public InputEvent(String[] inputs) {
		this.streamId = Long.parseLong(inputs[0]);
		this.streamName = inputs[1];
		this.channelId = Long.parseLong(inputs[2]);
		this.channelName = inputs[3];
		this.categoryId = Long.parseLong(inputs[4]);
		this.categoryName = inputs[5];
		this.uploaderId = Long.parseLong(inputs[6]);
		this.uploaderName = inputs[7];
		// todo: tags
	}
	
	public List<Object> getContents(){
		return contents;
	}
	
}
