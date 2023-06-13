package org.apereo.cas;

import org.apereo.cas.nativex.JdbcDriversRuntimeHintsTests;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author leeyc0
 * @since 6.2.0
 */
@SelectClasses({
    JdbcDriversRuntimeHintsTests.class,
    JdbcServletContextListenerTests.class
})
@Suite
public class AllTestsSuite {
}
