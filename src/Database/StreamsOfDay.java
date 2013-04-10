package Database;

import java.sql.Date;
import java.util.LinkedList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class StreamsOfDay {

	private Date date = null;
	private LinkedList<Channel> channels = new LinkedList<Channel>();
	private LinkedList<Stream> streams = new LinkedList<Stream>();

	public StreamsOfDay(Date date) {
		// TODO Auto-generated constructor stub
		this.date = date;

	}

	public int add(JSONArray listeStreams) throws JSONException {
		for (int i = 0; i < listeStreams.length(); i++) {
			JSONObject streamJson = listeStreams.optJSONObject(i);
			Stream stream = new Stream(streamJson);
			streams.add(stream);
			Channel channel = stream.getChannel();
			if (!channels.contains(channel)) {
				channels.add(channel);

			}
		}
		return listeStreams.length();

	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public LinkedList<Channel> getChannels() {
		return channels;
	}

	public void setChannels(LinkedList<Channel> channels) {
		this.channels = channels;
	}

	public LinkedList<Stream> getStreams() {
		return streams;
	}

	public void setStreams(LinkedList<Stream> streams) {
		this.streams = streams;
	}
}
