import java.io.File;
public class Exceptions {
private String[] args;
private String s;
private String s1;
private File sourceFile;

public Exceptions(String[]arr, String s, String s1) {
  args = arr;
  this.s = s;
  this.s1 = s1;
}

public Exceptions(String[] arr) {
  args = arr;
  
}

public String needsReformat(String s, String s1) throws Exception {
  this.s = s;
  this.s1 = s1;
  
  if (s1.charAt(0) == '{') {
    throw new Exception();
  }
  return s1;
}

public String checkLengthArgs(String[] arr) throws Exception {
  args = arr;
  if (args.length != 1) {
    throw new Exception();
  }
  
  
return "length = 1";
}

public String checkSource(String[] arr, File f) throws Exception {
  args = arr;
  sourceFile = f;
  if (!sourceFile.exists()) {
    throw new Exception();
    

}

return "Source file exists";
}

public String reformatStr(String s, String s1) throws Exception {
  this.s = s;
  this.s1 = s1;
  
  if (s1.length() > 1) {
    throw new Exception();
  }
  
  
  
  return s1;
}
}

