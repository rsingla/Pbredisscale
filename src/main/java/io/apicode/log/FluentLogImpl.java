package io.apicode.log;

import java.lang.annotation.Annotation;

import com.google.common.flogger.FluentLogger;

public class FluentLogImpl implements FluentLog {

	FluentLogger logger = FluentLogger.forEnclosingClass();

	@Override
	public Class<? extends Annotation> annotationType() {
		return annotationType();
	}

	@Override
	public String message() {
		logger.at(level().level).log(message());
		logger.atInfo().log(message());
		return message();
	}

	@Override
	public LogLevel level() {
		return level();
	}

}
