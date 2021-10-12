package ex.keisyou;

//super class
class Animal {
    protected String eat, fish;

    public Animal(String eat, String fish) {
        this.eat = eat;
        this.fish = fish;
    }

    public String getEat() {
        return eat;
    }

    public String getFish() {
        return fish;
    }
public void getProf(){
    System.out.println("好きな食べ物"+eat+"好きなさかな"+fish);
}

}




