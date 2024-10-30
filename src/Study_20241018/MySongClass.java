package Study_20241018;

class Song {
    String title;
    String genre;

    void set_Song(String _title, String _genre) {
        title = _title; // this.title = title 하는 방식말고, 변수를 다르게 할 때 언더바를 붙여줌
        genre = _genre;
    }

    void print_song() {
        System.out.println("노래제목: "+title+"("+genre+")");
    }

}

class Singer {
    String name;
    String title;
    Song song;

    void set_Singer(String _name) {
        name = _name;
    }
    void hit_Song(Song _song) { // 1. Song 객체를 받아서
        song = _song;
    }

    void print_singer() {
        System.out.println("가수이름: "+name);
        song.print_song(); // 2. Song의 메서드를 사용할 수 있게 됨
    }

}
public class MySongClass {
    public static void main(String[] args) {
        // song 객체 생성
        Song song = new Song();
        song.set_Song("취중진담", "발라드");

        // singer 객체 생성
        Singer singer = new Singer();
        singer.set_Singer("김동률");

        // singer의 대표곡을 지정함
        singer.hit_Song(song);

        // singer의 정보를 출력함
        // 가수이름과 노래제목이 여기서 출력됨
        singer.print_singer();
    }
}
