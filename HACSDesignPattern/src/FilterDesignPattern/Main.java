package FilterDesignPattern;

import FilterDesignPattern.filterCriteria.AndCriteria;
import FilterDesignPattern.filterCriteria.HardDisk250GB;
import FilterDesignPattern.filterCriteria.I5Proceesor;
import FilterDesignPattern.filterCriteria.MacCriteria;
import FilterDesignPattern.model.Laptop;
import java.util.List;

/**
    This pattern is not for HACS Module
    Implemented as a learning project seeking reference from
    Youtube: https://www.youtube.com/watch?v=icgoR_vfh40
    Github: https://github.com/ajitsing/design_patterns/tree/e41537a709fe2e26abbc23394e5ea15f2cf4806a

 */
public class Main {

    public static void main(String[] args){
        List<Laptop> laptops=LaptopFactory.manufactureInBulk();

        AndCriteria searchCriteria=new AndCriteria(new HardDisk250GB(),new MacCriteria(),new I5Proceesor());
        List<Laptop> filteredLaptops=searchCriteria.meetsCriteria(laptops);

        filteredLaptops.stream()
                .forEach(System.out::println);
    }
}