package com.example.trip;

public final class SegmentFactory {
    private SegmentFactory instance = new SegmentFactory();

    private SegmentFactory() {

    }

    public final static SegmentFactory getInstance() {
        return this.instance;
    }

    public List<Segment> getSegments(double startLat, double stopLat, double startLong, double stopLong) {
        List<Segment> returnValue = new LIst<Segment>();
        /// calculate segments for return

        return returnValue;
    }


}