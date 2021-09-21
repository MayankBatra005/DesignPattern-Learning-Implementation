package FilterDesignPattern.filterCriteria;

import FilterDesignPattern.model.Laptop;

import java.util.List;
import java.util.stream.Collectors;

public class MacCriteria implements ICritereia{
    @Override
    public List<Laptop>meetsCriteria(List<Laptop> laptopList){
        return laptopList.stream()
                .filter(laptop->laptop.getOperatingSystem().equalsIgnoreCase("MAC"))
                .collect(Collectors.toList());
    }

}


