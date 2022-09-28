package lesson15;

import java.util.Comparator;

public class SortBePriceToComparet implements Comparator<Tovar> {

    @Override
    public int compare(Tovar o1, Tovar o2) {
        if (o1.getPrace() != o2.getPrace()) {
            return Integer.compare(o2.getPrace(), o1.getPrace());
        } else if (!o1.getName().equals(o2.getName())) {
            return o1.getName().compareTo(o2.getName());
        } else if (o1.getTotalRat() != o2.getTotalRat()) {
            return Double.compare(o1.getTotalRat(), o2.getTotalRat());
        } else if (o1.getOtzivs() != o2.getOtzivs()) {
            return Integer.compare(o1.getOtzivs().size(), o2.getOtzivs().size());
        } else if (o1.getObzors().size() != o1.getObzors().size()) {
            return Integer.compare(o1.getObzors().size(), o2.getObzors().size());
        }
        return 0;
    }
}
