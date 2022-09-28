package lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Collections implements CollectionUtils {
    private ArrayList<Integer> Arraylist = new ArrayList<>();

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> res = new ArrayList<>();
        res.addAll(a);
        res.addAll(b);


        return res;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
       ArrayList<Integer> res1 = new ArrayList<>();
        ArrayList<Integer> aa = new ArrayList<>();
        ArrayList<Integer> bb = new ArrayList<>();

        aa.addAll(a);
        bb.addAll(b);

        aa.removeAll(b);
        a.removeAll(aa);

        bb.removeAll(a);
        b.removeAll(bb);

        res1.addAll(a);
        res1.addAll(b);

        /*a.retainAll(b);
        res1.addAll(a);*/


        return res1;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> res2 = new HashSet<>();
        res2.addAll(a);
        res2.addAll(b);

        return res2;
    }



    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> res3 = new HashSet<>();
        a.retainAll(b);
        res3.addAll(a);

        return res3;

    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        ArrayList<Integer> res4 = new ArrayList<>();
        ArrayList<Integer> aa = new ArrayList<>();
        ArrayList<Integer> bb = new ArrayList<>();

        aa.addAll(a);
        bb.addAll(b);

        aa.removeAll(b);

        bb.removeAll(a);

        res4.addAll(aa);
        res4.addAll(bb);
        return res4;
    }
}
