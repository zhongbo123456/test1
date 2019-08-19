package com.example.demo.pack.inter;

import java.util.Arrays;

public class Splitter  extends StringProcessor{

    @Override
    public String process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }
}
