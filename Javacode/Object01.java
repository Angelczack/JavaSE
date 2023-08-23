public class Object01 {
    public static void main(String[] args) {


        // String cat1Name = "miaoluduo";
        // int cat1Age = 3;
        // String cat1Color = "white";


        // String cat2Name = "miaokeli";
        // int cat2Age = 100;
        // String cat2color = "multcolor";

        Cat cat1 =  new Cat();
        cat1.name = "miaoluduo";
        cat1.age = 3;
        cat1.color = "white";

        Cat cat2 =  new Cat();
        cat2.name = "miaokeli";
        cat2.age = 100;
        cat2.color = "multcolor";



        System.out.println(cat1.name + " " + cat1.age + " " + cat1.color);
        System.out.println(cat2.name + " " + cat2.age + " " + cat2.color);
       
        
        
    }
}


class Cat {
            String name;
            int age;
            String color;
        }