package com.imooc.problems;

import com.imooc.resource.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by ningzeda on 11/4/2015.
 */
public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {

        if (intervals == null || intervals.size() <= 1)
            return intervals;

        ArrayList<Interval> res = new ArrayList<>();

        Collections.sort(intervals, new IntervalComparator());

        Interval last = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            Interval temp = intervals.get(i);

            if (last.end >= temp.start) {
                last.end = Math.max(last.end, temp.end);
            } else {
                res.add(last);
                last = temp;
            }


        }

        res.add(last);

        return res;
    }

    private class IntervalComparator implements Comparator<Interval> {


        @Override
        public int compare(Interval o1, Interval o2) {
            return o1.start - o2.start;
        }
    }





}
