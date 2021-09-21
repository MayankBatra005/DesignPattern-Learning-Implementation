package FilterDesignPattern.filterCriteria;

import FilterDesignPattern.model.Laptop;

import java.util.List;
import java.util.stream.Collectors;

public class AndCriteria implements ICritereia{
    private ICritereia[] critereias;

    public AndCriteria(ICritereia... criterias) {
    this.critereias=criterias;
    }

//    public AndCriteria(HardDisk250GB hardDisk250GB, MacCriteria macCriteria, I5Proceesor i5Proceesor) {
//    }

    @Override
    public List<Laptop>meetsCriteria(List<Laptop> laptopList){
        List<Laptop>result=laptopList;
        for(ICritereia critereia:critereias){
            result=critereia.meetsCriteria(result);
        }
        return result;
    }

}