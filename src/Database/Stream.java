package Database;
import org.json.JSONException;
import org.json.JSONObject;

public class Stream {
	private Channel channel;
	private String name;
	private String  stream_count ;

	private String format;

	private int  channel_count ;

	private String title;

	private String id ;
	private int channel_view_count;

	public Stream(JSONObject stream) throws JSONException {
		JSONObject s=stream.getJSONObject("channel");
		this.channel = new Channel (s);
		this.name = stream.getString("name");
		this.stream_count = stream.getString("stream_count");
		this.format = stream.getString("format");
		this.channel_count = stream.getInt("channel_count");
		//this.title = stream.getString("title");
		this.id = stream.getString("id");
		this.channel_view_count = stream.getInt("channel_view_count");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public int getChannel_count() {
		return channel_count;
	}

	public String getStream_count() {
		return stream_count;
	}

	public void setStream_count(String stream_count) {
		this.stream_count = stream_count;
	}

	public int getChannel_view_count() {
		return channel_view_count;
	}

	public void setChannel_view_count(int channel_view_count) {
		this.channel_view_count = channel_view_count;
	}

	public void setChannel_count(int channel_count) {
		this.channel_count = channel_count;
	}

	

}
