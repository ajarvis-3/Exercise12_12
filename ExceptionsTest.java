import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import org.junit.jupiter.api.Test;

class ExceptionsTest {

  @Test
  void testcheckLengthArgs() throws Exception {
   String[] args = {};
   Exceptions e = new Exceptions(args);
   Throwable t = null;
   try {
     e.checkLengthArgs(args);
   } catch (Exception ex1) {
     System.out.println("args does not equal 1");
     t = ex1;
   }
   
   assertTrue(t instanceof Exception);
  }

  @Test
  void testcheckSource() throws Exception {
   String[] args = {};
   Exceptions e = new Exceptions(args);
   File f = new File("E:\\Downloads\\File.txt");
   Throwable t = null;
  
   try {
     e.checkSource(args, f);
   } catch (Exception ex1) {
     System.out.println("Source file does not exist");
     t = ex1;
   }
   
   assertTrue(t instanceof Exception);
  }
  
  @Test
  void testneedsReformat() {
    String[] args = {};
    String s = "{";
    String s1 = s.trim();
    Exceptions e = new Exceptions(args, s, s1);
    Throwable t = null;
    try {
      e.needsReformat(s, s1);
    } catch(Exception ex2) {
      t = ex2;
    }
    assertTrue(t instanceof Exception);
    
  }
  
  @Test
  void testneedsreformatStr() {
    String[] args = {};
    String s = "{ c";
    String s1 = s.trim();
    Exceptions e = new Exceptions(args, s, s1);
    Throwable t = null;
    try {
      e.reformatStr(s, s1);
    } catch(Exception ex2) {
      t = ex2;
    }
    assertTrue(t instanceof Exception);
    
  }
}
