public class Street {
    String name;
    int houses;
    int length;

    public Street (String name, int houses, int length){
        this.name = name;
        this.houses = houses;
        this. length = length;
    }

    public void getInfo(){
        System.out.println("Название: "+ this.name);
        System.out.println("Домов на улице: "+this.houses);
        System.out.println("Длина улицы: "+this.length + " м");
    }
    public String getName(){
        return this.name;
    }


}
