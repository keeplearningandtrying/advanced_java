package com.xyzcorp.demos.generics;

import com.xyzcorp.Box;
import com.xyzcorp.demos.generics.containers.MyCollection;
import com.xyzcorp.demos.generics.containers.Tuple2;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomObjectTest {
    @Test
    public void testBoxCreation() throws Exception {
        Box<Integer> box = new Box<>(4);
        Box<Integer> result = box.map(e -> e + 10);
        assertThat(result.getContents()).isEqualTo(14);
    }

    @Test
    public void testTuple2Creation() throws Exception {
        Tuple2<Integer, String> t2 = new Tuple2<Integer, String>(3, "Foo");
        Integer k = t2.getK();
        String v = t2.getV();
    }

    @Test
    public void testMyCollection() throws Exception {
        MyCollection<String> myCollection = new MyCollection<>("One", "Two", "Three");
    }
}
