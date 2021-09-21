package FilterDesignPattern.filterCriteria;


import FilterDesignPattern.model.Laptop;

import java.util.List;

public interface ICritereia {
    List<Laptop> meetsCriteria(List<Laptop> laptopList);
}