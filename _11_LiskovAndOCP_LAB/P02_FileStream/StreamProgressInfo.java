package _11_LiskovAndOCP_LAB.P02_FileStream;


public class StreamProgressInfo {
    private Streamable stream;

    // If we want to stream a music file, we can't
    public StreamProgressInfo(Streamable stream) {
        this.stream = stream;
    }

    public int calculateCurrentPercent() {
        return (this.stream.getBytesSent() * 100) / this.stream.getLength();
    }

    public static void main(String[] args) {
        Streamable file = new File(10, 20);
        Streamable music = new Music(5, 2 );
        StreamProgressInfo s1 = new StreamProgressInfo(file);
        StreamProgressInfo s2 = new StreamProgressInfo(music);
        System.out.println(s1.calculateCurrentPercent());
        System.out.println(s2.calculateCurrentPercent());
    }
}
