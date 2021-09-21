package FilterDesignPattern.filterCriteria;

import FilterDesignPattern.model.Laptop;

import java.util.List;
import java.util.stream.Collectors;

public class I5Proceesor implements ICritereia{
    @Override
    public List<Laptop> meetsCriteria(List<Laptop> laptopList) {
        return laptopList.stream()
                .filter(laptop->laptop.getProcessor().equalsIgnoreCase("I5"))
                .collect(Collectors.toList());
    }
}
