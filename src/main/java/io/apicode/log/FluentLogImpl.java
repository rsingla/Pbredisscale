package io.apicode.log;

import java.lang.annotation.Annotation;

import org.springframework.boot.autoconfigure.AutoConfigureBefore;

import com.google.common.flogger.FluentLogger;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@AutoConfigureBefore
public class FluentLogImpl implements FluentLog {

	private static final FluentLogger logger = FluentLogger.forEnclosingClass();

	@Override
	public Class<? extends Annotation> annotationType() {
		System.out.println(annotationType());
		return annotationType();
	}

	@Override
	public String message() {
		logger.atInfo().isEnabled();
		logger.atInfo().log("STARTING TO LOG");
		logger.at(level().level).log(message());
		logger.atInfo().log(message());
		return message();
	}

	@Override
	public LogLevel level() {
		return level();
	}

}
