package org.naithani;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestWithMockito 
{
    @Mock
    private List<String> mockList;

    @Test
    public void test() 
    {
        String expected = "Hello, World!";

        when(mockList.get(0)).thenReturn(expected);

        String actual = mockList.get(0);

        assertEquals(expected, actual);
        
        System.out.println(actual);
    }
}
