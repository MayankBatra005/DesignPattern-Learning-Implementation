package FilterDesignPattern.filterCriteria;

import FilterDesignPattern.model.Laptop;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class HardDisk250GB implements ICritereia{

    @Override
    public List<Laptop> meetsCriteria(List<Laptop> laptopList) {
        return laptopList.stream()
                .filter(laptop->laptop.getHardDisk().equalsIgnoreCase("HDD 250"))
                .collect(Collectors.toList());

    }
}
