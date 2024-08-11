@Aspect
@Component
public class CachingAspect {

    private Map<String, Object> cache = new HashMap<>();

    @Around("execution(* com.example.service.*.*(..))")
    public Object cacheResult(ProceedingJoinPoint joinPoint) throws Throwable {


    }
}