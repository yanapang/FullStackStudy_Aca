

@Aspect
@Component
public class DAOErrorAdvice {
	
	@AfterThrowing(pointcut="execution(public * com.example.demo.dao..*(..))", 
			throwing="ex")
	public void afterError(JoinPoint joinPoint, Exception ex) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName+"수행시 예외발생:"+ex.getMessage());
	}
}
