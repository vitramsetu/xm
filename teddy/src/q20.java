class VideoTape {
    private String title;
    private int length;

    public VideoTape(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "VideoTape: " + title + " (" + length + " minutes)";
    }
}

class Movie extends VideoTape {
    private String rating;

    public Movie(String title, int length, String rating) {
        super(title, length);
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie: " + getTitle() + " (" + getLength() + " minutes, rated " + rating + ")";
    }
}

class MusicVideo extends VideoTape {
    private String artist;

    public MusicVideo(String title, int length, String artist) {
        super(title, length);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "MusicVideo: " + getTitle() + " (" + getLength() + " minutes, by " + artist + ")";
    }
}

public class q20 {
    public static void main(String[] args) {
        VideoTape tape1 = new VideoTape("The Secret Life of Pets", 90);
        System.out.println(tape1);  // prints "VideoTape: The Secret Life of Pets (90 minutes)"

        Movie movie1 = new Movie("Jurassic Park", 127, "PG-13");
        System.out.println(movie1);  // prints "Movie: Jurassic Park (127 minutes, rated PG-13)"

        MusicVideo musicVideo1 = new MusicVideo("Roar", 3, "Katy Perry");
        System.out.println(musicVideo1);  // prints "MusicVideo: Roar (3 minutes, by Katy Perry)"

    }
}