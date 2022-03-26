
package sayhello;

/**
 *
 * @author yiannis
 */
public class SayHello {

    public static void main(String[] args) {
        if (args.length == 0){
            System.out.println("Hello. Please tell me your name next time.");
        } else {
            System.out.println("Hello " + args[0]);
        }
    }
    
}
