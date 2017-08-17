package logutil.slf4j;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogUtilTest {
	private Logger logger = LoggerFactory.getLogger(LogUtilTest.class);
	@Test
	public void test_logger_debug_enabled() {
		LogUtil.debugIfEnabled(logger, "test_logger_debug_enabled", new Throwable("test_logger_debug_enabled"));
	}
	@Test
	public void test_logger_debug_disabled() {
		LogUtil.debugIfEnabled(logger, "test_logger_debug_disabled", new Throwable("test_logger_debug_disabled"));
	}
}