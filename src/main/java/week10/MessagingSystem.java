package week10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface CanSendMessage{
}

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface RequiresPermission{
    String value();
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface UserPermission{
    String value();
}

@UserPermission("USER")
class User{
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

@UserPermission("ADMIN")
class Admin{
    private String username;

    public Admin(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

class MessagingSystem {
    @CanSendMessage
    @RequiresPermission("ADMIN")
    public static void sendMessage(Object sender) throws NoSuchMethodException {
        System.out.println("Admin " + ((Admin) sender).getUsername() + " sent a message ");
    }

    public static void main(String[] args) throws NoSuchMethodException{
        Admin admin = new Admin("Fikret");
        User user = new User("Sead");

        sendMessageCheck(admin);
        sendMessageCheck(user);
    }

    private static void sendMessageCheck(Object sender) throws NoSuchMethodException {
        // Get the sendMessage method
        Method sendMessageMethod = MessagingSystem.class.getMethod("sendMessage", Object.class);

        // Check if the method is annotated with CanSendMessage
        if (sendMessageMethod.isAnnotationPresent(CanSendMessage.class)) {
            // Check if the method is annotated with RequiresPermission
            if (sendMessageMethod.isAnnotationPresent(RequiresPermission.class)) {
                // Get the RequiresPermission annotation value
                String requiredPermission = sendMessageMethod.getAnnotation(RequiresPermission.class).value();

                // Check if the sender has the required permission
                if (sender.getClass().isAnnotationPresent(UserPermission.class)) {
                    String userPermission = sender.getClass().getAnnotation(UserPermission.class).value();
                    if (userPermission.equals(requiredPermission)) {
                        // Invoke the sendMessage method
                        try {
                            MessagingSystem.sendMessage(sender);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println(sender.getClass().getSimpleName() + " does not have the required permission.");
                    }
                } else {
                    System.out.println(sender.getClass().getSimpleName() + " does not have a permission annotation.");
                }
            } else {
                // If no RequiresPermission annotation, invoke the sendMessage method
                try {
                    MessagingSystem.sendMessage(sender);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("sendMessage method is not annotated with CanSendMessage.");
        }
    }
}
