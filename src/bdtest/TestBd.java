package bdtest;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestBd {

	public static void main(String[] args) throws JSONException, ParseException {
		Connexion connexion = new Connexion("data/2012-08-01.db");
		connexion.connect();
		JSONObject jObject;
		JSONArray ja;
		Date dateBegin = new Date(113, 6, 32);
		System.out.println(dateBegin);
		Date date = new Date(dateBegin.getYear(), dateBegin.getMonth(),
				dateBegin.getDay() + 1);
		StreamsOfDay streamOfDay = new StreamsOfDay(date);
		ResultSet resultSet = connexion
				.query("SELECT * FROM crawler_access where cron_id='9'");
		try {
			int i = 0;
			int nb=2;//nombre de stream nb=1=>50 streams
			int totalStream=50;
			while (resultSet.next() && i < nb) {
				System.out.println("+++++++++++totalStream:"+totalStream+"");
				String s = resultSet.getString("response");
				ja = new JSONArray(s);
				streamOfDay.add(ja);
				i++;
				totalStream+=50;
			}
			//System.out.println(streamOfDay.getStreams().size());
			//System.out.println(streamOfDay.getChannels().size());
			int j=1;
			for (Stream  s: streamOfDay.getStreams()) {
				System.out.println("\n----------Stream:"+j+"----------\n");
				j++;
				System.out.println("Stream id =>"+s.getId());
				System.out.println("Stream Channl_count =>"+s.getChannel_count());
				System.out.println("Stream Stream_count =>"+s.getStream_count());
				System.out.println("Stream Channel_view_count =>"+s.getChannel_view_count());
				System.out.println("	Channel id =>"+s.getChannel().getId());
				System.out.println("	Views_count =>"+s.getChannel().getViews_count());


				//System.out.println(c.getId());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// connexion.close();
	}
}
