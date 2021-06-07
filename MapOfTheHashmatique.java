import java.util.HashMap;
import java.util.Set;


public class MapOfTheHashmatique {
  public static void retrieveSongData() {
    HashMap<String, String> songMap = new HashMap<String, String>();
    songMap.put("Beautiful Mistakes", "It's beautiful, it's bittersweet / You're like a broken home to me / I take a shot of memories");
    songMap.put("Come Through", "But you should come through tonight / I'm chilling on the Westside, boo / Call my homegirl, tell your best friend he could slide too");
    songMap.put("Goosebumps", "I get those goosebumps every time, yeah, you come around, yeah / You ease my mind, you make everything feel fine");
    songMap.put("The Business", "Let's get down, let's get down to business / Give you one more night, one more night to get this / We've had a million, million nights just like this");
    songMap.put("If You're Gonna Lie", "I kinda like it when you hurt me / 'Cause you come over saying sorry / So I put up with your lies just to have you for the night, baby");


    String song = songMap.get("Goosebumps");
    System.out.println(song);
    System.out.println();


    System.out.println("SONG LIST");
    Set<String> keys = songMap.keySet();
    for (String key : keys) {
      System.out.println(key + ": " + songMap.get(key));
    }
  }


  public static void main(String[] args) {
    System.out.println();
    retrieveSongData();
  }
}