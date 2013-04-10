package Database;

import org.json.JSONException;
import org.json.JSONObject;

public class Channel {
	private String title;
	private String  category;
	private String status;
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Channel other = (Channel) obj;
		if (id != other.id)
			return false;
		return true;
	}
	private String tags;
	private int  id ;
	private String  views_count ;
	public Channel(JSONObject channel) throws JSONException{
		
		id=channel.getInt("id");
		title=channel.getString("title");
		//status=channel.getString("status");
		//tags=channel.getString("tags");
		views_count=channel.getString("views_count");
		//category=channel.getString("category");
		
	}
	
	public String getTitle() {
		return title;
	}
	

	

	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getViews_count() {
		return views_count;
	}
	public void setViews_count(String views_count) {
		this.views_count = views_count;
	}
	

}
