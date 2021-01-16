package org.naithani;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void getPresidents() {
        HelloWorld helloWorld = new HelloWorld();
        assertNotNull(helloWorld);
    }
}
