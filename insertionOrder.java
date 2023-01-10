package StarPattern;

//Given an input string = aabbbccccaaaaa, maintain the insertion order and output a2b3c4a5.(10 Marks)

public class insertionOrder {
  public static void main(String[] args) {

      String str = "aabbbccccaaaaa";
      int count = 1;
      for (int i = 0; i < str.length()-1; i = i + count)
      {
          count = 1;
          for (int j = i + 1; j < str.length()-1; j++) 
          {
              if (str.charAt(i) == str.charAt(j)) 
              {
                  count = count + 1;
              } 
              else 
              {
                  System.out.println(str.charAt(i) + "" + count);
                  break;
              }
          }

      }
  }
}

/*
Output:-

a2
b3
c4


*/
