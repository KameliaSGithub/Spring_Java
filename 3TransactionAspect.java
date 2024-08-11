@Aspect
@Component
public class TransactionAspect {

    @Around("@annotation(org.springframework.transaction.annotation.Transactional)")
    public Object manageTransaction(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            System.out.println("Starting transaction");
            Object result = joinPoint.proceed();
            System.out.println("Committing transaction");
            return result;
        } catch (Exception e) {
            System.out.println("Rolling back transaction");
            throw e;
        }
    }
}