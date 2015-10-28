package com.imooc.problems;

import com.imooc.resource.Interval;

import java.util.ArrayList;

/**
 * Created by dnzyt on 10/27/2015.
 */
public class InsertInterval {

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        if (intervals == null || newInterval == null)
            return intervals;

        ArrayList<Interval> array = new ArrayList<>();

        int pos = 0;

        for (Interval current: intervals) {
            if (current.end < newInterval.start) {
                array.add(current);
                pos++;
            } else if (current.start > newInterval.end) {
                array.add(current);
            } else {
                newInterval.start = Math.min(current.start, newInterval.start);
                newInterval.end = Math.max(current.end, newInterval.end);
            }


        }
        array.add(pos, newInterval);


        return array;
    }

}
