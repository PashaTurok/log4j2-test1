
package com.foo.log4j2test1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Foo {

    private static final Logger logger = LoggerFactory.getLogger(Foo.class);

    public void test() {
        var s = "Hello, World!";
        logger.debug(s);
    }
}
