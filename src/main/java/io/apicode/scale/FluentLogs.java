package io.apicode.scale;

import java.util.logging.Level;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.google.common.flogger.FluentLogger;

@Configuration
@Aspect
@EnableAspectJAutoProxy
public class FluentLogs {

	private static final FluentLogger LOG = FluentLogger.forEnclosingClass();

	@Around("execution(* *(..)) && @annotation(FluentLog)")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		long start = System.currentTimeMillis();
		Object result = point.proceed();
		LOG.at(Level.ALL).log("#%s(%s): %s in %[msec]s",
				MethodSignature.class.cast(point.getSignature()).getMethod().getName(), point.getArgs(), result,
				System.currentTimeMillis() - start);
		return result;
	}

}
