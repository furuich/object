package ex.item;

class Item {
    private int id; //商品ID
    private String name; //商品名
    private  int price; //価格

    public Item(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  id +" "+name+" "+price;
    }
}

