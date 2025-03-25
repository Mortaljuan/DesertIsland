import java.util.Arrays;
import java.util.ArrayList;

public class Playlist {
    String[] favoriteSongs = new String[10];

    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    //favorite songs
    public Playlist(){
        favoriteSongs[0] = "Flow - Hero";
        favoriteSongs[1] = "Cafuné - Tek It";
        favoriteSongs[2] = "Cigarettes After Sex - Cry";
        favoriteSongs[3] = "Cigarettes After Sex - Apocalypse";
        favoriteSongs[4] = "Videoclub - Roi";
        favoriteSongs[5] = "adore - Did i tell u that i miss you";
        favoriteSongs[6] = "Dream, Ivory - Welcome and goodbye";
        favoriteSongs[7] = "Ricky Montgomery - Line Without a Hook";
        favoriteSongs[8] = "Mac DeMarco - For the First Time";
        favoriteSongs[9] = "Mac DeMarco - No Other Heart";
        //desert island songs
        desertIslandPlaylist.add("Dayglow - Can i Call You Tonight");
        desertIslandPlaylist.add("Laufey - From The Star");
        desertIslandPlaylist.add("Laufey - Falling Behind");
        desertIslandPlaylist.add("d4vd - Feel It");
        desertIslandPlaylist.add("Artemas - i like the way you kiss me");
        desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));

        desertIslandPlaylist.remove(1);
        desertIslandPlaylist.remove(1);
        desertIslandPlaylist.remove(1);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(1);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(1);
        desertIslandPlaylist.remove(2);
        desertIslandPlaylist.remove(1);
    }
    public void playSongs(){
        System.out.println("First three song of favorite list: ");
        System.out.println("\t-" + favoriteSongs[0]);
        System.out.println("\t-" + favoriteSongs[1]);
        System.out.println("\t-" + favoriteSongs[2]);
        System.out.println("Songs for a desert island...");
        System.out.println(desertIslandPlaylist);
        System.out.println(desertIslandPlaylist.size());
    }
}
