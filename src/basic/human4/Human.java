package basic.human4;

    //抽象にし
abstract class Human {
        //フィールド　スーパーに持たせるかどうか
        protected String name; //protectedなんでサブクラスから参照できる

        public Human(String name) {
            this.name = name;
        }

       public abstract void sayHello();
    }

