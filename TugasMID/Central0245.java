/* 13020210245
 * Astrit Puspita Udar
 */
package central0245;
interface A{ public void aaa(); }
interface B extends A{
public void aaa();
}

public class Central0245 implements A,B{
    public void aaa(){
         System.out.println("aaa");
    }
    public static void main(String[] args) { 
        System.out.println("main");
        this.aaa();
    }
    
}
