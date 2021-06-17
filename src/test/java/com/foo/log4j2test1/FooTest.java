
package com.foo.log4j2test1;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FooTest {

    private static final Logger logger = LoggerFactory.getLogger(FooTest.class);

    @Test
    public void foo() {
        logger.debug("Starting!");
        Foo foo = new Foo();
        foo.test();
        logger.debug("Finished!");
    }
}
