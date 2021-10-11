package basic.human3;

class Secret extends Human {
    public Secret(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("שלום"+name+"נעים להכיר אותך");
    }
}
