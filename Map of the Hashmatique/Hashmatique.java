import java.util.HashMap;

public class Hashmatique {

    public static void main(String[] args) {

        
        HashMap<String, String> trackList = new HashMap<String, String>();

        trackList.put("Entertainer", "In this game I own the rules");
        trackList.put("7 years", "once I was 7 years dad told me, make yourself a friend so you won't be lonely");
        trackList.put("Lockedaway", "If I couldn't be strong, tell me honestly would you still love me the same?");
        trackList.put("Noticed", "Yeah, you knew, I said you knew yeah, I turn heads when I roll thru yeah, you know I'm wit the, with the crew yeah, circle small so it's just 2x2, YEAH");
        

        String lyrics = trackList.get("7 years");
        System.out.println(lyrics);


        for (String title : trackList.keySet()){
            
            System.out.println(title + ": " + trackList.get(title));

        }

    }
}
