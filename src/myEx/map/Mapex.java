package myEx.map;

public class Mapex {

    private String name;
    private Variety variety;
    private String season;
    private String cook;
    private int number;

    public Mapex(String name, Variety variety, String season, String cook, int number) {
        this.name = name;
        this.variety = variety;
        this.season = season;
        this.cook = cook;
        this.number = number;


    }

    public String getName() {
        return name;
    }

    public Variety getVariety() {
        return variety;
    }

    public String getSeason() {
        return season;
    }

    public String getCook() {
        return cook;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %d ",
                name,variety.jpName,season,cook,number);

    }
}
