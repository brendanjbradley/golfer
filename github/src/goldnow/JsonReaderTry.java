package goldnow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import goldnow.Player;

public class JsonReaderTry {

	private static final String filePath = "https://statdata.pgatour.com/r/009/leaderboard-v2mini.json";

	private static String readAll(Reader rd) throws IOException {
		// read all method for strings from json
		StringBuilder sb = new StringBuilder();
		int cp;
		while ((cp = rd.read()) != -1) {
			sb.append((char) cp);
		}
		return sb.toString();
	}

	public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
		// create inout stream and to read url
		InputStream is = new URL(url).openStream();
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String jsonText = readAll(rd);
			JSONObject json = new JSONObject(jsonText);
			return json;
		} finally {
			is.close();
		}
	}

	public static void main(String[] args) throws IOException, JSONException {

		// create json object and read
		JSONObject json = readJsonFromUrl(filePath);
		// System.out.println(json.toString());

		// leaderboard check
		JSONObject leaderboard = json.getJSONObject("leaderboard");

		ArrayList<Player> playerList = new ArrayList<>();

		// players array
		JSONArray json1 = (JSONArray) leaderboard.getJSONArray("players");

		for (int i = 0; i < json1.length(); i++) {
			// System.out.println("The " + i + " player: " + json1.get(i));
			JSONObject object = json1.getJSONObject(i);
			// get players id
			String playerid = object.getString("player_id");

			// get player bio info and rounds
			JSONObject playerBio = (JSONObject) object.get("player_bio");

			// information for player class
			int id = Integer.parseInt(playerid);
			String currentPosition = object.getString("current_position");
			Object totalScore = object.get("total");
			String firstName = (String) playerBio.get("first_name");
			String lastName = (String) playerBio.get("last_name");
			String country = (String) playerBio.get("country");
			JSONArray rounds = (JSONArray) object.get("rounds");
			// System.out.println("Rounds: " + rounds);

			// loop through the round to get number and strokes
			for (int j = 0; j < rounds.length(); j++) {
				JSONObject roundsArray = rounds.getJSONObject(j);
				int roundNumber = roundsArray.getInt("round_number");
				Object strokes = roundsArray.get("strokes");
				
				// pass variables to setPlayerList
				setPlayerList(playerList, id, currentPosition, firstName,lastName,country,totalScore,strokes,roundNumber);

			}

		}
	}

	// method to take the attributes and populate the player list
	private static void setPlayerList(ArrayList<Player> playerList, int id, String currentPosition, String firstName,
			String lastName, String country, Object totalScore, Object strokes, int roundNumber) {

		Player playerClass1 = new Player();

		// populate player class
		playerClass1.setId(id);
		playerClass1.setFirstName(firstName);
		playerClass1.setLastName(lastName);
		playerClass1.setPosition(currentPosition);
		playerClass1.setScore(totalScore);
		playerClass1.setCountry(country);
		playerClass1.setStrokes(strokes);
		playerClass1.setRoundNo(roundNumber);

		// add  to list
		playerList.add(playerClass1);

	}

	private List<Player> playerList;

	public List<Player> getPlayerList() {

		return this.playerList;

	}

}
