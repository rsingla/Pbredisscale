package io.apicode.scale;

import com.google.common.flogger.FluentLogger;
import java.util.logging.Level;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class FluentLogs {

  private static final FluentLogger LOG = FluentLogger.forEnclosingClass();

  @Before("execution(* *(..))")
  public Object around(ProceedingJoinPoint point) throws Throwable {
    long start = System.currentTimeMillis();
    Object result = point.proceed();
    LOG.at(Level.ALL).log(
        "#%s(%s): %s in %[msec]s",
        MethodSignature.class.cast(point.getSignature()).getMethod().getName(),
        point.getArgs(),
        result,
        System.currentTimeMillis() - start);
    return result;
  }
}
