package lesson15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Tovar implements Comparable<Tovar> {
    private String name;
    private int prace;
    private ArrayList<Otziv> otzivs = new ArrayList<>();
    private ArrayList<Obzor> obzors = new ArrayList<>();

    public Tovar() {
    }


    public Tovar(String name, int prace) {
        this.name = name;
        this.prace = prace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrace() {
        return prace;
    }

    public void setPrace(int prace) {
        this.prace = prace;
    }

    public ArrayList<Otziv> getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(ArrayList<Otziv> otzivs) {
        this.otzivs = otzivs;
    }

    public ArrayList<Obzor> getObzors() {
        return obzors;
    }

    public void setObzors(ArrayList<Obzor> obzors) {
        this.obzors = obzors;
    }

    public void addOtziv(Otziv t) {
        this.otzivs.add(t);
    }

    public void addObzor(Obzor o) {
        this.obzors.add(o);
    }

    public double getTotalRat() {
        double result = 0;
        int count = 0;
        for (Otziv o : this.otzivs) {
            result = result + o.getRate();
            count++;
        }
        if (count != 0) {
            return result / count;
        } else return 0.0;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tovar tovar = (Tovar) o;

        if (prace != tovar.prace) return false;
        if (name != null ? !name.equals(tovar.name) : tovar.name != null) return false;
        if (otzivs != null ? !otzivs.equals(tovar.otzivs) : tovar.otzivs != null) return false;
        return obzors != null ? obzors.equals(tovar.obzors) : tovar.obzors == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + prace;
        result = 31 * result + (otzivs != null ? otzivs.hashCode() : 0);
        result = 31 * result + (obzors != null ? obzors.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", prace=" + prace +
                ", otzivs=" + otzivs +
                ", obzors=" + obzors +
                "}\n";

    }

    @Override
    public int compareTo(Tovar o) {
        if (this.prace != o.prace) {
            return Integer.compare(this.prace, o.prace);
        } else if (!this.name.equals(o.name)) {
            return this.name.compareTo(o.name);
        } else if (this.getTotalRat() != o.getTotalRat()) {
            return Double.compare(this.getTotalRat(), o.getTotalRat());
        } else if (this.otzivs.size() != o.otzivs.size()) {
            return Integer.compare(this.otzivs.size(), o.otzivs.size());
        } else if (this.obzors.size() != o.obzors.size()) {
            return Integer.compare(this.obzors.size(), o.obzors.size());
        }
        return 0;

    }

    public static TreeSet<Tovar> sortbyPriceToFrom(TreeSet<Tovar> t) {
        TreeSet<Tovar> res = new TreeSet<>(new SortBePriceToComparet());



        for (Tovar tt : t) {
            res.add(tt);
        }
        return res;
    }

    public static TreeSet<Tovar> sortByNameFromTo(TreeSet<Tovar> tovars) {
        TreeSet<Tovar> res = new TreeSet<>((o1, o2) -> {
            if (!o1.getName().equals(o2.getName())) {
                return o1.getName().compareTo(o2.getName());
            } else if (o1.getPrace() != o2.getPrace()) {
                return Integer.compare(o2.getPrace(), o2.getPrace());
            } else if (o1.getTotalRat() != o2.getTotalRat()) {
                return Double.compare(o2.getTotalRat(), o2.getTotalRat());
            } else if (o1.getOtzivs() != o2.getOtzivs()) {
                return Integer.compare(o1.getOtzivs().size(), o2.getOtzivs().size());
            } else if (o1.getObzors().size() != o2.getObzors().size()) {
                return Integer.compare(o2.getObzors().size(), o1.getObzors().size());
            }
            return 0;
        });

        for (
                Tovar tt : tovars) {
            res.add(tt);
        }
        return res;
    }

    public static TreeSet<Tovar> sortByRateFromTo(TreeSet<Tovar> tovars) {
        TreeSet<Tovar> res = new TreeSet<>((o1, o2) -> {
            if (o2.getTotalRat() != o1.getTotalRat()) {
                return Double.compare(o2.getTotalRat(), o1.getTotalRat());
            } else if (o2.getPrace() != o1.getPrace()) {
                return Integer.compare(o2.getPrace(), o1.getPrace());
            } else if (!o2.getName().equals(o1.getName())) {
                return o2.getName().compareTo(o1.getName());
            } else if (o2.getOtzivs() != o1.getOtzivs()) {
                return Integer.compare(o2.getOtzivs().size(), o1.getOtzivs().size());
            } else if (o2.getObzors().size() != o1.getObzors().size()) {
                return Integer.compare(o2.getObzors().size(), o1.getObzors().size());
            }
            return 0;
        });

        for (
                Tovar tt : tovars) {
            res.add(tt);
        }
        return res;
    }

    public static TreeSet<Tovar> sortByOtzivFromTo(TreeSet<Tovar> tovars) {
        TreeSet<Tovar> res = new TreeSet<>((o1, o2) -> {
            if (o2.getOtzivs().size() != o1.getOtzivs().size()) {
                return Integer.compare(o2.getOtzivs().size(), o1.getOtzivs().size());
            } else if (o1.getPrace() != o2.getPrace()) {
                return Integer.compare(o1.getPrace(), o2.getPrace());
            } else if (!o1.getName().equals(o2.getName())) {
                return o1.getName().compareTo(o2.getName());
            } else if (o1.getObzors() != o2.getObzors()) {
                return Integer.compare(o1.getObzors().size(), o2.getObzors().size());
            } else if (o1.getTotalRat() != o2.getTotalRat()) {
                return Double.compare(o1.getTotalRat(), o2.getTotalRat());
            }
            return 0;
        });

        for (
                Tovar tt : tovars) {
            res.add(tt);
        }
        return res;
    }

    public static TreeSet<Tovar> sortByObzorFromTo(TreeSet<Tovar> tovars) {
        TreeSet<Tovar> res = new TreeSet<>((o1, o2) -> {
            if (o2.getObzors().size() != o1.getObzors().size()) {
                return Integer.compare(o2.getObzors().size(), o1.getObzors().size());
            } else if (o1.getPrace() != o2.getPrace()) {
                return Integer.compare(o1.getPrace(), o2.getPrace());
            } else if (!o1.getName().equals(o2.getName())) {
                return o1.getName().compareTo(o2.getName());
            } else if (o1.getOtzivs() != o2.getOtzivs()) {
                return Integer.compare(o1.getOtzivs().size(), o2.getOtzivs().size());
            } else if (o1.getTotalRat() != o2.getTotalRat()) {
                return Double.compare(o1.getTotalRat(), o2.getTotalRat());
            }
            return 0;
        });

        for (
                Tovar tt : tovars) {
            res.add(tt);
        }
        return res;
    }


}

