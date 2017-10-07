public class Car3 {
    String name;
    int number;


    public Car3(String name){
        this.name = name;
    }

    public Car3() {
//      this.name = "이름없음";
//      this.number = 0;
        this("이름없음", 0);
    }

    public Car3(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
