package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to22then2() {
        double expected = 2;
        Point a = new Point(2, 0);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when40to24then2() {
        double expected = 2;
        Point a = new Point(4, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to212then3() {
        double expected = 3;
        Point a = new Point(0, 0, 0);
        Point b = new Point(2, 1, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when424to000then6() {
        double expected = 6;
        Point a = new Point(4, 2, 4);
        Point b = new Point(0, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}