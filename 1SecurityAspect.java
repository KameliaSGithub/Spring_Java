@Aspect
@Component

public class SecurityAspect {

    @Before("execution(* com.example.service.*.*(..)) && @annotation(secured)")
    public void checkPermission(Secured secured) {
        
        if (!hasPermission(secured.value())) {
            throw new SecurityException("Access denied");
        }
    }

    private boolean hasPermission(String role) {
        return "ADMIN".equals(role); 
    }
}