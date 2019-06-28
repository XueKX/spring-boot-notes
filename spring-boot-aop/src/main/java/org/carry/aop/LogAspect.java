package org.carry.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author: CARRY
 * @CreateTime: 2019-06-28 09:52
 * @Description: ${Description}
 */
@Component
@Aspect //声明这是个切面类
public class LogAspect {
    //切入点表达式
    // execution 中的第一 个＊表示方法返回任意值，第二个＊表示 service 包下的任意类，第三个＊表示类中的任意方法，
    // 括号中的两个点表示方法参数任意， 这里描述的切入点为 service 包下所有类中的所有方法。
    @Pointcut("execution(* org.carry.service.*.*(..))")
    public void pc1() {
    }

    //前置通知 通过JoinPoint参数可以获取目标方法的方法名、 修饰符等信息
    @Before(value = "pc1()")
    public void before(JoinPoint jp) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法开始执行...");
    }

    //后置通知
    @After(value = "pc1()")
    public void after(JoinPoint jp) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法执行结束...");
    }

    //返回通知，在该方法中可以获取目标方法的返回值
    @AfterReturning(value = "pc1()", returning = "result")
    public void afterReturning(JoinPoint jp, Object result) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法返回值为：" + result);
    }

    //异常通知 可获取异常e
    @AfterThrowing(value = "pc1()", throwing = "e")
    public void afterThrowing(JoinPoint jp, Exception e) {
        String name = jp.getSignature().getName();
        System.out.println(name + "方法抛异常了，异常是：" + e.getMessage());
    }

    //环绕通知 包含上述通知
    @Around("pc1()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        return pjp.proceed();
    }
}
