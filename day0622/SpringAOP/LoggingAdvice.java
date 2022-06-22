@Aspect
@Component //setting component
public class LoggingAdvice {
	
	//target method setting
	//setting all method under "com.example.demo.controller" as a target
	@Pointcut("execution(public * com.example.demo.controller..*(..))")
	public void test() {	} // targetID
	//empty body. does not run if write code in it.
	
	/*
	@AfterReturning("test()")
	public void afterOK() {
		System.out.println("Target Method is successfully worked.");
	}*/
	
	/*
	@AfterThrowing("test()")
	public void afterError(JoinPoint joinPoint) {
		String methodName=joinPoint.getSignature().toShortString();
		System.out.println(methodName+"Target Method is completed with error.");
	}*/
	
	@After("test()")
	public void afterOK(JoinPoint joinPoint) {
		String methodName=joinPoint.getSignature().toShortString();
		System.out.println(methodName+"Method Finished.");
	}
	
	//before Advice (joinPoint is optional)
//	@Before("test()")
//	public void before() {
//		System.out.println("Before target Method execution.");
//	}
	
	/*
	@Around("test()")
	public Object pro(ProceedingJoinPoint joinPoint) {
		//ProceedingJoinPoint
		Object re = null;
		String methodName = joinPoint.getSignature().toShortString();
		long start = System.currentTimeMillis();
		System.out.println("Before running " +methodName);
		try {
			re = joinPoint.proceed();
		}catch(Throwable e) {
			
		}
		long end = System.currentTimeMillis();
		System.out.println("Finished running "+methodName);
		System.out.println("Duration:"+(end-start));
		return re;
	}
	*/
}
