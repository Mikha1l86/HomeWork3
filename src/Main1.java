public class Main1 {
    public static void main(String[] args) {

//work1

        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

//work2

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

//work3

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

//work4
        var friend = 19;
        System.out.println("Значение переменной friend: " + friend);

        friend = friend + 2;
        System.out.println("Значение переменной friend после увеличения на 2: " + friend);

        friend = friend / 7;
        System.out.println("Значение переменной friend после деления на 7: " + friend);

//work5

        var frog = 3.5;
        System.out.println(frog);

        frog *= 10;
        System.out.println(frog);

        frog /= 3.5;
        System.out.println(frog);

        frog += 4;
        System.out.println(frog);

//work6

        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;

        var totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес двух боксеров " + totalWeight + " кг!");
        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Разница в вессе двух боксеров " + weightDifference + " кг!");

//work7

        var remainderWeight = boxer2Weight % boxer1Weight;
        System.out.println("Остаток от деления между двумя весами " + remainderWeight + " кг!");

//work8

        var workTime = 640;
        var timePerDay = 8;

        var employeeCount = workTime / timePerDay;
        System.out.println("Всего работников в компании - " + employeeCount + " человек");

        employeeCount += 94;
        var newTimePerDay = workTime / employeeCount;
        System.out.println("Если в компании работает " + employeeCount + " человек, то всего " + newTimePerDay + " часа работы может быть поделено между сотрудниками");
    }
}
