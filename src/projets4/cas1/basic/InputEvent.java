package projets4.cas1.basic;

import java.util.ArrayList;

/**
 * Class used for simulate the input event
 * @author Botu
 *
 */
public class InputEvent {
	
	public long videoId;
	
	public String videoName;
	
	public long channelId;
	
	public String channelName;

	public long categoryId;
	
	public String categoryName;
	
	public long uploaderId;
	
	public String uploaderName;
	
	public ArrayList<String> tags;
	
	public InputEvent(String[] inputs) {
		this.videoId = Long.parseLong(inputs[0]);
		this.videoName = inputs[1];
		this.channelId = Long.parseLong(inputs[2]);
		this.channelName = inputs[3];
		this.categoryId = Long.parseLong(inputs[4]);
		this.categoryName = inputs[5];
		this.uploaderId = Long.parseLong(inputs[6]);
		this.uploaderName = inputs[7];
		// todo: tags
	}
	
}
