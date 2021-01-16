package org.naithani;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.Mockito.*;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
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
