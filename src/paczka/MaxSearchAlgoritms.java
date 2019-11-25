package paczka;

import java.util.ArrayList;

class MaxSearchAlgorithms {
    protected static ArrayList<Integer> pierwszyScan(int[] in) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(in[0]);
        for (int i = 0; i < in.length - 1; i++) {
            if (in[i] > list.get(list.size() - 1)) {
                list.add(in[i]);
            }
        }
        return list;
    }

    protected static ArrayList<Integer> drugiScan(int [] in) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(in[in.length - 1]);
        for (int i = in.length - 1; i >= 0; i--) {
            if (in[i] > list.get(list.size() - 1)) {
                list.add(in[i]);
            }
        }
        return list;
    }

    protected static ArrayList<Integer> trzeciScan(int [] in) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(in[0]);
        for (int i = 0; i < in.length - 1 - in.length % 2; i += 2) {
            if (in[i] > list.get(list.size() - 1)) {
                list.add(in[i]);
            }
        }
        for (int i = 1; i < in.length - 1 - in.length % 2; i += 2) {
            if (in[i] > list.get(list.size() - 1)) {
                list.add(in[i]);
            }
        }
        return list;
    }

    protected static ArrayList<Integer> czwarta(int [] in) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < in.length - 1; i++) {
            list.add(in[i]);
        }
        return list;
    }
}